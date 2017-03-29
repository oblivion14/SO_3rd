package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.ContextModelData;
import com.pineone.icbms.so.interfaces.database.logic.itf.ContextModelDAO;
import com.pineone.icbms.so.interfaces.database.model.ContextModelForDB;
import com.pineone.icbms.so.interfaces.database.repository.ContextModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */

//NOTE: CM Data Access 기능 구현
@Service
public class ContextModelDAOImpl implements ContextModelDAO {
    //
    @Autowired
    ContextModelRepository contextModelRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE: CM 단일 조회 기능
    @Override
    public ContextModelForDB retrieveContextModel(long id) {
        //
        return contextModelRepository.findOne(id);
    }

    //NOTE: CM 리스트 조회 기능
    @Override
    public List<ContextModelForDB> retrieveContextModelList() {
        //
        return contextModelRepository.findAll();
    }

    //NOTE: CM 생성 기능
    @Override
    public String createContextModel(ContextModelData contextModelData) {
        //
        return null;
    }

    //NOTE : CM 삭제 기능
    @Override
    public String updateContextModel(long id, ContextModelData contextModelData) {
        //
        return null;
    }

    //NOTE: CM 삭제 기능
    @Override
    public String deleteContextModel(long id) {
        //
        ContextModelForDB contextModelForDB = contextModelRepository.findOne(id);
        contextModelRepository.delete(id);
        String resultMessage = "Delete : " + contextModelForDB.toString();
        return resultMessage;
    }
}
