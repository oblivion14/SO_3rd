package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.AspectData;
import com.pineone.icbms.so.interfaces.database.model.AspectForDB;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 28..
 */
public interface AspectDAO {
    //
    AspectForDB retrieveAspect(long id);
    List<AspectForDB> retrieveAspectList();
    String createAspect(AspectData aspectData);
    String updateAspect(long id, AspectData AspectData);
    String deleteAspect(long id);
}
