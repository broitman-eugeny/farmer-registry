package com.isands.farmer.registry.model.impl;

import com.isands.farmer.registry.model.Ref;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Ref in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Ref
 * @generated
 */
public class RefCacheModel implements CacheModel<Ref>, Externalizable {
    public long farmerId;
    public long regionId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{farmerId=");
        sb.append(farmerId);
        sb.append(", regionId=");
        sb.append(regionId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Ref toEntityModel() {
        RefImpl refImpl = new RefImpl();

        refImpl.setFarmerId(farmerId);
        refImpl.setRegionId(regionId);

        refImpl.resetOriginalValues();

        return refImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        farmerId = objectInput.readLong();
        regionId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(farmerId);
        objectOutput.writeLong(regionId);
    }
}
