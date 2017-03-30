package com.pineone.icbms.so.processor.devicecontrol.messagequeue.handler;

import com.pineone.icbms.so.devicecontrol.model.virtualdevice.DeviceControlValue;
import com.pineone.icbms.so.devicecontrol.model.virtualdevice.IGenericVirtualDevice;
import com.pineone.icbms.so.devicecontrol.model.virtualdevice.driver.IGenericDeviceDriver;
import com.pineone.icbms.so.devicecontrol.util.DeviceDriverLoader;
import com.pineone.icbms.so.interfaces.sda.handle.SdaClient;
import com.pineone.icbms.so.processor.Settings;
import com.pineone.icbms.so.processor.devicecontrol.messagequeue.model.VirtualDeviceForMQ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * device control handler.<BR/>
 * <p>
 * Created by uni4love on 2017. 1. 20..
 */
public class DeviceControlHandler {
    /**
     * logger
     */
    protected Logger log = LoggerFactory.getLogger(getClass());

    /**
     * device control handle.<BR/>
     *
     * @param virtualDeviceForMQ
     */
    public void handle(VirtualDeviceForMQ virtualDeviceForMQ) {
        //get DeviceDriver from sda by virtual object features
        SdaClient sdaClient = new SdaClient();
        List<? extends IGenericVirtualDevice> deviceList = sdaClient.retreiveDeviceList(null, null);
        for (Object device : deviceList) {
            String driverClassName = ((IGenericVirtualDevice) device).getDriverClassName();
            //load devicemapper driver
            IGenericDeviceDriver deviceDriver = new DeviceDriverLoader().loadDeviceDriver(Settings.DEVICE_DRIVER_PATH, driverClassName);
            //retreive values from sda
            List<DeviceControlValue> values = sdaClient.retrieveDeviceControlValues(null, null, ((IGenericVirtualDevice) device).getId());
            //device control
            //thread process 고민 필요
            deviceDriver.control(values);
        }
    }
}
