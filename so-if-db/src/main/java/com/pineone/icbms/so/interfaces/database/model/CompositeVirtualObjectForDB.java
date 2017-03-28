package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Composite Virtual Object model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 13..
 */
@Entity
@Table(name="composite_virtual_object")
public class CompositeVirtualObjectForDB extends CommonEntity {

    @Id
    @Column(name = "composite_virtual_object_id")
    private int id;

//    @Column(name = "name")
//    private String name;

    //NOTE : JOIN 필요
    @Column(name = "functionality_id")
    private int functionality_id;

    //NOTE : JOIN 필요
    @Column(name = "aspect_id")
    private int aspect_id;

    //NOTE: TODO : Join 필요 OneToMany
//    @Column(name = "virtual_object_ids")
//    private List<String> virtual_object_ids;

    @Column(name = "type")
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public int getFunctionality_id() {
        return functionality_id;
    }

    public void setFunctionality_id(int functionality_id) {
        this.functionality_id = functionality_id;
    }

    public int getAspect_id() {
        return aspect_id;
    }

    public void setAspect_id(int aspect_id) {
        this.aspect_id = aspect_id;
    }

//    public List<String> getVirtual_object_ids() {
//        return virtual_object_ids;
//    }
//
//    public void setVirtual_object_ids(List<String> virtual_object_ids) {
//        this.virtual_object_ids = virtual_object_ids;
//    }

}
