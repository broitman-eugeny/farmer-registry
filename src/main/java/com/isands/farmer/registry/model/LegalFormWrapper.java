package com.isands.farmer.registry.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LegalForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalForm
 * @generated
 */
public class LegalFormWrapper implements LegalForm, ModelWrapper<LegalForm> {
    private LegalForm _legalForm;

    public LegalFormWrapper(LegalForm legalForm) {
        _legalForm = legalForm;
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

    /**
    * Returns the primary key of this legal form.
    *
    * @return the primary key of this legal form
    */
    @Override
    public int getPrimaryKey() {
        return _legalForm.getPrimaryKey();
    }

    /**
    * Sets the primary key of this legal form.
    *
    * @param primaryKey the primary key of this legal form
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _legalForm.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this legal form.
    *
    * @return the ID of this legal form
    */
    @Override
    public int getId() {
        return _legalForm.getId();
    }

    /**
    * Sets the ID of this legal form.
    *
    * @param id the ID of this legal form
    */
    @Override
    public void setId(int id) {
        _legalForm.setId(id);
    }

    /**
    * Returns the abbreviation of this legal form.
    *
    * @return the abbreviation of this legal form
    */
    @Override
    public java.lang.String getAbbreviation() {
        return _legalForm.getAbbreviation();
    }

    /**
    * Sets the abbreviation of this legal form.
    *
    * @param abbreviation the abbreviation of this legal form
    */
    @Override
    public void setAbbreviation(java.lang.String abbreviation) {
        _legalForm.setAbbreviation(abbreviation);
    }

    @Override
    public boolean isNew() {
        return _legalForm.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _legalForm.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _legalForm.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _legalForm.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _legalForm.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _legalForm.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _legalForm.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _legalForm.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _legalForm.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _legalForm.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _legalForm.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LegalFormWrapper((LegalForm) _legalForm.clone());
    }

    @Override
    public int compareTo(com.isands.farmer.registry.model.LegalForm legalForm) {
        return _legalForm.compareTo(legalForm);
    }

    @Override
    public int hashCode() {
        return _legalForm.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.isands.farmer.registry.model.LegalForm> toCacheModel() {
        return _legalForm.toCacheModel();
    }

    @Override
    public com.isands.farmer.registry.model.LegalForm toEscapedModel() {
        return new LegalFormWrapper(_legalForm.toEscapedModel());
    }

    @Override
    public com.isands.farmer.registry.model.LegalForm toUnescapedModel() {
        return new LegalFormWrapper(_legalForm.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _legalForm.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _legalForm.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _legalForm.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LegalFormWrapper)) {
            return false;
        }

        LegalFormWrapper legalFormWrapper = (LegalFormWrapper) obj;

        if (Validator.equals(_legalForm, legalFormWrapper._legalForm)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public LegalForm getWrappedLegalForm() {
        return _legalForm;
    }

    @Override
    public LegalForm getWrappedModel() {
        return _legalForm;
    }

    @Override
    public void resetOriginalValues() {
        _legalForm.resetOriginalValues();
    }
}
