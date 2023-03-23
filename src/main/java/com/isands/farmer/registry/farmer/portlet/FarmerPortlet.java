package com.isands.farmer.registry.farmer.portlet;

import com.isands.farmer.registry.model.Farmer;
import com.isands.farmer.registry.model.LegalForm;
import com.isands.farmer.registry.model.Ref;
import com.isands.farmer.registry.region.portlet.RegionPortlet;
import com.isands.farmer.registry.service.FarmerLocalServiceUtil;
import com.isands.farmer.registry.service.LegalFormLocalServiceUtil;
import com.isands.farmer.registry.service.RefLocalServiceUtil;
import com.isands.farmer.registry.service.persistence.RefPK;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FarmerPortlet extends MVCPortlet {

    private static final String URL_EDIT_FARMER_CROP_REGIONS = "/jsp/farmer/edit_farmer_crop_regions.jsp";
    private static final String URL_VIEW = "/jsp/farmer/view.jsp";
    private static final String FARMER_ID = "farmerId";
    private static final String MVC_PATH = "mvcPath";

    public void addLegalForm(ActionRequest request, ActionResponse response) {

        try {

            int legalFormId = ParamUtil.getInteger(request, "id");
            String legalFormAbbreviation = ParamUtil.getString(request, "abbreviation");

            if (!legalFormAbbreviation.isEmpty() && legalFormId != 0) {

                LegalForm newLegalForm = LegalFormLocalServiceUtil.createLegalForm(legalFormId);
                newLegalForm.setAbbreviation(legalFormAbbreviation);

                insertOrUpdateLegalForm(newLegalForm);
            }
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }

    public void insertOrUpdateLegalForm(LegalForm legalForm) throws SystemException {
        try {
            /* Если нет в БД с таким id, будет PortalException */
            LegalFormLocalServiceUtil.getLegalForm(legalForm.getId());

            /* Если уже есть в БД - устанавливаем признак "не новая" */
            legalForm.setNew(false);
        } catch (PortalException e) {
            /* Если нет в БД - устанавливаем признак "новая" */
            legalForm.setNew(true);
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        LegalFormLocalServiceUtil.updateLegalForm(legalForm);
    }

    public void deleteLegalForm(ActionRequest request, ActionResponse response) {

        int selectedRowId = ParamUtil.getInteger(request, "legalFormId");

        try {
            LegalFormLocalServiceUtil.deleteLegalForm(selectedRowId);
        } catch (PortalException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }

    public void addFarmer(ActionRequest request, ActionResponse response) {

        try {

            long farmerId = ParamUtil.getLong(request, "id", 0L);
            String farmerOrganizationName = ParamUtil.getString(request, "organizationName");
            int farmerLegalFormId = ParamUtil.getInteger(request, "legalFormId", 0);
            String farmerInn = ParamUtil.getString(request, "inn");
            String farmerKpp = ParamUtil.getString(request, "kpp", "");
            String farmerOgrn = ParamUtil.getString(request, "ogrn", "");
            long farmerRegionId = ParamUtil.getLong(request, "regionId", 0L);
            Date farmerRegistrationDate =
                    ParamUtil.getDate(request, "registrationDate", new SimpleDateFormat("yyyy-MM-dd"), new Date());
            boolean farmerArchive = ParamUtil.getBoolean(request, "archive");

            if (!farmerOrganizationName.isEmpty() && !farmerInn.isEmpty()) {

                Farmer farmer = FarmerLocalServiceUtil.createFarmer(farmerId);
                farmer.setOrganizationName(farmerOrganizationName);
                farmer.setLegalFormId(farmerLegalFormId);
                farmer.setInn(farmerInn);
                farmer.setKpp(farmerKpp);
                farmer.setOgrn(farmerOgrn);
                farmer.setRegionId(farmerRegionId);
                farmer.setRegistrationDate(farmerRegistrationDate);
                farmer.setArchive(farmerArchive);

                farmer.setNew(farmerId == 0L);

                FarmerLocalServiceUtil.updateFarmer(farmer);
            }

            setRenderParametersForAddFarmer(request, response);
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }

    private void setRenderParametersForAddFarmer(ActionRequest request, ActionResponse response) {
        response.setRenderParameter(MVC_PATH, URL_VIEW);
        setFilterRenderParameters(request, response);
    }

    public void addRef(ActionRequest request, ActionResponse response) {

        try {
            long farmerId = ParamUtil.getLong(request, FARMER_ID);
            long cropRegionToAddId = ParamUtil.getLong(request, "cropRegionToAddId");

            Ref dbRef = RefLocalServiceUtil.findByfarmerIdAndRegionId(farmerId, cropRegionToAddId);

            if (dbRef == null) {
                Ref newRef = RefLocalServiceUtil.createRef(new RefPK(farmerId, cropRegionToAddId));

                RefLocalServiceUtil.addRef(newRef);
            }

            response.setRenderParameter(MVC_PATH, URL_EDIT_FARMER_CROP_REGIONS);
            response.setRenderParameter(FARMER_ID, String.valueOf(farmerId));
            setFilterRenderParameters(request, response);
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }

    private void setFilterRenderParameters(ActionRequest request, ActionResponse response) {
        response.setRenderParameter("filterRegistrationDateFrom",
                ParamUtil.getString(request, "filterRegistrationDateFrom"));
        response.setRenderParameter("filterRegistrationDateTo",
                ParamUtil.getString(request, "filterRegistrationDateTo"));
        response.setRenderParameter("filterOrganizationName",
                ParamUtil.getString(request, "filterOrganizationName"));
        response.setRenderParameter("filterInn",
                ParamUtil.getString(request, "filterInn"));
        response.setRenderParameter("filterRegionName",
                ParamUtil.getString(request, "filterRegionName"));
        response.setRenderParameter("filterArchive",
                ParamUtil.getString(request, "filterArchive"));
    }

    public void deleteRef(ActionRequest request, ActionResponse response) {

        long farmerId = ParamUtil.getLong(request, FARMER_ID);
        long regionId = ParamUtil.getLong(request, "regionId");

        try {
            RefLocalServiceUtil.deleteRef(RefLocalServiceUtil.createRef(new RefPK(farmerId, regionId)));

            response.setRenderParameter(FARMER_ID, String.valueOf(farmerId));
            response.setRenderParameter(MVC_PATH, URL_EDIT_FARMER_CROP_REGIONS);
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }

    public void filterFarmer(ActionRequest request, ActionResponse response) {

        setRenderParametersForAddFarmer(request, response);
    }
}
