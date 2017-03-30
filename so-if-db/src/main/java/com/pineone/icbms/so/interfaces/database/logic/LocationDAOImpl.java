package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.LocationData;
import com.pineone.icbms.so.interfaces.database.logic.itf.LocationDAO;
import com.pineone.icbms.so.interfaces.database.logic.itf.LocationDAO;
import com.pineone.icbms.so.interfaces.database.model.LocationForDB;
import com.pineone.icbms.so.interfaces.database.model.LocationForDB;
import com.pineone.icbms.so.interfaces.database.repository.LocationRepository;
import com.pineone.icbms.so.interfaces.database.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 30..
 */
@Service
//NOTE : Location Data Access 기능 구현
public class LocationDAOImpl implements LocationDAO {

    @Autowired
    LocationRepository locationRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE: Location 단일 조회
    @Override
    public LocationForDB retrieveLocation(long id) {
        return locationRepository.findOne(id);
    }

    //NOTE: Location 전체 조회
    @Override
    public List<LocationForDB> retrieveLocationList() {
        return locationRepository.findAll();
    }

    //NOTE: Location 생성 기능
    @Override
    public String createLocation(LocationData LocationData) {
        return null;
    }

    //NOTE: Location 갱신 기능
    @Override
    public String updateLocation(long id, LocationData LocationData) {
        return null;
    }

    //NOTE : Location 삭제 기능
    @Override
    public String deleteLocation(long id) {
        LocationForDB LocationForDB = locationRepository.findOne(id);
        locationRepository.delete(id);
        String message = "Delete : " + LocationForDB;
        return message;
    }
}
