package com.isands.farmer.registry.service.impl;

import com.isands.farmer.registry.model.Region;
import com.isands.farmer.registry.region.portlet.RegionPortlet;
import com.isands.farmer.registry.service.RegionLocalServiceUtil;
import com.isands.farmer.registry.service.base.RegionLocalServiceBaseImpl;
import com.isands.farmer.registry.service.persistence.RegionUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The implementation of the region local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.isands.farmer.registry.service.RegionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.isands.farmer.registry.service.base.RegionLocalServiceBaseImpl
 * @see com.isands.farmer.registry.service.RegionLocalServiceUtil
 */
public class RegionLocalServiceImpl extends RegionLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.isands.farmer.registry.service
     * .RegionLocalServiceUtil} to access the region local service.
     */

    /**
     * Returns the number of regions where archive = &#63;. If exception occurs, returns 0.
     *
     * @param archive the archive
     * @return the number of matching regions
     */
    public int countByArchive(boolean archive) {

        int res = 0;

        try {
            res = RegionUtil.countByArchive(archive);
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns a range of all the regions where archive = &#63;. If exception occurs, returns empty list.
     *
     * @param archive the archive
     * @return the range of matching regions
     */
    public List<Region> findByArchive(boolean archive) {

        List<com.isands.farmer.registry.model.Region> res = new ArrayList<Region>();

        try {
            res = RegionUtil.findByArchive(archive);
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns a range of all the regions where archive = &#63;. If exception occurs, returns empty list.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code>
     * and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to
     * the first result in the set. Setting both <code>start</code> and <code>end</code> to
     * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code>
     * are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default
     * ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both
     * <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an
     * ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param archive the archive
     * @param start   the lower bound of the range of regions
     * @param end     the upper bound of the range of regions (not inclusive)
     * @return the range of matching regions
     */
    public List<Region> findByArchive(
            boolean archive, int start, int end) {

        List<com.isands.farmer.registry.model.Region> res = new ArrayList<Region>();

        try {
            res = RegionUtil.findByArchive(archive, start, end);
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns all the regions where id = any &#63;. If didn't find - empty list.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code>
     * and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to
     * the first result in the set. Setting both <code>start</code> and <code>end</code> to
     * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code>
     * are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default
     * ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both
     * <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an
     * ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param ids the IDs
     * @return the matching regions
     */
    public List<Region> findByIds(long[] ids) {

        List<Region> res = new ArrayList<Region>();

        try {
            res = RegionUtil.findByIds(ids);
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns all the regions where id &ne; all &#63; and archive = &#63;. If didn't find - empty list.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code>
     * and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to
     * the first result in the set. Setting both <code>start</code> and <code>end</code> to
     * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code>
     * are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default
     * ORDER BY logic from {@link com.isands.farmer.registry.model.impl.RegionModelImpl}. If both
     * <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an
     * ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param ids     the IDs
     * @param archive the archive
     * @return the matching regions
     */
    public List<Region> findByNotInIdsAndArchive(
            long[] ids, boolean archive) {

        List<Region> res = new ArrayList<Region>();

        try {
            res = RegionUtil.findByNotInIdsAndArchive(ids, archive);
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns region name where id = &#63;. If exception occurs, returns empty string.
     *
     * @param regionId the regionId
     * @return the region name
     */
    public String getRegionNameById(long regionId) {

        String res = "";

        try {

            Region region = RegionLocalServiceUtil.getRegion(regionId);

            if (region != null) {

                res = region.getName();
            }
        } catch (PortalException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns all regions;. If didn't find, returns empty list.
     *
     * @return region list
     */
    public List<Region> getAll() {

        List<Region> res = new ArrayList<Region>();

        try {

            res = RegionUtil.findAll();
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns region ids array where region name LIKE filterRegionName, or null if list is empty
     *
     * @param filterRegionName the region name mask (wildcards % allowed)
     * @return the region ids array
     */

    public long[] getRegionIdArrayFromRegionNameMask(String filterRegionName) {

        long[] res = null;

        try {

            List<Region> regions = regionPersistence.findByNameMask(filterRegionName);
            int size = regions.size();

            if (size > 0) {

                res = new long[size];

                for (int i = 0; i < size; ++i) {
                    res[i] = regions.get(i).getId();
                }
            }
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }
}
