package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Virtual Object model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 13..
 */
@Entity
@Table(name="virtual_object")
public class VirtualObjectForDB extends CommonEntity {

//    @Id
//    @Column(name = "virtual_object_id")
//    private int id;

//    @Column(name = "name")
//    private String name;

    //NOTE : JOIN 필요
    @JoinColumn(name = "functionality_id")
    private int functionality_id;

    //NOTE : JOIN 필요
    @JoinColumn(name = "aspect_id")
    private int aspect_id;

    public VirtualObjectForDB(String name, int functionality, int aspect, String description) {
        super.name = name;
        this.functionality_id = functionality;
        this.aspect_id = aspect;
        super.description = description;
        Date date = new Date();
        super.created_date = date;
        super.modified_date = date;
    }

    public VirtualObjectForDB() {
    }

    public VirtualObjectForDB(String name, int functionality_id, int aspect_id, String description, Date modified_date) {
        super.name = name;
        this.functionality_id = functionality_id;
        this.aspect_id = aspect_id;
        super.description = description;
        super.modified_date = modified_date;
    }

//    @Column(name= "description")
//    String description;

//    @Temporal(TemporalType.DATE)
//    Date create_date;

//    @Temporal(TemporalType.DATE)
//    Date modified_date;

    @Override
    public int getId() {
        return id;
    }

    @Override
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

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }

    @Override
    public String toString() {
        return "VirtualObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", functionality_id=" + functionality_id +
                ", aspect_id=" + aspect_id +
                ", description='" + description + '\'' +
                ", create_date=" + created_date +
                ", modified_date=" + modified_date +
                '}';
    }
}
