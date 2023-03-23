package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Ref;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the ref service. This utility wraps {@link RefPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RefPersistence
 * @see RefPersistenceImpl
 * @generated
 */
public class RefUtil {
    private static RefPersistence _persistence;

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
    public static void clearCache(Ref ref) {
        getPersistence().clearCache(ref);
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
    public static List<Ref> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Ref> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Ref> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Ref update(Ref ref) throws SystemException {
        return getPersistence().update(ref);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Ref update(Ref ref, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(ref, serviceContext);
    }

    /**
    * Returns all the refs where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @return the matching refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfarmerId(farmerId);
    }

    /**
    * Returns a range of all the refs where farmerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param farmerId the farmer ID
    * @param start the lower bound of the range of refs
    * @param end the upper bound of the range of refs (not inclusive)
    * @return the range of matching refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfarmerId(farmerId, start, end);
    }

    /**
    * Returns an ordered range of all the refs where farmerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param farmerId the farmer ID
    * @param start the lower bound of the range of refs
    * @param end the upper bound of the range of refs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfarmerId(farmerId, start, end, orderByComparator);
    }

    /**
    * Returns the first ref in the ordered set where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref findByfarmerId_First(
        long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfarmerId_First(farmerId, orderByComparator);
    }

    /**
    * Returns the first ref in the ordered set where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref fetchByfarmerId_First(
        long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfarmerId_First(farmerId, orderByComparator);
    }

    /**
    * Returns the last ref in the ordered set where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref findByfarmerId_Last(
        long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfarmerId_Last(farmerId, orderByComparator);
    }

    /**
    * Returns the last ref in the ordered set where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref fetchByfarmerId_Last(
        long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByfarmerId_Last(farmerId, orderByComparator);
    }

    /**
    * Returns the refs before and after the current ref in the ordered set where farmerId = &#63;.
    *
    * @param refPK the primary key of the current ref
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref[] findByfarmerId_PrevAndNext(
        RefPK refPK, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfarmerId_PrevAndNext(refPK, farmerId,
            orderByComparator);
    }

    /**
    * Removes all the refs where farmerId = &#63; from the database.
    *
    * @param farmerId the farmer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByfarmerId(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByfarmerId(farmerId);
    }

    /**
    * Returns the number of refs where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @return the number of matching refs
    * @throws SystemException if a system exception occurred
    */
    public static int countByfarmerId(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByfarmerId(farmerId);
    }

    /**
    * Returns all the refs where regionId = &#63;.
    *
    * @param regionId the region ID
    * @return the matching refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findByregionId(
        long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByregionId(regionId);
    }

    /**
    * Returns a range of all the refs where regionId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionId the region ID
    * @param start the lower bound of the range of refs
    * @param end the upper bound of the range of refs (not inclusive)
    * @return the range of matching refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findByregionId(
        long regionId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByregionId(regionId, start, end);
    }

    /**
    * Returns an ordered range of all the refs where regionId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionId the region ID
    * @param start the lower bound of the range of refs
    * @param end the upper bound of the range of refs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findByregionId(
        long regionId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByregionId(regionId, start, end, orderByComparator);
    }

    /**
    * Returns the first ref in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref findByregionId_First(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByregionId_First(regionId, orderByComparator);
    }

    /**
    * Returns the first ref in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref fetchByregionId_First(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByregionId_First(regionId, orderByComparator);
    }

    /**
    * Returns the last ref in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref findByregionId_Last(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByregionId_Last(regionId, orderByComparator);
    }

    /**
    * Returns the last ref in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref fetchByregionId_Last(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByregionId_Last(regionId, orderByComparator);
    }

    /**
    * Returns the refs before and after the current ref in the ordered set where regionId = &#63;.
    *
    * @param refPK the primary key of the current ref
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref[] findByregionId_PrevAndNext(
        RefPK refPK, long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByregionId_PrevAndNext(refPK, regionId,
            orderByComparator);
    }

    /**
    * Removes all the refs where regionId = &#63; from the database.
    *
    * @param regionId the region ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByregionId(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByregionId(regionId);
    }

    /**
    * Returns the number of refs where regionId = &#63;.
    *
    * @param regionId the region ID
    * @return the number of matching refs
    * @throws SystemException if a system exception occurred
    */
    public static int countByregionId(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByregionId(regionId);
    }

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or throws a {@link com.isands.farmer.registry.NoSuchRefException} if it could not be found.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref findByfarmerIdAndRegionId(
        long farmerId, long regionId)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfarmerIdAndRegionId(farmerId, regionId);
    }

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref fetchByfarmerIdAndRegionId(
        long farmerId, long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByfarmerIdAndRegionId(farmerId, regionId);
    }

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref fetchByfarmerIdAndRegionId(
        long farmerId, long regionId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfarmerIdAndRegionId(farmerId, regionId,
            retrieveFromCache);
    }

    /**
    * Removes the ref where farmerId = &#63; and regionId = &#63; from the database.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the ref that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref removeByfarmerIdAndRegionId(
        long farmerId, long regionId)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByfarmerIdAndRegionId(farmerId, regionId);
    }

    /**
    * Returns the number of refs where farmerId = &#63; and regionId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the number of matching refs
    * @throws SystemException if a system exception occurred
    */
    public static int countByfarmerIdAndRegionId(long farmerId, long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByfarmerIdAndRegionId(farmerId, regionId);
    }

    /**
    * Caches the ref in the entity cache if it is enabled.
    *
    * @param ref the ref
    */
    public static void cacheResult(com.isands.farmer.registry.model.Ref ref) {
        getPersistence().cacheResult(ref);
    }

    /**
    * Caches the refs in the entity cache if it is enabled.
    *
    * @param refs the refs
    */
    public static void cacheResult(
        java.util.List<com.isands.farmer.registry.model.Ref> refs) {
        getPersistence().cacheResult(refs);
    }

    /**
    * Creates a new ref with the primary key. Does not add the ref to the database.
    *
    * @param refPK the primary key for the new ref
    * @return the new ref
    */
    public static com.isands.farmer.registry.model.Ref create(RefPK refPK) {
        return getPersistence().create(refPK);
    }

    /**
    * Removes the ref with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param refPK the primary key of the ref
    * @return the ref that was removed
    * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref remove(RefPK refPK)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(refPK);
    }

    public static com.isands.farmer.registry.model.Ref updateImpl(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(ref);
    }

    /**
    * Returns the ref with the primary key or throws a {@link com.isands.farmer.registry.NoSuchRefException} if it could not be found.
    *
    * @param refPK the primary key of the ref
    * @return the ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref findByPrimaryKey(
        RefPK refPK)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(refPK);
    }

    /**
    * Returns the ref with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param refPK the primary key of the ref
    * @return the ref, or <code>null</code> if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref fetchByPrimaryKey(
        RefPK refPK) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(refPK);
    }

    /**
    * Returns all the refs.
    *
    * @return the refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.isands.farmer.registry.model.Ref> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the refs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refs
    * @param end the upper bound of the range of refs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the refs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of refs.
    *
    * @return the number of refs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RefPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RefPersistence) PortletBeanLocatorUtil.locate(com.isands.farmer.registry.service.ClpSerializer.getServletContextName(),
                    RefPersistence.class.getName());

            ReferenceRegistry.registerReference(RefUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RefPersistence persistence) {
    }
}
