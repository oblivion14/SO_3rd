package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.FunctionalityData;
import com.pineone.icbms.so.interfaces.database.model.FunctionalityForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface FunctionalityDAO {
    //
    FunctionalityForDB retrieveFunctionality(long id);
    List<FunctionalityForDB> retrieveFunctionalityList();
    String createFunctionality(FunctionalityData functionalityData);
    String updateFunctionality(long id, FunctionalityData functionalityData);
    String deleteFunctionality(long id);
}
