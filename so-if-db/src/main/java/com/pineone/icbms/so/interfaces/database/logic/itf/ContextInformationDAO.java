package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.ContextInformationData;
import com.pineone.icbms.so.interfaces.database.model.ContextInformationForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface ContextInformationDAO {
    //
    ContextInformationForDB retrieveContextInformation(long id);
    List<ContextInformationForDB> retrieveContextInformationList();
    String createContextInformation(ContextInformationData contextInformationData);
    String updateContextInformation(long id, ContextInformationData contextInformationData);
    String deleteContextInformation(long id);
}
