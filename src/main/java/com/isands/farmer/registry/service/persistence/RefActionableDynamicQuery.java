package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Ref;
import com.isands.farmer.registry.service.RefLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RefActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RefActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RefLocalServiceUtil.getService());
        setClass(Ref.class);

        setClassLoader(com.isands.farmer.registry.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.farmerId");
    }
}
