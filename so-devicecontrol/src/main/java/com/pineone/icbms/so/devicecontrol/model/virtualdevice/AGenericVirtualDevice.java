package com.pineone.icbms.so.devicecontrol.model.virtualdevice;

import com.pineone.icbms.so.devicecontrol.model.virtualdevice.driver.IGenericDeviceDriver;
import com.pineone.icbms.so.virtualobject.common.AGenericIdNameOwner;

/**
 * generic virtual devicemapper abstract class.<BR/>
 *
 * Created by uni4love on 2017. 1. 11..
 */
abstract public class AGenericVirtualDevice extends AGenericIdNameOwner implements IGenericVirtualDevice {
    /**
     * driver for devicemapper
     */
    protected IGenericDeviceDriver deviceDriver;

    /**
     * device driver class name
     */
    protected String driverClassName;

    /**
     * constructor<BR/>
     *
     * @param id id
     * @param name name
     */
    public AGenericVirtualDevice(String id, String name) {
        super(id, name);
    }

    @Override
    public String getDriverClassName() {
        return this.driverClassName;
    }

    public IGenericDeviceDriver getDeviceDriver() {
        return deviceDriver;
    }

    public void setDeviceDriver(IGenericDeviceDriver deviceDriver) {
        this.deviceDriver = deviceDriver;
    }
}
