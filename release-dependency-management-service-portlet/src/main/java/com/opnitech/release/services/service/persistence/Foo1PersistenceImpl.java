package com.opnitech.release.services.service.persistence;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.opnitech.release.services.NoSuchFoo1Exception;
import com.opnitech.release.services.model.Foo1;
import com.opnitech.release.services.model.impl.Foo1Impl;
import com.opnitech.release.services.model.impl.Foo1ModelImpl;
import com.opnitech.release.services.service.persistence.Foo1Persistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the foo1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Foo1Persistence
 * @see Foo1Util
 * @generated
 */
public class Foo1PersistenceImpl extends BasePersistenceImpl<Foo1>
    implements Foo1Persistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Foo1Util} to access the foo1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Foo1Impl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            Foo1ModelImpl.UUID_COLUMN_BITMASK |
            Foo1ModelImpl.FIELD1_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "foo1.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "foo1.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(foo1.uuid IS NULL OR foo1.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            Foo1ModelImpl.UUID_COLUMN_BITMASK |
            Foo1ModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "foo1.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "foo1.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(foo1.uuid IS NULL OR foo1.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "foo1.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            Foo1ModelImpl.UUID_COLUMN_BITMASK |
            Foo1ModelImpl.COMPANYID_COLUMN_BITMASK |
            Foo1ModelImpl.FIELD1_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "foo1.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "foo1.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(foo1.uuid IS NULL OR foo1.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "foo1.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD2 = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField2",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2 =
        new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Foo1Impl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField2",
            new String[] { Boolean.class.getName() },
            Foo1ModelImpl.FIELD2_COLUMN_BITMASK |
            Foo1ModelImpl.FIELD1_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FIELD2 = new FinderPath(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField2",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_FIELD2_FIELD2_2 = "foo1.field2 = ?";
    private static final String _SQL_SELECT_FOO1 = "SELECT foo1 FROM Foo1 foo1";
    private static final String _SQL_SELECT_FOO1_WHERE = "SELECT foo1 FROM Foo1 foo1 WHERE ";
    private static final String _SQL_COUNT_FOO1 = "SELECT COUNT(foo1) FROM Foo1 foo1";
    private static final String _SQL_COUNT_FOO1_WHERE = "SELECT COUNT(foo1) FROM Foo1 foo1 WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "foo1.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Foo1 exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Foo1 exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Foo1PersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Foo1 _nullFoo1 = new Foo1Impl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Foo1> toCacheModel() {
                return _nullFoo1CacheModel;
            }
        };

    private static CacheModel<Foo1> _nullFoo1CacheModel = new CacheModel<Foo1>() {
            @Override
            public Foo1 toEntityModel() {
                return _nullFoo1;
            }
        };

    public Foo1PersistenceImpl() {
        setModelClass(Foo1.class);
    }

    /**
     * Returns all the foo1s where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the foo1s where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of foo1s
     * @param end the upper bound of the range of foo1s (not inclusive)
     * @return the range of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the foo1s where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of foo1s
     * @param end the upper bound of the range of foo1s (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Foo1> list = (List<Foo1>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Foo1 foo1 : list) {
                if (!Validator.equals(uuid, foo1.getUuid())) {
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

            query.append(_SQL_SELECT_FOO1_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Foo1ModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Foo1>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Foo1>(list);
                } else {
                    list = (List<Foo1>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first foo1 in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = fetchByUuid_First(uuid, orderByComparator);

        if (foo1 != null) {
            return foo1;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFoo1Exception(msg.toString());
    }

    /**
     * Returns the first foo1 in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo1, or <code>null</code> if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Foo1> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last foo1 in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByUuid_Last(String uuid, OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = fetchByUuid_Last(uuid, orderByComparator);

        if (foo1 != null) {
            return foo1;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFoo1Exception(msg.toString());
    }

    /**
     * Returns the last foo1 in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo1, or <code>null</code> if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Foo1> list = findByUuid(uuid, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the foo1s before and after the current foo1 in the ordered set where uuid = &#63;.
     *
     * @param fooId the primary key of the current foo1
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1[] findByUuid_PrevAndNext(long fooId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = findByPrimaryKey(fooId);

        Session session = null;

        try {
            session = openSession();

            Foo1[] array = new Foo1Impl[3];

            array[0] = getByUuid_PrevAndNext(session, foo1, uuid,
                    orderByComparator, true);

            array[1] = foo1;

            array[2] = getByUuid_PrevAndNext(session, foo1, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Foo1 getByUuid_PrevAndNext(Session session, Foo1 foo1,
        String uuid, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FOO1_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
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
            query.append(Foo1ModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(foo1);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Foo1> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the foo1s where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Foo1 foo1 : findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(foo1);
        }
    }

    /**
     * Returns the number of foo1s where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FOO1_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
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
     * Returns the foo1 where uuid = &#63; and groupId = &#63; or throws a {@link com.opnitech.release.services.NoSuchFoo1Exception} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByUUID_G(String uuid, long groupId)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = fetchByUUID_G(uuid, groupId);

        if (foo1 == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchFoo1Exception(msg.toString());
        }

        return foo1;
    }

    /**
     * Returns the foo1 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching foo1, or <code>null</code> if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the foo1 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching foo1, or <code>null</code> if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Foo1) {
            Foo1 foo1 = (Foo1) result;

            if (!Validator.equals(uuid, foo1.getUuid()) ||
                    (groupId != foo1.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_FOO1_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<Foo1> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Foo1 foo1 = list.get(0);

                    result = foo1;

                    cacheResult(foo1);

                    if ((foo1.getUuid() == null) ||
                            !foo1.getUuid().equals(uuid) ||
                            (foo1.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, foo1);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Foo1) result;
        }
    }

    /**
     * Removes the foo1 where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the foo1 that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 removeByUUID_G(String uuid, long groupId)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = findByUUID_G(uuid, groupId);

        return remove(foo1);
    }

    /**
     * Returns the number of foo1s where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FOO1_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

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
     * Returns all the foo1s where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the foo1s where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of foo1s
     * @param end the upper bound of the range of foo1s (not inclusive)
     * @return the range of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByUuid_C(String uuid, long companyId, int start,
        int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the foo1s where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of foo1s
     * @param end the upper bound of the range of foo1s (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByUuid_C(String uuid, long companyId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<Foo1> list = (List<Foo1>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Foo1 foo1 : list) {
                if (!Validator.equals(uuid, foo1.getUuid()) ||
                        (companyId != foo1.getCompanyId())) {
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

            query.append(_SQL_SELECT_FOO1_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Foo1ModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Foo1>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Foo1>(list);
                } else {
                    list = (List<Foo1>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first foo1 in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = fetchByUuid_C_First(uuid, companyId, orderByComparator);

        if (foo1 != null) {
            return foo1;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFoo1Exception(msg.toString());
    }

    /**
     * Returns the first foo1 in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo1, or <code>null</code> if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Foo1> list = findByUuid_C(uuid, companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last foo1 in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

        if (foo1 != null) {
            return foo1;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFoo1Exception(msg.toString());
    }

    /**
     * Returns the last foo1 in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo1, or <code>null</code> if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Foo1> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the foo1s before and after the current foo1 in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param fooId the primary key of the current foo1
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1[] findByUuid_C_PrevAndNext(long fooId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = findByPrimaryKey(fooId);

        Session session = null;

        try {
            session = openSession();

            Foo1[] array = new Foo1Impl[3];

            array[0] = getByUuid_C_PrevAndNext(session, foo1, uuid, companyId,
                    orderByComparator, true);

            array[1] = foo1;

            array[2] = getByUuid_C_PrevAndNext(session, foo1, uuid, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Foo1 getByUuid_C_PrevAndNext(Session session, Foo1 foo1,
        String uuid, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FOO1_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
            query.append(Foo1ModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(foo1);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Foo1> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the foo1s where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Foo1 foo1 : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(foo1);
        }
    }

    /**
     * Returns the number of foo1s where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FOO1_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

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
     * Returns all the foo1s where field2 = &#63;.
     *
     * @param field2 the field2
     * @return the matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByField2(boolean field2) throws SystemException {
        return findByField2(field2, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the foo1s where field2 = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param field2 the field2
     * @param start the lower bound of the range of foo1s
     * @param end the upper bound of the range of foo1s (not inclusive)
     * @return the range of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByField2(boolean field2, int start, int end)
        throws SystemException {
        return findByField2(field2, start, end, null);
    }

    /**
     * Returns an ordered range of all the foo1s where field2 = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param field2 the field2
     * @param start the lower bound of the range of foo1s
     * @param end the upper bound of the range of foo1s (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findByField2(boolean field2, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2;
            finderArgs = new Object[] { field2 };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD2;
            finderArgs = new Object[] { field2, start, end, orderByComparator };
        }

        List<Foo1> list = (List<Foo1>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Foo1 foo1 : list) {
                if ((field2 != foo1.getField2())) {
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

            query.append(_SQL_SELECT_FOO1_WHERE);

            query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Foo1ModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(field2);

                if (!pagination) {
                    list = (List<Foo1>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Foo1>(list);
                } else {
                    list = (List<Foo1>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first foo1 in the ordered set where field2 = &#63;.
     *
     * @param field2 the field2
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByField2_First(boolean field2,
        OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = fetchByField2_First(field2, orderByComparator);

        if (foo1 != null) {
            return foo1;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("field2=");
        msg.append(field2);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFoo1Exception(msg.toString());
    }

    /**
     * Returns the first foo1 in the ordered set where field2 = &#63;.
     *
     * @param field2 the field2
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo1, or <code>null</code> if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByField2_First(boolean field2,
        OrderByComparator orderByComparator) throws SystemException {
        List<Foo1> list = findByField2(field2, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last foo1 in the ordered set where field2 = &#63;.
     *
     * @param field2 the field2
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByField2_Last(boolean field2,
        OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = fetchByField2_Last(field2, orderByComparator);

        if (foo1 != null) {
            return foo1;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("field2=");
        msg.append(field2);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFoo1Exception(msg.toString());
    }

    /**
     * Returns the last foo1 in the ordered set where field2 = &#63;.
     *
     * @param field2 the field2
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo1, or <code>null</code> if a matching foo1 could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByField2_Last(boolean field2,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByField2(field2);

        if (count == 0) {
            return null;
        }

        List<Foo1> list = findByField2(field2, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the foo1s before and after the current foo1 in the ordered set where field2 = &#63;.
     *
     * @param fooId the primary key of the current foo1
     * @param field2 the field2
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1[] findByField2_PrevAndNext(long fooId, boolean field2,
        OrderByComparator orderByComparator)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = findByPrimaryKey(fooId);

        Session session = null;

        try {
            session = openSession();

            Foo1[] array = new Foo1Impl[3];

            array[0] = getByField2_PrevAndNext(session, foo1, field2,
                    orderByComparator, true);

            array[1] = foo1;

            array[2] = getByField2_PrevAndNext(session, foo1, field2,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Foo1 getByField2_PrevAndNext(Session session, Foo1 foo1,
        boolean field2, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FOO1_WHERE);

        query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

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
            query.append(Foo1ModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(field2);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(foo1);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Foo1> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the foo1s where field2 = &#63; from the database.
     *
     * @param field2 the field2
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByField2(boolean field2) throws SystemException {
        for (Foo1 foo1 : findByField2(field2, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(foo1);
        }
    }

    /**
     * Returns the number of foo1s where field2 = &#63;.
     *
     * @param field2 the field2
     * @return the number of matching foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByField2(boolean field2) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FIELD2;

        Object[] finderArgs = new Object[] { field2 };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FOO1_WHERE);

            query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(field2);

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
     * Caches the foo1 in the entity cache if it is enabled.
     *
     * @param foo1 the foo1
     */
    @Override
    public void cacheResult(Foo1 foo1) {
        EntityCacheUtil.putResult(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1Impl.class, foo1.getPrimaryKey(), foo1);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { foo1.getUuid(), foo1.getGroupId() }, foo1);

        foo1.resetOriginalValues();
    }

    /**
     * Caches the foo1s in the entity cache if it is enabled.
     *
     * @param foo1s the foo1s
     */
    @Override
    public void cacheResult(List<Foo1> foo1s) {
        for (Foo1 foo1 : foo1s) {
            if (EntityCacheUtil.getResult(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
                        Foo1Impl.class, foo1.getPrimaryKey()) == null) {
                cacheResult(foo1);
            } else {
                foo1.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all foo1s.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Foo1Impl.class.getName());
        }

        EntityCacheUtil.clearCache(Foo1Impl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the foo1.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Foo1 foo1) {
        EntityCacheUtil.removeResult(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1Impl.class, foo1.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(foo1);
    }

    @Override
    public void clearCache(List<Foo1> foo1s) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Foo1 foo1 : foo1s) {
            EntityCacheUtil.removeResult(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
                Foo1Impl.class, foo1.getPrimaryKey());

            clearUniqueFindersCache(foo1);
        }
    }

    protected void cacheUniqueFindersCache(Foo1 foo1) {
        if (foo1.isNew()) {
            Object[] args = new Object[] { foo1.getUuid(), foo1.getGroupId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, foo1);
        } else {
            Foo1ModelImpl foo1ModelImpl = (Foo1ModelImpl) foo1;

            if ((foo1ModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { foo1.getUuid(), foo1.getGroupId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    foo1);
            }
        }
    }

    protected void clearUniqueFindersCache(Foo1 foo1) {
        Foo1ModelImpl foo1ModelImpl = (Foo1ModelImpl) foo1;

        Object[] args = new Object[] { foo1.getUuid(), foo1.getGroupId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((foo1ModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    foo1ModelImpl.getOriginalUuid(),
                    foo1ModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new foo1 with the primary key. Does not add the foo1 to the database.
     *
     * @param fooId the primary key for the new foo1
     * @return the new foo1
     */
    @Override
    public Foo1 create(long fooId) {
        Foo1 foo1 = new Foo1Impl();

        foo1.setNew(true);
        foo1.setPrimaryKey(fooId);

        String uuid = PortalUUIDUtil.generate();

        foo1.setUuid(uuid);

        return foo1;
    }

    /**
     * Removes the foo1 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param fooId the primary key of the foo1
     * @return the foo1 that was removed
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 remove(long fooId) throws NoSuchFoo1Exception, SystemException {
        return remove((Serializable) fooId);
    }

    /**
     * Removes the foo1 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the foo1
     * @return the foo1 that was removed
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 remove(Serializable primaryKey)
        throws NoSuchFoo1Exception, SystemException {
        Session session = null;

        try {
            session = openSession();

            Foo1 foo1 = (Foo1) session.get(Foo1Impl.class, primaryKey);

            if (foo1 == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFoo1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(foo1);
        } catch (NoSuchFoo1Exception nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Foo1 removeImpl(Foo1 foo1) throws SystemException {
        foo1 = toUnwrappedModel(foo1);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(foo1)) {
                foo1 = (Foo1) session.get(Foo1Impl.class,
                        foo1.getPrimaryKeyObj());
            }

            if (foo1 != null) {
                session.delete(foo1);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (foo1 != null) {
            clearCache(foo1);
        }

        return foo1;
    }

    @Override
    public Foo1 updateImpl(com.opnitech.release.services.model.Foo1 foo1)
        throws SystemException {
        foo1 = toUnwrappedModel(foo1);

        boolean isNew = foo1.isNew();

        Foo1ModelImpl foo1ModelImpl = (Foo1ModelImpl) foo1;

        if (Validator.isNull(foo1.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            foo1.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (foo1.isNew()) {
                session.save(foo1);

                foo1.setNew(false);
            } else {
                session.merge(foo1);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Foo1ModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((foo1ModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { foo1ModelImpl.getOriginalUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { foo1ModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((foo1ModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        foo1ModelImpl.getOriginalUuid(),
                        foo1ModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        foo1ModelImpl.getUuid(), foo1ModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((foo1ModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { foo1ModelImpl.getOriginalField2() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FIELD2, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2,
                    args);

                args = new Object[] { foo1ModelImpl.getField2() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FIELD2, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2,
                    args);
            }
        }

        EntityCacheUtil.putResult(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
            Foo1Impl.class, foo1.getPrimaryKey(), foo1);

        clearUniqueFindersCache(foo1);
        cacheUniqueFindersCache(foo1);

        return foo1;
    }

    protected Foo1 toUnwrappedModel(Foo1 foo1) {
        if (foo1 instanceof Foo1Impl) {
            return foo1;
        }

        Foo1Impl foo1Impl = new Foo1Impl();

        foo1Impl.setNew(foo1.isNew());
        foo1Impl.setPrimaryKey(foo1.getPrimaryKey());

        foo1Impl.setUuid(foo1.getUuid());
        foo1Impl.setFooId(foo1.getFooId());
        foo1Impl.setGroupId(foo1.getGroupId());
        foo1Impl.setCompanyId(foo1.getCompanyId());
        foo1Impl.setUserId(foo1.getUserId());
        foo1Impl.setUserName(foo1.getUserName());
        foo1Impl.setCreateDate(foo1.getCreateDate());
        foo1Impl.setModifiedDate(foo1.getModifiedDate());
        foo1Impl.setField1(foo1.getField1());
        foo1Impl.setField2(foo1.isField2());
        foo1Impl.setField3(foo1.getField3());
        foo1Impl.setField4(foo1.getField4());
        foo1Impl.setField5(foo1.getField5());
        foo1Impl.setTest(foo1.isTest());

        return foo1Impl;
    }

    /**
     * Returns the foo1 with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the foo1
     * @return the foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFoo1Exception, SystemException {
        Foo1 foo1 = fetchByPrimaryKey(primaryKey);

        if (foo1 == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFoo1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return foo1;
    }

    /**
     * Returns the foo1 with the primary key or throws a {@link com.opnitech.release.services.NoSuchFoo1Exception} if it could not be found.
     *
     * @param fooId the primary key of the foo1
     * @return the foo1
     * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 findByPrimaryKey(long fooId)
        throws NoSuchFoo1Exception, SystemException {
        return findByPrimaryKey((Serializable) fooId);
    }

    /**
     * Returns the foo1 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the foo1
     * @return the foo1, or <code>null</code> if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Foo1 foo1 = (Foo1) EntityCacheUtil.getResult(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
                Foo1Impl.class, primaryKey);

        if (foo1 == _nullFoo1) {
            return null;
        }

        if (foo1 == null) {
            Session session = null;

            try {
                session = openSession();

                foo1 = (Foo1) session.get(Foo1Impl.class, primaryKey);

                if (foo1 != null) {
                    cacheResult(foo1);
                } else {
                    EntityCacheUtil.putResult(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
                        Foo1Impl.class, primaryKey, _nullFoo1);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Foo1ModelImpl.ENTITY_CACHE_ENABLED,
                    Foo1Impl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return foo1;
    }

    /**
     * Returns the foo1 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param fooId the primary key of the foo1
     * @return the foo1, or <code>null</code> if a foo1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Foo1 fetchByPrimaryKey(long fooId) throws SystemException {
        return fetchByPrimaryKey((Serializable) fooId);
    }

    /**
     * Returns all the foo1s.
     *
     * @return the foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the foo1s.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of foo1s
     * @param end the upper bound of the range of foo1s (not inclusive)
     * @return the range of foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the foo1s.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of foo1s
     * @param end the upper bound of the range of foo1s (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of foo1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Foo1> findAll(int start, int end,
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

        List<Foo1> list = (List<Foo1>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FOO1);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FOO1;

                if (pagination) {
                    sql = sql.concat(Foo1ModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Foo1>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Foo1>(list);
                } else {
                    list = (List<Foo1>) QueryUtil.list(q, getDialect(), start,
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
     * Removes all the foo1s from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Foo1 foo1 : findAll()) {
            remove(foo1);
        }
    }

    /**
     * Returns the number of foo1s.
     *
     * @return the number of foo1s
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

                Query q = session.createQuery(_SQL_COUNT_FOO1);

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
     * Initializes the foo1 persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.opnitech.release.services.model.Foo1")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Foo1>> listenersList = new ArrayList<ModelListener<Foo1>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Foo1>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Foo1Impl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
