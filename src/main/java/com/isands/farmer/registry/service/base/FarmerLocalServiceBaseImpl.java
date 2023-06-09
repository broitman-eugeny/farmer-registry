package com.isands.farmer.registry.service.base;

import com.isands.farmer.registry.model.Farmer;
import com.isands.farmer.registry.service.FarmerLocalService;
import com.isands.farmer.registry.service.persistence.FarmerPersistence;
import com.isands.farmer.registry.service.persistence.LegalFormPersistence;
import com.isands.farmer.registry.service.persistence.RefPersistence;
import com.isands.farmer.registry.service.persistence.RegionPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the farmer local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.isands.farmer.registry.service.impl.FarmerLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.isands.farmer.registry.service.impl.FarmerLocalServiceImpl
 * @see com.isands.farmer.registry.service.FarmerLocalServiceUtil
 * @generated
 */
public abstract class FarmerLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements FarmerLocalService, IdentifiableBean {
    @BeanReference(type = com.isands.farmer.registry.service.FarmerLocalService.class)
    protected com.isands.farmer.registry.service.FarmerLocalService farmerLocalService;
    @BeanReference(type = com.isands.farmer.registry.service.FarmerService.class)
    protected com.isands.farmer.registry.service.FarmerService farmerService;
    @BeanReference(type = FarmerPersistence.class)
    protected FarmerPersistence farmerPersistence;
    @BeanReference(type = com.isands.farmer.registry.service.LegalFormLocalService.class)
    protected com.isands.farmer.registry.service.LegalFormLocalService legalFormLocalService;
    @BeanReference(type = com.isands.farmer.registry.service.LegalFormService.class)
    protected com.isands.farmer.registry.service.LegalFormService legalFormService;
    @BeanReference(type = LegalFormPersistence.class)
    protected LegalFormPersistence legalFormPersistence;
    @BeanReference(type = com.isands.farmer.registry.service.RefLocalService.class)
    protected com.isands.farmer.registry.service.RefLocalService refLocalService;
    @BeanReference(type = com.isands.farmer.registry.service.RefService.class)
    protected com.isands.farmer.registry.service.RefService refService;
    @BeanReference(type = RefPersistence.class)
    protected RefPersistence refPersistence;
    @BeanReference(type = com.isands.farmer.registry.service.RegionLocalService.class)
    protected com.isands.farmer.registry.service.RegionLocalService regionLocalService;
    @BeanReference(type = com.isands.farmer.registry.service.RegionService.class)
    protected com.isands.farmer.registry.service.RegionService regionService;
    @BeanReference(type = RegionPersistence.class)
    protected RegionPersistence regionPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private FarmerLocalServiceClpInvoker _clpInvoker = new FarmerLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.isands.farmer.registry.service.FarmerLocalServiceUtil} to access the farmer local service.
     */

    /**
     * Adds the farmer to the database. Also notifies the appropriate model listeners.
     *
     * @param farmer the farmer
     * @return the farmer that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Farmer addFarmer(Farmer farmer) throws SystemException {
        farmer.setNew(true);

        return farmerPersistence.update(farmer);
    }

    /**
     * Creates a new farmer with the primary key. Does not add the farmer to the database.
     *
     * @param id the primary key for the new farmer
     * @return the new farmer
     */
    @Override
    public Farmer createFarmer(long id) {
        return farmerPersistence.create(id);
    }

    /**
     * Deletes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the farmer
     * @return the farmer that was removed
     * @throws PortalException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Farmer deleteFarmer(long id) throws PortalException, SystemException {
        return farmerPersistence.remove(id);
    }

    /**
     * Deletes the farmer from the database. Also notifies the appropriate model listeners.
     *
     * @param farmer the farmer
     * @return the farmer that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Farmer deleteFarmer(Farmer farmer) throws SystemException {
        return farmerPersistence.remove(farmer);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Farmer.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return farmerPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return farmerPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return farmerPersistence.findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return farmerPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return farmerPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Farmer fetchFarmer(long id) throws SystemException {
        return farmerPersistence.fetchByPrimaryKey(id);
    }

    /**
     * Returns the farmer with the primary key.
     *
     * @param id the primary key of the farmer
     * @return the farmer
     * @throws PortalException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer getFarmer(long id) throws PortalException, SystemException {
        return farmerPersistence.findByPrimaryKey(id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return farmerPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the farmers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.isands.farmer.registry.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> getFarmers(int start, int end)
        throws SystemException {
        return farmerPersistence.findAll(start, end);
    }

    /**
     * Returns the number of farmers.
     *
     * @return the number of farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getFarmersCount() throws SystemException {
        return farmerPersistence.countAll();
    }

    /**
     * Updates the farmer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param farmer the farmer
     * @return the farmer that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Farmer updateFarmer(Farmer farmer) throws SystemException {
        return farmerPersistence.update(farmer);
    }

    /**
     * Returns the farmer local service.
     *
     * @return the farmer local service
     */
    public com.isands.farmer.registry.service.FarmerLocalService getFarmerLocalService() {
        return farmerLocalService;
    }

    /**
     * Sets the farmer local service.
     *
     * @param farmerLocalService the farmer local service
     */
    public void setFarmerLocalService(
        com.isands.farmer.registry.service.FarmerLocalService farmerLocalService) {
        this.farmerLocalService = farmerLocalService;
    }

    /**
     * Returns the farmer remote service.
     *
     * @return the farmer remote service
     */
    public com.isands.farmer.registry.service.FarmerService getFarmerService() {
        return farmerService;
    }

    /**
     * Sets the farmer remote service.
     *
     * @param farmerService the farmer remote service
     */
    public void setFarmerService(
        com.isands.farmer.registry.service.FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    /**
     * Returns the farmer persistence.
     *
     * @return the farmer persistence
     */
    public FarmerPersistence getFarmerPersistence() {
        return farmerPersistence;
    }

    /**
     * Sets the farmer persistence.
     *
     * @param farmerPersistence the farmer persistence
     */
    public void setFarmerPersistence(FarmerPersistence farmerPersistence) {
        this.farmerPersistence = farmerPersistence;
    }

    /**
     * Returns the legal form local service.
     *
     * @return the legal form local service
     */
    public com.isands.farmer.registry.service.LegalFormLocalService getLegalFormLocalService() {
        return legalFormLocalService;
    }

    /**
     * Sets the legal form local service.
     *
     * @param legalFormLocalService the legal form local service
     */
    public void setLegalFormLocalService(
        com.isands.farmer.registry.service.LegalFormLocalService legalFormLocalService) {
        this.legalFormLocalService = legalFormLocalService;
    }

    /**
     * Returns the legal form remote service.
     *
     * @return the legal form remote service
     */
    public com.isands.farmer.registry.service.LegalFormService getLegalFormService() {
        return legalFormService;
    }

    /**
     * Sets the legal form remote service.
     *
     * @param legalFormService the legal form remote service
     */
    public void setLegalFormService(
        com.isands.farmer.registry.service.LegalFormService legalFormService) {
        this.legalFormService = legalFormService;
    }

    /**
     * Returns the legal form persistence.
     *
     * @return the legal form persistence
     */
    public LegalFormPersistence getLegalFormPersistence() {
        return legalFormPersistence;
    }

    /**
     * Sets the legal form persistence.
     *
     * @param legalFormPersistence the legal form persistence
     */
    public void setLegalFormPersistence(
        LegalFormPersistence legalFormPersistence) {
        this.legalFormPersistence = legalFormPersistence;
    }

    /**
     * Returns the ref local service.
     *
     * @return the ref local service
     */
    public com.isands.farmer.registry.service.RefLocalService getRefLocalService() {
        return refLocalService;
    }

    /**
     * Sets the ref local service.
     *
     * @param refLocalService the ref local service
     */
    public void setRefLocalService(
        com.isands.farmer.registry.service.RefLocalService refLocalService) {
        this.refLocalService = refLocalService;
    }

    /**
     * Returns the ref remote service.
     *
     * @return the ref remote service
     */
    public com.isands.farmer.registry.service.RefService getRefService() {
        return refService;
    }

    /**
     * Sets the ref remote service.
     *
     * @param refService the ref remote service
     */
    public void setRefService(
        com.isands.farmer.registry.service.RefService refService) {
        this.refService = refService;
    }

    /**
     * Returns the ref persistence.
     *
     * @return the ref persistence
     */
    public RefPersistence getRefPersistence() {
        return refPersistence;
    }

    /**
     * Sets the ref persistence.
     *
     * @param refPersistence the ref persistence
     */
    public void setRefPersistence(RefPersistence refPersistence) {
        this.refPersistence = refPersistence;
    }

    /**
     * Returns the region local service.
     *
     * @return the region local service
     */
    public com.isands.farmer.registry.service.RegionLocalService getRegionLocalService() {
        return regionLocalService;
    }

    /**
     * Sets the region local service.
     *
     * @param regionLocalService the region local service
     */
    public void setRegionLocalService(
        com.isands.farmer.registry.service.RegionLocalService regionLocalService) {
        this.regionLocalService = regionLocalService;
    }

    /**
     * Returns the region remote service.
     *
     * @return the region remote service
     */
    public com.isands.farmer.registry.service.RegionService getRegionService() {
        return regionService;
    }

    /**
     * Sets the region remote service.
     *
     * @param regionService the region remote service
     */
    public void setRegionService(
        com.isands.farmer.registry.service.RegionService regionService) {
        this.regionService = regionService;
    }

    /**
     * Returns the region persistence.
     *
     * @return the region persistence
     */
    public RegionPersistence getRegionPersistence() {
        return regionPersistence;
    }

    /**
     * Sets the region persistence.
     *
     * @param regionPersistence the region persistence
     */
    public void setRegionPersistence(RegionPersistence regionPersistence) {
        this.regionPersistence = regionPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.isands.farmer.registry.model.Farmer",
            farmerLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.isands.farmer.registry.model.Farmer");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Farmer.class;
    }

    protected String getModelClassName() {
        return Farmer.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = farmerPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
