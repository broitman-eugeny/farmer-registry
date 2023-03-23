package com.isands.farmer.registry.service.persistence;

import com.isands.farmer.registry.model.LegalForm;
import com.isands.farmer.registry.service.LegalFormLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LegalFormActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LegalFormActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LegalFormLocalServiceUtil.getService());
        setClass(LegalForm.class);

        setClassLoader(com.isands.farmer.registry.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
