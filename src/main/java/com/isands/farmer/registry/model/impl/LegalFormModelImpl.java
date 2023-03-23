package com.isands.farmer.registry.model.impl;

import com.isands.farmer.registry.model.LegalForm;
import com.isands.farmer.registry.model.LegalFormModel;
import com.isands.farmer.registry.model.LegalFormSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the LegalForm service. Represents a row in the &quot;FarmerRegistry_LegalForm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.isands.farmer.registry.model.LegalFormModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegalFormImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalFormImpl
 * @see com.isands.farmer.registry.model.LegalForm
 * @see com.isands.farmer.registry.model.LegalFormModel
 * @generated
 */
@JSON(strict = true)
public class LegalFormModelImpl extends BaseModelImpl<LegalForm>
    implements LegalFormModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a legal form model instance should use the {@link com.isands.farmer.registry.model.LegalForm} interface instead.
     */
    public static final String TABLE_NAME = "FarmerRegistry_LegalForm";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.INTEGER },
            { "abbreviation", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table FarmerRegistry_LegalForm (id_ INTEGER not null primary key,abbreviation VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table FarmerRegistry_LegalForm";
    public static final String ORDER_BY_JPQL = " ORDER BY legalForm.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY FarmerRegistry_LegalForm.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.isands.farmer.registry.model.LegalForm"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.isands.farmer.registry.model.LegalForm"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.isands.farmer.registry.model.LegalForm"),
            true);
    public static long ABBREVIATION_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.isands.farmer.registry.model.LegalForm"));
    private static ClassLoader _classLoader = LegalForm.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LegalForm.class
        };
    private int _id;
    private int _originalId;
    private boolean _setOriginalId;
    private String _abbreviation;
    private String _originalAbbreviation;
    private long _columnBitmask;
    private LegalForm _escapedModel;

    public LegalFormModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static LegalForm toModel(LegalFormSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        LegalForm model = new LegalFormImpl();

        model.setId(soapModel.getId());
        model.setAbbreviation(soapModel.getAbbreviation());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<LegalForm> toModels(LegalFormSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<LegalForm> models = new ArrayList<LegalForm>(soapModels.length);

        for (LegalFormSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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

    @JSON
    @Override
    public int getId() {
        return _id;
    }

    @Override
    public void setId(int id) {
        _columnBitmask = -1L;

        if (!_setOriginalId) {
            _setOriginalId = true;

            _originalId = _id;
        }

        _id = id;
    }

    public int getOriginalId() {
        return _originalId;
    }

    @JSON
    @Override
    public String getAbbreviation() {
        if (_abbreviation == null) {
            return StringPool.BLANK;
        } else {
            return _abbreviation;
        }
    }

    @Override
    public void setAbbreviation(String abbreviation) {
        _columnBitmask |= ABBREVIATION_COLUMN_BITMASK;

        if (_originalAbbreviation == null) {
            _originalAbbreviation = _abbreviation;
        }

        _abbreviation = abbreviation;
    }

    public String getOriginalAbbreviation() {
        return GetterUtil.getString(_originalAbbreviation);
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public LegalForm toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LegalForm) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LegalFormImpl legalFormImpl = new LegalFormImpl();

        legalFormImpl.setId(getId());
        legalFormImpl.setAbbreviation(getAbbreviation());

        legalFormImpl.resetOriginalValues();

        return legalFormImpl;
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

        if (!(obj instanceof LegalForm)) {
            return false;
        }

        LegalForm legalForm = (LegalForm) obj;

        int primaryKey = legalForm.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LegalFormModelImpl legalFormModelImpl = this;

        legalFormModelImpl._originalId = legalFormModelImpl._id;

        legalFormModelImpl._setOriginalId = false;

        legalFormModelImpl._originalAbbreviation = legalFormModelImpl._abbreviation;

        legalFormModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LegalForm> toCacheModel() {
        LegalFormCacheModel legalFormCacheModel = new LegalFormCacheModel();

        legalFormCacheModel.id = getId();

        legalFormCacheModel.abbreviation = getAbbreviation();

        String abbreviation = legalFormCacheModel.abbreviation;

        if ((abbreviation != null) && (abbreviation.length() == 0)) {
            legalFormCacheModel.abbreviation = null;
        }

        return legalFormCacheModel;
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
