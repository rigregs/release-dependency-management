package com.opnitech.release.services.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Foo1}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Foo1
 * @generated
 */
public class Foo1Wrapper implements Foo1, ModelWrapper<Foo1> {
    private Foo1 _foo1;

    public Foo1Wrapper(Foo1 foo1) {
        _foo1 = foo1;
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

    /**
    * Returns the primary key of this foo1.
    *
    * @return the primary key of this foo1
    */
    @Override
    public long getPrimaryKey() {
        return _foo1.getPrimaryKey();
    }

    /**
    * Sets the primary key of this foo1.
    *
    * @param primaryKey the primary key of this foo1
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _foo1.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this foo1.
    *
    * @return the uuid of this foo1
    */
    @Override
    public java.lang.String getUuid() {
        return _foo1.getUuid();
    }

    /**
    * Sets the uuid of this foo1.
    *
    * @param uuid the uuid of this foo1
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _foo1.setUuid(uuid);
    }

    /**
    * Returns the foo ID of this foo1.
    *
    * @return the foo ID of this foo1
    */
    @Override
    public long getFooId() {
        return _foo1.getFooId();
    }

    /**
    * Sets the foo ID of this foo1.
    *
    * @param fooId the foo ID of this foo1
    */
    @Override
    public void setFooId(long fooId) {
        _foo1.setFooId(fooId);
    }

    /**
    * Returns the group ID of this foo1.
    *
    * @return the group ID of this foo1
    */
    @Override
    public long getGroupId() {
        return _foo1.getGroupId();
    }

    /**
    * Sets the group ID of this foo1.
    *
    * @param groupId the group ID of this foo1
    */
    @Override
    public void setGroupId(long groupId) {
        _foo1.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this foo1.
    *
    * @return the company ID of this foo1
    */
    @Override
    public long getCompanyId() {
        return _foo1.getCompanyId();
    }

    /**
    * Sets the company ID of this foo1.
    *
    * @param companyId the company ID of this foo1
    */
    @Override
    public void setCompanyId(long companyId) {
        _foo1.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this foo1.
    *
    * @return the user ID of this foo1
    */
    @Override
    public long getUserId() {
        return _foo1.getUserId();
    }

    /**
    * Sets the user ID of this foo1.
    *
    * @param userId the user ID of this foo1
    */
    @Override
    public void setUserId(long userId) {
        _foo1.setUserId(userId);
    }

    /**
    * Returns the user uuid of this foo1.
    *
    * @return the user uuid of this foo1
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _foo1.getUserUuid();
    }

    /**
    * Sets the user uuid of this foo1.
    *
    * @param userUuid the user uuid of this foo1
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _foo1.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this foo1.
    *
    * @return the user name of this foo1
    */
    @Override
    public java.lang.String getUserName() {
        return _foo1.getUserName();
    }

    /**
    * Sets the user name of this foo1.
    *
    * @param userName the user name of this foo1
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _foo1.setUserName(userName);
    }

    /**
    * Returns the create date of this foo1.
    *
    * @return the create date of this foo1
    */
    @Override
    public java.util.Date getCreateDate() {
        return _foo1.getCreateDate();
    }

    /**
    * Sets the create date of this foo1.
    *
    * @param createDate the create date of this foo1
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _foo1.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this foo1.
    *
    * @return the modified date of this foo1
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _foo1.getModifiedDate();
    }

    /**
    * Sets the modified date of this foo1.
    *
    * @param modifiedDate the modified date of this foo1
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _foo1.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the field1 of this foo1.
    *
    * @return the field1 of this foo1
    */
    @Override
    public java.lang.String getField1() {
        return _foo1.getField1();
    }

    /**
    * Sets the field1 of this foo1.
    *
    * @param field1 the field1 of this foo1
    */
    @Override
    public void setField1(java.lang.String field1) {
        _foo1.setField1(field1);
    }

    /**
    * Returns the field2 of this foo1.
    *
    * @return the field2 of this foo1
    */
    @Override
    public boolean getField2() {
        return _foo1.getField2();
    }

    /**
    * Returns <code>true</code> if this foo1 is field2.
    *
    * @return <code>true</code> if this foo1 is field2; <code>false</code> otherwise
    */
    @Override
    public boolean isField2() {
        return _foo1.isField2();
    }

    /**
    * Sets whether this foo1 is field2.
    *
    * @param field2 the field2 of this foo1
    */
    @Override
    public void setField2(boolean field2) {
        _foo1.setField2(field2);
    }

    /**
    * Returns the field3 of this foo1.
    *
    * @return the field3 of this foo1
    */
    @Override
    public int getField3() {
        return _foo1.getField3();
    }

    /**
    * Sets the field3 of this foo1.
    *
    * @param field3 the field3 of this foo1
    */
    @Override
    public void setField3(int field3) {
        _foo1.setField3(field3);
    }

    /**
    * Returns the field4 of this foo1.
    *
    * @return the field4 of this foo1
    */
    @Override
    public java.util.Date getField4() {
        return _foo1.getField4();
    }

    /**
    * Sets the field4 of this foo1.
    *
    * @param field4 the field4 of this foo1
    */
    @Override
    public void setField4(java.util.Date field4) {
        _foo1.setField4(field4);
    }

    /**
    * Returns the field5 of this foo1.
    *
    * @return the field5 of this foo1
    */
    @Override
    public java.lang.String getField5() {
        return _foo1.getField5();
    }

    /**
    * Sets the field5 of this foo1.
    *
    * @param field5 the field5 of this foo1
    */
    @Override
    public void setField5(java.lang.String field5) {
        _foo1.setField5(field5);
    }

    /**
    * Returns the test of this foo1.
    *
    * @return the test of this foo1
    */
    @Override
    public boolean getTest() {
        return _foo1.getTest();
    }

    /**
    * Returns <code>true</code> if this foo1 is test.
    *
    * @return <code>true</code> if this foo1 is test; <code>false</code> otherwise
    */
    @Override
    public boolean isTest() {
        return _foo1.isTest();
    }

    /**
    * Sets whether this foo1 is test.
    *
    * @param test the test of this foo1
    */
    @Override
    public void setTest(boolean test) {
        _foo1.setTest(test);
    }

    @Override
    public boolean isNew() {
        return _foo1.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _foo1.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _foo1.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _foo1.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _foo1.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _foo1.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _foo1.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _foo1.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _foo1.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _foo1.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _foo1.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Foo1Wrapper((Foo1) _foo1.clone());
    }

    @Override
    public int compareTo(com.opnitech.release.services.model.Foo1 foo1) {
        return _foo1.compareTo(foo1);
    }

    @Override
    public int hashCode() {
        return _foo1.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.opnitech.release.services.model.Foo1> toCacheModel() {
        return _foo1.toCacheModel();
    }

    @Override
    public com.opnitech.release.services.model.Foo1 toEscapedModel() {
        return new Foo1Wrapper(_foo1.toEscapedModel());
    }

    @Override
    public com.opnitech.release.services.model.Foo1 toUnescapedModel() {
        return new Foo1Wrapper(_foo1.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _foo1.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _foo1.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _foo1.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Foo1Wrapper)) {
            return false;
        }

        Foo1Wrapper foo1Wrapper = (Foo1Wrapper) obj;

        if (Validator.equals(_foo1, foo1Wrapper._foo1)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _foo1.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Foo1 getWrappedFoo1() {
        return _foo1;
    }

    @Override
    public Foo1 getWrappedModel() {
        return _foo1;
    }

    @Override
    public void resetOriginalValues() {
        _foo1.resetOriginalValues();
    }
}
