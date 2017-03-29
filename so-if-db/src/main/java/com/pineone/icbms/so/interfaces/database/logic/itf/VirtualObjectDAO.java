package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import com.pineone.icbms.so.interfaces.database.controller.inputdata.VirtualObjectData;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 27..
 */
public interface VirtualObjectDAO {
    //
    VirtualObjectForDB retrieveVirtualObject(long id);
    List<VirtualObjectForDB> retrieveVirtualObjectList();
    String createVirtualObject(VirtualObjectData virtualObjectData);
    String updateVirtualObject(long id, VirtualObjectData virtualObjectData);
    String deleteVirtualObject(long id);
}
