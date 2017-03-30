package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.OrchestrationServiceData;
import com.pineone.icbms.so.interfaces.database.model.OrchestrationServiceForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface OrchestrationServiceDAO {
    //
    OrchestrationServiceForDB retrieveOrchestrationService(long id);
    List<OrchestrationServiceForDB> retrieveOrchestrationServiceList();
    String createOrchestrationService(OrchestrationServiceData orchestrationServiceData);
    String updateOrchestrationService(long id, OrchestrationServiceData orchestrationServiceData);
    String deleteOrchestrationService(long id);
}
