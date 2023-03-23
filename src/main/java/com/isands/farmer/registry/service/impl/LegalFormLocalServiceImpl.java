package com.isands.farmer.registry.service.impl;

import com.isands.farmer.registry.model.LegalForm;
import com.isands.farmer.registry.farmer.portlet.FarmerPortlet;
import com.isands.farmer.registry.service.LegalFormLocalServiceUtil;
import com.isands.farmer.registry.service.base.LegalFormLocalServiceBaseImpl;
import com.isands.farmer.registry.service.persistence.LegalFormUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The implementation of the legal form local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.isands.farmer.registry.service.LegalFormLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.isands.farmer.registry.service.base.LegalFormLocalServiceBaseImpl
 * @see com.isands.farmer.registry.service.LegalFormLocalServiceUtil
 */
public class LegalFormLocalServiceImpl extends LegalFormLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.isands.farmer.registry.service.LegalFormLocalServiceUtil} to access the legal form local service.
     */

    /**
     * Returns all the legal forms or empty list
     *
     * @return the legal forms
     */
    public java.util.List<com.isands.farmer.registry.model.LegalForm> findAll() {

        List<LegalForm> legalForms = new ArrayList<LegalForm>();

        try {
            legalForms = LegalFormUtil.findAll();
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        return legalForms;
    }

    /**
     * Returns legal form abbreviation, or empty string if legal form is absent
     *
     * @return the legal form abbreviation
     */

    public String getLegalFormAbbreviationById(int legalFormId) {

        String res = "";

        try {

            LegalForm legalForm = LegalFormLocalServiceUtil.getLegalForm(legalFormId);

            if (legalForm != null) {
                res = legalForm.getAbbreviation();
            }
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        } catch (PortalException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

}
