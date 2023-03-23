package com.isands.farmer.registry.service.impl;

import com.isands.farmer.registry.NoSuchRefException;
import com.isands.farmer.registry.farmer.portlet.FarmerPortlet;
import com.isands.farmer.registry.model.Ref;
import com.isands.farmer.registry.model.Region;
import com.isands.farmer.registry.service.base.RefLocalServiceBaseImpl;
import com.isands.farmer.registry.service.persistence.RefUtil;
import com.isands.farmer.registry.service.persistence.RegionUtil;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The implementation of the ref local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy
 * their definitions into the {@link com.isands.farmer.registry.service.RefLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.isands.farmer.registry.service.base.RefLocalServiceBaseImpl
 * @see com.isands.farmer.registry.service.RefLocalServiceUtil
 */
public class RefLocalServiceImpl extends RefLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.isands.farmer.registry.service
     * .RefLocalServiceUtil} to access the ref local service.
     */

    /**
     * Returns all the refs where farmerId = &#63;. If didn't find - empty list.
     *
     * @param farmerId the farmer ID
     * @return the matching refs
     */
    public List<Ref> findByfarmerId(long farmerId) {

        List<Ref> res = new ArrayList<Ref>();

        try {
            res = RefUtil.findByfarmerId(farmerId);
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns all the regions where farmerId = &#63;. If didn't find - empty list.
     *
     * @param farmerId the farmer ID
     * @return the matching refs
     */
    public List<Region> findRegionsByFarmerId(long farmerId) {

        List<Region> res = new ArrayList<Region>();

        try {
            List<Ref> refs = RefUtil.findByfarmerId(farmerId);
            long[] regionIds = new long[refs.size()];

            for (int i = 0; i < refs.size(); ++i) {
                regionIds[i] = refs.get(i).getRegionId();
            }

            res = RegionUtil.findByIds(regionIds);
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
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
    public List<Region> findRegionsByfarmerIdStartEnd(long farmerId, int start, int end) {

        List<Region> res = new ArrayList<Region>();

        try {
            List<Ref> refs = RefUtil.findByfarmerId(farmerId, start, end);
            if(!refs.isEmpty()) {

                long[] regionIds = new long[refs.size()];

                for (int i = 0; i < refs.size(); ++i) {
                    regionIds[i] = refs.get(i).getRegionId();
                }

                res = RegionUtil.findByIds(regionIds);
            }
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns the number of refs where farmerId = &#63;.
     *
     * @param farmerId the farmer ID
     * @return the number of matching refs
     */
    public int countByfarmerId(long farmerId) {

        int res = 0;

        try {

            res = RefUtil.countByfarmerId(farmerId);
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        return res;
    }

    /**
     * Returns a range of the regions, that can be added to farmer's crop regions, excluding existing farmer's crop
     * regions, where farmerId = &#63;. If didn't find - empty list.
     *
     * @param farmerId the farmer ID
     * @return the range of matching refs
     */
    public List<Region> findCropRegionsToAddByfarmerId(long farmerId) {

        List<Region> res = new ArrayList<Region>();

        try {
            List<Ref> refs = RefUtil.findByfarmerId(farmerId);
            long[] regionIds = new long[refs.size()];

            for (int i = 0; i < refs.size(); ++i) {
                regionIds[i] = refs.get(i).getRegionId();
            }

            res = RegionUtil.findByNotInIdsAndArchive(regionIds, false);
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }

    /**
     * Returns the ref where farmerId = &#63; and regionId = &#63; or null if it could not be found.
     *
     * @param farmerId the farmer ID
     * @param regionId the region ID
     * @return the matching ref
     */
    public com.isands.farmer.registry.model.Ref findByfarmerIdAndRegionId(
            long farmerId, long regionId) {

        Ref res = null;

        try {
            res = RefUtil.findByfarmerIdAndRegionId(farmerId, regionId);
        } catch (NoSuchRefException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        } catch (SystemException ex) {
            Logger.getLogger(FarmerPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return res;
    }
}
