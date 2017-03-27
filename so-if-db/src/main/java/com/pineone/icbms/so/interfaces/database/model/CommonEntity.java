package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;

/**
 * handler entity model.<BR/>
 * Created by uni4love on 2017. 1. 13..
 */
@MappedSuperclass
public class CommonEntity { //extends AbstractPersistable<String> {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "description")
    String description;

//    @Column(name = "createdDate", nullable = false)
//    Timestamp createdDate;
//
//    @Column(name = "modifiedDate", nullable = false)
//    Timestamp modifiedDate;

    @Temporal(TemporalType.DATE)
    Date created_date;

    @Temporal(TemporalType.DATE)
    Date modified_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

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
}
