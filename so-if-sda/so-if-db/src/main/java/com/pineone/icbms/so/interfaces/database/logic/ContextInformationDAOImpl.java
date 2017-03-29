package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.ContextInformationData;
import com.pineone.icbms.so.interfaces.database.logic.itf.ContextInformationDAO;
import com.pineone.icbms.so.interfaces.database.model.ContextInformationForDB;
import com.pineone.icbms.so.interfaces.database.repository.ContextInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */

//NOTE: CI Data Access 로직 구현
@Service
public class ContextInformationDAOImpl implements ContextInformationDAO {

    @Autowired
    ContextInformationRepository contextInformationRepository;

    @PersistenceContext
    EntityManager entityManager;
    //
    //NOTE: 단일 CI 조회 기능
    @Override
    public ContextInformationForDB retrieveContextInformation(long id) {
        //
        return contextInformationRepository.findOne(id);
    }

    //NOTE: CI 리스트 조회 기능
    @Override
    public List<ContextInformationForDB> retrieveContextInformationList() {
        //
        return contextInformationRepository.findAll();
    }

    //NOTE: CI 생성 기능
    @Override
    public String createContextInformation(ContextInformationData contextInformationData) {
        //
        return null;
    }

    //NOTE : CI 갱신 기능
    @Override
    public String updateContextInformation(long id, ContextInformationData contextInformationData) {
        //
        return null;
    }

    //NOTE : CI 삭제 기능
    @Override
    public String deleteContextInformation(long id) {
        //
        ContextInformationForDB contextInformationForDB = contextInformationRepository.findOne(id);
        contextInformationRepository.delete(id);
        String message = "Delete : " + contextInformationForDB.toString();
        return message;
    }
}
