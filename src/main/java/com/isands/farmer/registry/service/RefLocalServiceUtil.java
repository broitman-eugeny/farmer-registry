package com.isands.farmer.registry.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Ref. This utility wraps
 * {@link com.isands.farmer.registry.service.impl.RefLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RefLocalService
 * @see com.isands.farmer.registry.service.base.RefLocalServiceBaseImpl
 * @see com.isands.farmer.registry.service.impl.RefLocalServiceImpl
 * @generated
 */
public class RefLocalServiceUtil {
    private static RefLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.isands.farmer.registry.service.impl.RefLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the ref to the database. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref addRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRef(ref);
    }

    /**
    * Creates a new ref with the primary key. Does not add the ref to the database.
    *
    * @param refPK the primary key for the new ref
    * @return the new ref
    */
    public static com.isands.farmer.registry.model.Ref createRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK) {
        return getService().createRef(refPK);
    }

    /**
    * Deletes the ref with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param refPK the primary key of the ref
    * @return the ref that was removed
    * @throws PortalException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref deleteRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRef(refPK);
    }

    /**
    * Deletes the ref from the database. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref deleteRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRef(ref);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.isands.farmer.registry.model.Ref fetchRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRef(refPK);
    }

    /**
    * Returns the ref with the primary key.
    *
    * @param refPK the primary key of the ref
    * @return the ref
    * @throws PortalException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref getRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRef(refPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the refs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refs
    * @param end the upper bound of the range of refs (not inclusive)
    * @return the range of refs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> getRefs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRefs(start, end);
    }

    /**
    * Returns the number of refs.
    *
    * @return the number of refs
    * @throws SystemException if a system exception occurred
    */
    public static int getRefsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRefsCount();
    }

    /**
    * Updates the ref in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.isands.farmer.registry.model.Ref updateRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRef(ref);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns all the refs where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the matching refs
    */
    public static java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId) {
        return getService().findByfarmerId(farmerId);
    }

    /**
    * Returns all the regions where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the matching refs
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findRegionsByFarmerId(
        long farmerId) {
        return getService().findRegionsByFarmerId(farmerId);
    }

    /**
    * Returns a range of all the regions where farmerId = &#63;. If didn't find - empty list.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code>
    * and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to
    * the first result in the set. Setting both <code>start</code> and <code>end</code> to
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If
    * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
    * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code>
    * are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default
    * ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RefModelImpl}. If both
    * <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an
    * ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param farmerId the farmer ID
    * @param start    the lower bound of the range of refs
    * @param end      the upper bound of the range of refs (not inclusive)
    * @return the range of matching refs
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findRegionsByfarmerIdStartEnd(
        long farmerId, int start, int end) {
        return getService().findRegionsByfarmerIdStartEnd(farmerId, start, end);
    }

    /**
    * Returns the number of refs where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @return the number of matching refs
    */
    public static int countByfarmerId(long farmerId) {
        return getService().countByfarmerId(farmerId);
    }

    /**
    * Returns a range of the regions, that can be added to farmer's crop regions, excluding existing farmer's crop
    * regions, where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the range of matching refs
    */
    public static java.util.List<com.isands.farmer.registry.model.Region> findCropRegionsToAddByfarmerId(
        long farmerId) {
        return getService().findCropRegionsToAddByfarmerId(farmerId);
    }

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or null if it could not be found.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the matching ref
    */
    public static com.isands.farmer.registry.model.Ref findByfarmerIdAndRegionId(
        long farmerId, long regionId) {
        return getService().findByfarmerIdAndRegionId(farmerId, regionId);
    }

    public static void clearService() {
        _service = null;
    }

    public static RefLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RefLocalService.class.getName());

            if (invokableLocalService instanceof RefLocalService) {
                _service = (RefLocalService) invokableLocalService;
            } else {
                _service = new RefLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RefLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RefLocalService service) {
    }
}
