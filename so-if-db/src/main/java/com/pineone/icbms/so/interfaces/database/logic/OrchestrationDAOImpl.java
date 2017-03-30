package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.OrchestrationServiceData;
import com.pineone.icbms.so.interfaces.database.logic.itf.OrchestrationServiceDAO;
import com.pineone.icbms.so.interfaces.database.model.OrchestrationServiceForDB;
import com.pineone.icbms.so.interfaces.database.repository.OrchestrationServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 30..
 */
@Service
//NOTE : OrchestrationService Data Access 기능 구현
public class OrchestrationDAOImpl implements OrchestrationServiceDAO {

    @Autowired
    OrchestrationServiceRepository orchestrationServiceRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE: OrchestrationService 단일 조회
    @Override
    public OrchestrationServiceForDB retrieveOrchestrationService(long id) {
        return orchestrationServiceRepository.findOne(id);
    }

    //NOTE: OrchestrationService 전체 조회
    @Override
    public List<OrchestrationServiceForDB> retrieveOrchestrationServiceList() {
        return orchestrationServiceRepository.findAll();
    }

    //NOTE: OrchestrationService 생성 기능
    @Override
    public String createOrchestrationService(OrchestrationServiceData OrchestrationServiceData) {
        return null;
    }

    //NOTE: OrchestrationService 갱신 기능
    @Override
    public String updateOrchestrationService(long id, OrchestrationServiceData OrchestrationServiceData) {
        return null;
    }

    //NOTE : OrchestrationService 삭제 기능
    @Override
    public String deleteOrchestrationService(long id) {
        OrchestrationServiceForDB OrchestrationServiceForDB = orchestrationServiceRepository.findOne(id);
        orchestrationServiceRepository.delete(id);
        String message = "Delete : " + OrchestrationServiceForDB;
        return message;
    }
}
