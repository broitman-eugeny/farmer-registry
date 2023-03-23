package com.isands.farmer.registry.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LegalForm. This utility wraps
 * {@link com.isands.farmer.registry.service.impl.LegalFormLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LegalFormLocalService
 * @see com.isands.farmer.registry.service.base.LegalFormLocalServiceBaseImpl
 * @see com.isands.farmer.registry.service.impl.LegalFormLocalServiceImpl
 * @generated
 */
public class LegalFormLocalServiceUtil {
    private static LegalFormLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.isands.farmer.registry.service.impl.LegalFormLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the legal form to the database. Also notifies the appropriate model listeners.
    *
    * @param legalForm the legal form
    * @return the legal form that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm addLegalForm(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLegalForm(legalForm);
    }

    /**
    * Creates a new legal form with the primary key. Does not add the legal form to the database.
    *
    * @param id the primary key for the new legal form
    * @return the new legal form
    */
    public static com.isands.farmer.registry.model.LegalForm createLegalForm(
        int id) {
        return getService().createLegalForm(id);
    }

    /**
    * Deletes the legal form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the legal form
    * @return the legal form that was removed
    * @throws PortalException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm deleteLegalForm(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLegalForm(id);
    }

    /**
    * Deletes the legal form from the database. Also notifies the appropriate model listeners.
    *
    * @param legalForm the legal form
    * @return the legal form that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm deleteLegalForm(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLegalForm(legalForm);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.LegalFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.LegalFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.isands.farmer.registry.model.LegalForm fetchLegalForm(
        int id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLegalForm(id);
    }

    /**
    * Returns the legal form with the primary key.
    *
    * @param id the primary key of the legal form
    * @return the legal form
    * @throws PortalException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm getLegalForm(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLegalForm(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the legal forms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.LegalFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of legal forms
    * @param end the upper bound of the range of legal forms (not inclusive)
    * @return the range of legal forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.LegalForm> getLegalForms(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLegalForms(start, end);
    }

    /**
    * Returns the number of legal forms.
    *
    * @return the number of legal forms
    * @throws SystemException if a system exception occurred
    */
    public static int getLegalFormsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLegalFormsCount();
    }

    /**
    * Updates the legal form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param legalForm the legal form
    * @return the legal form that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm updateLegalForm(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLegalForm(legalForm);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns all the legal forms or empty list
    *
    * @return the legal forms
    */
    public static java.util.List<com.isands.farmer.registry.model.LegalForm> findAll() {
        return getService().findAll();
    }

    /**
    * Returns legal form abbreviation, or empty string if legal form is absent
    *
    * @return the legal form abbreviation
    */
    public static java.lang.String getLegalFormAbbreviationById(int legalFormId) {
        return getService().getLegalFormAbbreviationById(legalFormId);
    }

    public static void clearService() {
        _service = null;
    }

    public static LegalFormLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LegalFormLocalService.class.getName());

            if (invokableLocalService instanceof LegalFormLocalService) {
                _service = (LegalFormLocalService) invokableLocalService;
            } else {
                _service = new LegalFormLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LegalFormLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LegalFormLocalService service) {
    }
}
