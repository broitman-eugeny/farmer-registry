package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Ref;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the ref service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RefPersistenceImpl
 * @see RefUtil
 * @generated
 */
public interface RefPersistence extends BasePersistence<Ref> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RefUtil} to access the ref persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the refs where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @return the matching refs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first ref in the ordered set where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref findByfarmerId_First(
        long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first ref in the ordered set where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref fetchByfarmerId_First(
        long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last ref in the ordered set where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref findByfarmerId_Last(
        long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last ref in the ordered set where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref fetchByfarmerId_Last(
        long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.isands.farmer.registry.model.Ref[] findByfarmerId_PrevAndNext(
        RefPK refPK, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the refs where farmerId = &#63; from the database.
    *
    * @param farmerId the farmer ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByfarmerId(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of refs where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @return the number of matching refs
    * @throws SystemException if a system exception occurred
    */
    public int countByfarmerId(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the refs where regionId = &#63;.
    *
    * @param regionId the region ID
    * @return the matching refs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Ref> findByregionId(
        long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Ref> findByregionId(
        long regionId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Ref> findByregionId(
        long regionId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first ref in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref findByregionId_First(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first ref in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref fetchByregionId_First(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last ref in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref findByregionId_Last(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last ref in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref fetchByregionId_Last(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.isands.farmer.registry.model.Ref[] findByregionId_PrevAndNext(
        RefPK refPK, long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the refs where regionId = &#63; from the database.
    *
    * @param regionId the region ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByregionId(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of refs where regionId = &#63;.
    *
    * @param regionId the region ID
    * @return the number of matching refs
    * @throws SystemException if a system exception occurred
    */
    public int countByregionId(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or throws a {@link com.isands.farmer.registry.NoSuchRefException} if it could not be found.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the matching ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref findByfarmerIdAndRegionId(
        long farmerId, long regionId)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref fetchByfarmerIdAndRegionId(
        long farmerId, long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching ref, or <code>null</code> if a matching ref could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref fetchByfarmerIdAndRegionId(
        long farmerId, long regionId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the ref where farmerId = &#63; and regionId = &#63; from the database.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the ref that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref removeByfarmerIdAndRegionId(
        long farmerId, long regionId)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of refs where farmerId = &#63; and regionId = &#63;.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the number of matching refs
    * @throws SystemException if a system exception occurred
    */
    public int countByfarmerIdAndRegionId(long farmerId, long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the ref in the entity cache if it is enabled.
    *
    * @param ref the ref
    */
    public void cacheResult(com.isands.farmer.registry.model.Ref ref);

    /**
    * Caches the refs in the entity cache if it is enabled.
    *
    * @param refs the refs
    */
    public void cacheResult(
        java.util.List<com.isands.farmer.registry.model.Ref> refs);

    /**
    * Creates a new ref with the primary key. Does not add the ref to the database.
    *
    * @param refPK the primary key for the new ref
    * @return the new ref
    */
    public com.isands.farmer.registry.model.Ref create(RefPK refPK);

    /**
    * Removes the ref with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param refPK the primary key of the ref
    * @return the ref that was removed
    * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref remove(RefPK refPK)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.isands.farmer.registry.model.Ref updateImpl(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the ref with the primary key or throws a {@link com.isands.farmer.registry.NoSuchRefException} if it could not be found.
    *
    * @param refPK the primary key of the ref
    * @return the ref
    * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref findByPrimaryKey(RefPK refPK)
        throws com.isands.farmer.registry.NoSuchRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the ref with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param refPK the primary key of the ref
    * @return the ref, or <code>null</code> if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Ref fetchByPrimaryKey(RefPK refPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the refs.
    *
    * @return the refs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Ref> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Ref> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Ref> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the refs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of refs.
    *
    * @return the number of refs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
