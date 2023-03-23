package com.isands.farmer.registry.service.messaging;

import com.isands.farmer.registry.service.ClpSerializer;
import com.isands.farmer.registry.service.FarmerLocalServiceUtil;
import com.isands.farmer.registry.service.FarmerServiceUtil;
import com.isands.farmer.registry.service.LegalFormLocalServiceUtil;
import com.isands.farmer.registry.service.LegalFormServiceUtil;
import com.isands.farmer.registry.service.RefLocalServiceUtil;
import com.isands.farmer.registry.service.RefServiceUtil;
import com.isands.farmer.registry.service.RegionLocalServiceUtil;
import com.isands.farmer.registry.service.RegionServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            FarmerLocalServiceUtil.clearService();

            FarmerServiceUtil.clearService();
            LegalFormLocalServiceUtil.clearService();

            LegalFormServiceUtil.clearService();
            RefLocalServiceUtil.clearService();

            RefServiceUtil.clearService();
            RegionLocalServiceUtil.clearService();

            RegionServiceUtil.clearService();
        }
    }
}
