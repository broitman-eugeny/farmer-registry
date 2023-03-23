package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.Region;
import com.isands.farmer.registry.service.RegionLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RegionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RegionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RegionLocalServiceUtil.getService());
        setClass(Region.class);

        setClassLoader(com.isands.farmer.registry.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
