package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Region;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegionPersistenceImpl
 * @see RegionUtil
 * @generated
 */
public interface RegionPersistence extends BasePersistence<Region> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RegionUtil} to access the region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the region where id = &#63; or throws a {@link com.isands.farmer.registry.NoSuchRegionException} if it could not be found.
    *
    * @param id the ID
    * @return the matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region findById(long id)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the region where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param id the ID
    * @return the matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchById(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the region where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param id the ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchById(long id,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the region where id = &#63; from the database.
    *
    * @param id the ID
    * @return the region that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region removeById(long id)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countById(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the regions where archive = &#63;.
    *
    * @param archive the archive
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByArchive(
        boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region findByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region findByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.isands.farmer.registry.model.Region[] findByArchive_PrevAndNext(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the regions where archive = &#63; from the database.
    *
    * @param archive the archive
    * @throws SystemException if a system exception occurred
    */
    public void removeByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where archive = &#63;.
    *
    * @param archive the archive
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the regions where id = &#63;.
    *
    * @param id the ID
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region findByIds_First(long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByIds_First(long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region findByIds_Last(long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByIds_Last(long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long[] ids) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByIds(
        long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the regions where id = &#63; from the database.
    *
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByIds(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByIds(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where id = any &#63;.
    *
    * @param ids the IDs
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByIds(long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the regions where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long id, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long id, boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long id, boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.isands.farmer.registry.model.Region findByNotInIdsAndArchive_First(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByNotInIdsAndArchive_First(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.isands.farmer.registry.model.Region findByNotInIdsAndArchive_Last(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByNotInIdsAndArchive_Last(
        long id, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long[] ids, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long[] ids, boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByNotInIdsAndArchive(
        long[] ids, boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the regions where id &ne; &#63; and archive = &#63; from the database.
    *
    * @param id the ID
    * @param archive the archive
    * @throws SystemException if a system exception occurred
    */
    public void removeByNotInIdsAndArchive(long id, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where id &ne; &#63; and archive = &#63;.
    *
    * @param id the ID
    * @param archive the archive
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByNotInIdsAndArchive(long id, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where id &ne; all &#63; and archive = &#63;.
    *
    * @param ids the IDs
    * @param archive the archive
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByNotInIdsAndArchive(long[] ids, boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the regions where name LIKE &#63;.
    *
    * @param name the name
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Region> findByNameMask(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByNameMask(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findByNameMask(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where name LIKE &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region findByNameMask_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where name LIKE &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByNameMask_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where name LIKE &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region findByNameMask_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where name LIKE &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByNameMask_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.isands.farmer.registry.model.Region[] findByNameMask_PrevAndNext(
        long id, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the regions where name LIKE &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public void removeByNameMask(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where name LIKE &#63;.
    *
    * @param name the name
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByNameMask(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the region in the entity cache if it is enabled.
    *
    * @param region the region
    */
    public void cacheResult(com.isands.farmer.registry.model.Region region);

    /**
    * Caches the regions in the entity cache if it is enabled.
    *
    * @param regions the regions
    */
    public void cacheResult(
        java.util.List<com.isands.farmer.registry.model.Region> regions);

    /**
    * Creates a new region with the primary key. Does not add the region to the database.
    *
    * @param id the primary key for the new region
    * @return the new region
    */
    public com.isands.farmer.registry.model.Region create(long id);

    /**
    * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the region
    * @return the region that was removed
    * @throws com.isands.farmer.registry.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region remove(long id)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.isands.farmer.registry.model.Region updateImpl(
        com.isands.farmer.registry.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the region with the primary key or throws a {@link com.isands.farmer.registry.NoSuchRegionException} if it could not be found.
    *
    * @param id the primary key of the region
    * @return the region
    * @throws com.isands.farmer.registry.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region findByPrimaryKey(long id)
        throws com.isands.farmer.registry.NoSuchRegionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the region with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the region
    * @return the region, or <code>null</code> if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Region fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the regions.
    *
    * @return the regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Region> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.Region> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the regions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions.
    *
    * @return the number of regions
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
