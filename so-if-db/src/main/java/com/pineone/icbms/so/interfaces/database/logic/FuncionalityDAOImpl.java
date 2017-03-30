package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.FunctionalityData;
import com.pineone.icbms.so.interfaces.database.logic.itf.FunctionalityDAO;
import com.pineone.icbms.so.interfaces.database.model.FunctionalityForDB;
import com.pineone.icbms.so.interfaces.database.repository.FunctionalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 30..
 */
@Service
//NOTE : Functionality Data Access 기능 구현
public class FuncionalityDAOImpl implements FunctionalityDAO {

    @Autowired
    FunctionalityRepository functionalityRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE: Functionality 단일 조회
    @Override
    public FunctionalityForDB retrieveFunctionality(long id) {
        return functionalityRepository.findOne(id);
    }

    //NOTE: Functionality 전체 조회
    @Override
    public List<FunctionalityForDB> retrieveFunctionalityList() {
        return functionalityRepository.findAll();
    }

    //NOTE: Functionality 생성 기능
    @Override
    public String createFunctionality(FunctionalityData functionalityData) {
        return null;
    }

    //NOTE: Functionality 갱신 기능
    @Override
    public String updateFunctionality(long id, FunctionalityData functionalityData) {
        return null;
    }

    //NOTE : Functionality 삭제 기능
    @Override
    public String deleteFunctionality(long id) {
        FunctionalityForDB functionalityForDB = functionalityRepository.findOne(id);
        functionalityRepository.delete(id);
        String message = "Delete : " + functionalityForDB;
        return message;
    }
}
