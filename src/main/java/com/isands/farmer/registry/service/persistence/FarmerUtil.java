package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Farmer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the farmer service. This utility wraps {@link FarmerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerPersistence
 * @see FarmerPersistenceImpl
 * @generated
 */
public class FarmerUtil {
    private static FarmerPersistence _persistence;

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
    public static void clearCache(Farmer farmer) {
        getPersistence().clearCache(farmer);
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
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Farmer update(Farmer farmer) throws SystemException {
        return getPersistence().update(farmer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Farmer update(Farmer farmer, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(farmer, serviceContext);
    }

    /**
    * Returns the farmer where id = &#63; or throws a {@link com.isands.farmer.registry.NoSuchFarmerException} if it could not be found.
    *
    * @param id the ID
    * @return the matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer findById(long id)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findById(id);
    }

    /**
    * Returns the farmer where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param id the ID
    * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchById(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchById(id);
    }

    /**
    * Returns the farmer where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param id the ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchById(long id,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchById(id, retrieveFromCache);
    }

    /**
    * Removes the farmer where id = &#63; from the database.
    *
    * @param id the ID
    * @return the farmer that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer removeById(long id)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeById(id);
    }

    /**
    * Returns the number of farmers where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countById(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countById(id);
    }

    /**
    * Returns all the farmers where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateFrom(
        java.util.Date registrationDate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRegistrationDateFrom(registrationDate);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateFrom(
        java.util.Date registrationDate, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateFrom(registrationDate, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateFrom(
        java.util.Date registrationDate, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateFrom(registrationDate, start, end,
            orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer findByRegistrationDateFrom_First(
        java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateFrom_First(registrationDate,
            orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByRegistrationDateFrom_First(
        java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegistrationDateFrom_First(registrationDate,
            orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer findByRegistrationDateFrom_Last(
        java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateFrom_Last(registrationDate,
            orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByRegistrationDateFrom_Last(
        java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegistrationDateFrom_Last(registrationDate,
            orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer[] findByRegistrationDateFrom_PrevAndNext(
        long id, java.util.Date registrationDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateFrom_PrevAndNext(id,
            registrationDate, orderByComparator);
    }

    /**
    * Removes all the farmers where registrationDate &ge; &#63; from the database.
    *
    * @param registrationDate the registration date
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRegistrationDateFrom(
        java.util.Date registrationDate)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRegistrationDateFrom(registrationDate);
    }

    /**
    * Returns the number of farmers where registrationDate &ge; &#63;.
    *
    * @param registrationDate the registration date
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByRegistrationDateFrom(
        java.util.Date registrationDate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRegistrationDateFrom(registrationDate);
    }

    /**
    * Returns all the farmers where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateToAndIds(registrationDate, id);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateToAndIds(registrationDate, id, start,
            end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateToAndIds(registrationDate, id, start,
            end, orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByRegistrationDateToAndIds_First(
        java.util.Date registrationDate, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateToAndIds_First(registrationDate, id,
            orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByRegistrationDateToAndIds_First(
        java.util.Date registrationDate, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegistrationDateToAndIds_First(registrationDate, id,
            orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByRegistrationDateToAndIds_Last(
        java.util.Date registrationDate, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateToAndIds_Last(registrationDate, id,
            orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByRegistrationDateToAndIds_Last(
        java.util.Date registrationDate, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegistrationDateToAndIds_Last(registrationDate, id,
            orderByComparator);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateToAndIds(registrationDate, ids);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateToAndIds(registrationDate, ids,
            start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegistrationDateToAndIds(
        java.util.Date registrationDate, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegistrationDateToAndIds(registrationDate, ids,
            start, end, orderByComparator);
    }

    /**
    * Removes all the farmers where registrationDate &le; &#63; and id = &#63; from the database.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRegistrationDateToAndIds(registrationDate, id);
    }

    /**
    * Returns the number of farmers where registrationDate &le; &#63; and id = &#63;.
    *
    * @param registrationDate the registration date
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByRegistrationDateToAndIds(
        java.util.Date registrationDate, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByRegistrationDateToAndIds(registrationDate, id);
    }

    /**
    * Returns the number of farmers where registrationDate &le; &#63; and id = any &#63;.
    *
    * @param registrationDate the registration date
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByRegistrationDateToAndIds(
        java.util.Date registrationDate, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByRegistrationDateToAndIds(registrationDate, ids);
    }

    /**
    * Returns all the farmers where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByOrgNameMaskAndIds(organizationName, id);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByOrgNameMaskAndIds(organizationName, id, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByOrgNameMaskAndIds(organizationName, id, start, end,
            orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByOrgNameMaskAndIds_First(
        java.lang.String organizationName, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByOrgNameMaskAndIds_First(organizationName, id,
            orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByOrgNameMaskAndIds_First(
        java.lang.String organizationName, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByOrgNameMaskAndIds_First(organizationName, id,
            orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByOrgNameMaskAndIds_Last(
        java.lang.String organizationName, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByOrgNameMaskAndIds_Last(organizationName, id,
            orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByOrgNameMaskAndIds_Last(
        java.lang.String organizationName, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByOrgNameMaskAndIds_Last(organizationName, id,
            orderByComparator);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByOrgNameMaskAndIds(organizationName, ids);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByOrgNameMaskAndIds(organizationName, ids, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByOrgNameMaskAndIds(
        java.lang.String organizationName, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByOrgNameMaskAndIds(organizationName, ids, start, end,
            orderByComparator);
    }

    /**
    * Removes all the farmers where organizationName LIKE &#63; and id = &#63; from the database.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByOrgNameMaskAndIds(
        java.lang.String organizationName, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByOrgNameMaskAndIds(organizationName, id);
    }

    /**
    * Returns the number of farmers where organizationName LIKE &#63; and id = &#63;.
    *
    * @param organizationName the organization name
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByOrgNameMaskAndIds(
        java.lang.String organizationName, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByOrgNameMaskAndIds(organizationName, id);
    }

    /**
    * Returns the number of farmers where organizationName LIKE &#63; and id = any &#63;.
    *
    * @param organizationName the organization name
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByOrgNameMaskAndIds(
        java.lang.String organizationName, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByOrgNameMaskAndIds(organizationName, ids);
    }

    /**
    * Returns all the farmers where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInnMaskAndIds(inn, id);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInnMaskAndIds(inn, id, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInnMaskAndIds(inn, id, start, end, orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByInnMaskAndIds_First(
        java.lang.String inn, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInnMaskAndIds_First(inn, id, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByInnMaskAndIds_First(
        java.lang.String inn, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByInnMaskAndIds_First(inn, id, orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByInnMaskAndIds_Last(
        java.lang.String inn, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInnMaskAndIds_Last(inn, id, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByInnMaskAndIds_Last(
        java.lang.String inn, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByInnMaskAndIds_Last(inn, id, orderByComparator);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInnMaskAndIds(inn, ids);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInnMaskAndIds(inn, ids, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByInnMaskAndIds(
        java.lang.String inn, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInnMaskAndIds(inn, ids, start, end, orderByComparator);
    }

    /**
    * Removes all the farmers where inn LIKE &#63; and id = &#63; from the database.
    *
    * @param inn the inn
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByInnMaskAndIds(java.lang.String inn, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByInnMaskAndIds(inn, id);
    }

    /**
    * Returns the number of farmers where inn LIKE &#63; and id = &#63;.
    *
    * @param inn the inn
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByInnMaskAndIds(java.lang.String inn, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByInnMaskAndIds(inn, id);
    }

    /**
    * Returns the number of farmers where inn LIKE &#63; and id = any &#63;.
    *
    * @param inn the inn
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByInnMaskAndIds(java.lang.String inn, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByInnMaskAndIds(inn, ids);
    }

    /**
    * Returns all the farmers where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveAndIds(archive, id);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveAndIds(archive, id, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchiveAndIds(archive, id, start, end,
            orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByArchiveAndIds_First(
        boolean archive, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchiveAndIds_First(archive, id, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByArchiveAndIds_First(
        boolean archive, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchiveAndIds_First(archive, id, orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByArchiveAndIds_Last(
        boolean archive, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchiveAndIds_Last(archive, id, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByArchiveAndIds_Last(
        boolean archive, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchiveAndIds_Last(archive, id, orderByComparator);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveAndIds(archive, ids);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveAndIds(archive, ids, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByArchiveAndIds(
        boolean archive, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchiveAndIds(archive, ids, start, end,
            orderByComparator);
    }

    /**
    * Removes all the farmers where archive = &#63; and id = &#63; from the database.
    *
    * @param archive the archive
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByArchiveAndIds(boolean archive, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByArchiveAndIds(archive, id);
    }

    /**
    * Returns the number of farmers where archive = &#63; and id = &#63;.
    *
    * @param archive the archive
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByArchiveAndIds(boolean archive, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByArchiveAndIds(archive, id);
    }

    /**
    * Returns the number of farmers where archive = &#63; and id = any &#63;.
    *
    * @param archive the archive
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByArchiveAndIds(boolean archive, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByArchiveAndIds(archive, ids);
    }

    /**
    * Returns all the farmers where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long regionId, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRegionIdsAndIds(regionId, id);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long regionId, long id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRegionIdsAndIds(regionId, id, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long regionId, long id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegionIdsAndIds(regionId, id, start, end,
            orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByRegionIdsAndIds_First(
        long regionId, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegionIdsAndIds_First(regionId, id, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByRegionIdsAndIds_First(
        long regionId, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegionIdsAndIds_First(regionId, id, orderByComparator);
    }

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
    public static com.isands.farmer.registry.model.Farmer findByRegionIdsAndIds_Last(
        long regionId, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegionIdsAndIds_Last(regionId, id, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByRegionIdsAndIds_Last(
        long regionId, long id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegionIdsAndIds_Last(regionId, id, orderByComparator);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long[] regionIds, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRegionIdsAndIds(regionIds, ids);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long[] regionIds, long[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRegionIdsAndIds(regionIds, ids, start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findByRegionIdsAndIds(
        long[] regionIds, long[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegionIdsAndIds(regionIds, ids, start, end,
            orderByComparator);
    }

    /**
    * Removes all the farmers where regionId = &#63; and id = &#63; from the database.
    *
    * @param regionId the region ID
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRegionIdsAndIds(long regionId, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRegionIdsAndIds(regionId, id);
    }

    /**
    * Returns the number of farmers where regionId = &#63; and id = &#63;.
    *
    * @param regionId the region ID
    * @param id the ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByRegionIdsAndIds(long regionId, long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRegionIdsAndIds(regionId, id);
    }

    /**
    * Returns the number of farmers where regionId = any &#63; and id = any &#63;.
    *
    * @param regionIds the region IDs
    * @param ids the IDs
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByRegionIdsAndIds(long[] regionIds, long[] ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRegionIdsAndIds(regionIds, ids);
    }

    /**
    * Caches the farmer in the entity cache if it is enabled.
    *
    * @param farmer the farmer
    */
    public static void cacheResult(
        com.isands.farmer.registry.model.Farmer farmer) {
        getPersistence().cacheResult(farmer);
    }

    /**
    * Caches the farmers in the entity cache if it is enabled.
    *
    * @param farmers the farmers
    */
    public static void cacheResult(
        java.util.List<com.isands.farmer.registry.model.Farmer> farmers) {
        getPersistence().cacheResult(farmers);
    }

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param id the primary key for the new farmer
    * @return the new farmer
    */
    public static com.isands.farmer.registry.model.Farmer create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the farmer
    * @return the farmer that was removed
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer remove(long id)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.isands.farmer.registry.model.Farmer updateImpl(
        com.isands.farmer.registry.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(farmer);
    }

    /**
    * Returns the farmer with the primary key or throws a {@link com.isands.farmer.registry.NoSuchFarmerException} if it could not be found.
    *
    * @param id the primary key of the farmer
    * @return the farmer
    * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer findByPrimaryKey(
        long id)
        throws com.isands.farmer.registry.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the farmer
    * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Farmer fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the farmers.
    *
    * @return the farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.isands.farmer.registry.model.Farmer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the farmers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static FarmerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FarmerPersistence) PortletBeanLocatorUtil.locate(com.isands.farmer.registry.service.ClpSerializer.getServletContextName(),
                    FarmerPersistence.class.getName());

            ReferenceRegistry.registerReference(FarmerUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FarmerPersistence persistence) {
    }
}
