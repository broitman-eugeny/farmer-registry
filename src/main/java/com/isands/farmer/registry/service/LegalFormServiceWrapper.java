package com.isands.farmer.registry.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LegalFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see LegalFormService
 * @generated
 */
public class LegalFormServiceWrapper implements LegalFormService,
    ServiceWrapper<LegalFormService> {
    private LegalFormService _legalFormService;

    public LegalFormServiceWrapper(LegalFormService legalFormService) {
        _legalFormService = legalFormService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _legalFormService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _legalFormService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _legalFormService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LegalFormService getWrappedLegalFormService() {
        return _legalFormService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLegalFormService(LegalFormService legalFormService) {
        _legalFormService = legalFormService;
    }

    @Override
    public LegalFormService getWrappedService() {
        return _legalFormService;
    }

    @Override
    public void setWrappedService(LegalFormService legalFormService) {
        _legalFormService = legalFormService;
    }
}
