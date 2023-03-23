package com.isands.farmer.registry.model.impl;

import com.isands.farmer.registry.model.Ref;
import com.isands.farmer.registry.service.RefLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Ref service. Represents a row in the &quot;FarmerRegistry_Ref&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RefImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RefImpl
 * @see com.isands.farmer.registry.model.Ref
 * @generated
 */
public abstract class RefBaseImpl extends RefModelImpl implements Ref {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a ref model instance should use the {@link Ref} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RefLocalServiceUtil.addRef(this);
        } else {
            RefLocalServiceUtil.updateRef(this);
        }
    }
}