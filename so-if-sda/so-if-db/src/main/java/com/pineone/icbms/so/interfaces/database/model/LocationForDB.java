package com.pineone.icbms.so.interfaces.database.model;

import com.pineone.icbms.so.util.time.DateFormat;
import javafx.scene.input.DataFormat;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by melvin on 2017. 3. 24..
 */
@Entity
@Table(name="location")
public class LocationForDB extends CommonEntity{

    @Id
    @Column(name = "location_id")
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

    public LocationForDB() {
    }

    public LocationForDB(int id, String name, String uri) {
        this.id = id;
        this.name = name;
        this.uri = uri;
        Date date = Calendar.getInstance().getTime();
        this.created_date = DateFormat.dateFormat(date);
        this.modified_date = DateFormat.dateFormat(date);
    }

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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
