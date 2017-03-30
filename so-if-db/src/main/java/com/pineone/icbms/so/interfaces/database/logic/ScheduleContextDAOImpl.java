package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.ScheduleContextData;
import com.pineone.icbms.so.interfaces.database.logic.itf.ScheduleContextDAO;
import com.pineone.icbms.so.interfaces.database.model.ScheduleContextForDB;
import com.pineone.icbms.so.interfaces.database.repository.ScheduleContextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 30..
 */
@Service
//NOTE : ScheduleContext Data Access 기능 구현
public class ScheduleContextDAOImpl implements ScheduleContextDAO {

    @Autowired
    ScheduleContextRepository scheduleContextRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE: ScheduleContext 단일 조회
    @Override
    public ScheduleContextForDB retrieveScheduleContext(long id) {
        return scheduleContextRepository.findOne(id);
    }

    //NOTE: ScheduleContext 전체 조회
    @Override
    public List<ScheduleContextForDB> retrieveScheduleContextList() {
        return scheduleContextRepository.findAll();
    }

    //NOTE: ScheduleContext 생성 기능
    @Override
    public String createScheduleContext(ScheduleContextData ScheduleContextData) {
        return null;
    }

    //NOTE: ScheduleContext 갱신 기능
    @Override
    public String updateScheduleContext(long id, ScheduleContextData ScheduleContextData) {
        return null;
    }

    //NOTE : ScheduleContext 삭제 기능
    @Override
    public String deleteScheduleContext(long id) {
        ScheduleContextForDB ScheduleContextForDB = scheduleContextRepository.findOne(id);
        scheduleContextRepository.delete(id);
        String message = "Delete : " + ScheduleContextForDB;
        return message;
    }
}
