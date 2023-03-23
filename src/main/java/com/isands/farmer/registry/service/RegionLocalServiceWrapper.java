package com.isands.farmer.registry.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegionLocalService
 * @generated
 */
public class RegionLocalServiceWrapper implements RegionLocalService,
    ServiceWrapper<RegionLocalService> {
    private RegionLocalService _regionLocalService;

    public RegionLocalServiceWrapper(RegionLocalService regionLocalService) {
        _regionLocalService = regionLocalService;
    }

    /**
    * Adds the region to the database. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Region addRegion(
        com.isands.farmer.registry.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.addRegion(region);
    }

    /**
    * Creates a new region with the primary key. Does not add the region to the database.
    *
    * @param id the primary key for the new region
    * @return the new region
    */
    @Override
    public com.isands.farmer.registry.model.Region createRegion(long id) {
        return _regionLocalService.createRegion(id);
    }

    /**
    * Deletes the region with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the region
    * @return the region that was removed
    * @throws PortalException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Region deleteRegion(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.deleteRegion(id);
    }

    /**
    * Deletes the region from the database. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Region deleteRegion(
        com.isands.farmer.registry.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.deleteRegion(region);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _regionLocalService.dynamicQuery();
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
        return _regionLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _regionLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _regionLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _regionLocalService.dynamicQueryCount(dynamicQuery);
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
        return _regionLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.isands.farmer.registry.model.Region fetchRegion(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.fetchRegion(id);
    }

    /**
    * Returns the region with the primary key.
    *
    * @param id the primary key of the region
    * @return the region
    * @throws PortalException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Region getRegion(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getRegion(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the regions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of regions
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> getRegions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getRegions(start, end);
    }

    /**
    * Returns the number of regions.
    *
    * @return the number of regions
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRegionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getRegionsCount();
    }

    /**
    * Updates the region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.isands.farmer.registry.model.Region updateRegion(
        com.isands.farmer.registry.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.updateRegion(region);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _regionLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _regionLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _regionLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns the number of regions where archive = &#63;. If exception occurs, returns 0.
    *
    * @param archive the archive
    * @return the number of matching regions
    */
    @Override
    public int countByArchive(boolean archive) {
        return _regionLocalService.countByArchive(archive);
    }

    /**
    * Returns a range of all the regions where archive = &#63;. If exception occurs, returns empty list.
    *
    * @param archive the archive
    * @return the range of matching regions
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive) {
        return _regionLocalService.findByArchive(archive);
    }

    /**
    * Returns a range of all the regions where archive = &#63;. If exception occurs, returns empty list.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code>
    * and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to
    * the first result in the set. Setting both <code>start</code> and <code>end</code> to
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If
    * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
    * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code>
    * are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default
    * ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both
    * <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an
    * ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param start   the lower bound of the range of regions
    * @param end     the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive, int start, int end) {
        return _regionLocalService.findByArchive(archive, start, end);
    }

    /**
    * Returns all the regions where id = any &#63;. If didn't find - empty list.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code>
    * and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to
    * the first result in the set. Setting both <code>start</code> and <code>end</code> to
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If
    * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
    * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code>
    * are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default
    * ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both
    * <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an
    * ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ids the IDs
    * @return the matching regions
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long[] ids) {
        return _regionLocalService.findByIds(ids);
    }

    /**
    * Returns all the regions where id &ne; all &#63; and archive = &#63;. If didn't find - empty list.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code>
    * and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to
    * the first result in the set. Setting both <code>start</code> and <code>end</code> to
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If
    * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
    * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code>
    * are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default
    * ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both
    * <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an
    * ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ids     the IDs
    * @param archive the archive
    * @return the matching regions
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long[] ids, boolean archive) {
        return _regionLocalService.findByNotInIdsAndArchive(ids, archive);
    }

    /**
    * Returns region name where id = &#63;. If exception occurs, returns empty string.
    *
    * @param regionId the regionId
    * @return the region name
    */
    @Override
    public java.lang.String getRegionNameById(long regionId) {
        return _regionLocalService.getRegionNameById(regionId);
    }

    /**
    * Returns all regions;. If didn't find, returns empty list.
    *
    * @return region list
    */
    @Override
    public java.util.List<com.isands.farmer.registry.model.Region> getAll() {
        return _regionLocalService.getAll();
    }

    /**
    * Returns region ids array where region name LIKE filterRegionName, or null if list is empty
    *
    * @param filterRegionName the region name mask (wildcards % allowed)
    * @return the region ids array
    */
    @Override
    public long[] getRegionIdArrayFromRegionNameMask(
        java.lang.String filterRegionName) {
        return _regionLocalService.getRegionIdArrayFromRegionNameMask(filterRegionName);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RegionLocalService getWrappedRegionLocalService() {
        return _regionLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRegionLocalService(
        RegionLocalService regionLocalService) {
        _regionLocalService = regionLocalService;
    }

    @Override
    public RegionLocalService getWrappedService() {
        return _regionLocalService;
    }

    @Override
    public void setWrappedService(RegionLocalService regionLocalService) {
        _regionLocalService = regionLocalService;
    }
}
