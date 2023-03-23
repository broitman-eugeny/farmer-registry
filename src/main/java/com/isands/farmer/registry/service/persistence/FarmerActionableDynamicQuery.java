package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Farmer;
import com.isands.farmer.registry.service.FarmerLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class FarmerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FarmerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FarmerLocalServiceUtil.getService());
        setClass(Farmer.class);

        setClassLoader(com.isands.farmer.registry.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
