package com.opnitech.release.services.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.opnitech.release.services.service.ClpSerializer;
import com.opnitech.release.services.service.Foo1LocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Foo1Clp extends BaseModelImpl<Foo1> implements Foo1 {
    private String _uuid;
    private long _fooId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _field1;
    private boolean _field2;
    private int _field3;
    private Date _field4;
    private String _field5;
    private boolean _test;
    private BaseModel<?> _foo1RemoteModel;
    private Class<?> _clpSerializerClass = com.opnitech.release.services.service.ClpSerializer.class;

    public Foo1Clp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Foo1.class;
    }

    @Override
    public String getModelClassName() {
        return Foo1.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _fooId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFooId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _fooId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("fooId", getFooId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("field1", getField1());
        attributes.put("field2", getField2());
        attributes.put("field3", getField3());
        attributes.put("field4", getField4());
        attributes.put("field5", getField5());
        attributes.put("test", getTest());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long fooId = (Long) attributes.get("fooId");

        if (fooId != null) {
            setFooId(fooId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String field1 = (String) attributes.get("field1");

        if (field1 != null) {
            setField1(field1);
        }

        Boolean field2 = (Boolean) attributes.get("field2");

        if (field2 != null) {
            setField2(field2);
        }

        Integer field3 = (Integer) attributes.get("field3");

        if (field3 != null) {
            setField3(field3);
        }

        Date field4 = (Date) attributes.get("field4");

        if (field4 != null) {
            setField4(field4);
        }

        String field5 = (String) attributes.get("field5");

        if (field5 != null) {
            setField5(field5);
        }

        Boolean test = (Boolean) attributes.get("test");

        if (test != null) {
            setTest(test);
        }
    }

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_foo1RemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFooId() {
        return _fooId;
    }

    @Override
    public void setFooId(long fooId) {
        _fooId = fooId;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setFooId", long.class);

                method.invoke(_foo1RemoteModel, fooId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_foo1RemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_foo1RemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_foo1RemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_foo1RemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_foo1RemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_foo1RemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getField1() {
        return _field1;
    }

    @Override
    public void setField1(String field1) {
        _field1 = field1;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setField1", String.class);

                method.invoke(_foo1RemoteModel, field1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getField2() {
        return _field2;
    }

    @Override
    public boolean isField2() {
        return _field2;
    }

    @Override
    public void setField2(boolean field2) {
        _field2 = field2;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setField2", boolean.class);

                method.invoke(_foo1RemoteModel, field2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getField3() {
        return _field3;
    }

    @Override
    public void setField3(int field3) {
        _field3 = field3;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setField3", int.class);

                method.invoke(_foo1RemoteModel, field3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getField4() {
        return _field4;
    }

    @Override
    public void setField4(Date field4) {
        _field4 = field4;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setField4", Date.class);

                method.invoke(_foo1RemoteModel, field4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getField5() {
        return _field5;
    }

    @Override
    public void setField5(String field5) {
        _field5 = field5;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setField5", String.class);

                method.invoke(_foo1RemoteModel, field5);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getTest() {
        return _test;
    }

    @Override
    public boolean isTest() {
        return _test;
    }

    @Override
    public void setTest(boolean test) {
        _test = test;

        if (_foo1RemoteModel != null) {
            try {
                Class<?> clazz = _foo1RemoteModel.getClass();

                Method method = clazz.getMethod("setTest", boolean.class);

                method.invoke(_foo1RemoteModel, test);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Foo1.class.getName()));
    }

    public BaseModel<?> getFoo1RemoteModel() {
        return _foo1RemoteModel;
    }

    public void setFoo1RemoteModel(BaseModel<?> foo1RemoteModel) {
        _foo1RemoteModel = foo1RemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _foo1RemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_foo1RemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Foo1LocalServiceUtil.addFoo1(this);
        } else {
            Foo1LocalServiceUtil.updateFoo1(this);
        }
    }

    @Override
    public Foo1 toEscapedModel() {
        return (Foo1) ProxyUtil.newProxyInstance(Foo1.class.getClassLoader(),
            new Class[] { Foo1.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Foo1Clp clone = new Foo1Clp();

        clone.setUuid(getUuid());
        clone.setFooId(getFooId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setField1(getField1());
        clone.setField2(getField2());
        clone.setField3(getField3());
        clone.setField4(getField4());
        clone.setField5(getField5());
        clone.setTest(getTest());

        return clone;
    }

    @Override
    public int compareTo(Foo1 foo1) {
        int value = 0;

        value = getField1().compareTo(foo1.getField1());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Foo1Clp)) {
            return false;
        }

        Foo1Clp foo1 = (Foo1Clp) obj;

        long primaryKey = foo1.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", fooId=");
        sb.append(getFooId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", field1=");
        sb.append(getField1());
        sb.append(", field2=");
        sb.append(getField2());
        sb.append(", field3=");
        sb.append(getField3());
        sb.append(", field4=");
        sb.append(getField4());
        sb.append(", field5=");
        sb.append(getField5());
        sb.append(", test=");
        sb.append(getTest());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.opnitech.release.services.model.Foo1");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fooId</column-name><column-value><![CDATA[");
        sb.append(getFooId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>field1</column-name><column-value><![CDATA[");
        sb.append(getField1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>field2</column-name><column-value><![CDATA[");
        sb.append(getField2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>field3</column-name><column-value><![CDATA[");
        sb.append(getField3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>field4</column-name><column-value><![CDATA[");
        sb.append(getField4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>field5</column-name><column-value><![CDATA[");
        sb.append(getField5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>test</column-name><column-value><![CDATA[");
        sb.append(getTest());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
