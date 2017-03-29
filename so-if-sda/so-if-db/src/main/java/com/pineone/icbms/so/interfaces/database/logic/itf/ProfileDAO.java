package com.pineone.icbms.so.interfaces.database.logic.itf;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.ProfileData;
import com.pineone.icbms.so.interfaces.database.model.ProfileForDB;


import java.util.List;

/**
 * Created by melvin on 2017. 3. 29..
 */
public interface ProfileDAO {
    //
    ProfileForDB retrieveProfile(long id);
    List<ProfileForDB> retrieveProfileList();
    String createProfile(ProfileData profileData);
    String updateProfile(long id, ProfileData profileData);
    String deleteProfile(long id);
}
