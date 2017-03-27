package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import com.pineone.icbms.so.interfaces.database.ref.VirtualObjectData;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 27..
 */
public interface VirtualObjectLogic {
    VirtualObjectForDB retrieveVirtualObject(int id);
    List<VirtualObjectForDB> retrieveVirtualObjectList();
    VirtualObjectForDB createVirtualObject(VirtualObjectData virtualObjectData);
    VirtualObjectForDB updateVirtualObject(int id, VirtualObjectData virtualObjectData);
    String deleteVirtualObject(int id);
}
