package com.isands.farmer.registry.model;

import com.isands.farmer.registry.service.persistence.RefPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.isands.farmer.registry.service.http.RefServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.isands.farmer.registry.service.http.RefServiceSoap
 * @generated
 */
public class RefSoap implements Serializable {
    private long _farmerId;
    private long _regionId;

    public RefSoap() {
    }

    public static RefSoap toSoapModel(Ref model) {
        RefSoap soapModel = new RefSoap();

        soapModel.setFarmerId(model.getFarmerId());
        soapModel.setRegionId(model.getRegionId());

        return soapModel;
    }

    public static RefSoap[] toSoapModels(Ref[] models) {
        RefSoap[] soapModels = new RefSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RefSoap[][] toSoapModels(Ref[][] models) {
        RefSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RefSoap[models.length][models[0].length];
        } else {
            soapModels = new RefSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RefSoap[] toSoapModels(List<Ref> models) {
        List<RefSoap> soapModels = new ArrayList<RefSoap>(models.size());

        for (Ref model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RefSoap[soapModels.size()]);
    }

    public RefPK getPrimaryKey() {
        return new RefPK(_farmerId, _regionId);
    }

    public void setPrimaryKey(RefPK pk) {
        setFarmerId(pk.farmerId);
        setRegionId(pk.regionId);
    }

    public long getFarmerId() {
        return _farmerId;
    }

    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;
    }

    public long getRegionId() {
        return _regionId;
    }

    public void setRegionId(long regionId) {
        _regionId = regionId;
    }
}
