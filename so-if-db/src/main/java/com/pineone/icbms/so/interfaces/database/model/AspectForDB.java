package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;

/**
 * aspect model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 16..
 */
@Entity
@Table(name="aspect")
public class AspectForDB extends CommonEntity {

//    @Id
//    @Column(name = "aspect_id")
//    private int id;

//    @Column(name = "name")
//    private String name;

    @Column(name = "uri")
    String uri;

//    @Column(name= "description")
//    String description;


    @Override
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

}
