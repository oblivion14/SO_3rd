package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import com.pineone.icbms.so.interfaces.database.ref.DataLossException;
import com.pineone.icbms.so.interfaces.database.ref.VirtualObjectData;
import com.pineone.icbms.so.interfaces.database.repository.VirtualObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 27..
 */

@Service
public class VirtualObjectLogicImpl implements VirtualObjectLogic {

    @Autowired
    VirtualObjectRepository virtualObjectRepository;

    //NOTE : VO 단일 조회 기능 구현
    @Override
    public VirtualObjectForDB retrieveVirtualObject(int id){
        return virtualObjectRepository.findOne(id);
    }

    //NOTE : VO List 조회 기능 구현
    @Override
    public List<VirtualObjectForDB> retrieveVirtualObjectList() {
        return  virtualObjectRepository.findAll();
    }

    //NOTE: VO 저장 기능 구현
    @Override
    public VirtualObjectForDB createVirtualObject(VirtualObjectData virtualObjectData) {
        VirtualObjectForDB virtualObjectForDB = createVirtualObjectDataConversion(virtualObjectData);
        virtualObjectForDB.setId((int)virtualObjectRepository.count()+1);
        virtualObjectRepository.save(virtualObjectForDB);
        return virtualObjectForDB;
    }

    //NOTE : VO 갱신 기능 구현
    @Override
    public VirtualObjectForDB updateVirtualObject(int id, VirtualObjectData virtualObjectData) {
        if(virtualObjectRepository.findOne(id) != null){
            VirtualObjectForDB virtualObjectForDB = virtualObjectRepository.findOne(id);
            virtualObjectForDB = updateVirtualObjectDataConversion(virtualObjectData);
            virtualObjectForDB.setId(id);
            virtualObjectRepository.save(virtualObjectForDB);
            return virtualObjectForDB;
        }
        else{
            VirtualObjectForDB virtualObjectForDB = createVirtualObject(virtualObjectData);
            return virtualObjectForDB;
        }
    }

    @Override
    public String deleteVirtualObject(int id) {
        VirtualObjectForDB virtualObjectForDB = virtualObjectRepository.findOne(id);
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
        virtualObjectData.setModified_date(new Date());
        VirtualObjectForDB virtualObjectForDB = new VirtualObjectForDB(virtualObjectData.getName(), virtualObjectData.getFunctionality_id(),
                virtualObjectData.getAspect_id(), virtualObjectData.getDescription(), virtualObjectData.getModified_date());
        return virtualObjectForDB;
    }
}
