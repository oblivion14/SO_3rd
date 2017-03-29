package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.FunctionalityData;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface FunctionalityDAO {
    //
    FunctionalityDAO retrieveFunctionality(long id);
    List<FunctionalityDAO> retrieveFunctionalityList();
    String createFunctionality(FunctionalityData functionalityData);
    String updateFunctionality(long id, FunctionalityData functionalityData);
    String deleteFunctionality(long id);
}
