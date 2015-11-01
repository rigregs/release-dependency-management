package com.opnitech.release.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.opnitech.release.services.model.Foo1;

/**
 * The persistence interface for the foo1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Foo1PersistenceImpl
 * @see Foo1Util
 * @generated
 */
public interface Foo1Persistence extends BasePersistence<Foo1> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Foo1Util} to access the foo1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the foo1s where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching foo1s
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opnitech.release.services.model.Foo1> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opnitech.release.services.model.Foo1> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opnitech.release.services.model.Foo1> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo1 in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo1
    * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the first foo1 in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo1 in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo1
    * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the last foo1 in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.opnitech.release.services.model.Foo1[] findByUuid_PrevAndNext(
        long fooId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Removes all the foo1s where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foo1s where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching foo1s
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo1 where uuid = &#63; and groupId = &#63; or throws a {@link com.opnitech.release.services.NoSuchFoo1Exception} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching foo1
    * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the foo1 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo1 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the foo1 where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the foo1 that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the number of foo1s where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching foo1s
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the foo1s where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching foo1s
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opnitech.release.services.model.Foo1> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opnitech.release.services.model.Foo1> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opnitech.release.services.model.Foo1> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.opnitech.release.services.model.Foo1 findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the first foo1 in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.opnitech.release.services.model.Foo1 findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the last foo1 in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.opnitech.release.services.model.Foo1[] findByUuid_C_PrevAndNext(
        long fooId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Removes all the foo1s where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foo1s where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching foo1s
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the foo1s where field2 = &#63;.
    *
    * @param field2 the field2
    * @return the matching foo1s
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opnitech.release.services.model.Foo1> findByField2(
        boolean field2)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opnitech.release.services.model.Foo1> findByField2(
        boolean field2, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opnitech.release.services.model.Foo1> findByField2(
        boolean field2, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first foo1 in the ordered set where field2 = &#63;.
    *
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo1
    * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 findByField2_First(
        boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the first foo1 in the ordered set where field2 = &#63;.
    *
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByField2_First(
        boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last foo1 in the ordered set where field2 = &#63;.
    *
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo1
    * @throws com.opnitech.release.services.NoSuchFoo1Exception if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 findByField2_Last(
        boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the last foo1 in the ordered set where field2 = &#63;.
    *
    * @param field2 the field2
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByField2_Last(
        boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.opnitech.release.services.model.Foo1[] findByField2_PrevAndNext(
        long fooId, boolean field2,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Removes all the foo1s where field2 = &#63; from the database.
    *
    * @param field2 the field2
    * @throws SystemException if a system exception occurred
    */
    public void removeByField2(boolean field2)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foo1s where field2 = &#63;.
    *
    * @param field2 the field2
    * @return the number of matching foo1s
    * @throws SystemException if a system exception occurred
    */
    public int countByField2(boolean field2)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the foo1 in the entity cache if it is enabled.
    *
    * @param foo1 the foo1
    */
    public void cacheResult(com.opnitech.release.services.model.Foo1 foo1);

    /**
    * Caches the foo1s in the entity cache if it is enabled.
    *
    * @param foo1s the foo1s
    */
    public void cacheResult(
        java.util.List<com.opnitech.release.services.model.Foo1> foo1s);

    /**
    * Creates a new foo1 with the primary key. Does not add the foo1 to the database.
    *
    * @param fooId the primary key for the new foo1
    * @return the new foo1
    */
    public com.opnitech.release.services.model.Foo1 create(long fooId);

    /**
    * Removes the foo1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fooId the primary key of the foo1
    * @return the foo1 that was removed
    * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 remove(long fooId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    public com.opnitech.release.services.model.Foo1 updateImpl(
        com.opnitech.release.services.model.Foo1 foo1)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the foo1 with the primary key or throws a {@link com.opnitech.release.services.NoSuchFoo1Exception} if it could not be found.
    *
    * @param fooId the primary key of the foo1
    * @return the foo1
    * @throws com.opnitech.release.services.NoSuchFoo1Exception if a foo1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 findByPrimaryKey(long fooId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opnitech.release.services.NoSuchFoo1Exception;

    /**
    * Returns the foo1 with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param fooId the primary key of the foo1
    * @return the foo1, or <code>null</code> if a foo1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opnitech.release.services.model.Foo1 fetchByPrimaryKey(
        long fooId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the foo1s.
    *
    * @return the foo1s
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opnitech.release.services.model.Foo1> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opnitech.release.services.model.Foo1> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.opnitech.release.services.model.Foo1> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the foo1s from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of foo1s.
    *
    * @return the number of foo1s
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
