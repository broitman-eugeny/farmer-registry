package com.isands.farmer.registry.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LegalForm service. Represents a row in the &quot;FarmerRegistry_LegalForm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.isands.farmer.registry.model.impl.LegalFormModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.isands.farmer.registry.model.impl.LegalFormImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalForm
 * @see com.isands.farmer.registry.model.impl.LegalFormImpl
 * @see com.isands.farmer.registry.model.impl.LegalFormModelImpl
 * @generated
 */
public interface LegalFormModel extends BaseModel<LegalForm> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a legal form model instance should use the {@link LegalForm} interface instead.
     */

    /**
     * Returns the primary key of this legal form.
     *
     * @return the primary key of this legal form
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this legal form.
     *
     * @param primaryKey the primary key of this legal form
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the ID of this legal form.
     *
     * @return the ID of this legal form
     */
    public int getId();

    /**
     * Sets the ID of this legal form.
     *
     * @param id the ID of this legal form
     */
    public void setId(int id);

    /**
     * Returns the abbreviation of this legal form.
     *
     * @return the abbreviation of this legal form
     */
    @AutoEscape
    public String getAbbreviation();

    /**
     * Sets the abbreviation of this legal form.
     *
     * @param abbreviation the abbreviation of this legal form
     */
    public void setAbbreviation(String abbreviation);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.isands.farmer.registry.model.LegalForm legalForm);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.isands.farmer.registry.model.LegalForm> toCacheModel();

    @Override
    public com.isands.farmer.registry.model.LegalForm toEscapedModel();

    @Override
    public com.isands.farmer.registry.model.LegalForm toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
