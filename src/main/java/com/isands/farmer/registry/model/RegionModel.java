package com.isands.farmer.registry.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Region service. Represents a row in the &quot;FarmerRegistry_Region&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.isands.farmer.registry.model.impl.RegionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.isands.farmer.registry.model.impl.RegionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Region
 * @see com.isands.farmer.registry.model.impl.RegionImpl
 * @see com.isands.farmer.registry.model.impl.RegionModelImpl
 * @generated
 */
public interface RegionModel extends BaseModel<Region> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a region model instance should use the {@link Region} interface instead.
     */

    /**
     * Returns the primary key of this region.
     *
     * @return the primary key of this region
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this region.
     *
     * @param primaryKey the primary key of this region
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this region.
     *
     * @return the ID of this region
     */
    public long getId();

    /**
     * Sets the ID of this region.
     *
     * @param id the ID of this region
     */
    public void setId(long id);

    /**
     * Returns the name of this region.
     *
     * @return the name of this region
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this region.
     *
     * @param name the name of this region
     */
    public void setName(String name);

    /**
     * Returns the code of this region.
     *
     * @return the code of this region
     */
    @AutoEscape
    public String getCode();

    /**
     * Sets the code of this region.
     *
     * @param code the code of this region
     */
    public void setCode(String code);

    /**
     * Returns the archive of this region.
     *
     * @return the archive of this region
     */
    public boolean getArchive();

    /**
     * Returns <code>true</code> if this region is archive.
     *
     * @return <code>true</code> if this region is archive; <code>false</code> otherwise
     */
    public boolean isArchive();

    /**
     * Sets whether this region is archive.
     *
     * @param archive the archive of this region
     */
    public void setArchive(boolean archive);

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
    public int compareTo(com.isands.farmer.registry.model.Region region);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.isands.farmer.registry.model.Region> toCacheModel();

    @Override
    public com.isands.farmer.registry.model.Region toEscapedModel();

    @Override
    public com.isands.farmer.registry.model.Region toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}