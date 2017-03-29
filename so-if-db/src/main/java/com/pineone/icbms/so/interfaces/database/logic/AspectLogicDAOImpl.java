package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.AspectData;
import com.pineone.icbms.so.interfaces.database.logic.itf.AspectDAO;
import com.pineone.icbms.so.interfaces.database.model.AspectForDB;
import com.pineone.icbms.so.interfaces.database.repository.AspectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 28..
 */

//NOTE: Aspect Data Access 로직 구현
@Service
public class AspectLogicDAOImpl implements AspectDAO {

    @Autowired
    AspectRepository aspectRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE : aspect 단일 조회 기능 구현
    @Override
    public AspectForDB retrieveAspect(long id){
        return aspectRepository.findOne(id);
    }

    //NOTE : Aspect List 조회 기능 구현
    @Override
    public List<AspectForDB> retrieveAspectList() {
        return  aspectRepository.findAll();
    }

    //NOTE: Aspect 저장 기능 구현
    @Override
    public String createAspect(AspectData aspectData) {
        AspectForDB aspectForDB = createAspectDataConversion(aspectData);
        long id = entityManager.createNamedQuery("findRecentAspect", AspectForDB.class)
                .getSingleResult().getId();
        aspectForDB.setId(id+1);
        //     virtualObjectForDB.setId((int)virtualObjectRepository.count()+1);
        aspectRepository.save(aspectForDB);
        return "Create : " + aspectData.toString();
    }

    //NOTE : Aspect 갱신 기능 구현
    @Override
    public String updateAspect(long id, AspectData aspectData) {
        if(aspectRepository.findOne(id) != null){
            AspectForDB aspectForDB = aspectRepository.findOne(id);
            aspectForDB = updateAspectDataConversion(aspectData);
            aspectForDB.setId(id);
            aspectForDB.setCreated_date(aspectRepository.findOne(id).getCreated_date());
            aspectRepository.save(aspectForDB);
            return "Update : " + aspectData.toString();
        }
        else{
            String createMessage = createAspect(aspectData);
            return createMessage;
        }
    }

    //NOTE: Aspect 삭제 기능 구현
    @Override
    public String deleteAspect(long id) {
        AspectForDB aspectForDB = aspectRepository.findOne(id);
        aspectRepository.delete(id);
        String message = "Delete : " + aspectForDB.toString();
        return message;
    }

    private AspectForDB createAspectDataConversion(AspectData aspectData) {
        AspectForDB aspectForDB = new AspectForDB(aspectData.getName(), aspectData.getUri(), aspectData.getDescription());
        return aspectForDB;
    }

    private AspectForDB updateAspectDataConversion(AspectData aspectData) {
        aspectData.setModified_date(Calendar.getInstance().getTime());
        AspectForDB aspectForDB = new AspectForDB(aspectData.getName(), aspectData.getUri(),
                aspectData.getDescription(), aspectData.getModified_date());
        return aspectForDB;
    }
}
