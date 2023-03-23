package com.isands.farmer.registry.service.impl;

import com.isands.farmer.registry.model.Farmer;
import com.isands.farmer.registry.farmer.portlet.FarmerPortlet;
import com.isands.farmer.registry.service.RegionLocalServiceUtil;
import com.isands.farmer.registry.service.FarmerLocalServiceUtil;
import com.isands.farmer.registry.service.base.FarmerLocalServiceBaseImpl;
import com.isands.farmer.registry.service.persistence.FarmerUtil;
import com.liferay.portal.kernel.exception.SystemException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The implementation of the farmer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.isands.farmer.registry.service.FarmerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.isands.farmer.registry.service.base.FarmerLocalServiceBaseImpl
 * @see com.isands.farmer.registry.service.FarmerLocalServiceUtil
 */
public class FarmerLocalServiceImpl extends FarmerLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.isands.farmer.registry.service
     * .FarmerLocalServiceUtil} to access the farmer local service.
     */

    /**
     * Returns farmer organization name, or empty string if absent
     *
     * @param farmerId the farmer ID
     * @return the farmer organization name
     */

    public String getFarmerOrganizationNameById(long farmerId) {

        String res = "";

        try {

            Farmer farmer = FarmerLocalServiceUtil.fetchFarmer(farmerId);

            if (farmer != null) {
                res = farmer.getOrganizationName();
            }
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns farmer list filtered by parameters, or empty list if not found
     *
     * @param filterRegistrationDateFrom the farmer registration date, from (inclusive) what need to search
     * @param filterRegistrationDateTo   the farmer registration date, to (inclusive) what need to search
     * @param filterOrganizationName     the farmer name mask (wildcards % allowed), by what need to search
     * @param filterInn                  the farmer INN mask (wildcards % allowed), by what need to search
     * @param filterRegionName           the farmer region name mask (wildcards % allowed), by what need to search
     * @param filterArchive              the farmer archive attribute, by what need to search
     * @return the filtered farmer list
     */
    public List<Farmer> getFilteredFarmers(String filterRegistrationDateFrom,
            String filterRegistrationDateTo,
            String filterOrganizationName,
            String filterInn,
            String filterRegionName,
            boolean filterArchive) {

        List<Farmer> res = new ArrayList<Farmer>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {

            if (filterRegistrationDateFrom.isEmpty()) {

                res = FarmerUtil.findAll();
            } else {

                res = FarmerUtil.findByRegistrationDateFrom(dateFormat.parse(filterRegistrationDateFrom));
            }

            if (!filterRegistrationDateTo.isEmpty() && !res.isEmpty()) {

                res = FarmerUtil.findByRegistrationDateToAndIds(dateFormat.parse(filterRegistrationDateTo),
                        getIdArrayFromList(res));
            }

            if (!filterOrganizationName.isEmpty() && !res.isEmpty()) {

                res = FarmerUtil.findByOrgNameMaskAndIds(filterOrganizationName, getIdArrayFromList(res));
            }

            if (!filterInn.isEmpty() && !res.isEmpty()) {

                res = FarmerUtil.findByInnMaskAndIds(filterInn, getIdArrayFromList(res));
            }

            res = filterByRegionName(filterRegionName, res);

            if (!res.isEmpty()) {
                res = FarmerUtil.findByArchiveAndIds(filterArchive, getIdArrayFromList(res));
            }
        } catch (SystemException ex) {

            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        } catch (ParseException ex) {

            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns filtered farmer list by regions, or empty list if not found
     *
     * @param filterRegionName           the farmer region name mask (wildcards % allowed)
     * @param farmerList                 the farmer list to filter by regions
     * @return the farmer ids array
     */
    public List<Farmer> filterByRegionName(String filterRegionName, List<Farmer> farmerList) throws SystemException {

        if (!filterRegionName.isEmpty() && !farmerList.isEmpty()) {

            long[] regionIds = RegionLocalServiceUtil.getRegionIdArrayFromRegionNameMask(filterRegionName);

            if (regionIds != null) {

                farmerList = FarmerUtil.findByRegionIdsAndIds(regionIds, getIdArrayFromList(farmerList));
            } else {

                farmerList = new ArrayList<Farmer>();
            }
        }

        return farmerList;
    }

    /**
     * Returns farmer ids array from farmer list, or null if list is empty
     *
     * @param farmers the farmer list
     * @return the farmer ids array
     */
    private long[] getIdArrayFromList(List<Farmer> farmers) {
        long[] farmerIds = null;
        int size = farmers.size();

        if (size > 0) {

            farmerIds = new long[size];

            for (int i = 0; i < size; ++i) {
                farmerIds[i] = farmers.get(i).getId();
            }
        }

        return farmerIds;
    }

    /**
     * Returns farmer list filtered by parameters from start index to end index, or empty list if not found
     *
     * @param allFilteredFarmers         the farmer registration date, from (inclusive) what need to search
     * @param start                      the start index to output
     * @param end                        the end index to output
     * @return the filtered farmer list
     */
    public List<Farmer> getFilteredFarmers(List<Farmer> allFilteredFarmers,
            int start,
            int end) {

        List<Farmer> outputFilteredFarmers = new ArrayList<Farmer>();

        for (int i = start; i < end && i < allFilteredFarmers.size(); ++i) {

            outputFilteredFarmers.add(allFilteredFarmers.get(i));
        }

        return outputFilteredFarmers;
    }
}
