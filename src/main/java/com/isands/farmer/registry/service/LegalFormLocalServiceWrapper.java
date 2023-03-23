package com.isands.farmer.registry.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LegalFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LegalFormLocalService
 * @generated
 */
public class LegalFormLocalServiceWrapper implements LegalFormLocalService,
    ServiceWrapper<LegalFormLocalService> {
    private LegalFormLocalService _legalFormLocalService;

    public LegalFormLocalServiceWrapper(
        LegalFormLocalService legalFormLocalService) {
        _legalFormLocalService = legalFormLocalService;
    }

    /**
    * Adds the legal form to the database. Also notifies the appropriate model listeners.
    *
    * @param legalForm the legal form
    * @return the legal form that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.LegalForm addLegalForm(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.addLegalForm(legalForm);
    }

    /**
    * Creates a new legal form with the primary key. Does not add the legal form to the database.
    *
    * @param id the primary key for the new legal form
    * @return the new legal form
    */
    @Override
    public com.isands.farmer.registry.model.LegalForm createLegalForm(int id) {
        return _legalFormLocalService.createLegalForm(id);
    }

    /**
    * Deletes the legal form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the legal form
    * @return the legal form that was removed
    * @throws PortalException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.LegalForm deleteLegalForm(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.deleteLegalForm(id);
    }

    /**
    * Deletes the legal form from the database. Also notifies the appropriate model listeners.
    *
    * @param legalForm the legal form
    * @return the legal form that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.LegalForm deleteLegalForm(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.deleteLegalForm(legalForm);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _legalFormLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.isands.farmer.registry.model.LegalForm fetchLegalForm(int id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.fetchLegalForm(id);
    }

    /**
    * Returns the legal form with the primary key.
    *
    * @param id the primary key of the legal form
    * @return the legal form
    * @throws PortalException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.LegalForm getLegalForm(int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.getLegalForm(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.isands.farmer.registry.model.LegalForm> getLegalForms(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.getLegalForms(start, end);
    }

    /**
    * Returns the number of legal forms.
    *
    * @return the number of legal forms
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLegalFormsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.getLegalFormsCount();
    }

    /**
    * Updates the legal form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param legalForm the legal form
    * @return the legal form that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.LegalForm updateLegalForm(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _legalFormLocalService.updateLegalForm(legalForm);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _legalFormLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _legalFormLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _legalFormLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
    * Returns all the legal forms or empty list
    *
    * @return the legal forms
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.LegalForm> findAll() {
        return _legalFormLocalService.findAll();
    }

    /**
    * Returns legal form abbreviation, or empty string if legal form is absent
    *
    * @return the legal form abbreviation
    */
    @Override
    public java.lang.String getLegalFormAbbreviationById(int legalFormId) {
        return _legalFormLocalService.getLegalFormAbbreviationById(legalFormId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LegalFormLocalService getWrappedLegalFormLocalService() {
        return _legalFormLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLegalFormLocalService(
        LegalFormLocalService legalFormLocalService) {
        _legalFormLocalService = legalFormLocalService;
    }

    @Override
    public LegalFormLocalService getWrappedService() {
        return _legalFormLocalService;
    }

    @Override
    public void setWrappedService(LegalFormLocalService legalFormLocalService) {
        _legalFormLocalService = legalFormLocalService;
    }
}
