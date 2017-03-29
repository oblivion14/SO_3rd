package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.ScheduleContextData;
import com.pineone.icbms.so.interfaces.database.model.ScheduleContextForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface ScheduleContextDAO {
    //
    ScheduleContextForDB retrieveScheduleContext(long id);
    List<ScheduleContextForDB> retrieveScheduleContextList();
    String createScheduleContext(ScheduleContextData scheduleContextData);
    String updateScheduleContext(long id, ScheduleContextData scheduleContextData);
    String deleteScheduleContext(long id);
}
