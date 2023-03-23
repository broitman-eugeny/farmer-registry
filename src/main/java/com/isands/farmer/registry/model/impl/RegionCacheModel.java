package com.isands.farmer.registry.model.impl;

import com.isands.farmer.registry.model.Region;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Region in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Region
 * @generated
 */
public class RegionCacheModel implements CacheModel<Region>, Externalizable {
    public long id;
    public String name;
    public String code;
    public boolean archive;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", code=");
        sb.append(code);
        sb.append(", archive=");
        sb.append(archive);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Region toEntityModel() {
        RegionImpl regionImpl = new RegionImpl();

        regionImpl.setId(id);

        if (name == null) {
            regionImpl.setName(StringPool.BLANK);
        } else {
            regionImpl.setName(name);
        }

        if (code == null) {
            regionImpl.setCode(StringPool.BLANK);
        } else {
            regionImpl.setCode(code);
        }

        regionImpl.setArchive(archive);

        regionImpl.resetOriginalValues();

        return regionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        name = objectInput.readUTF();
        code = objectInput.readUTF();
        archive = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (code == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(code);
        }

        objectOutput.writeBoolean(archive);
    }
}
