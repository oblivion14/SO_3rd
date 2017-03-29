package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.ContextModelData;
import com.pineone.icbms.so.interfaces.database.model.ContextModelForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface ContextModelDAO {
    //
    ContextModelForDB retrieveContextModel(long id);
    List<ContextModelForDB> retrieveContextModelList();
    String createContextModel(ContextModelData contextModelData);
    String updateContextModel(long id, ContextModelData contextModelData);
    String deleteContextModel(long id);
}
