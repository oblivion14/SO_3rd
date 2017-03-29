package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.DeviceControlCallbackData;
import com.pineone.icbms.so.interfaces.database.logic.itf.DeviceControlCallbackDAO;
import com.pineone.icbms.so.interfaces.database.model.ContextModelForDB;
import com.pineone.icbms.so.interfaces.database.model.DeviceControlCallbackForDB;
import com.pineone.icbms.so.interfaces.database.repository.DeviceControlCallbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */

//NOTE: 디바이스제어내용 Data Access 기능 구현
@Service
public class DeviceControlCallbackDAOImpl implements DeviceControlCallbackDAO{
    //
    @Autowired
    DeviceControlCallbackRepository deviceControlCallbackRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE : 디바이스 제어내용 단일 조회
    @Override
    public DeviceControlCallbackForDB retrieveDeviceControlCallback(long id) {
        //
        return deviceControlCallbackRepository.findOne(id);
    }

    //NOTE: 디바이스 제어내용 전체 조회
    @Override
    public List<DeviceControlCallbackForDB> retrieveDeviceControlCallbackList() {
        //
        return deviceControlCallbackRepository.findAll();
    }

    //NOTE: 디바이스 제어내용 생성
    @Override
    public String createDeviceControlCallback(DeviceControlCallbackData deviceControlCallbackData) {
        //
        return null;
    }

    //NOTE: 디바이스 제어내용 갱신
    @Override
    public String updateDeviceControlCallback(long id, DeviceControlCallbackData deviceControlCallbackData) {
        //
        return null;
    }

    //NOTE: 디바이스 제어내용 삭제
    @Override
    public String deleteDeviceControlCallback(long id) {
        //
        DeviceControlCallbackForDB deviceControlCallbackForDB = deviceControlCallbackRepository.findOne(id);
        deviceControlCallbackRepository.delete(id);
        String resultMessage = "Delete : " + deviceControlCallbackForDB.toString();
        return resultMessage;
    }
}
