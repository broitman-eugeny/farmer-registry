package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.NoSuchRefException;
import com.isands.farmer.registry.model.Ref;
import com.isands.farmer.registry.model.impl.RefImpl;
import com.isands.farmer.registry.model.impl.RefModelImpl;
import com.isands.farmer.registry.service.persistence.RefPersistence;

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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
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

/**
 * The persistence implementation for the ref service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RefPersistence
 * @see RefUtil
 * @generated
 */
public class RefPersistenceImpl extends BasePersistenceImpl<Ref>
    implements RefPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RefUtil} to access the ref persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RefImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, RefImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, RefImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FARMERID = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, RefImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfarmerId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FARMERID =
        new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, RefImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfarmerId",
            new String[] { Long.class.getName() },
            RefModelImpl.FARMERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FARMERID = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfarmerId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_FARMERID_FARMERID_2 = "ref.id.farmerId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONID = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, RefImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByregionId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID =
        new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, RefImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByregionId",
            new String[] { Long.class.getName() },
            RefModelImpl.REGIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REGIONID = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByregionId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_REGIONID_REGIONID_2 = "ref.id.regionId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, RefImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByfarmerIdAndRegionId",
            new String[] { Long.class.getName(), Long.class.getName() },
            RefModelImpl.FARMERID_COLUMN_BITMASK |
            RefModelImpl.REGIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FARMERIDANDREGIONID = new FinderPath(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByfarmerIdAndRegionId",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_FARMERIDANDREGIONID_FARMERID_2 = "ref.id.farmerId = ? AND ";
    private static final String _FINDER_COLUMN_FARMERIDANDREGIONID_REGIONID_2 = "ref.id.regionId = ?";
    private static final String _SQL_SELECT_REF = "SELECT ref FROM Ref ref";
    private static final String _SQL_SELECT_REF_WHERE = "SELECT ref FROM Ref ref WHERE ";
    private static final String _SQL_COUNT_REF = "SELECT COUNT(ref) FROM Ref ref";
    private static final String _SQL_COUNT_REF_WHERE = "SELECT COUNT(ref) FROM Ref ref WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "ref.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Ref exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Ref exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RefPersistenceImpl.class);
    private static Ref _nullRef = new RefImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Ref> toCacheModel() {
                return _nullRefCacheModel;
            }
        };

    private static CacheModel<Ref> _nullRefCacheModel = new CacheModel<Ref>() {
            @Override
            public Ref toEntityModel() {
                return _nullRef;
            }
        };

    public RefPersistenceImpl() {
        setModelClass(Ref.class);
    }

    /**
     * Returns all the refs where farmerId = &#63;.
     *
     * @param farmerId the farmer ID
     * @return the matching refs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Ref> findByfarmerId(long farmerId) throws SystemException {
        return findByfarmerId(farmerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Ref> findByfarmerId(long farmerId, int start, int end)
        throws SystemException {
        return findByfarmerId(farmerId, start, end, null);
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
    @Override
    public List<Ref> findByfarmerId(long farmerId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FARMERID;
            finderArgs = new Object[] { farmerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FARMERID;
            finderArgs = new Object[] { farmerId, start, end, orderByComparator };
        }

        List<Ref> list = (List<Ref>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Ref ref : list) {
                if ((farmerId != ref.getFarmerId())) {
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

            query.append(_SQL_SELECT_REF_WHERE);

            query.append(_FINDER_COLUMN_FARMERID_FARMERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RefModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(farmerId);

                if (!pagination) {
                    list = (List<Ref>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Ref>(list);
                } else {
                    list = (List<Ref>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first ref in the ordered set where farmerId = &#63;.
     *
     * @param farmerId the farmer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching ref
     * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref findByfarmerId_First(long farmerId,
        OrderByComparator orderByComparator)
        throws NoSuchRefException, SystemException {
        Ref ref = fetchByfarmerId_First(farmerId, orderByComparator);

        if (ref != null) {
            return ref;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("farmerId=");
        msg.append(farmerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRefException(msg.toString());
    }

    /**
     * Returns the first ref in the ordered set where farmerId = &#63;.
     *
     * @param farmerId the farmer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching ref, or <code>null</code> if a matching ref could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref fetchByfarmerId_First(long farmerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Ref> list = findByfarmerId(farmerId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Ref findByfarmerId_Last(long farmerId,
        OrderByComparator orderByComparator)
        throws NoSuchRefException, SystemException {
        Ref ref = fetchByfarmerId_Last(farmerId, orderByComparator);

        if (ref != null) {
            return ref;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("farmerId=");
        msg.append(farmerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRefException(msg.toString());
    }

    /**
     * Returns the last ref in the ordered set where farmerId = &#63;.
     *
     * @param farmerId the farmer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching ref, or <code>null</code> if a matching ref could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref fetchByfarmerId_Last(long farmerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByfarmerId(farmerId);

        if (count == 0) {
            return null;
        }

        List<Ref> list = findByfarmerId(farmerId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Ref[] findByfarmerId_PrevAndNext(RefPK refPK, long farmerId,
        OrderByComparator orderByComparator)
        throws NoSuchRefException, SystemException {
        Ref ref = findByPrimaryKey(refPK);

        Session session = null;

        try {
            session = openSession();

            Ref[] array = new RefImpl[3];

            array[0] = getByfarmerId_PrevAndNext(session, ref, farmerId,
                    orderByComparator, true);

            array[1] = ref;

            array[2] = getByfarmerId_PrevAndNext(session, ref, farmerId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Ref getByfarmerId_PrevAndNext(Session session, Ref ref,
        long farmerId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REF_WHERE);

        query.append(_FINDER_COLUMN_FARMERID_FARMERID_2);

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
            query.append(RefModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(farmerId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ref);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Ref> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the refs where farmerId = &#63; from the database.
     *
     * @param farmerId the farmer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByfarmerId(long farmerId) throws SystemException {
        for (Ref ref : findByfarmerId(farmerId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(ref);
        }
    }

    /**
     * Returns the number of refs where farmerId = &#63;.
     *
     * @param farmerId the farmer ID
     * @return the number of matching refs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByfarmerId(long farmerId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FARMERID;

        Object[] finderArgs = new Object[] { farmerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REF_WHERE);

            query.append(_FINDER_COLUMN_FARMERID_FARMERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(farmerId);

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
     * Returns all the refs where regionId = &#63;.
     *
     * @param regionId the region ID
     * @return the matching refs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Ref> findByregionId(long regionId) throws SystemException {
        return findByregionId(regionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Ref> findByregionId(long regionId, int start, int end)
        throws SystemException {
        return findByregionId(regionId, start, end, null);
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
    @Override
    public List<Ref> findByregionId(long regionId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID;
            finderArgs = new Object[] { regionId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONID;
            finderArgs = new Object[] { regionId, start, end, orderByComparator };
        }

        List<Ref> list = (List<Ref>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Ref ref : list) {
                if ((regionId != ref.getRegionId())) {
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

            query.append(_SQL_SELECT_REF_WHERE);

            query.append(_FINDER_COLUMN_REGIONID_REGIONID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RefModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(regionId);

                if (!pagination) {
                    list = (List<Ref>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Ref>(list);
                } else {
                    list = (List<Ref>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first ref in the ordered set where regionId = &#63;.
     *
     * @param regionId the region ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching ref
     * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref findByregionId_First(long regionId,
        OrderByComparator orderByComparator)
        throws NoSuchRefException, SystemException {
        Ref ref = fetchByregionId_First(regionId, orderByComparator);

        if (ref != null) {
            return ref;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("regionId=");
        msg.append(regionId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRefException(msg.toString());
    }

    /**
     * Returns the first ref in the ordered set where regionId = &#63;.
     *
     * @param regionId the region ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching ref, or <code>null</code> if a matching ref could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref fetchByregionId_First(long regionId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Ref> list = findByregionId(regionId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Ref findByregionId_Last(long regionId,
        OrderByComparator orderByComparator)
        throws NoSuchRefException, SystemException {
        Ref ref = fetchByregionId_Last(regionId, orderByComparator);

        if (ref != null) {
            return ref;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("regionId=");
        msg.append(regionId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRefException(msg.toString());
    }

    /**
     * Returns the last ref in the ordered set where regionId = &#63;.
     *
     * @param regionId the region ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching ref, or <code>null</code> if a matching ref could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref fetchByregionId_Last(long regionId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByregionId(regionId);

        if (count == 0) {
            return null;
        }

        List<Ref> list = findByregionId(regionId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Ref[] findByregionId_PrevAndNext(RefPK refPK, long regionId,
        OrderByComparator orderByComparator)
        throws NoSuchRefException, SystemException {
        Ref ref = findByPrimaryKey(refPK);

        Session session = null;

        try {
            session = openSession();

            Ref[] array = new RefImpl[3];

            array[0] = getByregionId_PrevAndNext(session, ref, regionId,
                    orderByComparator, true);

            array[1] = ref;

            array[2] = getByregionId_PrevAndNext(session, ref, regionId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Ref getByregionId_PrevAndNext(Session session, Ref ref,
        long regionId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REF_WHERE);

        query.append(_FINDER_COLUMN_REGIONID_REGIONID_2);

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
            query.append(RefModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(regionId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ref);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Ref> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the refs where regionId = &#63; from the database.
     *
     * @param regionId the region ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByregionId(long regionId) throws SystemException {
        for (Ref ref : findByregionId(regionId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(ref);
        }
    }

    /**
     * Returns the number of refs where regionId = &#63;.
     *
     * @param regionId the region ID
     * @return the number of matching refs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByregionId(long regionId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REGIONID;

        Object[] finderArgs = new Object[] { regionId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REF_WHERE);

            query.append(_FINDER_COLUMN_REGIONID_REGIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(regionId);

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
     * Returns the ref where farmerId = &#63; and regionId = &#63; or throws a {@link com.isands.farmer.registry.NoSuchRefException} if it could not be found.
     *
     * @param farmerId the farmer ID
     * @param regionId the region ID
     * @return the matching ref
     * @throws com.isands.farmer.registry.NoSuchRefException if a matching ref could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref findByfarmerIdAndRegionId(long farmerId, long regionId)
        throws NoSuchRefException, SystemException {
        Ref ref = fetchByfarmerIdAndRegionId(farmerId, regionId);

        if (ref == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("farmerId=");
            msg.append(farmerId);

            msg.append(", regionId=");
            msg.append(regionId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchRefException(msg.toString());
        }

        return ref;
    }

    /**
     * Returns the ref where farmerId = &#63; and regionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param farmerId the farmer ID
     * @param regionId the region ID
     * @return the matching ref, or <code>null</code> if a matching ref could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref fetchByfarmerIdAndRegionId(long farmerId, long regionId)
        throws SystemException {
        return fetchByfarmerIdAndRegionId(farmerId, regionId, true);
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
    @Override
    public Ref fetchByfarmerIdAndRegionId(long farmerId, long regionId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { farmerId, regionId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
                    finderArgs, this);
        }

        if (result instanceof Ref) {
            Ref ref = (Ref) result;

            if ((farmerId != ref.getFarmerId()) ||
                    (regionId != ref.getRegionId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_REF_WHERE);

            query.append(_FINDER_COLUMN_FARMERIDANDREGIONID_FARMERID_2);

            query.append(_FINDER_COLUMN_FARMERIDANDREGIONID_REGIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(farmerId);

                qPos.add(regionId);

                List<Ref> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "RefPersistenceImpl.fetchByfarmerIdAndRegionId(long, long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Ref ref = list.get(0);

                    result = ref;

                    cacheResult(ref);

                    if ((ref.getFarmerId() != farmerId) ||
                            (ref.getRegionId() != regionId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
                            finderArgs, ref);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Ref) result;
        }
    }

    /**
     * Removes the ref where farmerId = &#63; and regionId = &#63; from the database.
     *
     * @param farmerId the farmer ID
     * @param regionId the region ID
     * @return the ref that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref removeByfarmerIdAndRegionId(long farmerId, long regionId)
        throws NoSuchRefException, SystemException {
        Ref ref = findByfarmerIdAndRegionId(farmerId, regionId);

        return remove(ref);
    }

    /**
     * Returns the number of refs where farmerId = &#63; and regionId = &#63;.
     *
     * @param farmerId the farmer ID
     * @param regionId the region ID
     * @return the number of matching refs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByfarmerIdAndRegionId(long farmerId, long regionId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FARMERIDANDREGIONID;

        Object[] finderArgs = new Object[] { farmerId, regionId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_REF_WHERE);

            query.append(_FINDER_COLUMN_FARMERIDANDREGIONID_FARMERID_2);

            query.append(_FINDER_COLUMN_FARMERIDANDREGIONID_REGIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(farmerId);

                qPos.add(regionId);

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
     * Caches the ref in the entity cache if it is enabled.
     *
     * @param ref the ref
     */
    @Override
    public void cacheResult(Ref ref) {
        EntityCacheUtil.putResult(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefImpl.class, ref.getPrimaryKey(), ref);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
            new Object[] { ref.getFarmerId(), ref.getRegionId() }, ref);

        ref.resetOriginalValues();
    }

    /**
     * Caches the refs in the entity cache if it is enabled.
     *
     * @param refs the refs
     */
    @Override
    public void cacheResult(List<Ref> refs) {
        for (Ref ref : refs) {
            if (EntityCacheUtil.getResult(RefModelImpl.ENTITY_CACHE_ENABLED,
                        RefImpl.class, ref.getPrimaryKey()) == null) {
                cacheResult(ref);
            } else {
                ref.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all refs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RefImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RefImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the ref.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Ref ref) {
        EntityCacheUtil.removeResult(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefImpl.class, ref.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(ref);
    }

    @Override
    public void clearCache(List<Ref> refs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Ref ref : refs) {
            EntityCacheUtil.removeResult(RefModelImpl.ENTITY_CACHE_ENABLED,
                RefImpl.class, ref.getPrimaryKey());

            clearUniqueFindersCache(ref);
        }
    }

    protected void cacheUniqueFindersCache(Ref ref) {
        if (ref.isNew()) {
            Object[] args = new Object[] { ref.getFarmerId(), ref.getRegionId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FARMERIDANDREGIONID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
                args, ref);
        } else {
            RefModelImpl refModelImpl = (RefModelImpl) ref;

            if ((refModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ref.getFarmerId(), ref.getRegionId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FARMERIDANDREGIONID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
                    args, ref);
            }
        }
    }

    protected void clearUniqueFindersCache(Ref ref) {
        RefModelImpl refModelImpl = (RefModelImpl) ref;

        Object[] args = new Object[] { ref.getFarmerId(), ref.getRegionId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FARMERIDANDREGIONID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
            args);

        if ((refModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    refModelImpl.getOriginalFarmerId(),
                    refModelImpl.getOriginalRegionId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FARMERIDANDREGIONID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FARMERIDANDREGIONID,
                args);
        }
    }

    /**
     * Creates a new ref with the primary key. Does not add the ref to the database.
     *
     * @param refPK the primary key for the new ref
     * @return the new ref
     */
    @Override
    public Ref create(RefPK refPK) {
        Ref ref = new RefImpl();

        ref.setNew(true);
        ref.setPrimaryKey(refPK);

        return ref;
    }

    /**
     * Removes the ref with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param refPK the primary key of the ref
     * @return the ref that was removed
     * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref remove(RefPK refPK) throws NoSuchRefException, SystemException {
        return remove((Serializable) refPK);
    }

    /**
     * Removes the ref with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the ref
     * @return the ref that was removed
     * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref remove(Serializable primaryKey)
        throws NoSuchRefException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Ref ref = (Ref) session.get(RefImpl.class, primaryKey);

            if (ref == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRefException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(ref);
        } catch (NoSuchRefException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Ref removeImpl(Ref ref) throws SystemException {
        ref = toUnwrappedModel(ref);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(ref)) {
                ref = (Ref) session.get(RefImpl.class, ref.getPrimaryKeyObj());
            }

            if (ref != null) {
                session.delete(ref);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (ref != null) {
            clearCache(ref);
        }

        return ref;
    }

    @Override
    public Ref updateImpl(com.isands.farmer.registry.model.Ref ref)
        throws SystemException {
        ref = toUnwrappedModel(ref);

        boolean isNew = ref.isNew();

        RefModelImpl refModelImpl = (RefModelImpl) ref;

        Session session = null;

        try {
            session = openSession();

            if (ref.isNew()) {
                session.save(ref);

                ref.setNew(false);
            } else {
                session.merge(ref);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RefModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((refModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FARMERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { refModelImpl.getOriginalFarmerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FARMERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FARMERID,
                    args);

                args = new Object[] { refModelImpl.getFarmerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FARMERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FARMERID,
                    args);
            }

            if ((refModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { refModelImpl.getOriginalRegionId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID,
                    args);

                args = new Object[] { refModelImpl.getRegionId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONID,
                    args);
            }
        }

        EntityCacheUtil.putResult(RefModelImpl.ENTITY_CACHE_ENABLED,
            RefImpl.class, ref.getPrimaryKey(), ref);

        clearUniqueFindersCache(ref);
        cacheUniqueFindersCache(ref);

        return ref;
    }

    protected Ref toUnwrappedModel(Ref ref) {
        if (ref instanceof RefImpl) {
            return ref;
        }

        RefImpl refImpl = new RefImpl();

        refImpl.setNew(ref.isNew());
        refImpl.setPrimaryKey(ref.getPrimaryKey());

        refImpl.setFarmerId(ref.getFarmerId());
        refImpl.setRegionId(ref.getRegionId());

        return refImpl;
    }

    /**
     * Returns the ref with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the ref
     * @return the ref
     * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRefException, SystemException {
        Ref ref = fetchByPrimaryKey(primaryKey);

        if (ref == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRefException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return ref;
    }

    /**
     * Returns the ref with the primary key or throws a {@link com.isands.farmer.registry.NoSuchRefException} if it could not be found.
     *
     * @param refPK the primary key of the ref
     * @return the ref
     * @throws com.isands.farmer.registry.NoSuchRefException if a ref with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref findByPrimaryKey(RefPK refPK)
        throws NoSuchRefException, SystemException {
        return findByPrimaryKey((Serializable) refPK);
    }

    /**
     * Returns the ref with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the ref
     * @return the ref, or <code>null</code> if a ref with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Ref ref = (Ref) EntityCacheUtil.getResult(RefModelImpl.ENTITY_CACHE_ENABLED,
                RefImpl.class, primaryKey);

        if (ref == _nullRef) {
            return null;
        }

        if (ref == null) {
            Session session = null;

            try {
                session = openSession();

                ref = (Ref) session.get(RefImpl.class, primaryKey);

                if (ref != null) {
                    cacheResult(ref);
                } else {
                    EntityCacheUtil.putResult(RefModelImpl.ENTITY_CACHE_ENABLED,
                        RefImpl.class, primaryKey, _nullRef);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RefModelImpl.ENTITY_CACHE_ENABLED,
                    RefImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return ref;
    }

    /**
     * Returns the ref with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param refPK the primary key of the ref
     * @return the ref, or <code>null</code> if a ref with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ref fetchByPrimaryKey(RefPK refPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) refPK);
    }

    /**
     * Returns all the refs.
     *
     * @return the refs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Ref> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Ref> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Ref> findAll(int start, int end,
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

        List<Ref> list = (List<Ref>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_REF);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_REF;

                if (pagination) {
                    sql = sql.concat(RefModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Ref>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Ref>(list);
                } else {
                    list = (List<Ref>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the refs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Ref ref : findAll()) {
            remove(ref);
        }
    }

    /**
     * Returns the number of refs.
     *
     * @return the number of refs
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

                Query q = session.createQuery(_SQL_COUNT_REF);

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

    /**
     * Initializes the ref persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.isands.farmer.registry.model.Ref")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Ref>> listenersList = new ArrayList<ModelListener<Ref>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Ref>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RefImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
