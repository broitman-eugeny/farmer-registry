package com.isands.farmer.registry.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RefService}.
 *
 * @author Brian Wing Shun Chan
 * @see RefService
 * @generated
 */
public class RefServiceWrapper implements RefService,
    ServiceWrapper<RefService> {
    private RefService _refService;

    public RefServiceWrapper(RefService refService) {
        _refService = refService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _refService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _refService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _refService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RefService getWrappedRefService() {
        return _refService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRefService(RefService refService) {
        _refService = refService;
    }

    @Override
    public RefService getWrappedService() {
        return _refService;
    }

    @Override
    public void setWrappedService(RefService refService) {
        _refService = refService;
    }
}
