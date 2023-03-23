package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.NoSuchLegalFormException;
import com.isands.farmer.registry.model.LegalForm;
import com.isands.farmer.registry.model.impl.LegalFormImpl;
import com.isands.farmer.registry.model.impl.LegalFormModelImpl;
import com.isands.farmer.registry.service.persistence.LegalFormPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the legal form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalFormPersistence
 * @see LegalFormUtil
 * @generated
 */
public class LegalFormPersistenceImpl extends BasePersistenceImpl<LegalForm>
    implements LegalFormPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LegalFormUtil} to access the legal form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LegalFormImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormModelImpl.FINDER_CACHE_ENABLED, LegalFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormModelImpl.FINDER_CACHE_ENABLED, LegalFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_ID = new FinderPath(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormModelImpl.FINDER_CACHE_ENABLED, LegalFormImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchById",
            new String[] { Integer.class.getName() },
            LegalFormModelImpl.ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countById",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_ID_ID_2 = "legalForm.id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ABBREVIATION =
        new FinderPath(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormModelImpl.FINDER_CACHE_ENABLED, LegalFormImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByabbreviation",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_ABBREVIATION =
        new FinderPath(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByabbreviation",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_ABBREVIATION_ABBREVIATION_1 = "legalForm.abbreviation LIKE NULL";
    private static final String _FINDER_COLUMN_ABBREVIATION_ABBREVIATION_2 = "lower(legalForm.abbreviation) LIKE ?";
    private static final String _FINDER_COLUMN_ABBREVIATION_ABBREVIATION_3 = "(legalForm.abbreviation IS NULL OR legalForm.abbreviation LIKE '')";
    private static final String _SQL_SELECT_LEGALFORM = "SELECT legalForm FROM LegalForm legalForm";
    private static final String _SQL_SELECT_LEGALFORM_WHERE = "SELECT legalForm FROM LegalForm legalForm WHERE ";
    private static final String _SQL_COUNT_LEGALFORM = "SELECT COUNT(legalForm) FROM LegalForm legalForm";
    private static final String _SQL_COUNT_LEGALFORM_WHERE = "SELECT COUNT(legalForm) FROM LegalForm legalForm WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "legalForm.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LegalForm exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LegalForm exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LegalFormPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static LegalForm _nullLegalForm = new LegalFormImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<LegalForm> toCacheModel() {
                return _nullLegalFormCacheModel;
            }
        };

    private static CacheModel<LegalForm> _nullLegalFormCacheModel = new CacheModel<LegalForm>() {
            @Override
            public LegalForm toEntityModel() {
                return _nullLegalForm;
            }
        };

    public LegalFormPersistenceImpl() {
        setModelClass(LegalForm.class);
    }

    /**
     * Returns the legal form where id = &#63; or throws a {@link com.isands.farmer.registry.NoSuchLegalFormException} if it could not be found.
     *
     * @param id the ID
     * @return the matching legal form
     * @throws com.isands.farmer.registry.NoSuchLegalFormException if a matching legal form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm findById(int id)
        throws NoSuchLegalFormException, SystemException {
        LegalForm legalForm = fetchById(id);

        if (legalForm == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("id=");
            msg.append(id);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchLegalFormException(msg.toString());
        }

        return legalForm;
    }

    /**
     * Returns the legal form where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param id the ID
     * @return the matching legal form, or <code>null</code> if a matching legal form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm fetchById(int id) throws SystemException {
        return fetchById(id, true);
    }

    /**
     * Returns the legal form where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param id the ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching legal form, or <code>null</code> if a matching legal form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm fetchById(int id, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { id };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ID,
                    finderArgs, this);
        }

        if (result instanceof LegalForm) {
            LegalForm legalForm = (LegalForm) result;

            if ((id != legalForm.getId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_LEGALFORM_WHERE);

            query.append(_FINDER_COLUMN_ID_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(id);

                List<LegalForm> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "LegalFormPersistenceImpl.fetchById(int, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    LegalForm legalForm = list.get(0);

                    result = legalForm;

                    cacheResult(legalForm);

                    if ((legalForm.getId() != id)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
                            finderArgs, legalForm);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (LegalForm) result;
        }
    }

    /**
     * Removes the legal form where id = &#63; from the database.
     *
     * @param id the ID
     * @return the legal form that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm removeById(int id)
        throws NoSuchLegalFormException, SystemException {
        LegalForm legalForm = findById(id);

        return remove(legalForm);
    }

    /**
     * Returns the number of legal forms where id = &#63;.
     *
     * @param id the ID
     * @return the number of matching legal forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countById(int id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

        Object[] finderArgs = new Object[] { id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_LEGALFORM_WHERE);

            query.append(_FINDER_COLUMN_ID_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the legal forms where abbreviation LIKE &#63;.
     *
     * @param abbreviation the abbreviation
     * @return the matching legal forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LegalForm> findByabbreviation(String abbreviation)
        throws SystemException {
        return findByabbreviation(abbreviation, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<LegalForm> findByabbreviation(String abbreviation, int start,
        int end) throws SystemException {
        return findByabbreviation(abbreviation, start, end, null);
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
    @Override
    public List<LegalForm> findByabbreviation(String abbreviation, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ABBREVIATION;
        finderArgs = new Object[] { abbreviation, start, end, orderByComparator };

        List<LegalForm> list = (List<LegalForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (LegalForm legalForm : list) {
                if (!StringUtil.wildcardMatches(legalForm.getAbbreviation(),
                            abbreviation, CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, false)) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_LEGALFORM_WHERE);

            boolean bindAbbreviation = false;

            if (abbreviation == null) {
                query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_1);
            } else if (abbreviation.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_3);
            } else {
                bindAbbreviation = true;

                query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(LegalFormModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindAbbreviation) {
                    qPos.add(abbreviation.toLowerCase());
                }

                if (!pagination) {
                    list = (List<LegalForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LegalForm>(list);
                } else {
                    list = (List<LegalForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public LegalForm findByabbreviation_First(String abbreviation,
        OrderByComparator orderByComparator)
        throws NoSuchLegalFormException, SystemException {
        LegalForm legalForm = fetchByabbreviation_First(abbreviation,
                orderByComparator);

        if (legalForm != null) {
            return legalForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("abbreviation=");
        msg.append(abbreviation);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLegalFormException(msg.toString());
    }

    /**
     * Returns the first legal form in the ordered set where abbreviation LIKE &#63;.
     *
     * @param abbreviation the abbreviation
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching legal form, or <code>null</code> if a matching legal form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm fetchByabbreviation_First(String abbreviation,
        OrderByComparator orderByComparator) throws SystemException {
        List<LegalForm> list = findByabbreviation(abbreviation, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public LegalForm findByabbreviation_Last(String abbreviation,
        OrderByComparator orderByComparator)
        throws NoSuchLegalFormException, SystemException {
        LegalForm legalForm = fetchByabbreviation_Last(abbreviation,
                orderByComparator);

        if (legalForm != null) {
            return legalForm;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("abbreviation=");
        msg.append(abbreviation);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLegalFormException(msg.toString());
    }

    /**
     * Returns the last legal form in the ordered set where abbreviation LIKE &#63;.
     *
     * @param abbreviation the abbreviation
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching legal form, or <code>null</code> if a matching legal form could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm fetchByabbreviation_Last(String abbreviation,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByabbreviation(abbreviation);

        if (count == 0) {
            return null;
        }

        List<LegalForm> list = findByabbreviation(abbreviation, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public LegalForm[] findByabbreviation_PrevAndNext(int id,
        String abbreviation, OrderByComparator orderByComparator)
        throws NoSuchLegalFormException, SystemException {
        LegalForm legalForm = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            LegalForm[] array = new LegalFormImpl[3];

            array[0] = getByabbreviation_PrevAndNext(session, legalForm,
                    abbreviation, orderByComparator, true);

            array[1] = legalForm;

            array[2] = getByabbreviation_PrevAndNext(session, legalForm,
                    abbreviation, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected LegalForm getByabbreviation_PrevAndNext(Session session,
        LegalForm legalForm, String abbreviation,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_LEGALFORM_WHERE);

        boolean bindAbbreviation = false;

        if (abbreviation == null) {
            query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_1);
        } else if (abbreviation.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_3);
        } else {
            bindAbbreviation = true;

            query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(LegalFormModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindAbbreviation) {
            qPos.add(abbreviation.toLowerCase());
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(legalForm);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<LegalForm> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the legal forms where abbreviation LIKE &#63; from the database.
     *
     * @param abbreviation the abbreviation
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByabbreviation(String abbreviation)
        throws SystemException {
        for (LegalForm legalForm : findByabbreviation(abbreviation,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(legalForm);
        }
    }

    /**
     * Returns the number of legal forms where abbreviation LIKE &#63;.
     *
     * @param abbreviation the abbreviation
     * @return the number of matching legal forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByabbreviation(String abbreviation)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_ABBREVIATION;

        Object[] finderArgs = new Object[] { abbreviation };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_LEGALFORM_WHERE);

            boolean bindAbbreviation = false;

            if (abbreviation == null) {
                query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_1);
            } else if (abbreviation.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_3);
            } else {
                bindAbbreviation = true;

                query.append(_FINDER_COLUMN_ABBREVIATION_ABBREVIATION_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindAbbreviation) {
                    qPos.add(abbreviation.toLowerCase());
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the legal form in the entity cache if it is enabled.
     *
     * @param legalForm the legal form
     */
    @Override
    public void cacheResult(LegalForm legalForm) {
        EntityCacheUtil.putResult(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormImpl.class, legalForm.getPrimaryKey(), legalForm);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
            new Object[] { legalForm.getId() }, legalForm);

        legalForm.resetOriginalValues();
    }

    /**
     * Caches the legal forms in the entity cache if it is enabled.
     *
     * @param legalForms the legal forms
     */
    @Override
    public void cacheResult(List<LegalForm> legalForms) {
        for (LegalForm legalForm : legalForms) {
            if (EntityCacheUtil.getResult(
                        LegalFormModelImpl.ENTITY_CACHE_ENABLED,
                        LegalFormImpl.class, legalForm.getPrimaryKey()) == null) {
                cacheResult(legalForm);
            } else {
                legalForm.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all legal forms.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LegalFormImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LegalFormImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the legal form.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(LegalForm legalForm) {
        EntityCacheUtil.removeResult(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormImpl.class, legalForm.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(legalForm);
    }

    @Override
    public void clearCache(List<LegalForm> legalForms) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (LegalForm legalForm : legalForms) {
            EntityCacheUtil.removeResult(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
                LegalFormImpl.class, legalForm.getPrimaryKey());

            clearUniqueFindersCache(legalForm);
        }
    }

    protected void cacheUniqueFindersCache(LegalForm legalForm) {
        if (legalForm.isNew()) {
            Object[] args = new Object[] { legalForm.getId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args, legalForm);
        } else {
            LegalFormModelImpl legalFormModelImpl = (LegalFormModelImpl) legalForm;

            if ((legalFormModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { legalForm.getId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args,
                    legalForm);
            }
        }
    }

    protected void clearUniqueFindersCache(LegalForm legalForm) {
        LegalFormModelImpl legalFormModelImpl = (LegalFormModelImpl) legalForm;

        Object[] args = new Object[] { legalForm.getId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);

        if ((legalFormModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
            args = new Object[] { legalFormModelImpl.getOriginalId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);
        }
    }

    /**
     * Creates a new legal form with the primary key. Does not add the legal form to the database.
     *
     * @param id the primary key for the new legal form
     * @return the new legal form
     */
    @Override
    public LegalForm create(int id) {
        LegalForm legalForm = new LegalFormImpl();

        legalForm.setNew(true);
        legalForm.setPrimaryKey(id);

        return legalForm;
    }

    /**
     * Removes the legal form with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the legal form
     * @return the legal form that was removed
     * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm remove(int id)
        throws NoSuchLegalFormException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the legal form with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the legal form
     * @return the legal form that was removed
     * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm remove(Serializable primaryKey)
        throws NoSuchLegalFormException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LegalForm legalForm = (LegalForm) session.get(LegalFormImpl.class,
                    primaryKey);

            if (legalForm == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLegalFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(legalForm);
        } catch (NoSuchLegalFormException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected LegalForm removeImpl(LegalForm legalForm)
        throws SystemException {
        legalForm = toUnwrappedModel(legalForm);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(legalForm)) {
                legalForm = (LegalForm) session.get(LegalFormImpl.class,
                        legalForm.getPrimaryKeyObj());
            }

            if (legalForm != null) {
                session.delete(legalForm);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (legalForm != null) {
            clearCache(legalForm);
        }

        return legalForm;
    }

    @Override
    public LegalForm updateImpl(
        com.isands.farmer.registry.model.LegalForm legalForm)
        throws SystemException {
        legalForm = toUnwrappedModel(legalForm);

        boolean isNew = legalForm.isNew();

        Session session = null;

        try {
            session = openSession();

            if (legalForm.isNew()) {
                session.save(legalForm);

                legalForm.setNew(false);
            } else {
                session.merge(legalForm);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !LegalFormModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
            LegalFormImpl.class, legalForm.getPrimaryKey(), legalForm);

        clearUniqueFindersCache(legalForm);
        cacheUniqueFindersCache(legalForm);

        return legalForm;
    }

    protected LegalForm toUnwrappedModel(LegalForm legalForm) {
        if (legalForm instanceof LegalFormImpl) {
            return legalForm;
        }

        LegalFormImpl legalFormImpl = new LegalFormImpl();

        legalFormImpl.setNew(legalForm.isNew());
        legalFormImpl.setPrimaryKey(legalForm.getPrimaryKey());

        legalFormImpl.setId(legalForm.getId());
        legalFormImpl.setAbbreviation(legalForm.getAbbreviation());

        return legalFormImpl;
    }

    /**
     * Returns the legal form with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the legal form
     * @return the legal form
     * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLegalFormException, SystemException {
        LegalForm legalForm = fetchByPrimaryKey(primaryKey);

        if (legalForm == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLegalFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return legalForm;
    }

    /**
     * Returns the legal form with the primary key or throws a {@link com.isands.farmer.registry.NoSuchLegalFormException} if it could not be found.
     *
     * @param id the primary key of the legal form
     * @return the legal form
     * @throws com.isands.farmer.registry.NoSuchLegalFormException if a legal form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm findByPrimaryKey(int id)
        throws NoSuchLegalFormException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the legal form with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the legal form
     * @return the legal form, or <code>null</code> if a legal form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        LegalForm legalForm = (LegalForm) EntityCacheUtil.getResult(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
                LegalFormImpl.class, primaryKey);

        if (legalForm == _nullLegalForm) {
            return null;
        }

        if (legalForm == null) {
            Session session = null;

            try {
                session = openSession();

                legalForm = (LegalForm) session.get(LegalFormImpl.class,
                        primaryKey);

                if (legalForm != null) {
                    cacheResult(legalForm);
                } else {
                    EntityCacheUtil.putResult(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
                        LegalFormImpl.class, primaryKey, _nullLegalForm);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LegalFormModelImpl.ENTITY_CACHE_ENABLED,
                    LegalFormImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return legalForm;
    }

    /**
     * Returns the legal form with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the legal form
     * @return the legal form, or <code>null</code> if a legal form with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LegalForm fetchByPrimaryKey(int id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the legal forms.
     *
     * @return the legal forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LegalForm> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<LegalForm> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<LegalForm> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<LegalForm> list = (List<LegalForm>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LEGALFORM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LEGALFORM;

                if (pagination) {
                    sql = sql.concat(LegalFormModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<LegalForm>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LegalForm>(list);
                } else {
                    list = (List<LegalForm>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the legal forms from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (LegalForm legalForm : findAll()) {
            remove(legalForm);
        }
    }

    /**
     * Returns the number of legal forms.
     *
     * @return the number of legal forms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_LEGALFORM);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the legal form persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.isands.farmer.registry.model.LegalForm")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LegalForm>> listenersList = new ArrayList<ModelListener<LegalForm>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LegalForm>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LegalFormImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
