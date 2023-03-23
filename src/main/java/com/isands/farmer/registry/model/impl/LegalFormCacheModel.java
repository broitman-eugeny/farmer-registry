package com.isands.farmer.registry.model.impl;

import com.isands.farmer.registry.model.LegalForm;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LegalForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LegalForm
 * @generated
 */
public class LegalFormCacheModel implements CacheModel<LegalForm>,
    Externalizable {
    public int id;
    public String abbreviation;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(id);
        sb.append(", abbreviation=");
        sb.append(abbreviation);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public LegalForm toEntityModel() {
        LegalFormImpl legalFormImpl = new LegalFormImpl();

        legalFormImpl.setId(id);

        if (abbreviation == null) {
            legalFormImpl.setAbbreviation(StringPool.BLANK);
        } else {
            legalFormImpl.setAbbreviation(abbreviation);
        }

        legalFormImpl.resetOriginalValues();

        return legalFormImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readInt();
        abbreviation = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(id);

        if (abbreviation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(abbreviation);
        }
    }
}
