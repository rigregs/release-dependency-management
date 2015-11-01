package com.opnitech.release.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Foo1LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Foo1LocalService
 * @generated
 */
public class Foo1LocalServiceWrapper implements Foo1LocalService,
    ServiceWrapper<Foo1LocalService> {
    private Foo1LocalService _foo1LocalService;

    public Foo1LocalServiceWrapper(Foo1LocalService foo1LocalService) {
        _foo1LocalService = foo1LocalService;
    }

    /**
    * Adds the foo1 to the database. Also notifies the appropriate model listeners.
    *
    * @param foo1 the foo1
    * @return the foo1 that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opnitech.release.services.model.Foo1 addFoo1(
        com.opnitech.release.services.model.Foo1 foo1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.addFoo1(foo1);
    }

    /**
    * Creates a new foo1 with the primary key. Does not add the foo1 to the database.
    *
    * @param fooId the primary key for the new foo1
    * @return the new foo1
    */
    @Override
    public com.opnitech.release.services.model.Foo1 createFoo1(long fooId) {
        return _foo1LocalService.createFoo1(fooId);
    }

    /**
    * Deletes the foo1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param fooId the primary key of the foo1
    * @return the foo1 that was removed
    * @throws PortalException if a foo1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opnitech.release.services.model.Foo1 deleteFoo1(long fooId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.deleteFoo1(fooId);
    }

    /**
    * Deletes the foo1 from the database. Also notifies the appropriate model listeners.
    *
    * @param foo1 the foo1
    * @return the foo1 that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opnitech.release.services.model.Foo1 deleteFoo1(
        com.opnitech.release.services.model.Foo1 foo1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.deleteFoo1(foo1);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _foo1LocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.opnitech.release.services.model.Foo1 fetchFoo1(long fooId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.fetchFoo1(fooId);
    }

    /**
    * Returns the foo1 with the matching UUID and company.
    *
    * @param uuid the foo1's UUID
    * @param companyId the primary key of the company
    * @return the matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opnitech.release.services.model.Foo1 fetchFoo1ByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.fetchFoo1ByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the foo1 matching the UUID and group.
    *
    * @param uuid the foo1's UUID
    * @param groupId the primary key of the group
    * @return the matching foo1, or <code>null</code> if a matching foo1 could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opnitech.release.services.model.Foo1 fetchFoo1ByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.fetchFoo1ByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the foo1 with the primary key.
    *
    * @param fooId the primary key of the foo1
    * @return the foo1
    * @throws PortalException if a foo1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opnitech.release.services.model.Foo1 getFoo1(long fooId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.getFoo1(fooId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public com.opnitech.release.services.model.Foo1 getFoo1ByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.getFoo1ByUuidAndCompanyId(uuid, companyId);
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
    @Override
    public com.opnitech.release.services.model.Foo1 getFoo1ByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.getFoo1ByUuidAndGroupId(uuid, groupId);
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
    public java.util.List<com.opnitech.release.services.model.Foo1> getFoo1s(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.getFoo1s(start, end);
    }

    /**
    * Returns the number of foo1s.
    *
    * @return the number of foo1s
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getFoo1sCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.getFoo1sCount();
    }

    /**
    * Updates the foo1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param foo1 the foo1
    * @return the foo1 that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opnitech.release.services.model.Foo1 updateFoo1(
        com.opnitech.release.services.model.Foo1 foo1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1LocalService.updateFoo1(foo1);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _foo1LocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _foo1LocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _foo1LocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Foo1LocalService getWrappedFoo1LocalService() {
        return _foo1LocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFoo1LocalService(Foo1LocalService foo1LocalService) {
        _foo1LocalService = foo1LocalService;
    }

    @Override
    public Foo1LocalService getWrappedService() {
        return _foo1LocalService;
    }

    @Override
    public void setWrappedService(Foo1LocalService foo1LocalService) {
        _foo1LocalService = foo1LocalService;
    }
}
