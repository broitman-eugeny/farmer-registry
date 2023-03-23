package com.isands.farmer.registry.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Ref}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Ref
 * @generated
 */
public class RefWrapper implements Ref, ModelWrapper<Ref> {
    private Ref _ref;

    public RefWrapper(Ref ref) {
        _ref = ref;
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

    /**
    * Returns the primary key of this ref.
    *
    * @return the primary key of this ref
    */
    @Override
    public com.isands.farmer.registry.service.persistence.RefPK getPrimaryKey() {
        return _ref.getPrimaryKey();
    }

    /**
    * Sets the primary key of this ref.
    *
    * @param primaryKey the primary key of this ref
    */
    @Override
    public void setPrimaryKey(
        com.isands.farmer.registry.service.persistence.RefPK primaryKey) {
        _ref.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the farmer ID of this ref.
    *
    * @return the farmer ID of this ref
    */
    @Override
    public long getFarmerId() {
        return _ref.getFarmerId();
    }

    /**
    * Sets the farmer ID of this ref.
    *
    * @param farmerId the farmer ID of this ref
    */
    @Override
    public void setFarmerId(long farmerId) {
        _ref.setFarmerId(farmerId);
    }

    /**
    * Returns the region ID of this ref.
    *
    * @return the region ID of this ref
    */
    @Override
    public long getRegionId() {
        return _ref.getRegionId();
    }

    /**
    * Sets the region ID of this ref.
    *
    * @param regionId the region ID of this ref
    */
    @Override
    public void setRegionId(long regionId) {
        _ref.setRegionId(regionId);
    }

    @Override
    public boolean isNew() {
        return _ref.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _ref.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _ref.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _ref.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _ref.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _ref.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _ref.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _ref.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _ref.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _ref.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _ref.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RefWrapper((Ref) _ref.clone());
    }

    @Override
    public int compareTo(com.isands.farmer.registry.model.Ref ref) {
        return _ref.compareTo(ref);
    }

    @Override
    public int hashCode() {
        return _ref.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.isands.farmer.registry.model.Ref> toCacheModel() {
        return _ref.toCacheModel();
    }

    @Override
    public com.isands.farmer.registry.model.Ref toEscapedModel() {
        return new RefWrapper(_ref.toEscapedModel());
    }

    @Override
    public com.isands.farmer.registry.model.Ref toUnescapedModel() {
        return new RefWrapper(_ref.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _ref.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _ref.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _ref.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RefWrapper)) {
            return false;
        }

        RefWrapper refWrapper = (RefWrapper) obj;

        if (Validator.equals(_ref, refWrapper._ref)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Ref getWrappedRef() {
        return _ref;
    }

    @Override
    public Ref getWrappedModel() {
        return _ref;
    }

    @Override
    public void resetOriginalValues() {
        _ref.resetOriginalValues();
    }
}
