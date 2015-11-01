package com.opnitech.release.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Foo1Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Foo1Service
 * @generated
 */
public class Foo1ServiceWrapper implements Foo1Service,
    ServiceWrapper<Foo1Service> {
    private Foo1Service _foo1Service;

    public Foo1ServiceWrapper(Foo1Service foo1Service) {
        _foo1Service = foo1Service;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _foo1Service.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _foo1Service.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _foo1Service.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Foo1Service getWrappedFoo1Service() {
        return _foo1Service;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFoo1Service(Foo1Service foo1Service) {
        _foo1Service = foo1Service;
    }

    @Override
    public Foo1Service getWrappedService() {
        return _foo1Service;
    }

    @Override
    public void setWrappedService(Foo1Service foo1Service) {
        _foo1Service = foo1Service;
    }
}
