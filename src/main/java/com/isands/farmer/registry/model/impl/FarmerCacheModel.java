package com.isands.farmer.registry.model.impl;

import com.isands.farmer.registry.model.Farmer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Farmer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Farmer
 * @generated
 */
public class FarmerCacheModel implements CacheModel<Farmer>, Externalizable {
    public long id;
    public String organizationName;
    public int legalFormId;
    public String inn;
    public String kpp;
    public String ogrn;
    public long regionId;
    public long registrationDate;
    public boolean archive;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{id=");
        sb.append(id);
        sb.append(", organizationName=");
        sb.append(organizationName);
        sb.append(", legalFormId=");
        sb.append(legalFormId);
        sb.append(", inn=");
        sb.append(inn);
        sb.append(", kpp=");
        sb.append(kpp);
        sb.append(", ogrn=");
        sb.append(ogrn);
        sb.append(", regionId=");
        sb.append(regionId);
        sb.append(", registrationDate=");
        sb.append(registrationDate);
        sb.append(", archive=");
        sb.append(archive);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Farmer toEntityModel() {
        FarmerImpl farmerImpl = new FarmerImpl();

        farmerImpl.setId(id);

        if (organizationName == null) {
            farmerImpl.setOrganizationName(StringPool.BLANK);
        } else {
            farmerImpl.setOrganizationName(organizationName);
        }

        farmerImpl.setLegalFormId(legalFormId);

        if (inn == null) {
            farmerImpl.setInn(StringPool.BLANK);
        } else {
            farmerImpl.setInn(inn);
        }

        if (kpp == null) {
            farmerImpl.setKpp(StringPool.BLANK);
        } else {
            farmerImpl.setKpp(kpp);
        }

        if (ogrn == null) {
            farmerImpl.setOgrn(StringPool.BLANK);
        } else {
            farmerImpl.setOgrn(ogrn);
        }

        farmerImpl.setRegionId(regionId);

        if (registrationDate == Long.MIN_VALUE) {
            farmerImpl.setRegistrationDate(null);
        } else {
            farmerImpl.setRegistrationDate(new Date(registrationDate));
        }

        farmerImpl.setArchive(archive);

        farmerImpl.resetOriginalValues();

        return farmerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        organizationName = objectInput.readUTF();
        legalFormId = objectInput.readInt();
        inn = objectInput.readUTF();
        kpp = objectInput.readUTF();
        ogrn = objectInput.readUTF();
        regionId = objectInput.readLong();
        registrationDate = objectInput.readLong();
        archive = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (organizationName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(organizationName);
        }

        objectOutput.writeInt(legalFormId);

        if (inn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inn);
        }

        if (kpp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kpp);
        }

        if (ogrn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ogrn);
        }

        objectOutput.writeLong(regionId);
        objectOutput.writeLong(registrationDate);
        objectOutput.writeBoolean(archive);
    }
}
