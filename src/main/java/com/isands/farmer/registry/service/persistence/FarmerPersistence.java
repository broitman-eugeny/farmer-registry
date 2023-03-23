package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Farmer;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the farmer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerPersistenceImpl
 * @see FarmerUtil
 * @generated
 */
public interface FarmerPersistence extends BasePersistence<Farmer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FarmerUtil} to access the farmer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the farmer where id = &#63; or throws a {@link com.isands.farmer.registry.NoSuchFarmerException} if it could not be found.
    *
    * @param id the ID
    * @return the matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findById(long id)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param id the ID
    * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchById(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param id the ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchById(long id,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the farmer where id = &#63; from the database.
    *
    * @param id the ID
    * @return the farmer that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer removeById(long id)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countById(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateFrom(
        java.util.Date registrationDate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where registrationDate &ge; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationDate the registration date
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateFrom(
        java.util.Date registrationDate, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where registrationDate &ge; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationDate the registration date
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateFrom(
        java.util.Date registrationDate, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByRegistrationDateFrom_First(
        java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByRegistrationDateFrom_First(
        java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByRegistrationDateFrom_Last(
        java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByRegistrationDateFrom_Last(
        java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param id the primary key of the current farmer
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer[] findByRegistrationDateFrom_PrevAndNext(
        long id, java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where registrationDate &ge; &#63; from the database.
    *
    * @param registrationDate the registration date
    * @throws SystemException if a system exception occurred
    */
    public void removeByRegistrationDateFrom(java.util.Date registrationDate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByRegistrationDateFrom(java.util.Date registrationDate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where registrationDate &le; &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where registrationDate &le; &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByRegistrationDateToAndIds_First(
        java.util.Date registrationDate, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByRegistrationDateToAndIds_First(
        java.util.Date registrationDate, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByRegistrationDateToAndIds_Last(
        java.util.Date registrationDate, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByRegistrationDateToAndIds_Last(
        java.util.Date registrationDate, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where registrationDate &le; &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationDate the registration date
    * @param ids the IDs
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where registrationDate &le; &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationDate the registration date
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where registrationDate &le; &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationDate the registration date
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where registrationDate &le; &#63; and id = &#63; from the database.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where registrationDate &le; &#63; and id = any &#63;.
    *
    * @param registrationDate the registration date
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByRegistrationDateToAndIds(
        java.util.Date registrationDate, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where organizationName LIKE &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organizationName the organization name
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where organizationName LIKE &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organizationName the organization name
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByOrgNameMaskAndIds_First(
        java.lang.String organizationName, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByOrgNameMaskAndIds_First(
        java.lang.String organizationName, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByOrgNameMaskAndIds_Last(
        java.lang.String organizationName, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByOrgNameMaskAndIds_Last(
        java.lang.String organizationName, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where organizationName LIKE &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organizationName the organization name
    * @param ids the IDs
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where organizationName LIKE &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organizationName the organization name
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where organizationName LIKE &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organizationName the organization name
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where organizationName LIKE &#63; and id = &#63; from the database.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByOrgNameMaskAndIds(java.lang.String organizationName,
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByOrgNameMaskAndIds(java.lang.String organizationName,
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where organizationName LIKE &#63; and id = any &#63;.
    *
    * @param organizationName the organization name
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByOrgNameMaskAndIds(java.lang.String organizationName,
        long[] ids) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where inn LIKE &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where inn LIKE &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByInnMaskAndIds_First(
        java.lang.String inn, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByInnMaskAndIds_First(
        java.lang.String inn, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByInnMaskAndIds_Last(
        java.lang.String inn, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByInnMaskAndIds_Last(
        java.lang.String inn, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where inn LIKE &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param ids the IDs
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where inn LIKE &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where inn LIKE &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where inn LIKE &#63; and id = &#63; from the database.
    *
    * @param inn the inn
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByInnMaskAndIds(java.lang.String inn, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByInnMaskAndIds(java.lang.String inn, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where inn LIKE &#63; and id = any &#63;.
    *
    * @param inn the inn
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByInnMaskAndIds(java.lang.String inn, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where archive = &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where archive = &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByArchiveAndIds_First(
        boolean archive, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByArchiveAndIds_First(
        boolean archive, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByArchiveAndIds_Last(
        boolean archive, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByArchiveAndIds_Last(
        boolean archive, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where archive = &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param ids the IDs
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where archive = &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where archive = &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where archive = &#63; and id = &#63; from the database.
    *
    * @param archive the archive
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByArchiveAndIds(boolean archive, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByArchiveAndIds(boolean archive, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where archive = &#63; and id = any &#63;.
    *
    * @param archive the archive
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByArchiveAndIds(boolean archive, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long regionId, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where regionId = &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionId the region ID
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long regionId, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where regionId = &#63; and id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionId the region ID
    * @param id the ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long regionId, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByRegionIdsAndIds_First(
        long regionId, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByRegionIdsAndIds_First(
        long regionId, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByRegionIdsAndIds_Last(
        long regionId, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByRegionIdsAndIds_Last(
        long regionId, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where regionId = any &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionIds the region IDs
    * @param ids the IDs
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long[] regionIds, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where regionId = any &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionIds the region IDs
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long[] regionIds, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where regionId = any &#63; and id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionIds the region IDs
    * @param ids the IDs
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long[] regionIds, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where regionId = &#63; and id = &#63; from the database.
    *
    * @param regionId the region ID
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByRegionIdsAndIds(long regionId, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByRegionIdsAndIds(long regionId, long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where regionId = any &#63; and id = any &#63;.
    *
    * @param regionIds the region IDs
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByRegionIdsAndIds(long[] regionIds, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the farmer in the entity cache if it is enabled.
    *
    * @param farmer the farmer
    */
    public void cacheResult(com.isands.farmer.registry.model.Farmer farmer);

    /**
    * Caches the farmers in the entity cache if it is enabled.
    *
    * @param farmers the farmers
    */
    public void cacheResult(
        java.util.List<com.isands.farmer.registry.model.Farmer> farmers);

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param id the primary key for the new farmer
    * @return the new farmer
    */
    public com.isands.farmer.registry.model.Farmer create(long id);

    /**
    * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the farmer
    * @return the farmer that was removed
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer remove(long id)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.isands.farmer.registry.model.Farmer updateImpl(
        com.isands.farmer.registry.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer with the primary key or throws a {@link com.isands.farmer.registry.NoSuchFarmerException} if it could not be found.
    *
    * @param id the primary key of the farmer
    * @return the farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer findByPrimaryKey(long id)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the farmer
    * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.Farmer fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers.
    *
    * @return the farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.Farmer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
