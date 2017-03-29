package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.FixedDeviceData;
import com.pineone.icbms.so.interfaces.database.logic.itf.FixedDeviceDAO;
import com.pineone.icbms.so.interfaces.database.model.FixedDeviceForDB;
import com.pineone.icbms.so.interfaces.database.repository.FixedDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */

//NOTE : 지정 디바이스 Data Access 기능 구현
@Service
public class FixedDeviceDAOImpl implements FixedDeviceDAO {
    //
    @Autowired
    FixedDeviceRepository fixedDeviceRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE: 지정 디바이스 단일 조회 기능
    @Override
    public FixedDeviceForDB retrieveFixedDevice(long id) {
        //
        return fixedDeviceRepository.findOne(id);
    }

    //NOTE: 지정 디바이스 전체 조회
    @Override
    public List<FixedDeviceForDB> retrieveFixedDeviceList() {
        //
        return fixedDeviceRepository.findAll();
    }

    //NOTE : 지정 디바이스 데이터 생성
    @Override
    public String createFixedDevice(FixedDeviceData fixedDeviceData) {
        //
        return null;
    }

    //NOTE : 지정 디바이스 데이터 갱신
    @Override
    public String updateFixedDevice(long id, FixedDeviceData fixedDeviceData) {
        //
        return null;
    }

    //NOTE: 지정 디바이스 데이터 삭제
    @Override
    public String deleteFixedDevice(long id) {
        //
        FixedDeviceForDB fixedDeviceForDB = fixedDeviceRepository.findOne(id);
        fixedDeviceRepository.delete(id);
        String message = "Delete : " + fixedDeviceForDB.toString();
        return message;
    }
}
