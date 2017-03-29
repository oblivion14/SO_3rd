package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;

/**
 * fixed_device model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 16..
 */
@Entity
@Table(name="fixed_device")
public class FixedDeviceForDB extends CommonEntity {

    @Id
    @Column(name = "fixed_device_id")
    private int id;

//    @Column(name = "name")
//    private String name;

    //NOTE: Join 필요
    @Column(name = "profile_id")
    private int profile_id;

    @Column(name = "device_uri")
    String device_uri;

    //NOTE : Join 필요
    @Column(name = "virtual_object_id")
    private int virtual_object_id;

//    @Column(name= "description")
//    String description;

//    @Temporal(TemporalType.DATE)
//    Date create_date;

//    @Temporal(TemporalType.DATE)
//    Date modified_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public String getDevice_uri() {
        return device_uri;
    }

    public void setDevice_uri(String device_uri) {
        this.device_uri = device_uri;
    }

    public int getVirtual_object_id() {
        return virtual_object_id;
    }

    public void setVirtual_object_id(int virtual_object_id) {
        this.virtual_object_id = virtual_object_id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }


    //    @Column(name = "profile_id")
//    Long profileId;
//
//    @Column(name = "virtual_object_id")
//    Long virtualObjectId;
//
//    public Long getProfileId() {
//        return profileId;
//    }
//
//    public void setProfileId(Long profileId) {
//        this.profileId = profileId;
//    }
//
//    public Long getVirtualObjectId() {
//        return virtualObjectId;
//    }
//
//    public void setVirtualObjectId(Long virtualObjectId) {
//        this.virtualObjectId = virtualObjectId;
//    }
}
