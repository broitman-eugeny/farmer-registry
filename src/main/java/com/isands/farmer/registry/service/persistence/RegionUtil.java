package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Region;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the region service. This utility wraps {@link RegionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegionPersistence
 * @see RegionPersistenceImpl
 * @generated
 */
public class RegionUtil {
    private static RegionPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Region region) {
        getPersistence().clearCache(region);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Region> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Region> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Region> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Region update(Region region) throws SystemException {
        return getPersistence().update(region);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Region update(Region region, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(region, serviceContext);
    }

    /**
    * Returns the region where id = &#63; or throws a {@link com.isands.farmer.registry.NoSuchRegionException} if it could not be found.
    *
    * @param id the ID
    * @return the matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findById(long id)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findById(id);
    }

    /**
    * Returns the region where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param id the ID
    * @return the matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchById(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchById(id);
    }

    /**
    * Returns the region where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param id the ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchById(long id,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchById(id, retrieveFromCache);
    }

    /**
    * Removes the region where id = &#63; from the database.
    *
    * @param id the ID
    * @return the region that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region removeById(long id)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeById(id);
    }

    /**
    * Returns the number of regions where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countById(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countById(id);
    }

    /**
    * Returns all the regions where archive = &#63;.
    *
    * @param archive the archive
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchive(archive);
    }

    /**
    * Returns a range of all the regions where archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchive(archive, start, end);
    }

    /**
    * Returns an ordered range of all the regions where archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchive(archive, start, end, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchive_First(archive, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByArchive_First(archive, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchive_Last(archive, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByArchive_Last(archive, orderByComparator);
    }

    /**
    * Returns the regions before and after the current region in the ordered set where archive = &#63;.
    *
    * @param id the primary key of the current region
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region[] findByArchive_PrevAndNext(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchive_PrevAndNext(id, archive, orderByComparator);
    }

    /**
    * Removes all the regions where archive = &#63; from the database.
    *
    * @param archive the archive
    * @throws SystemException if a system exception occurred
    */
    public static void removeByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByArchive(archive);
    }

    /**
    * Returns the number of regions where archive = &#63;.
    *
    * @param archive the archive
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByArchive(archive);
    }

    /**
    * Returns all the regions where id = &#63;.
    *
    * @param id the ID
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIds(id);
    }

    /**
    * Returns a range of all the regions where id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param id the ID
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIds(id, start, end);
    }

    /**
    * Returns an ordered range of all the regions where id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param id the ID
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIds(id, start, end, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByIds_First(
        long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIds_First(id, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByIds_First(
        long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByIds_First(id, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByIds_Last(
        long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIds_Last(id, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByIds_Last(
        long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByIds_Last(id, orderByComparator);
    }

    /**
    * Returns all the regions where id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ids the IDs
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long[] ids) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIds(ids);
    }

    /**
    * Returns a range of all the regions where id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ids the IDs
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIds(ids, start, end);
    }

    /**
    * Returns an ordered range of all the regions where id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ids the IDs
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByIds(ids, start, end, orderByComparator);
    }

    /**
    * Removes all the regions where id = &#63; from the database.
    *
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByIds(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByIds(id);
    }

    /**
    * Returns the number of regions where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByIds(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByIds(id);
    }

    /**
    * Returns the number of regions where id = any &#63;.
    *
    * @param ids the IDs
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByIds(long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByIds(ids);
    }

    /**
    * Returns all the regions where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long id, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNotInIdsAndArchive(id, archive);
    }

    /**
    * Returns a range of all the regions where id &ne; &#63; and archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param id the ID
    * @param archive the archive
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long id, boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNotInIdsAndArchive(id, archive, start, end);
    }

    /**
    * Returns an ordered range of all the regions where id &ne; &#63; and archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param id the ID
    * @param archive the archive
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long id, boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNotInIdsAndArchive(id, archive, start, end,
            orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByNotInIdsAndArchive_First(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNotInIdsAndArchive_First(id, archive,
            orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByNotInIdsAndArchive_First(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNotInIdsAndArchive_First(id, archive,
            orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByNotInIdsAndArchive_Last(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNotInIdsAndArchive_Last(id, archive, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByNotInIdsAndArchive_Last(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNotInIdsAndArchive_Last(id, archive,
            orderByComparator);
    }

    /**
    * Returns all the regions where id &ne; all &#63; and archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ids the IDs
    * @param archive the archive
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long[] ids, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNotInIdsAndArchive(ids, archive);
    }

    /**
    * Returns a range of all the regions where id &ne; all &#63; and archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ids the IDs
    * @param archive the archive
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long[] ids, boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNotInIdsAndArchive(ids, archive, start, end);
    }

    /**
    * Returns an ordered range of all the regions where id &ne; all &#63; and archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ids the IDs
    * @param archive the archive
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long[] ids, boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNotInIdsAndArchive(ids, archive, start, end,
            orderByComparator);
    }

    /**
    * Removes all the regions where id &ne; &#63; and archive = &#63; from the database.
    *
    * @param id the ID
    * @param archive the archive
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNotInIdsAndArchive(long id, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNotInIdsAndArchive(id, archive);
    }

    /**
    * Returns the number of regions where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByNotInIdsAndArchive(long id, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNotInIdsAndArchive(id, archive);
    }

    /**
    * Returns the number of regions where id &ne; all &#63; and archive = &#63;.
    *
    * @param ids the IDs
    * @param archive the archive
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByNotInIdsAndArchive(long[] ids, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNotInIdsAndArchive(ids, archive);
    }

    /**
    * Returns all the regions where name LIKE &#63;.
    *
    * @param name the name
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNameMask(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNameMask(name);
    }

    /**
    * Returns a range of all the regions where name LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNameMask(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNameMask(name, start, end);
    }

    /**
    * Returns an ordered range of all the regions where name LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findByNameMask(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNameMask(name, start, end, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where name LIKE &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByNameMask_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNameMask_First(name, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where name LIKE &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByNameMask_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNameMask_First(name, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where name LIKE &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByNameMask_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNameMask_Last(name, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where name LIKE &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByNameMask_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNameMask_Last(name, orderByComparator);
    }

    /**
    * Returns the regions before and after the current region in the ordered set where name LIKE &#63;.
    *
    * @param id the primary key of the current region
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region[] findByNameMask_PrevAndNext(
        long id, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNameMask_PrevAndNext(id, name, orderByComparator);
    }

    /**
    * Removes all the regions where name LIKE &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNameMask(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNameMask(name);
    }

    /**
    * Returns the number of regions where name LIKE &#63;.
    *
    * @param name the name
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByNameMask(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNameMask(name);
    }

    /**
    * Caches the region in the entity cache if it is enabled.
    *
    * @param region the region
    */
    public static void cacheResult(
        com.isands.farmer.registry.model.Region region) {
        getPersistence().cacheResult(region);
    }

    /**
    * Caches the regions in the entity cache if it is enabled.
    *
    * @param regions the regions
    */
    public static void cacheResult(
        java.util.List<com.isands.farmer.registry.model.Region> regions) {
        getPersistence().cacheResult(regions);
    }

    /**
    * Creates a new region with the primary key. Does not add the region to the database.
    *
    * @param id the primary key for the new region
    * @return the new region
    */
    public static com.isands.farmer.registry.model.Region create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the region
    * @return the region that was removed
    * @throws com.isands.farmer.registry.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region remove(long id)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.isands.farmer.registry.model.Region updateImpl(
        com.isands.farmer.registry.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(region);
    }

    /**
    * Returns the region with the primary key or throws a {@link com.isands.farmer.registry.NoSuchRegionException} if it could not be found.
    *
    * @param id the primary key of the region
    * @return the region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region findByPrimaryKey(
        long id)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the region with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the region
    * @return the region, or <code>null</code> if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Region fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the regions.
    *
    * @return the regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.isands.farmer.registry.model.Region> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the regions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the regions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of regions.
    *
    * @return the number of regions
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RegionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RegionPersistence) PortletBeanLocatorUtil.locate(com.isands.farmer.registry.service.ClpSerializer.getServletContextName(),
                    RegionPersistence.class.getName());

            ReferenceRegistry.registerReference(RegionUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RegionPersistence persistence) {
    }
}
