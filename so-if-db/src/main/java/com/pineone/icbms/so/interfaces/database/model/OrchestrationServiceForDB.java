package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Orchestration Service model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 13..
 */
@Entity
@Table(name="orchestration_service")
public class OrchestrationServiceForDB extends CommonEntity {

    @Id
    @Column(name = "orchestration_service_id")
    private int id;

//    @Column(name = "name")
//    private String name;

    //NOTE: TODO : Join 필요 OneToMany
//    @Column(name = "virtual_object_ids")
//    private List<String> virtualObject_ids;

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

//    public List<String> getVirtualObject_ids() {
//        return virtualObject_ids;
//    }
//
//    public void setVirtualObject_ids(List<String> virtualObject_ids) {
//        this.virtualObject_ids = virtualObject_ids;
//    }

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

