package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.LegalForm;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the legal form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalFormPersistenceImpl
 * @see LegalFormUtil
 * @generated
 */
public interface LegalFormPersistence extends BasePersistence<LegalForm> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LegalFormUtil} to access the legal form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the legal form where id = &#63; or throws a {@link com.isands.farmer.registry.NoSuchLegalFormException} if it could not be found.
    *
    * @param id the ID
    * @return the matching legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm findById(int id)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the legal form where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param id the ID
    * @return the matching legal form, or <code>null</code> if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm fetchById(int id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the legal form where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param id the ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching legal form, or <code>null</code> if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm fetchById(int id,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the legal form where id = &#63; from the database.
    *
    * @param id the ID
    * @return the legal form that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm removeById(int id)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of legal forms where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching legal forms
    * @throws SystemException if a system exception occurred
    */
    public int countById(int id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the legal forms where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @return the matching legal forms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.LegalForm> findByabbreviation(
        java.lang.String abbreviation)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.LegalForm> findByabbreviation(
        java.lang.String abbreviation, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.LegalForm> findByabbreviation(
        java.lang.String abbreviation, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm findByabbreviation_First(
        java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching legal form, or <code>null</code> if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm fetchByabbreviation_First(
        java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm findByabbreviation_Last(
        java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last legal form in the ordered set where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching legal form, or <code>null</code> if a matching legal form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm fetchByabbreviation_Last(
        java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.isands.farmer.registry.model.LegalForm[] findByabbreviation_PrevAndNext(
        int id, java.lang.String abbreviation,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the legal forms where abbreviation LIKE &#63; from the database.
    *
    * @param abbreviation the abbreviation
    * @throws SystemException if a system exception occurred
    */
    public void removeByabbreviation(java.lang.String abbreviation)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of legal forms where abbreviation LIKE &#63;.
    *
    * @param abbreviation the abbreviation
    * @return the number of matching legal forms
    * @throws SystemException if a system exception occurred
    */
    public int countByabbreviation(java.lang.String abbreviation)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the legal form in the entity cache if it is enabled.
    *
    * @param legalForm the legal form
    */
    public void cacheResult(
        com.isands.farmer.registry.model.LegalForm legalForm);

    /**
    * Caches the legal forms in the entity cache if it is enabled.
    *
    * @param legalForms the legal forms
    */
    public void cacheResult(
        java.util.List<com.isands.farmer.registry.model.LegalForm> legalForms);

    /**
    * Creates a new legal form with the primary key. Does not add the legal form to the database.
    *
    * @param id the primary key for the new legal form
    * @return the new legal form
    */
    public com.isands.farmer.registry.model.LegalForm create(int id);

    /**
    * Removes the legal form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the legal form
    * @return the legal form that was removed
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm remove(int id)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.isands.farmer.registry.model.LegalForm updateImpl(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the legal form with the primary key or throws a {@link com.isands.farmer.registry.NoSuchLegalFormException} if it could not be found.
    *
    * @param id the primary key of the legal form
    * @return the legal form
    * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm findByPrimaryKey(int id)
        throws com.isands.farmer.registry.NoSuchLegalFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the legal form with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the legal form
    * @return the legal form, or <code>null</code> if a legal form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.isands.farmer.registry.model.LegalForm fetchByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the legal forms.
    *
    * @return the legal forms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.isands.farmer.registry.model.LegalForm> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.LegalForm> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.isands.farmer.registry.model.LegalForm> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the legal forms from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of legal forms.
    *
    * @return the number of legal forms
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
