package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.TypeOfCompositeVirtualObjectData;
import com.pineone.icbms.so.interfaces.database.logic.itf.TypeOfCompositeVirtualObjectDAO;
import com.pineone.icbms.so.interfaces.database.model.TypeOfCompositeVirtualObjectForDB;
import com.pineone.icbms.so.interfaces.database.repository.TypeOfCompositeVirtualObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 30..
 */
@Service
//NOTE : TypeOfCompositeVirtualObjectRepository Data Access 기능 구현
public class TypeOfCompositeVirtualObjectDAOImpl implements TypeOfCompositeVirtualObjectDAO {

    @Autowired
    TypeOfCompositeVirtualObjectRepository TypeOfCompositeVirtualObjectRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE: TypeOfCompositeVirtualObjectRepository 단일 조회
    @Override
    public TypeOfCompositeVirtualObjectForDB retrieveTypeOfCompositeVirtualObject(long id) {
        return TypeOfCompositeVirtualObjectRepository.findOne(id);
    }

    //NOTE: TypeOfCompositeVirtualObjectRepository 전체 조회
    @Override
    public List<TypeOfCompositeVirtualObjectForDB> retrieveTypeOfCompositeVirtualObjectList() {
        return TypeOfCompositeVirtualObjectRepository.findAll();
    }

    //NOTE: TypeOfCompositeVirtualObjectRepository 생성 기능
    @Override
    public String createTypeOfCompositeVirtualObject(TypeOfCompositeVirtualObjectData TypeOfCompositeVirtualObjectData) {
        return null;
    }

    //NOTE: TypeOfCompositeVirtualObjectRepository 갱신 기능
    @Override
    public String updateTypeOfCompositeVirtualObject(long id, TypeOfCompositeVirtualObjectData TypeOfCompositeVirtualObjectData) {
        return null;
    }

    //NOTE : TypeOfCompositeVirtualObjectRepository 삭제 기능
    @Override
    public String deleteTypeOfCompositeVirtualObject(long id) {
        TypeOfCompositeVirtualObjectForDB TypeOfCompositeVirtualObjectForDB = TypeOfCompositeVirtualObjectRepository.findOne(id);
        TypeOfCompositeVirtualObjectRepository.delete(id);
        String message = "Delete : " + TypeOfCompositeVirtualObjectForDB;
        return message;
    }
}
