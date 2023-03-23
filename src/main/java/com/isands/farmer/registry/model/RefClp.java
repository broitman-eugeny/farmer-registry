package com.isands.farmer.registry.model;

import com.isands.farmer.registry.service.ClpSerializer;
import com.isands.farmer.registry.service.RefLocalServiceUtil;
import com.isands.farmer.registry.service.persistence.RefPK;

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


public class RefClp extends BaseModelImpl<Ref> implements Ref {
    private long _farmerId;
    private long _regionId;
    private BaseModel<?> _refRemoteModel;
    private Class<?> _clpSerializerClass = com.isands.farmer.registry.service.ClpSerializer.class;

    public RefClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Ref.class;
    }

    @Override
    public String getModelClassName() {
        return Ref.class.getName();
    }

    @Override
    public RefPK getPrimaryKey() {
        return new RefPK(_farmerId, _regionId);
    }

    @Override
    public void setPrimaryKey(RefPK primaryKey) {
        setFarmerId(primaryKey.farmerId);
        setRegionId(primaryKey.regionId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new RefPK(_farmerId, _regionId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((RefPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("farmerId", getFarmerId());
        attributes.put("regionId", getRegionId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long farmerId = (Long) attributes.get("farmerId");

        if (farmerId != null) {
            setFarmerId(farmerId);
        }

        Long regionId = (Long) attributes.get("regionId");

        if (regionId != null) {
            setRegionId(regionId);
        }
    }

    @Override
    public long getFarmerId() {
        return _farmerId;
    }

    @Override
    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;

        if (_refRemoteModel != null) {
            try {
                Class<?> clazz = _refRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerId", long.class);

                method.invoke(_refRemoteModel, farmerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRegionId() {
        return _regionId;
    }

    @Override
    public void setRegionId(long regionId) {
        _regionId = regionId;

        if (_refRemoteModel != null) {
            try {
                Class<?> clazz = _refRemoteModel.getClass();

                Method method = clazz.getMethod("setRegionId", long.class);

                method.invoke(_refRemoteModel, regionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRefRemoteModel() {
        return _refRemoteModel;
    }

    public void setRefRemoteModel(BaseModel<?> refRemoteModel) {
        _refRemoteModel = refRemoteModel;
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

        Class<?> remoteModelClass = _refRemoteModel.getClass();

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

        Object returnValue = method.invoke(_refRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RefLocalServiceUtil.addRef(this);
        } else {
            RefLocalServiceUtil.updateRef(this);
        }
    }

    @Override
    public Ref toEscapedModel() {
        return (Ref) ProxyUtil.newProxyInstance(Ref.class.getClassLoader(),
            new Class[] { Ref.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RefClp clone = new RefClp();

        clone.setFarmerId(getFarmerId());
        clone.setRegionId(getRegionId());

        return clone;
    }

    @Override
    public int compareTo(Ref ref) {
        RefPK primaryKey = ref.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RefClp)) {
            return false;
        }

        RefClp ref = (RefClp) obj;

        RefPK primaryKey = ref.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{farmerId=");
        sb.append(getFarmerId());
        sb.append(", regionId=");
        sb.append(getRegionId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.isands.farmer.registry.model.Ref");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>farmerId</column-name><column-value><![CDATA[");
        sb.append(getFarmerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>regionId</column-name><column-value><![CDATA[");
        sb.append(getRegionId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
