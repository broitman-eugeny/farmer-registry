package com.isands.farmer.registry.region.portlet;

import com.isands.farmer.registry.model.Region;
import com.isands.farmer.registry.service.RegionLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegionPortlet extends MVCPortlet {

    public void addRegion(ActionRequest request, ActionResponse response) {

        try {

            long regionId = ParamUtil.getLong(request, "id", 0L);
            String regionName = ParamUtil.getString(request, "name");
            String regionCode = ParamUtil.getString(request, "code", "");
            boolean regionArchive = ParamUtil.getBoolean(request, "archive");

            if (!regionName.isEmpty()) {

                Region region = RegionLocalServiceUtil.createRegion(regionId);
                region.setName(regionName);
                region.setCode(regionCode);
                region.setArchive(regionArchive);

                region.setNew(regionId == 0L);

                RegionLocalServiceUtil.updateRegion(region);
            }
        } catch (SystemException ex) {
            Logger.getLogger(RegionPortlet.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }
}
