package com.opnitech.release.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.opnitech.release.services.model.Foo1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Foo1 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Foo1
 * @generated
 */
public class Foo1CacheModel implements CacheModel<Foo1>, Externalizable {
    public String uuid;
    public long fooId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String field1;
    public boolean field2;
    public int field3;
    public long field4;
    public String field5;
    public boolean test;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", fooId=");
        sb.append(fooId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", field1=");
        sb.append(field1);
        sb.append(", field2=");
        sb.append(field2);
        sb.append(", field3=");
        sb.append(field3);
        sb.append(", field4=");
        sb.append(field4);
        sb.append(", field5=");
        sb.append(field5);
        sb.append(", test=");
        sb.append(test);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Foo1 toEntityModel() {
        Foo1Impl foo1Impl = new Foo1Impl();

        if (uuid == null) {
            foo1Impl.setUuid(StringPool.BLANK);
        } else {
            foo1Impl.setUuid(uuid);
        }

        foo1Impl.setFooId(fooId);
        foo1Impl.setGroupId(groupId);
        foo1Impl.setCompanyId(companyId);
        foo1Impl.setUserId(userId);

        if (userName == null) {
            foo1Impl.setUserName(StringPool.BLANK);
        } else {
            foo1Impl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            foo1Impl.setCreateDate(null);
        } else {
            foo1Impl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            foo1Impl.setModifiedDate(null);
        } else {
            foo1Impl.setModifiedDate(new Date(modifiedDate));
        }

        if (field1 == null) {
            foo1Impl.setField1(StringPool.BLANK);
        } else {
            foo1Impl.setField1(field1);
        }

        foo1Impl.setField2(field2);
        foo1Impl.setField3(field3);

        if (field4 == Long.MIN_VALUE) {
            foo1Impl.setField4(null);
        } else {
            foo1Impl.setField4(new Date(field4));
        }

        if (field5 == null) {
            foo1Impl.setField5(StringPool.BLANK);
        } else {
            foo1Impl.setField5(field5);
        }

        foo1Impl.setTest(test);

        foo1Impl.resetOriginalValues();

        return foo1Impl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        fooId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        field1 = objectInput.readUTF();
        field2 = objectInput.readBoolean();
        field3 = objectInput.readInt();
        field4 = objectInput.readLong();
        field5 = objectInput.readUTF();
        test = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(fooId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (field1 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(field1);
        }

        objectOutput.writeBoolean(field2);
        objectOutput.writeInt(field3);
        objectOutput.writeLong(field4);

        if (field5 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(field5);
        }

        objectOutput.writeBoolean(test);
    }
}
