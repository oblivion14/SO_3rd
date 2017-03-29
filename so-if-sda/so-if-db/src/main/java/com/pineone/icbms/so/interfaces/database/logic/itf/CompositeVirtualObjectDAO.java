package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.CompositeVirtualObjectData;
import com.pineone.icbms.so.interfaces.database.model.CompositeVirtualObjectForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface CompositeVirtualObjectDAO {
    //
    CompositeVirtualObjectForDB retrieveCompositeVirtualObject(long id);
    List<CompositeVirtualObjectForDB> retrieveCompositeVirtualObjectList();
    String createCompositeVirtualObject(CompositeVirtualObjectData compositeVirtualObjectData);
    String updateCompositeVirtualObject(long id, CompositeVirtualObjectData compositeVirtualObjectData);
    String deleteCompositeVirtualObject(long id);
}
