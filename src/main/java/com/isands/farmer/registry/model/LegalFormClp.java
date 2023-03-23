package com.isands.farmer.registry.model;

import com.isands.farmer.registry.service.ClpSerializer;
import com.isands.farmer.registry.service.LegalFormLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class LegalFormClp extends BaseModelImpl<LegalForm> implements LegalForm {
    private int _id;
    private String _abbreviation;
    private BaseModel<?> _legalFormRemoteModel;
    private Class<?> _clpSerializerClass = com.isands.farmer.registry.service.ClpSerializer.class;

    public LegalFormClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return LegalForm.class;
    }

    @Override
    public String getModelClassName() {
        return LegalForm.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("abbreviation", getAbbreviation());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String abbreviation = (String) attributes.get("abbreviation");

        if (abbreviation != null) {
            setAbbreviation(abbreviation);
        }
    }

    @Override
    public int getId() {
        return _id;
    }

    @Override
    public void setId(int id) {
        _id = id;

        if (_legalFormRemoteModel != null) {
            try {
                Class<?> clazz = _legalFormRemoteModel.getClass();

                Method method = clazz.getMethod("setId", int.class);

                method.invoke(_legalFormRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAbbreviation() {
        return _abbreviation;
    }

    @Override
    public void setAbbreviation(String abbreviation) {
        _abbreviation = abbreviation;

        if (_legalFormRemoteModel != null) {
            try {
                Class<?> clazz = _legalFormRemoteModel.getClass();

                Method method = clazz.getMethod("setAbbreviation", String.class);

                method.invoke(_legalFormRemoteModel, abbreviation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLegalFormRemoteModel() {
        return _legalFormRemoteModel;
    }

    public void setLegalFormRemoteModel(BaseModel<?> legalFormRemoteModel) {
        _legalFormRemoteModel = legalFormRemoteModel;
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

        Class<?> remoteModelClass = _legalFormRemoteModel.getClass();

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

        Object returnValue = method.invoke(_legalFormRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LegalFormLocalServiceUtil.addLegalForm(this);
        } else {
            LegalFormLocalServiceUtil.updateLegalForm(this);
        }
    }

    @Override
    public LegalForm toEscapedModel() {
        return (LegalForm) ProxyUtil.newProxyInstance(LegalForm.class.getClassLoader(),
            new Class[] { LegalForm.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LegalFormClp clone = new LegalFormClp();

        clone.setId(getId());
        clone.setAbbreviation(getAbbreviation());

        return clone;
    }

    @Override
    public int compareTo(LegalForm legalForm) {
        int value = 0;

        if (getId() < legalForm.getId()) {
            value = -1;
        } else if (getId() > legalForm.getId()) {
            value = 1;
        } else {
            value = 0;
        }

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

        if (!(obj instanceof LegalFormClp)) {
            return false;
        }

        LegalFormClp legalForm = (LegalFormClp) obj;

        int primaryKey = legalForm.getPrimaryKey();

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
        return getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", abbreviation=");
        sb.append(getAbbreviation());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.isands.farmer.registry.model.LegalForm");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>abbreviation</column-name><column-value><![CDATA[");
        sb.append(getAbbreviation());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
