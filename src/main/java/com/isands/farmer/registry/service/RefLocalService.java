package com.isands.farmer.registry.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Ref. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see RefLocalServiceUtil
 * @see com.isands.farmer.registry.service.base.RefLocalServiceBaseImpl
 * @see com.isands.farmer.registry.service.impl.RefLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface RefLocalService extends BaseLocalService, InvokableLocalService,
    PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RefLocalServiceUtil} to access the ref local service. Add custom service methods to {@link com.isands.farmer.registry.service.impl.RefLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the ref to the database. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was added
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.isands.farmer.registry.model.Ref addRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new ref with the primary key. Does not add the ref to the database.
    *
    * @param refPK the primary key for the new ref
    * @return the new ref
    */
    public com.isands.farmer.registry.model.Ref createRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK);

    /**
    * Deletes the ref with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param refPK the primary key of the ref
    * @return the ref that was removed
    * @throws PortalException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.isands.farmer.registry.model.Ref deleteRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the ref from the database. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was removed
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.isands.farmer.registry.model.Ref deleteRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.isands.farmer.registry.model.Ref fetchRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the ref with the primary key.
    *
    * @param refPK the primary key of the ref
    * @return the ref
    * @throws PortalException if a ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.isands.farmer.registry.model.Ref getRef(
        com.isands.farmer.registry.service.persistence.RefPK refPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.isands.farmer.registry.model.Ref> getRefs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of refs.
    *
    * @return the number of refs
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getRefsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the ref in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ref the ref
    * @return the ref that was updated
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.isands.farmer.registry.model.Ref updateRef(
        com.isands.farmer.registry.model.Ref ref)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    /**
    * Returns all the refs where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the matching refs
    */
    public java.util.List<com.isands.farmer.registry.model.Ref> findByfarmerId(
        long farmerId);

    /**
    * Returns all the regions where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the matching refs
    */
    public java.util.List<com.isands.farmer.registry.model.Region> findRegionsByFarmerId(
        long farmerId);

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
    public java.util.List<com.isands.farmer.registry.model.Region> findRegionsByfarmerIdStartEnd(
        long farmerId, int start, int end);

    /**
    * Returns the number of refs where farmerId = &#63;.
    *
    * @param farmerId the farmer ID
    * @return the number of matching refs
    */
    public int countByfarmerId(long farmerId);

    /**
    * Returns a range of the regions, that can be added to farmer's crop regions, excluding existing farmer's crop
    * regions, where farmerId = &#63;. If didn't find - empty list.
    *
    * @param farmerId the farmer ID
    * @return the range of matching refs
    */
    public java.util.List<com.isands.farmer.registry.model.Region> findCropRegionsToAddByfarmerId(
        long farmerId);

    /**
    * Returns the ref where farmerId = &#63; and regionId = &#63; or null if it could not be found.
    *
    * @param farmerId the farmer ID
    * @param regionId the region ID
    * @return the matching ref
    */
    public com.isands.farmer.registry.model.Ref findByfarmerIdAndRegionId(
        long farmerId, long regionId);
}
