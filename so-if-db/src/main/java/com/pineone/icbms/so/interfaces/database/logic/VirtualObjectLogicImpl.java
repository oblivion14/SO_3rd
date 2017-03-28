package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import com.pineone.icbms.so.interfaces.database.ref.DataLossException;
import com.pineone.icbms.so.interfaces.database.ref.VirtualObjectData;
import com.pineone.icbms.so.interfaces.database.repository.VirtualObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 27..
 */

@Service
public class VirtualObjectLogicImpl implements VirtualObjectLogic {

    @Autowired
    VirtualObjectRepository virtualObjectRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE : VO 단일 조회 기능 구현
    @Override
    public VirtualObjectForDB retrieveVirtualObject(int id){
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
        int id = entityManager.createNamedQuery("findRecentVirtualObject", VirtualObjectForDB.class)
                .getSingleResult().getId();
        virtualObjectForDB.setId(id+1);
        //     virtualObjectForDB.setId((int)virtualObjectRepository.count()+1);
        virtualObjectRepository.save(virtualObjectForDB);
        return "Create : " + virtualObjectForDB.toString();
    }

    //NOTE : VO 갱신 기능 구현
    @Override
    public String updateVirtualObject(int id, VirtualObjectData virtualObjectData) {
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

    @Override
    public String deleteVirtualObject(int id) {
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
