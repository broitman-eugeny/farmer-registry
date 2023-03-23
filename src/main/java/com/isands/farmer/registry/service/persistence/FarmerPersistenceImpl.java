package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.NoSuchFarmerException;
import com.isands.farmer.registry.model.Farmer;
import com.isands.farmer.registry.model.impl.FarmerImpl;
import com.isands.farmer.registry.model.impl.FarmerModelImpl;
import com.isands.farmer.registry.service.persistence.FarmerPersistence;

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
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
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
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the farmer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerPersistence
 * @see FarmerUtil
 * @generated
 */
public class FarmerPersistenceImpl extends BasePersistenceImpl<Farmer>
    implements FarmerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link FarmerUtil} to access the farmer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = FarmerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_ID = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchById",
            new String[] { Long.class.getName() },
            FarmerModelImpl.ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countById",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ID_ID_2 = "farmer.id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDATEFROM =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByRegistrationDateFrom",
            new String[] {
                Date.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGISTRATIONDATEFROM =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "countByRegistrationDateFrom", new String[] { Date.class.getName() });
    private static final String _FINDER_COLUMN_REGISTRATIONDATEFROM_REGISTRATIONDATE_1 =
        "farmer.registrationDate >= NULL";
    private static final String _FINDER_COLUMN_REGISTRATIONDATEFROM_REGISTRATIONDATE_2 =
        "farmer.registrationDate >= ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDATETOANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByRegistrationDateToAndIds",
            new String[] {
                Date.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGISTRATIONDATETOANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "countByRegistrationDateToAndIds",
            new String[] { Date.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_1 =
        "farmer.registrationDate <= NULL AND ";
    private static final String _FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_2 =
        "farmer.registrationDate <= ? AND ";
    private static final String _FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_4 =
        "(" +
        removeConjunction(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_1) +
        ")";
    private static final String _FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_5 =
        "(" +
        removeConjunction(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_2) +
        ")";
    private static final String _FINDER_COLUMN_REGISTRATIONDATETOANDIDS_ID_2 = "farmer.id = ?";
    private static final String _FINDER_COLUMN_REGISTRATIONDATETOANDIDS_ID_5 = "(" +
        removeConjunction(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_ID_2) + ")";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGNAMEMASKANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrgNameMaskAndIds",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGNAMEMASKANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByOrgNameMaskAndIds",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_1 =
        "farmer.organizationName LIKE NULL AND ";
    private static final String _FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_2 =
        "farmer.organizationName LIKE ? AND ";
    private static final String _FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_3 =
        "(farmer.organizationName IS NULL OR farmer.organizationName LIKE '') AND ";
    private static final String _FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_4 =
        "(" +
        removeConjunction(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_1) +
        ")";
    private static final String _FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_5 =
        "(" +
        removeConjunction(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_2) +
        ")";
    private static final String _FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_6 =
        "(" +
        removeConjunction(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_3) +
        ")";
    private static final String _FINDER_COLUMN_ORGNAMEMASKANDIDS_ID_2 = "farmer.id = ?";
    private static final String _FINDER_COLUMN_ORGNAMEMASKANDIDS_ID_5 = "(" +
        removeConjunction(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ID_2) + ")";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INNMASKANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInnMaskAndIds",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_INNMASKANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByInnMaskAndIds",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_INNMASKANDIDS_INN_1 = "farmer.inn LIKE NULL AND ";
    private static final String _FINDER_COLUMN_INNMASKANDIDS_INN_2 = "farmer.inn LIKE ? AND ";
    private static final String _FINDER_COLUMN_INNMASKANDIDS_INN_3 = "(farmer.inn IS NULL OR farmer.inn LIKE '') AND ";
    private static final String _FINDER_COLUMN_INNMASKANDIDS_INN_4 = "(" +
        removeConjunction(_FINDER_COLUMN_INNMASKANDIDS_INN_1) + ")";
    private static final String _FINDER_COLUMN_INNMASKANDIDS_INN_5 = "(" +
        removeConjunction(_FINDER_COLUMN_INNMASKANDIDS_INN_2) + ")";
    private static final String _FINDER_COLUMN_INNMASKANDIDS_INN_6 = "(" +
        removeConjunction(_FINDER_COLUMN_INNMASKANDIDS_INN_3) + ")";
    private static final String _FINDER_COLUMN_INNMASKANDIDS_ID_2 = "farmer.id = ?";
    private static final String _FINDER_COLUMN_INNMASKANDIDS_ID_5 = "(" +
        removeConjunction(_FINDER_COLUMN_INNMASKANDIDS_ID_2) + ")";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVEANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArchiveAndIds",
            new String[] {
                Boolean.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVEANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArchiveAndIds",
            new String[] { Boolean.class.getName(), Long.class.getName() },
            FarmerModelImpl.ARCHIVE_COLUMN_BITMASK |
            FarmerModelImpl.ID_COLUMN_BITMASK |
            FarmerModelImpl.REGISTRATIONDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ARCHIVEANDIDS = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArchiveAndIds",
            new String[] { Boolean.class.getName(), Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_ARCHIVEANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByArchiveAndIds",
            new String[] { Boolean.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_ARCHIVEANDIDS_ARCHIVE_2 = "farmer.archive = ? AND ";
    private static final String _FINDER_COLUMN_ARCHIVEANDIDS_ARCHIVE_5 = "(" +
        removeConjunction(_FINDER_COLUMN_ARCHIVEANDIDS_ARCHIVE_2) + ")";
    private static final String _FINDER_COLUMN_ARCHIVEANDIDS_ID_2 = "farmer.id = ?";
    private static final String _FINDER_COLUMN_ARCHIVEANDIDS_ID_5 = "(" +
        removeConjunction(_FINDER_COLUMN_ARCHIVEANDIDS_ID_2) + ")";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONIDSANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRegionIdsAndIds",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONIDSANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRegionIdsAndIds",
            new String[] { Long.class.getName(), Long.class.getName() },
            FarmerModelImpl.REGIONID_COLUMN_BITMASK |
            FarmerModelImpl.ID_COLUMN_BITMASK |
            FarmerModelImpl.REGISTRATIONDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REGIONIDSANDIDS = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByRegionIdsAndIds",
            new String[] { Long.class.getName(), Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGIONIDSANDIDS =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByRegionIdsAndIds",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_REGIONIDSANDIDS_REGIONID_2 = "farmer.regionId = ? AND ";
    private static final String _FINDER_COLUMN_REGIONIDSANDIDS_REGIONID_5 = "(" +
        removeConjunction(_FINDER_COLUMN_REGIONIDSANDIDS_REGIONID_2) + ")";
    private static final String _FINDER_COLUMN_REGIONIDSANDIDS_ID_2 = "farmer.id = ?";
    private static final String _FINDER_COLUMN_REGIONIDSANDIDS_ID_5 = "(" +
        removeConjunction(_FINDER_COLUMN_REGIONIDSANDIDS_ID_2) + ")";
    private static final String _SQL_SELECT_FARMER = "SELECT farmer FROM Farmer farmer";
    private static final String _SQL_SELECT_FARMER_WHERE = "SELECT farmer FROM Farmer farmer WHERE ";
    private static final String _SQL_COUNT_FARMER = "SELECT COUNT(farmer) FROM Farmer farmer";
    private static final String _SQL_COUNT_FARMER_WHERE = "SELECT COUNT(farmer) FROM Farmer farmer WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "farmer.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Farmer exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Farmer exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(FarmerPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Farmer _nullFarmer = new FarmerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Farmer> toCacheModel() {
                return _nullFarmerCacheModel;
            }
        };

    private static CacheModel<Farmer> _nullFarmerCacheModel = new CacheModel<Farmer>() {
            @Override
            public Farmer toEntityModel() {
                return _nullFarmer;
            }
        };

    public FarmerPersistenceImpl() {
        setModelClass(Farmer.class);
    }

    /**
     * Returns the farmer where id = &#63; or throws a {@link com.isands.farmer.registry.NoSuchFarmerException} if it could not be found.
     *
     * @param id the ID
     * @return the matching farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findById(long id)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchById(id);

        if (farmer == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("id=");
            msg.append(id);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchFarmerException(msg.toString());
        }

        return farmer;
    }

    /**
     * Returns the farmer where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param id the ID
     * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchById(long id) throws SystemException {
        return fetchById(id, true);
    }

    /**
     * Returns the farmer where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param id the ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchById(long id, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { id };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ID,
                    finderArgs, this);
        }

        if (result instanceof Farmer) {
            Farmer farmer = (Farmer) result;

            if ((id != farmer.getId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_ID_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(id);

                List<Farmer> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "FarmerPersistenceImpl.fetchById(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Farmer farmer = list.get(0);

                    result = farmer;

                    cacheResult(farmer);

                    if ((farmer.getId() != id)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
                            finderArgs, farmer);
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
            return (Farmer) result;
        }
    }

    /**
     * Removes the farmer where id = &#63; from the database.
     *
     * @param id the ID
     * @return the farmer that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer removeById(long id)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = findById(id);

        return remove(farmer);
    }

    /**
     * Returns the number of farmers where id = &#63;.
     *
     * @param id the ID
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countById(long id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

        Object[] finderArgs = new Object[] { id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FARMER_WHERE);

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
     * Returns all the farmers where registrationDate &ge; &#63;.
     *
     * @param registrationDate the registration date
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByRegistrationDateFrom(Date registrationDate)
        throws SystemException {
        return findByRegistrationDateFrom(registrationDate, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByRegistrationDateFrom(Date registrationDate,
        int start, int end) throws SystemException {
        return findByRegistrationDateFrom(registrationDate, start, end, null);
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
    @Override
    public List<Farmer> findByRegistrationDateFrom(Date registrationDate,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDATEFROM;
        finderArgs = new Object[] {
                registrationDate,
                
                start, end, orderByComparator
            };

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((registrationDate.getTime() > farmer.getRegistrationDate()
                                                            .getTime())) {
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

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean bindRegistrationDate = false;

            if (registrationDate == null) {
                query.append(_FINDER_COLUMN_REGISTRATIONDATEFROM_REGISTRATIONDATE_1);
            } else {
                bindRegistrationDate = true;

                query.append(_FINDER_COLUMN_REGISTRATIONDATEFROM_REGISTRATIONDATE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegistrationDate) {
                    qPos.add(CalendarUtil.getTimestamp(registrationDate));
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
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
     * Returns the first farmer in the ordered set where registrationDate &ge; &#63;.
     *
     * @param registrationDate the registration date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByRegistrationDateFrom_First(Date registrationDate,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByRegistrationDateFrom_First(registrationDate,
                orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("registrationDate=");
        msg.append(registrationDate);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the first farmer in the ordered set where registrationDate &ge; &#63;.
     *
     * @param registrationDate the registration date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByRegistrationDateFrom_First(Date registrationDate,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByRegistrationDateFrom(registrationDate, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Farmer findByRegistrationDateFrom_Last(Date registrationDate,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByRegistrationDateFrom_Last(registrationDate,
                orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("registrationDate=");
        msg.append(registrationDate);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the last farmer in the ordered set where registrationDate &ge; &#63;.
     *
     * @param registrationDate the registration date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByRegistrationDateFrom_Last(Date registrationDate,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByRegistrationDateFrom(registrationDate);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByRegistrationDateFrom(registrationDate,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Farmer[] findByRegistrationDateFrom_PrevAndNext(long id,
        Date registrationDate, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Farmer[] array = new FarmerImpl[3];

            array[0] = getByRegistrationDateFrom_PrevAndNext(session, farmer,
                    registrationDate, orderByComparator, true);

            array[1] = farmer;

            array[2] = getByRegistrationDateFrom_PrevAndNext(session, farmer,
                    registrationDate, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Farmer getByRegistrationDateFrom_PrevAndNext(Session session,
        Farmer farmer, Date registrationDate,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FARMER_WHERE);

        boolean bindRegistrationDate = false;

        if (registrationDate == null) {
            query.append(_FINDER_COLUMN_REGISTRATIONDATEFROM_REGISTRATIONDATE_1);
        } else {
            bindRegistrationDate = true;

            query.append(_FINDER_COLUMN_REGISTRATIONDATEFROM_REGISTRATIONDATE_2);
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
            query.append(FarmerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindRegistrationDate) {
            qPos.add(CalendarUtil.getTimestamp(registrationDate));
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(farmer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Farmer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the farmers where registrationDate &ge; &#63; from the database.
     *
     * @param registrationDate the registration date
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRegistrationDateFrom(Date registrationDate)
        throws SystemException {
        for (Farmer farmer : findByRegistrationDateFrom(registrationDate,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where registrationDate &ge; &#63;.
     *
     * @param registrationDate the registration date
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRegistrationDateFrom(Date registrationDate)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGISTRATIONDATEFROM;

        Object[] finderArgs = new Object[] { registrationDate };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean bindRegistrationDate = false;

            if (registrationDate == null) {
                query.append(_FINDER_COLUMN_REGISTRATIONDATEFROM_REGISTRATIONDATE_1);
            } else {
                bindRegistrationDate = true;

                query.append(_FINDER_COLUMN_REGISTRATIONDATEFROM_REGISTRATIONDATE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegistrationDate) {
                    qPos.add(CalendarUtil.getTimestamp(registrationDate));
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
     * Returns all the farmers where registrationDate &le; &#63; and id = &#63;.
     *
     * @param registrationDate the registration date
     * @param id the ID
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByRegistrationDateToAndIds(Date registrationDate,
        long id) throws SystemException {
        return findByRegistrationDateToAndIds(registrationDate, id,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByRegistrationDateToAndIds(Date registrationDate,
        long id, int start, int end) throws SystemException {
        return findByRegistrationDateToAndIds(registrationDate, id, start, end,
            null);
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
    @Override
    public List<Farmer> findByRegistrationDateToAndIds(Date registrationDate,
        long id, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDATETOANDIDS;
        finderArgs = new Object[] {
                registrationDate, id,
                
                start, end, orderByComparator
            };

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((registrationDate.getTime() < farmer.getRegistrationDate()
                                                            .getTime()) ||
                        (id != farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean bindRegistrationDate = false;

            if (registrationDate == null) {
                query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_1);
            } else {
                bindRegistrationDate = true;

                query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_2);
            }

            query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegistrationDate) {
                    qPos.add(CalendarUtil.getTimestamp(registrationDate));
                }

                qPos.add(id);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
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
     * Returns the first farmer in the ordered set where registrationDate &le; &#63; and id = &#63;.
     *
     * @param registrationDate the registration date
     * @param id the ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByRegistrationDateToAndIds_First(Date registrationDate,
        long id, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByRegistrationDateToAndIds_First(registrationDate,
                id, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("registrationDate=");
        msg.append(registrationDate);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByRegistrationDateToAndIds_First(Date registrationDate,
        long id, OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByRegistrationDateToAndIds(registrationDate,
                id, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Farmer findByRegistrationDateToAndIds_Last(Date registrationDate,
        long id, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByRegistrationDateToAndIds_Last(registrationDate,
                id, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("registrationDate=");
        msg.append(registrationDate);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByRegistrationDateToAndIds_Last(Date registrationDate,
        long id, OrderByComparator orderByComparator) throws SystemException {
        int count = countByRegistrationDateToAndIds(registrationDate, id);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByRegistrationDateToAndIds(registrationDate,
                id, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public List<Farmer> findByRegistrationDateToAndIds(Date registrationDate,
        long[] ids) throws SystemException {
        return findByRegistrationDateToAndIds(registrationDate, ids,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByRegistrationDateToAndIds(Date registrationDate,
        long[] ids, int start, int end) throws SystemException {
        return findByRegistrationDateToAndIds(registrationDate, ids, start,
            end, null);
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
    @Override
    public List<Farmer> findByRegistrationDateToAndIds(Date registrationDate,
        long[] ids, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        if ((ids != null) && (ids.length == 1)) {
            return findByRegistrationDateToAndIds(registrationDate, ids[0],
                start, end, orderByComparator);
        }

        boolean pagination = true;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderArgs = new Object[] { registrationDate, StringUtil.merge(ids) };
        } else {
            finderArgs = new Object[] {
                    registrationDate, StringUtil.merge(ids),
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDATETOANDIDS,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((registrationDate.getTime() < farmer.getRegistrationDate()
                                                            .getTime()) ||
                        !ArrayUtil.contains(ids, farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean conjunctionable = false;

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            boolean bindRegistrationDate = false;

            if (registrationDate == null) {
                query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_4);
            } else {
                bindRegistrationDate = true;

                query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_5);
            }

            conjunctionable = true;

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegistrationDate) {
                    qPos.add(CalendarUtil.getTimestamp(registrationDate));
                }

                if (ids != null) {
                    qPos.add(ids);
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDATETOANDIDS,
                    finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDATETOANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the farmers where registrationDate &le; &#63; and id = &#63; from the database.
     *
     * @param registrationDate the registration date
     * @param id the ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRegistrationDateToAndIds(Date registrationDate, long id)
        throws SystemException {
        for (Farmer farmer : findByRegistrationDateToAndIds(registrationDate,
                id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where registrationDate &le; &#63; and id = &#63;.
     *
     * @param registrationDate the registration date
     * @param id the ID
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRegistrationDateToAndIds(Date registrationDate, long id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGISTRATIONDATETOANDIDS;

        Object[] finderArgs = new Object[] { registrationDate, id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean bindRegistrationDate = false;

            if (registrationDate == null) {
                query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_1);
            } else {
                bindRegistrationDate = true;

                query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_2);
            }

            query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegistrationDate) {
                    qPos.add(CalendarUtil.getTimestamp(registrationDate));
                }

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
     * Returns the number of farmers where registrationDate &le; &#63; and id = any &#63;.
     *
     * @param registrationDate the registration date
     * @param ids the IDs
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRegistrationDateToAndIds(Date registrationDate, long[] ids)
        throws SystemException {
        Object[] finderArgs = new Object[] {
                registrationDate, StringUtil.merge(ids)
            };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGISTRATIONDATETOANDIDS,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean conjunctionable = false;

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            boolean bindRegistrationDate = false;

            if (registrationDate == null) {
                query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_4);
            } else {
                bindRegistrationDate = true;

                query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_REGISTRATIONDATE_5);
            }

            conjunctionable = true;

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_REGISTRATIONDATETOANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegistrationDate) {
                    qPos.add(CalendarUtil.getTimestamp(registrationDate));
                }

                if (ids != null) {
                    qPos.add(ids);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGISTRATIONDATETOANDIDS,
                    finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGISTRATIONDATETOANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where organizationName LIKE &#63; and id = &#63;.
     *
     * @param organizationName the organization name
     * @param id the ID
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByOrgNameMaskAndIds(String organizationName, long id)
        throws SystemException {
        return findByOrgNameMaskAndIds(organizationName, id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByOrgNameMaskAndIds(String organizationName,
        long id, int start, int end) throws SystemException {
        return findByOrgNameMaskAndIds(organizationName, id, start, end, null);
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
    @Override
    public List<Farmer> findByOrgNameMaskAndIds(String organizationName,
        long id, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGNAMEMASKANDIDS;
        finderArgs = new Object[] {
                organizationName, id,
                
                start, end, orderByComparator
            };

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if (!StringUtil.wildcardMatches(farmer.getOrganizationName(),
                            organizationName, CharPool.UNDERLINE,
                            CharPool.PERCENT, CharPool.BACK_SLASH, true) ||
                        (id != farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean bindOrganizationName = false;

            if (organizationName == null) {
                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_1);
            } else if (organizationName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_3);
            } else {
                bindOrganizationName = true;

                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_2);
            }

            query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindOrganizationName) {
                    qPos.add(organizationName);
                }

                qPos.add(id);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
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
     * Returns the first farmer in the ordered set where organizationName LIKE &#63; and id = &#63;.
     *
     * @param organizationName the organization name
     * @param id the ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByOrgNameMaskAndIds_First(String organizationName,
        long id, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByOrgNameMaskAndIds_First(organizationName, id,
                orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("organizationName=");
        msg.append(organizationName);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByOrgNameMaskAndIds_First(String organizationName,
        long id, OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByOrgNameMaskAndIds(organizationName, id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Farmer findByOrgNameMaskAndIds_Last(String organizationName,
        long id, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByOrgNameMaskAndIds_Last(organizationName, id,
                orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("organizationName=");
        msg.append(organizationName);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByOrgNameMaskAndIds_Last(String organizationName,
        long id, OrderByComparator orderByComparator) throws SystemException {
        int count = countByOrgNameMaskAndIds(organizationName, id);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByOrgNameMaskAndIds(organizationName, id,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public List<Farmer> findByOrgNameMaskAndIds(String organizationName,
        long[] ids) throws SystemException {
        return findByOrgNameMaskAndIds(organizationName, ids,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByOrgNameMaskAndIds(String organizationName,
        long[] ids, int start, int end) throws SystemException {
        return findByOrgNameMaskAndIds(organizationName, ids, start, end, null);
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
    @Override
    public List<Farmer> findByOrgNameMaskAndIds(String organizationName,
        long[] ids, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        if ((ids != null) && (ids.length == 1)) {
            return findByOrgNameMaskAndIds(organizationName, ids[0], start,
                end, orderByComparator);
        }

        boolean pagination = true;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderArgs = new Object[] { organizationName, StringUtil.merge(ids) };
        } else {
            finderArgs = new Object[] {
                    organizationName, StringUtil.merge(ids),
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGNAMEMASKANDIDS,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if (!StringUtil.wildcardMatches(farmer.getOrganizationName(),
                            organizationName, CharPool.UNDERLINE,
                            CharPool.PERCENT, CharPool.BACK_SLASH, true) ||
                        !ArrayUtil.contains(ids, farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean conjunctionable = false;

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            boolean bindOrganizationName = false;

            if (organizationName == null) {
                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_4);
            } else if (organizationName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_6);
            } else {
                bindOrganizationName = true;

                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_5);
            }

            conjunctionable = true;

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindOrganizationName) {
                    qPos.add(organizationName);
                }

                if (ids != null) {
                    qPos.add(ids);
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGNAMEMASKANDIDS,
                    finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGNAMEMASKANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the farmers where organizationName LIKE &#63; and id = &#63; from the database.
     *
     * @param organizationName the organization name
     * @param id the ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByOrgNameMaskAndIds(String organizationName, long id)
        throws SystemException {
        for (Farmer farmer : findByOrgNameMaskAndIds(organizationName, id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where organizationName LIKE &#63; and id = &#63;.
     *
     * @param organizationName the organization name
     * @param id the ID
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByOrgNameMaskAndIds(String organizationName, long id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGNAMEMASKANDIDS;

        Object[] finderArgs = new Object[] { organizationName, id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean bindOrganizationName = false;

            if (organizationName == null) {
                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_1);
            } else if (organizationName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_3);
            } else {
                bindOrganizationName = true;

                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_2);
            }

            query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindOrganizationName) {
                    qPos.add(organizationName);
                }

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
     * Returns the number of farmers where organizationName LIKE &#63; and id = any &#63;.
     *
     * @param organizationName the organization name
     * @param ids the IDs
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByOrgNameMaskAndIds(String organizationName, long[] ids)
        throws SystemException {
        Object[] finderArgs = new Object[] {
                organizationName, StringUtil.merge(ids)
            };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGNAMEMASKANDIDS,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean conjunctionable = false;

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            boolean bindOrganizationName = false;

            if (organizationName == null) {
                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_4);
            } else if (organizationName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_6);
            } else {
                bindOrganizationName = true;

                query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ORGANIZATIONNAME_5);
            }

            conjunctionable = true;

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_ORGNAMEMASKANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindOrganizationName) {
                    qPos.add(organizationName);
                }

                if (ids != null) {
                    qPos.add(ids);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGNAMEMASKANDIDS,
                    finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGNAMEMASKANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where inn LIKE &#63; and id = &#63;.
     *
     * @param inn the inn
     * @param id the ID
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByInnMaskAndIds(String inn, long id)
        throws SystemException {
        return findByInnMaskAndIds(inn, id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByInnMaskAndIds(String inn, long id, int start,
        int end) throws SystemException {
        return findByInnMaskAndIds(inn, id, start, end, null);
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
    @Override
    public List<Farmer> findByInnMaskAndIds(String inn, long id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INNMASKANDIDS;
        finderArgs = new Object[] { inn, id, start, end, orderByComparator };

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if (!StringUtil.wildcardMatches(farmer.getInn(), inn,
                            CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true) ||
                        (id != farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_1);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_3);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_2);
            }

            query.append(_FINDER_COLUMN_INNMASKANDIDS_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInn) {
                    qPos.add(inn);
                }

                qPos.add(id);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
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
     * Returns the first farmer in the ordered set where inn LIKE &#63; and id = &#63;.
     *
     * @param inn the inn
     * @param id the ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByInnMaskAndIds_First(String inn, long id,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByInnMaskAndIds_First(inn, id, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("inn=");
        msg.append(inn);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByInnMaskAndIds_First(String inn, long id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByInnMaskAndIds(inn, id, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Farmer findByInnMaskAndIds_Last(String inn, long id,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByInnMaskAndIds_Last(inn, id, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("inn=");
        msg.append(inn);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByInnMaskAndIds_Last(String inn, long id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByInnMaskAndIds(inn, id);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByInnMaskAndIds(inn, id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public List<Farmer> findByInnMaskAndIds(String inn, long[] ids)
        throws SystemException {
        return findByInnMaskAndIds(inn, ids, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByInnMaskAndIds(String inn, long[] ids, int start,
        int end) throws SystemException {
        return findByInnMaskAndIds(inn, ids, start, end, null);
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
    @Override
    public List<Farmer> findByInnMaskAndIds(String inn, long[] ids, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        if ((ids != null) && (ids.length == 1)) {
            return findByInnMaskAndIds(inn, ids[0], start, end,
                orderByComparator);
        }

        boolean pagination = true;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderArgs = new Object[] { inn, StringUtil.merge(ids) };
        } else {
            finderArgs = new Object[] {
                    inn, StringUtil.merge(ids),
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_INNMASKANDIDS,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if (!StringUtil.wildcardMatches(farmer.getInn(), inn,
                            CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true) ||
                        !ArrayUtil.contains(ids, farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean conjunctionable = false;

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_4);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_6);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_5);
            }

            conjunctionable = true;

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_INNMASKANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInn) {
                    qPos.add(inn);
                }

                if (ids != null) {
                    qPos.add(ids);
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_INNMASKANDIDS,
                    finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_INNMASKANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the farmers where inn LIKE &#63; and id = &#63; from the database.
     *
     * @param inn the inn
     * @param id the ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByInnMaskAndIds(String inn, long id)
        throws SystemException {
        for (Farmer farmer : findByInnMaskAndIds(inn, id, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where inn LIKE &#63; and id = &#63;.
     *
     * @param inn the inn
     * @param id the ID
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByInnMaskAndIds(String inn, long id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_INNMASKANDIDS;

        Object[] finderArgs = new Object[] { inn, id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_1);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_3);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_2);
            }

            query.append(_FINDER_COLUMN_INNMASKANDIDS_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInn) {
                    qPos.add(inn);
                }

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
     * Returns the number of farmers where inn LIKE &#63; and id = any &#63;.
     *
     * @param inn the inn
     * @param ids the IDs
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByInnMaskAndIds(String inn, long[] ids)
        throws SystemException {
        Object[] finderArgs = new Object[] { inn, StringUtil.merge(ids) };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_INNMASKANDIDS,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean conjunctionable = false;

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_4);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_6);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_INNMASKANDIDS_INN_5);
            }

            conjunctionable = true;

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_INNMASKANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInn) {
                    qPos.add(inn);
                }

                if (ids != null) {
                    qPos.add(ids);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_INNMASKANDIDS,
                    finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_INNMASKANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where archive = &#63; and id = &#63;.
     *
     * @param archive the archive
     * @param id the ID
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByArchiveAndIds(boolean archive, long id)
        throws SystemException {
        return findByArchiveAndIds(archive, id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByArchiveAndIds(boolean archive, long id,
        int start, int end) throws SystemException {
        return findByArchiveAndIds(archive, id, start, end, null);
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
    @Override
    public List<Farmer> findByArchiveAndIds(boolean archive, long id,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVEANDIDS;
            finderArgs = new Object[] { archive, id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVEANDIDS;
            finderArgs = new Object[] { archive, id, start, end, orderByComparator };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((archive != farmer.getArchive()) || (id != farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVEANDIDS_ARCHIVE_2);

            query.append(_FINDER_COLUMN_ARCHIVEANDIDS_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive);

                qPos.add(id);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
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
     * Returns the first farmer in the ordered set where archive = &#63; and id = &#63;.
     *
     * @param archive the archive
     * @param id the ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByArchiveAndIds_First(boolean archive, long id,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByArchiveAndIds_First(archive, id,
                orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive=");
        msg.append(archive);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByArchiveAndIds_First(boolean archive, long id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByArchiveAndIds(archive, id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Farmer findByArchiveAndIds_Last(boolean archive, long id,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByArchiveAndIds_Last(archive, id, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive=");
        msg.append(archive);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByArchiveAndIds_Last(boolean archive, long id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByArchiveAndIds(archive, id);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByArchiveAndIds(archive, id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public List<Farmer> findByArchiveAndIds(boolean archive, long[] ids)
        throws SystemException {
        return findByArchiveAndIds(archive, ids, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByArchiveAndIds(boolean archive, long[] ids,
        int start, int end) throws SystemException {
        return findByArchiveAndIds(archive, ids, start, end, null);
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
    @Override
    public List<Farmer> findByArchiveAndIds(boolean archive, long[] ids,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        if ((ids != null) && (ids.length == 1)) {
            return findByArchiveAndIds(archive, ids[0], start, end,
                orderByComparator);
        }

        boolean pagination = true;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderArgs = new Object[] { archive, StringUtil.merge(ids) };
        } else {
            finderArgs = new Object[] {
                    archive, StringUtil.merge(ids),
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVEANDIDS,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((archive != farmer.getArchive()) ||
                        !ArrayUtil.contains(ids, farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean conjunctionable = false;

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(_FINDER_COLUMN_ARCHIVEANDIDS_ARCHIVE_5);

            conjunctionable = true;

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_ARCHIVEANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive);

                if (ids != null) {
                    qPos.add(ids);
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVEANDIDS,
                    finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVEANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the farmers where archive = &#63; and id = &#63; from the database.
     *
     * @param archive the archive
     * @param id the ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByArchiveAndIds(boolean archive, long id)
        throws SystemException {
        for (Farmer farmer : findByArchiveAndIds(archive, id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where archive = &#63; and id = &#63;.
     *
     * @param archive the archive
     * @param id the ID
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByArchiveAndIds(boolean archive, long id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ARCHIVEANDIDS;

        Object[] finderArgs = new Object[] { archive, id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVEANDIDS_ARCHIVE_2);

            query.append(_FINDER_COLUMN_ARCHIVEANDIDS_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive);

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
     * Returns the number of farmers where archive = &#63; and id = any &#63;.
     *
     * @param archive the archive
     * @param ids the IDs
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByArchiveAndIds(boolean archive, long[] ids)
        throws SystemException {
        Object[] finderArgs = new Object[] { archive, StringUtil.merge(ids) };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ARCHIVEANDIDS,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean conjunctionable = false;

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(_FINDER_COLUMN_ARCHIVEANDIDS_ARCHIVE_5);

            conjunctionable = true;

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_ARCHIVEANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive);

                if (ids != null) {
                    qPos.add(ids);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ARCHIVEANDIDS,
                    finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ARCHIVEANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where regionId = &#63; and id = &#63;.
     *
     * @param regionId the region ID
     * @param id the ID
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByRegionIdsAndIds(long regionId, long id)
        throws SystemException {
        return findByRegionIdsAndIds(regionId, id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByRegionIdsAndIds(long regionId, long id,
        int start, int end) throws SystemException {
        return findByRegionIdsAndIds(regionId, id, start, end, null);
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
    @Override
    public List<Farmer> findByRegionIdsAndIds(long regionId, long id,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONIDSANDIDS;
            finderArgs = new Object[] { regionId, id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONIDSANDIDS;
            finderArgs = new Object[] {
                    regionId, id,
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((regionId != farmer.getRegionId()) ||
                        (id != farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_REGIONIDSANDIDS_REGIONID_2);

            query.append(_FINDER_COLUMN_REGIONIDSANDIDS_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(regionId);

                qPos.add(id);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
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
     * Returns the first farmer in the ordered set where regionId = &#63; and id = &#63;.
     *
     * @param regionId the region ID
     * @param id the ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByRegionIdsAndIds_First(long regionId, long id,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByRegionIdsAndIds_First(regionId, id,
                orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("regionId=");
        msg.append(regionId);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByRegionIdsAndIds_First(long regionId, long id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByRegionIdsAndIds(regionId, id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Farmer findByRegionIdsAndIds_Last(long regionId, long id,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByRegionIdsAndIds_Last(regionId, id,
                orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("regionId=");
        msg.append(regionId);

        msg.append(", id=");
        msg.append(id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
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
    @Override
    public Farmer fetchByRegionIdsAndIds_Last(long regionId, long id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByRegionIdsAndIds(regionId, id);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByRegionIdsAndIds(regionId, id, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public List<Farmer> findByRegionIdsAndIds(long[] regionIds, long[] ids)
        throws SystemException {
        return findByRegionIdsAndIds(regionIds, ids, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findByRegionIdsAndIds(long[] regionIds, long[] ids,
        int start, int end) throws SystemException {
        return findByRegionIdsAndIds(regionIds, ids, start, end, null);
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
    @Override
    public List<Farmer> findByRegionIdsAndIds(long[] regionIds, long[] ids,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        if ((regionIds != null) && (regionIds.length == 1) && (ids != null) &&
                (ids.length == 1)) {
            return findByRegionIdsAndIds(regionIds[0], ids[0], start, end,
                orderByComparator);
        }

        boolean pagination = true;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderArgs = new Object[] {
                    StringUtil.merge(regionIds), StringUtil.merge(ids)
                };
        } else {
            finderArgs = new Object[] {
                    StringUtil.merge(regionIds), StringUtil.merge(ids),
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONIDSANDIDS,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if (!ArrayUtil.contains(regionIds, farmer.getRegionId()) ||
                        !ArrayUtil.contains(ids, farmer.getId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_SELECT_FARMER_WHERE);

            boolean conjunctionable = false;

            if ((regionIds == null) || (regionIds.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < regionIds.length; i++) {
                    query.append(_FINDER_COLUMN_REGIONIDSANDIDS_REGIONID_5);

                    if ((i + 1) < regionIds.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_REGIONIDSANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (regionIds != null) {
                    qPos.add(regionIds);
                }

                if (ids != null) {
                    qPos.add(ids);
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONIDSANDIDS,
                    finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONIDSANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the farmers where regionId = &#63; and id = &#63; from the database.
     *
     * @param regionId the region ID
     * @param id the ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRegionIdsAndIds(long regionId, long id)
        throws SystemException {
        for (Farmer farmer : findByRegionIdsAndIds(regionId, id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where regionId = &#63; and id = &#63;.
     *
     * @param regionId the region ID
     * @param id the ID
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRegionIdsAndIds(long regionId, long id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REGIONIDSANDIDS;

        Object[] finderArgs = new Object[] { regionId, id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_REGIONIDSANDIDS_REGIONID_2);

            query.append(_FINDER_COLUMN_REGIONIDSANDIDS_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(regionId);

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
     * Returns the number of farmers where regionId = any &#63; and id = any &#63;.
     *
     * @param regionIds the region IDs
     * @param ids the IDs
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRegionIdsAndIds(long[] regionIds, long[] ids)
        throws SystemException {
        Object[] finderArgs = new Object[] {
                StringUtil.merge(regionIds), StringUtil.merge(ids)
            };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGIONIDSANDIDS,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_COUNT_FARMER_WHERE);

            boolean conjunctionable = false;

            if ((regionIds == null) || (regionIds.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < regionIds.length; i++) {
                    query.append(_FINDER_COLUMN_REGIONIDSANDIDS_REGIONID_5);

                    if ((i + 1) < regionIds.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((ids == null) || (ids.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < ids.length; i++) {
                    query.append(_FINDER_COLUMN_REGIONIDSANDIDS_ID_5);

                    if ((i + 1) < ids.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (regionIds != null) {
                    qPos.add(regionIds);
                }

                if (ids != null) {
                    qPos.add(ids);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGIONIDSANDIDS,
                    finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_REGIONIDSANDIDS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the farmer in the entity cache if it is enabled.
     *
     * @param farmer the farmer
     */
    @Override
    public void cacheResult(Farmer farmer) {
        EntityCacheUtil.putResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerImpl.class, farmer.getPrimaryKey(), farmer);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
            new Object[] { farmer.getId() }, farmer);

        farmer.resetOriginalValues();
    }

    /**
     * Caches the farmers in the entity cache if it is enabled.
     *
     * @param farmers the farmers
     */
    @Override
    public void cacheResult(List<Farmer> farmers) {
        for (Farmer farmer : farmers) {
            if (EntityCacheUtil.getResult(
                        FarmerModelImpl.ENTITY_CACHE_ENABLED, FarmerImpl.class,
                        farmer.getPrimaryKey()) == null) {
                cacheResult(farmer);
            } else {
                farmer.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all farmers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(FarmerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(FarmerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the farmer.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Farmer farmer) {
        EntityCacheUtil.removeResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerImpl.class, farmer.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(farmer);
    }

    @Override
    public void clearCache(List<Farmer> farmers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Farmer farmer : farmers) {
            EntityCacheUtil.removeResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
                FarmerImpl.class, farmer.getPrimaryKey());

            clearUniqueFindersCache(farmer);
        }
    }

    protected void cacheUniqueFindersCache(Farmer farmer) {
        if (farmer.isNew()) {
            Object[] args = new Object[] { farmer.getId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args, farmer);
        } else {
            FarmerModelImpl farmerModelImpl = (FarmerModelImpl) farmer;

            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { farmer.getId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args, farmer);
            }
        }
    }

    protected void clearUniqueFindersCache(Farmer farmer) {
        FarmerModelImpl farmerModelImpl = (FarmerModelImpl) farmer;

        Object[] args = new Object[] { farmer.getId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);

        if ((farmerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
            args = new Object[] { farmerModelImpl.getOriginalId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);
        }
    }

    /**
     * Creates a new farmer with the primary key. Does not add the farmer to the database.
     *
     * @param id the primary key for the new farmer
     * @return the new farmer
     */
    @Override
    public Farmer create(long id) {
        Farmer farmer = new FarmerImpl();

        farmer.setNew(true);
        farmer.setPrimaryKey(id);

        return farmer;
    }

    /**
     * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the farmer
     * @return the farmer that was removed
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer remove(long id) throws NoSuchFarmerException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the farmer
     * @return the farmer that was removed
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer remove(Serializable primaryKey)
        throws NoSuchFarmerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Farmer farmer = (Farmer) session.get(FarmerImpl.class, primaryKey);

            if (farmer == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFarmerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(farmer);
        } catch (NoSuchFarmerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Farmer removeImpl(Farmer farmer) throws SystemException {
        farmer = toUnwrappedModel(farmer);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(farmer)) {
                farmer = (Farmer) session.get(FarmerImpl.class,
                        farmer.getPrimaryKeyObj());
            }

            if (farmer != null) {
                session.delete(farmer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (farmer != null) {
            clearCache(farmer);
        }

        return farmer;
    }

    @Override
    public Farmer updateImpl(com.isands.farmer.registry.model.Farmer farmer)
        throws SystemException {
        farmer = toUnwrappedModel(farmer);

        boolean isNew = farmer.isNew();

        FarmerModelImpl farmerModelImpl = (FarmerModelImpl) farmer;

        Session session = null;

        try {
            session = openSession();

            if (farmer.isNew()) {
                session.save(farmer);

                farmer.setNew(false);
            } else {
                session.merge(farmer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !FarmerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVEANDIDS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        farmerModelImpl.getOriginalArchive(),
                        farmerModelImpl.getOriginalId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVEANDIDS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVEANDIDS,
                    args);

                args = new Object[] {
                        farmerModelImpl.getArchive(), farmerModelImpl.getId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVEANDIDS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVEANDIDS,
                    args);
            }

            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONIDSANDIDS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        farmerModelImpl.getOriginalRegionId(),
                        farmerModelImpl.getOriginalId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONIDSANDIDS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONIDSANDIDS,
                    args);

                args = new Object[] {
                        farmerModelImpl.getRegionId(), farmerModelImpl.getId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONIDSANDIDS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONIDSANDIDS,
                    args);
            }
        }

        EntityCacheUtil.putResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerImpl.class, farmer.getPrimaryKey(), farmer);

        clearUniqueFindersCache(farmer);
        cacheUniqueFindersCache(farmer);

        return farmer;
    }

    protected Farmer toUnwrappedModel(Farmer farmer) {
        if (farmer instanceof FarmerImpl) {
            return farmer;
        }

        FarmerImpl farmerImpl = new FarmerImpl();

        farmerImpl.setNew(farmer.isNew());
        farmerImpl.setPrimaryKey(farmer.getPrimaryKey());

        farmerImpl.setId(farmer.getId());
        farmerImpl.setOrganizationName(farmer.getOrganizationName());
        farmerImpl.setLegalFormId(farmer.getLegalFormId());
        farmerImpl.setInn(farmer.getInn());
        farmerImpl.setKpp(farmer.getKpp());
        farmerImpl.setOgrn(farmer.getOgrn());
        farmerImpl.setRegionId(farmer.getRegionId());
        farmerImpl.setRegistrationDate(farmer.getRegistrationDate());
        farmerImpl.setArchive(farmer.isArchive());

        return farmerImpl;
    }

    /**
     * Returns the farmer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the farmer
     * @return the farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByPrimaryKey(primaryKey);

        if (farmer == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFarmerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return farmer;
    }

    /**
     * Returns the farmer with the primary key or throws a {@link com.isands.farmer.registry.NoSuchFarmerException} if it could not be found.
     *
     * @param id the primary key of the farmer
     * @return the farmer
     * @throws com.isands.farmer.registry.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByPrimaryKey(long id)
        throws NoSuchFarmerException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the farmer
     * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Farmer farmer = (Farmer) EntityCacheUtil.getResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
                FarmerImpl.class, primaryKey);

        if (farmer == _nullFarmer) {
            return null;
        }

        if (farmer == null) {
            Session session = null;

            try {
                session = openSession();

                farmer = (Farmer) session.get(FarmerImpl.class, primaryKey);

                if (farmer != null) {
                    cacheResult(farmer);
                } else {
                    EntityCacheUtil.putResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
                        FarmerImpl.class, primaryKey, _nullFarmer);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
                    FarmerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return farmer;
    }

    /**
     * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the farmer
     * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the farmers.
     *
     * @return the farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Farmer> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Farmer> findAll(int start, int end,
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

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FARMER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FARMER;

                if (pagination) {
                    sql = sql.concat(FarmerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
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
     * Removes all the farmers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Farmer farmer : findAll()) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers.
     *
     * @return the number of farmers
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

                Query q = session.createQuery(_SQL_COUNT_FARMER);

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
     * Initializes the farmer persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.isands.farmer.registry.model.Farmer")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Farmer>> listenersList = new ArrayList<ModelListener<Farmer>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Farmer>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(FarmerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
