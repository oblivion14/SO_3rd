package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.logic.itf.VirtualObjectDAO;
import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import com.pineone.icbms.so.interfaces.database.controller.inputdata.VirtualObjectData;
import com.pineone.icbms.so.interfaces.database.repository.VirtualObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 27..
 */

//NOTE: VirtualObject Data Access 로직 구현
@Service
public class VirtualObjectDAOImpl implements VirtualObjectDAO {

    @Autowired
    VirtualObjectRepository virtualObjectRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE : VO 단일 조회 기능 구현
    @Override
    public VirtualObjectForDB retrieveVirtualObject(long id){
        return virtualObjectRepository.findById(id);
    }

    //NOTE : VO List 조회 기능 구현
    @Override
    public List<VirtualObjectForDB> retrieveVirtualObjectList() {
        return  virtualObjectRepository.findAll();
    }

    //NOTE: VO 저장 기능 구현
    @Override
    public String createVirtualObject(VirtualObjectData virtualObjectData) {
        VirtualObjectForDB virtualObjectForDB = createVirtualObjectDataConversion(virtualObjectData);
        long id = entityManager.createNamedQuery("findRecentVirtualObject", VirtualObjectForDB.class)
                .getSingleResult().getId();
        virtualObjectForDB.setId(id+1);
        //     virtualObjectForDB.setId((int)virtualObjectRepository.count()+1);
        virtualObjectRepository.save(virtualObjectForDB);
        return "Create : " + virtualObjectForDB.toString();
    }

    //NOTE : VO 갱신 기능 구현
    @Override
    public String updateVirtualObject(long id, VirtualObjectData virtualObjectData) {
        if(virtualObjectRepository.findOne(id) != null){
            VirtualObjectForDB virtualObjectForDB = virtualObjectRepository.findById(id);
            virtualObjectForDB = updateVirtualObjectDataConversion(virtualObjectData);
            virtualObjectForDB.setId(id);
            virtualObjectForDB.setCreated_date(virtualObjectRepository.findOne(id).getCreated_date());
            virtualObjectRepository.save(virtualObjectForDB);
            return "Update : " + virtualObjectForDB.toString();
        }
        else{
            String createMessage = createVirtualObject(virtualObjectData);
            return createMessage;
        }
    }

    //NOTE: VO 삭제 기능 구현
    @Override
    public String deleteVirtualObject(long id) {
        VirtualObjectForDB virtualObjectForDB = virtualObjectRepository.findById(id);
        virtualObjectRepository.delete(id);
        String message = "Delete : " + virtualObjectForDB.toString();
        return message;
    }

    VirtualObjectForDB createVirtualObjectDataConversion(VirtualObjectData virtualObjectData){
        VirtualObjectForDB virtualObjectForDB = new VirtualObjectForDB(virtualObjectData.getName(), virtualObjectData.getFunctionality_id(),
                virtualObjectData.getAspect_id(), virtualObjectData.getDescription());
        return virtualObjectForDB;
    }

    VirtualObjectForDB updateVirtualObjectDataConversion(VirtualObjectData virtualObjectData){
        virtualObjectData.setModified_date(Calendar.getInstance().getTime());
        VirtualObjectForDB virtualObjectForDB = new VirtualObjectForDB(virtualObjectData.getName(), virtualObjectData.getFunctionality_id(),
                virtualObjectData.getAspect_id(), virtualObjectData.getDescription(), virtualObjectData.getModified_date());
        return virtualObjectForDB;
    }
}
