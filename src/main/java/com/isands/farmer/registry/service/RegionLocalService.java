package com.isands.farmer.registry.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Region. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see RegionLocalServiceUtil
 * @see com.isands.farmer.registry.service.base.RegionLocalServiceBaseImpl
 * @see com.isands.farmer.registry.service.impl.RegionLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface RegionLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RegionLocalServiceUtil} to access the region local service. Add custom service methods to {@link com.isands.farmer.registry.service.impl.RegionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the region to the database. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was added
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.isands.farmer.registry.model.Region addRegion(
        com.isands.farmer.registry.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new region with the primary key. Does not add the region to the database.
    *
    * @param id the primary key for the new region
    * @return the new region
    */
    public com.isands.farmer.registry.model.Region createRegion(long id);

    /**
    * Deletes the region with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the region
    * @return the region that was removed
    * @throws PortalException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.isands.farmer.registry.model.Region deleteRegion(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the region from the database. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was removed
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.isands.farmer.registry.model.Region deleteRegion(
        com.isands.farmer.registry.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.isands.farmer.registry.model.Region fetchRegion(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the region with the primary key.
    *
    * @param id the primary key of the region
    * @return the region
    * @throws PortalException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.isands.farmer.registry.model.Region getRegion(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.isands.farmer.registry.model.Region> getRegions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions.
    *
    * @return the number of regions
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getRegionsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was updated
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.isands.farmer.registry.model.Region updateRegion(
        com.isands.farmer.registry.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    /**
    * Returns the number of regions where archive = &#63;. If exception occurs, returns 0.
    *
    * @param archive the archive
    * @return the number of matching regions
    */
    public int countByArchive(boolean archive);

    /**
    * Returns a range of all the regions where archive = &#63;. If exception occurs, returns empty list.
    *
    * @param archive the archive
    * @return the range of matching regions
    */
    public java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive);

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive, int start, int end);

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long[] ids);

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long[] ids, boolean archive);

    /**
    * Returns region name where id = &#63;. If exception occurs, returns empty string.
    *
    * @param regionId the regionId
    * @return the region name
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String getRegionNameById(long regionId);

    /**
    * Returns all regions;. If didn't find, returns empty list.
    *
    * @return region list
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.isands.farmer.registry.model.Region> getAll();

    /**
    * Returns region ids array where region name LIKE filterRegionName, or null if list is empty
    *
    * @param filterRegionName the region name mask (wildcards % allowed)
    * @return the region ids array
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public long[] getRegionIdArrayFromRegionNameMask(
        java.lang.String filterRegionName);
}
