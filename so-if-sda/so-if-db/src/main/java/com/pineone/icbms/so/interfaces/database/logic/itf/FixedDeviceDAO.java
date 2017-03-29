package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.FixedDeviceData;
import com.pineone.icbms.so.interfaces.database.model.AspectForDB;
import com.pineone.icbms.so.interfaces.database.model.FixedDeviceForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface FixedDeviceDAO {
    //
    FixedDeviceForDB retrieveFixedDevice(long id);
    List<FixedDeviceForDB> retrieveFixedDeviceList();
    String createFixedDevice(FixedDeviceData fixedDeviceData);
    String updateFixedDevice(long id, FixedDeviceData fixedDeviceData);
    String deleteFixedDevice(long id);
}
