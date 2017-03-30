package com.pineone.icbms.so.interfaces.database.logic;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.ProfileData;
import com.pineone.icbms.so.interfaces.database.logic.itf.ProfileDAO;
import com.pineone.icbms.so.interfaces.database.model.ProfileForDB;
import com.pineone.icbms.so.interfaces.database.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by melvin on 2017. 3. 30..
 */
@Service
//NOTE : Profile Data Access 기능 구현
public class ProfileDAOImpl implements ProfileDAO {

    @Autowired
    ProfileRepository profileRepository;

    @PersistenceContext
    EntityManager entityManager;

    //NOTE: Profile 단일 조회
    @Override
    public ProfileForDB retrieveProfile(long id) {
        return profileRepository.findOne(id);
    }

    //NOTE: Profile 전체 조회
    @Override
    public List<ProfileForDB> retrieveProfileList() {
        return profileRepository.findAll();
    }

    //NOTE: Profile 생성 기능
    @Override
    public String createProfile(ProfileData ProfileData) {
        return null;
    }

    //NOTE: Profile 갱신 기능
    @Override
    public String updateProfile(long id, ProfileData ProfileData) {
        return null;
    }

    //NOTE : Profile 삭제 기능
    @Override
    public String deleteProfile(long id) {
        ProfileForDB ProfileForDB = profileRepository.findOne(id);
        profileRepository.delete(id);
        String message = "Delete : " + ProfileForDB;
        return message;
    }
}
