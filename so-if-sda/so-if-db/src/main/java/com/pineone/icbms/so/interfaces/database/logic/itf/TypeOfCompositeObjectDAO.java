package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.TypeOfCompositeVirtualObjectData;
import com.pineone.icbms.so.interfaces.database.model.TypeOfCompositeVirtualObjectForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface TypeOfCompositeObjectDAO {
    //
    TypeOfCompositeVirtualObjectForDB retrieveTypeOfCompositeVirtualObject(long id);
    List<TypeOfCompositeVirtualObjectForDB> retrieveTypeOfCompositeVirtualObjectList();
    String createTypeOfCompositeVirtualObjectForDB(TypeOfCompositeVirtualObjectData typeOfCompositeVirtualObjectData);
    String updateTypeOfCompositeVirtualObjectForDB(long id, TypeOfCompositeVirtualObjectData typeOfCompositeVirtualObjectData);
    String deleteTypeOfCompositeVirtualObjectForDB(long id);
}
