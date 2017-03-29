package com.pineone.icbms.so.interfaces.database.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by melvin on 2017. 3. 24..
 */

@Entity
@Table(name="composite_virtual_object_type")
public class TypeOfCompositeVirtualObjectForDB extends CommonEntity {

    @Id
    @Column(name = "cvo_type_id")
    private int id;

//    @Column(name = "name")
//    private String name;

    @Column(name = "type")
    String type;

//    @Column(name= "description")
//    String description;

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
}
