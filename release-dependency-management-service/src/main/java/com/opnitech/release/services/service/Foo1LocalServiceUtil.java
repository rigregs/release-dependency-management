package com.opnitech.release.services.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Foo1. This utility wraps
 * {@link com.opnitech.release.services.service.impl.Foo1LocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see Foo1LocalService
 * @see com.opnitech.release.services.service.base.Foo1LocalServiceBaseImpl
 * @see com.opnitech.release.services.service.impl.Foo1LocalServiceImpl
 * @generated
 */
public class Foo1LocalServiceUtil {
    private static Foo1LocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.opnitech.release.services.service.impl.Foo1LocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the foo1 to the database. Also notifies the appropriate model listeners.
    *
    * @param foo1 the foo1
    * @return the foo1 that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 addFoo1(
        com.opnitech.release.services.model.Foo1 foo1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addFoo1(foo1);
    }

    /**
    * Creates a new foo1 with the primary key. Does not add the foo1 to the database.
    *
    * @param fooId the primary key for the new foo1
    * @return the new foo1
    */
    public static com.opnitech.release.services.model.Foo1 createFoo1(
        long fooId) {
        return getService().createFoo1(fooId);
    }

    /**
    * Deletes the foo1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fooId the primary key of the foo1
    * @return the foo1 that was removed
    * @throws PortalException if a foo1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 deleteFoo1(
        long fooId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFoo1(fooId);
    }

    /**
    * Deletes the foo1 from the database. Also notifies the appropriate model listeners.
    *
    * @param foo1 the foo1
    * @return the foo1 that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 deleteFoo1(
        com.opnitech.release.services.model.Foo1 foo1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFoo1(foo1);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opnitech.release.services.model.impl.Foo1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.opnitech.release.services.model.Foo1 fetchFoo1(long fooId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchFoo1(fooId);
    }

    /**
    * Returns the foo1 with the matching UUID and company.
    *
    * @param uuid the foo1's UUID
    * @param companyId the primary key of the company
    * @return the matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 fetchFoo1ByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchFoo1ByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the foo1 matching the UUID and group.
    *
    * @param uuid the foo1's UUID
    * @param groupId the primary key of the group
    * @return the matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 fetchFoo1ByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchFoo1ByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the foo1 with the primary key.
    *
    * @param fooId the primary key of the foo1
    * @return the foo1
    * @throws PortalException if a foo1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 getFoo1(long fooId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFoo1(fooId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the foo1 with the matching UUID and company.
    *
    * @param uuid the foo1's UUID
    * @param companyId the primary key of the company
    * @return the matching foo1
    * @throws PortalException if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 getFoo1ByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFoo1ByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the foo1 matching the UUID and group.
    *
    * @param uuid the foo1's UUID
    * @param groupId the primary key of the group
    * @return the matching foo1
    * @throws PortalException if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 getFoo1ByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFoo1ByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<com.opnitech.release.services.model.Foo1> getFoo1s(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFoo1s(start, end);
    }

    /**
    * Returns the number of foo1s.
    *
    * @return the number of foo1s
    * @throws SystemException if a system exception occurred
    */
    public static int getFoo1sCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFoo1sCount();
    }

    /**
    * Updates the foo1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param foo1 the foo1
    * @return the foo1 that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.opnitech.release.services.model.Foo1 updateFoo1(
        com.opnitech.release.services.model.Foo1 foo1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateFoo1(foo1);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static Foo1LocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Foo1LocalService.class.getName());

            if (invokableLocalService instanceof Foo1LocalService) {
                _service = (Foo1LocalService) invokableLocalService;
            } else {
                _service = new Foo1LocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Foo1LocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Foo1LocalService service) {
    }
}
