package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;

/**
 * ProfileForDB model for authoring.<BR/>
 * 
 * Created by uni4love on 2017. 1. 13..
 */
@Entity
@Table(name="profile")
public class ProfileForDB extends CommonEntity {

    @Id
    @Column(name = "profile_id")
    private int id;

//    @Column(name = "name")
//    private String name;

    //NOTE : Join 필요
    @Column(name = "context_model_id")
    private int context_model_id;

    //NOTE : Join 필요
    @Column(name = "orchestration_service_id")
    private int orchestration_service_id;

    //NOTE : Join 필요
    @Column(name = "location_id")
    private int location_id;


//    @Column(name= "description")
//    String description;

    @Column
    boolean eneabled;

//    @Temporal(TemporalType.DATE)
//    Date create_date;

//    @Temporal(TemporalType.DATE)
//    Date modified_date;



    //    @JoinColumn(name = "id")
//    ContextModelForDB contextModel;
//
//    @JoinColumn(name = "id")
//    OrchestrationServiceForDB orchestrationService;
//
//    @Column(name = "location_id")
//    String locationId;

//    public ContextModelForDB getContextModel() {
//        return contextModel;
//    }
//
//    public void setContextModel(ContextModelForDB contextModel) {
//        this.contextModel = contextModel;
//    }
//
//    public OrchestrationServiceForDB getOrchestrationService() {
//        return orchestrationService;
//    }
//
//    public void setOrchestrationService(OrchestrationServiceForDB orchestrationService) {
//        this.orchestrationService = orchestrationService;
//    }
//
//    public String getLocationId() {
//        return locationId;
//    }
//
//    public void setLocationId(String locationId) {
//        this.locationId = locationId;
//    }


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

    public int getContext_model_id() {
        return context_model_id;
    }

    public void setContext_model_id(int context_model_id) {
        this.context_model_id = context_model_id;
    }

    public int getOrchestration_service_id() {
        return orchestration_service_id;
    }

    public void setOrchestration_service_id(int orchestration_service_id) {
        this.orchestration_service_id = orchestration_service_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEneabled() {
        return eneabled;
    }

    public void setEneabled(boolean eneabled) {
        this.eneabled = eneabled;
    }
}
