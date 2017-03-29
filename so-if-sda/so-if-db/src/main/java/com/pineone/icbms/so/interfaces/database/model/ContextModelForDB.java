package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Context Model model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 13..
 */
@Entity
@Table(name = "context_model")
public class ContextModelForDB extends CommonEntity {

    @Id
    @Column(name = "context_model_id")
    private int id;

//    @Column(name = "name")
//    private String name;

    //NOTE: TODO : Join 및 구현 필요
//    @Column(name = "context_information_ids")
//    private List<String> context_information_ids;

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

//    public List<String> getContext_information_ids() {
//        return context_information_ids;
//    }
//
//    public void setContext_information_ids(List<String> context_information_ids) {
//        this.context_information_ids = context_information_ids;
//    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }



    //    @ManyToMany
//    List<ContextInformationForDB> contextInformationList;
//
//    public List<ContextInformationForDB> getContextInformationList() {
//        return contextInformationList;
//    }
//
//    public void setContextInformationList(List<ContextInformationForDB> contextInformationList) {
//        this.contextInformationList = contextInformationList;
//    }
}
