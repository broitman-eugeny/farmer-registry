package com.isands.farmer.registry.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.isands.farmer.registry.service.http.LegalFormServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.isands.farmer.registry.service.http.LegalFormServiceSoap
 * @generated
 */
public class LegalFormSoap implements Serializable {
    private int _id;
    private String _abbreviation;

    public LegalFormSoap() {
    }

    public static LegalFormSoap toSoapModel(LegalForm model) {
        LegalFormSoap soapModel = new LegalFormSoap();

        soapModel.setId(model.getId());
        soapModel.setAbbreviation(model.getAbbreviation());

        return soapModel;
    }

    public static LegalFormSoap[] toSoapModels(LegalForm[] models) {
        LegalFormSoap[] soapModels = new LegalFormSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LegalFormSoap[][] toSoapModels(LegalForm[][] models) {
        LegalFormSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LegalFormSoap[models.length][models[0].length];
        } else {
            soapModels = new LegalFormSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LegalFormSoap[] toSoapModels(List<LegalForm> models) {
        List<LegalFormSoap> soapModels = new ArrayList<LegalFormSoap>(models.size());

        for (LegalForm model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LegalFormSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(int pk) {
        setId(pk);
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getAbbreviation() {
        return _abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        _abbreviation = abbreviation;
    }
}
