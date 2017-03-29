package com.pineone.icbms.so.interfaces.database.model;

import com.pineone.icbms.so.util.time.DateFormat;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Virtual Object model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 13..
 */
@NamedNativeQueries({
        @NamedNativeQuery(
                name = "findRecentVirtualObject",
                query = "SELECT * FROM virtual_object ORDER BY created_date DESC LIMIT 1",
                resultClass = VirtualObjectForDB.class
        )
})
@Entity
@Table(name="virtual_object")
public class VirtualObjectForDB extends CommonEntity {

    @Id
    @Column(name = "virtual_object_id")
    private long id;

//    @Column(name = "name")
//    private String name;

    //NOTE : JOIN 필요
    @JoinColumn(name = "functionality_id")
    private int functionality_id;

    //NOTE : JOIN 필요
    @JoinColumn(name = "aspect_id")
    private int aspect_id;

    public VirtualObjectForDB(String name, int functionality, int aspect, String description) {
        this.name = name;
        this.functionality_id = functionality;
        this.aspect_id = aspect;
        this.description = description;
        Date date = Calendar.getInstance().getTime();
        String dateString = DateFormat.dateFormat(date);
        this.created_date = dateString;
        this.modified_date = dateString;
    }

    public VirtualObjectForDB() {
    }

    public VirtualObjectForDB(String name, int functionality_id, int aspect_id, String description, Date modified_date) {
        this.name = name;
        this.functionality_id = functionality_id;
        this.aspect_id = aspect_id;
        this.description = description;
        this.modified_date = DateFormat.dateFormat(modified_date);
    }

//    @Column(name= "description")
//    String description;

//    @Temporal(TemporalType.DATE)
//    Date create_date;

//    @Temporal(TemporalType.DATE)
//    Date modified_date;


    public long getId() {
        return id;
    }

    public void setId(long id) {
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
