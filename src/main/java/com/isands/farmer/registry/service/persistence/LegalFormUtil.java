package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.LegalForm;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the legal form service. This utility wraps {@link LegalFormPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalFormPersistence
 * @see LegalFormPersistenceImpl
 * @generated
 */
public class LegalFormUtil {
    private static LegalFormPersistence _persistence;

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
    public static void clearCache(LegalForm legalForm) {
        getPersistence().clearCache(legalForm);
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
    public static List<LegalForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LegalForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LegalForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static LegalForm update(LegalForm legalForm)
        throws SystemException {
        return getPersistence().update(legalForm);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static LegalForm update(LegalForm legalForm,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(legalForm, serviceContext);
    }

    /**
    * Returns the legal form where id = &#63; or throws a {@link com.isands.farmer.registry.NoSuchLegalFormException} if it could not be found.
    *
    * @param id the ID
    * @return the matching legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm findById(int id)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findById(id);
    }

    /**
    * Returns the legal form where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param id the ID
    * @return the matching legal form, or <code>null</code> if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm fetchById(int id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchById(id);
    }

    /**
    * Returns the legal form where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param id the ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching legal form, or <code>null</code> if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm fetchById(int id,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchById(id, retrieveFromCache);
    }

    /**
    * Removes the legal form where id = &#63; from the database.
    *
    * @param id the ID
    * @return the legal form that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm removeById(int id)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeById(id);
    }

    /**
    * Returns the number of legal forms where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching legal forms
    * @throws SystemException if a system exception occurred
    */
    public static int countById(int id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countById(id);
    }

    /**
    * Returns all the legal forms where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @return the matching legal forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.LegalForm> findByabbreviation(
        java.lang.String abbreviation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByabbreviation(abbreviation);
    }

    /**
    * Returns a range of all the legal forms where abbreviation LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.LegalFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param abbreviation the abbreviation
    * @param start the lower bound of the range of legal forms
    * @param end the upper bound of the range of legal forms (not inclusive)
    * @return the range of matching legal forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.LegalForm> findByabbreviation(
        java.lang.String abbreviation, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByabbreviation(abbreviation, start, end);
    }

    /**
    * Returns an ordered range of all the legal forms where abbreviation LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.LegalFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param abbreviation the abbreviation
    * @param start the lower bound of the range of legal forms
    * @param end the upper bound of the range of legal forms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching legal forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.LegalForm> findByabbreviation(
        java.lang.String abbreviation, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByabbreviation(abbreviation, start, end,
            orderByComparator);
    }

    /**
    * Returns the first legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm findByabbreviation_First(
        java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByabbreviation_First(abbreviation, orderByComparator);
    }

    /**
    * Returns the first legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching legal form, or <code>null</code> if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm fetchByabbreviation_First(
        java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByabbreviation_First(abbreviation, orderByComparator);
    }

    /**
    * Returns the last legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm findByabbreviation_Last(
        java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByabbreviation_Last(abbreviation, orderByComparator);
    }

    /**
    * Returns the last legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching legal form, or <code>null</code> if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm fetchByabbreviation_Last(
        java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByabbreviation_Last(abbreviation, orderByComparator);
    }

    /**
    * Returns the legal forms before and after the current legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param id the primary key of the current legal form
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm[] findByabbreviation_PrevAndNext(
        int id, java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByabbreviation_PrevAndNext(id, abbreviation,
            orderByComparator);
    }

    /**
    * Removes all the legal forms where abbreviation LIKE &#63; from the database.
    *
    * @param abbreviation the abbreviation
    * @throws SystemException if a system exception occurred
    */
    public static void removeByabbreviation(java.lang.String abbreviation)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByabbreviation(abbreviation);
    }

    /**
    * Returns the number of legal forms where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @return the number of matching legal forms
    * @throws SystemException if a system exception occurred
    */
    public static int countByabbreviation(java.lang.String abbreviation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByabbreviation(abbreviation);
    }

    /**
    * Caches the legal form in the entity cache if it is enabled.
    *
    * @param legalForm the legal form
    */
    public static void cacheResult(
        com.isands.farmer.registry.model.LegalForm legalForm) {
        getPersistence().cacheResult(legalForm);
    }

    /**
    * Caches the legal forms in the entity cache if it is enabled.
    *
    * @param legalForms the legal forms
    */
    public static void cacheResult(
        java.util.List<com.isands.farmer.registry.model.LegalForm> legalForms) {
        getPersistence().cacheResult(legalForms);
    }

    /**
    * Creates a new legal form with the primary key. Does not add the legal form to the database.
    *
    * @param id the primary key for the new legal form
    * @return the new legal form
    */
    public static com.isands.farmer.registry.model.LegalForm create(int id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the legal form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the legal form
    * @return the legal form that was removed
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm remove(int id)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.isands.farmer.registry.model.LegalForm updateImpl(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(legalForm);
    }

    /**
    * Returns the legal form with the primary key or throws a {@link com.isands.farmer.registry.NoSuchLegalFormException} if it could not be found.
    *
    * @param id the primary key of the legal form
    * @return the legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm findByPrimaryKey(
        int id)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the legal form with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the legal form
    * @return the legal form, or <code>null</code> if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.LegalForm fetchByPrimaryKey(
        int id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the legal forms.
    *
    * @return the legal forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.LegalForm> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.isands.farmer.registry.model.LegalForm> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the legal forms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.LegalFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of legal forms
    * @param end the upper bound of the range of legal forms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of legal forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.LegalForm> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the legal forms from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of legal forms.
    *
    * @return the number of legal forms
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LegalFormPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LegalFormPersistence) PortletBeanLocatorUtil.locate(com.isands.farmer.registry.service.ClpSerializer.getServletContextName(),
                    LegalFormPersistence.class.getName());

            ReferenceRegistry.registerReference(LegalFormUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LegalFormPersistence persistence) {
    }
}
