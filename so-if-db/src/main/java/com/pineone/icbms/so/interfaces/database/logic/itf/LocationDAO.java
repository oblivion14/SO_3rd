package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.LocationData;
import com.pineone.icbms.so.interfaces.database.model.LocationForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface LocationDAO {
    //
    LocationForDB retrieveLocation(long id);
    List<LocationForDB> retrieveLocationList();
    String createLocation(LocationData locationData);
    String updateLocation(long id, LocationData AspectData);
    String deleteLocation(long id);
}
