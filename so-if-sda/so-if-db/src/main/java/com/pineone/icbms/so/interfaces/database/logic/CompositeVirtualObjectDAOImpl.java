package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.CompositeVirtualObjectData;
import com.pineone.icbms.so.interfaces.database.logic.itf.CompositeVirtualObjectDAO;
import com.pineone.icbms.so.interfaces.database.model.CompositeVirtualObjectForDB;
import com.pineone.icbms.so.interfaces.database.repository.CompositeVirtualObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */

//NOTE: CVO Data Access 로직 구현
@Service
public class CompositeVirtualObjectDAOImpl implements CompositeVirtualObjectDAO {
    //
    @Autowired
    CompositeVirtualObjectRepository compositeVirtualObjectRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE : 단일 CVO 조회 기능
    @Override
    public CompositeVirtualObjectForDB retrieveCompositeVirtualObject(long id) {
        //
        return compositeVirtualObjectRepository.findOne(id);
    }

    //NOTE : CVO List 조회
    @Override
    public List<CompositeVirtualObjectForDB> retrieveCompositeVirtualObjectList() {
        //
        return compositeVirtualObjectRepository.findAll();
    }

    //NOTE : CVO 생성 기능
    @Override
    public String createCompositeVirtualObject(CompositeVirtualObjectData compositeVirtualObjectData) {
        return null;
    }

    //NOTE: CVO 갱신 기능
    @Override
    public String updateCompositeVirtualObject(long id, CompositeVirtualObjectData compositeVirtualObjectData) {
        return null;
    }

    //NOTE: CVO 삭제 기능
    @Override
    public String deleteCompositeVirtualObject(long id) {
        //
        CompositeVirtualObjectForDB compositeVirtualObjectForDB = compositeVirtualObjectRepository.findOne(id);
        compositeVirtualObjectRepository.delete(id);
        String message = "Delete : " + compositeVirtualObjectForDB.toString();
        return message;
    }
}
