package com.isands.farmer.registry.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RefLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RefLocalService
 * @generated
 */
public class RefLocalServiceWrapper implements RefLocalService,
    ServiceWrapper<RefLocalService> {
    private RefLocalService _refLocalService;

    public RefLocalServiceWrapper(RefLocalService refLocalService) {
        _refLocalService = refLocalService;
    }

    /**
    * Adds the ref to the database. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Ref addRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.addRef(ref);
    }

    /**
    * Creates a new ref with the primary key. Does not add the ref to the database.
    *
    * @param refPK the primary key for the new ref
    * @return the new ref
    */
    @Override
    public com.isands.farmer.registry.model.Ref createRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK) {
        return _refLocalService.createRef(refPK);
    }

    /**
    * Deletes the ref with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param refPK the primary key of the ref
    * @return the ref that was removed
    * @throws PortalException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Ref deleteRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.deleteRef(refPK);
    }

    /**
    * Deletes the ref from the database. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Ref deleteRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.deleteRef(ref);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _refLocalService.dynamicQuery();
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
        return _refLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _refLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _refLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _refLocalService.dynamicQueryCount(dynamicQuery);
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
        return _refLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.isands.farmer.registry.model.Ref fetchRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.fetchRef(refPK);
    }

    /**
    * Returns the ref with the primary key.
    *
    * @param refPK the primary key of the ref
    * @return the ref
    * @throws PortalException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Ref getRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.getRef(refPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the refs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refs
    * @param end the upper bound of the range of refs (not inclusive)
    * @return the range of refs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Ref> getRefs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.getRefs(start, end);
    }

    /**
    * Returns the number of refs.
    *
    * @return the number of refs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRefsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.getRefsCount();
    }

    /**
    * Updates the ref in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Ref updateRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refLocalService.updateRef(ref);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _refLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _refLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _refLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns all the refs where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the matching refs
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId) {
        return _refLocalService.findByfarmerId(farmerId);
    }

    /**
    * Returns all the regions where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the matching refs
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> findRegionsByFarmerId(
        long farmerId) {
        return _refLocalService.findRegionsByFarmerId(farmerId);
    }

    /**
    * Returns a range of all the regions where farmerId = &#63;. If didn't find - empty list.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code>
    * and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to
    * the first result in the set. Setting both <code>start</code> and <code>end</code> to
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If
    * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
    * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code>
    * are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default
    * ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both
    * <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an
    * ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param farmerId the farmer ID
    * @param start    the lower bound of the range of refs
    * @param end      the upper bound of the range of refs (not inclusive)
    * @return the range of matching refs
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> findRegionsByfarmerIdStartEnd(
        long farmerId, int start, int end) {
        return _refLocalService.findRegionsByfarmerIdStartEnd(farmerId, start,
            end);
    }

    /**
    * Returns the number of refs where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @return the number of matching refs
    */
    @Override
    public int countByfarmerId(long farmerId) {
        return _refLocalService.countByfarmerId(farmerId);
    }

    /**
    * Returns a range of the regions, that can be added to farmer's crop regions, excluding existing farmer's crop
    * regions, where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the range of matching refs
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> findCropRegionsToAddByfarmerId(
        long farmerId) {
        return _refLocalService.findCropRegionsToAddByfarmerId(farmerId);
    }

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or null if it could not be found.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the matching ref
    */
    @Override
    public com.isands.farmer.registry.model.Ref findByfarmerIdAndRegionId(
        long farmerId, long regionId) {
        return _refLocalService.findByfarmerIdAndRegionId(farmerId, regionId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RefLocalService getWrappedRefLocalService() {
        return _refLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRefLocalService(RefLocalService refLocalService) {
        _refLocalService = refLocalService;
    }

    @Override
    public RefLocalService getWrappedService() {
        return _refLocalService;
    }

    @Override
    public void setWrappedService(RefLocalService refLocalService) {
        _refLocalService = refLocalService;
    }
}
