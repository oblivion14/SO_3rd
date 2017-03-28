package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Context Information model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 13..
 */
@Entity
@Table(name="context_information")
public class ContextInformationForDB extends CommonEntity {

    @Id
    @Column(name = "context_information_id")
    private int id;

//    @Column(name = "name")
//    private String name;

    @Column(name = "uri")
    private String uri;

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
