package com.opnitech.release.services.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.opnitech.release.services.service.ClpSerializer;
import com.opnitech.release.services.service.Foo1LocalServiceUtil;
import com.opnitech.release.services.service.Foo1ServiceUtil;


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
            Foo1LocalServiceUtil.clearService();

            Foo1ServiceUtil.clearService();
        }
    }
}
