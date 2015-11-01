package com.opnitech.release.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.opnitech.release.services.model.Foo1;
import com.opnitech.release.services.service.Foo1LocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class Foo1ActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Foo1ActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Foo1LocalServiceUtil.getService());
        setClass(Foo1.class);

        setClassLoader(com.opnitech.release.services.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("fooId");
    }
}
