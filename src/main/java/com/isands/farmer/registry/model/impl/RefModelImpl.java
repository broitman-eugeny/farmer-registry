package com.isands.farmer.registry.model.impl;

import com.isands.farmer.registry.model.Ref;
import com.isands.farmer.registry.model.RefModel;
import com.isands.farmer.registry.model.RefSoap;
import com.isands.farmer.registry.service.persistence.RefPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Ref service. Represents a row in the &quot;FarmerRegistry_Ref&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.isands.farmer.registry.model.RefModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RefImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RefImpl
 * @see com.isands.farmer.registry.model.Ref
 * @see com.isands.farmer.registry.model.RefModel
 * @generated
 */
@JSON(strict = true)
public class RefModelImpl extends BaseModelImpl<Ref> implements RefModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a ref model instance should use the {@link com.isands.farmer.registry.model.Ref} interface instead.
     */
    public static final String TABLE_NAME = "FarmerRegistry_Ref";
    public static final Object[][] TABLE_COLUMNS = {
            { "farmerId", Types.BIGINT },
            { "regionId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table FarmerRegistry_Ref (farmerId LONG not null,regionId LONG not null,primary key (farmerId, regionId))";
    public static final String TABLE_SQL_DROP = "drop table FarmerRegistry_Ref";
    public static final String ORDER_BY_JPQL = " ORDER BY ref.id.farmerId ASC, ref.id.regionId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY FarmerRegistry_Ref.farmerId ASC, FarmerRegistry_Ref.regionId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.isands.farmer.registry.model.Ref"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.isands.farmer.registry.model.Ref"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.isands.farmer.registry.model.Ref"),
            true);
    public static long FARMERID_COLUMN_BITMASK = 1L;
    public static long REGIONID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.isands.farmer.registry.model.Ref"));
    private static ClassLoader _classLoader = Ref.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Ref.class };
    private long _farmerId;
    private long _originalFarmerId;
    private boolean _setOriginalFarmerId;
    private long _regionId;
    private long _originalRegionId;
    private boolean _setOriginalRegionId;
    private long _columnBitmask;
    private Ref _escapedModel;

    public RefModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Ref toModel(RefSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Ref model = new RefImpl();

        model.setFarmerId(soapModel.getFarmerId());
        model.setRegionId(soapModel.getRegionId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Ref> toModels(RefSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Ref> models = new ArrayList<Ref>(soapModels.length);

        for (RefSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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

    @JSON
    @Override
    public long getFarmerId() {
        return _farmerId;
    }

    @Override
    public void setFarmerId(long farmerId) {
        _columnBitmask |= FARMERID_COLUMN_BITMASK;

        if (!_setOriginalFarmerId) {
            _setOriginalFarmerId = true;

            _originalFarmerId = _farmerId;
        }

        _farmerId = farmerId;
    }

    public long getOriginalFarmerId() {
        return _originalFarmerId;
    }

    @JSON
    @Override
    public long getRegionId() {
        return _regionId;
    }

    @Override
    public void setRegionId(long regionId) {
        _columnBitmask |= REGIONID_COLUMN_BITMASK;

        if (!_setOriginalRegionId) {
            _setOriginalRegionId = true;

            _originalRegionId = _regionId;
        }

        _regionId = regionId;
    }

    public long getOriginalRegionId() {
        return _originalRegionId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public Ref toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Ref) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        RefImpl refImpl = new RefImpl();

        refImpl.setFarmerId(getFarmerId());
        refImpl.setRegionId(getRegionId());

        refImpl.resetOriginalValues();

        return refImpl;
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

        if (!(obj instanceof Ref)) {
            return false;
        }

        Ref ref = (Ref) obj;

        RefPK primaryKey = ref.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
        RefModelImpl refModelImpl = this;

        refModelImpl._originalFarmerId = refModelImpl._farmerId;

        refModelImpl._setOriginalFarmerId = false;

        refModelImpl._originalRegionId = refModelImpl._regionId;

        refModelImpl._setOriginalRegionId = false;

        refModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Ref> toCacheModel() {
        RefCacheModel refCacheModel = new RefCacheModel();

        refCacheModel.farmerId = getFarmerId();

        refCacheModel.regionId = getRegionId();

        return refCacheModel;
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