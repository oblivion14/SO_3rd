package com.pineone.icbms.so.interfaces.database.model;

import com.pineone.icbms.so.util.time.DateFormat;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * aspect model for authoring.<BR/>
 * Created by uni4love on 2017. 1. 16..
 */
@NamedNativeQueries({
        @NamedNativeQuery(
                name = "findRecentAspect",
                query = "SELECT * FROM aspect ORDER BY created_date DESC LIMIT 1",
                resultClass = AspectForDB.class
        )
})
@Entity
@Table(name="aspect")
public class AspectForDB extends CommonEntity {

    @Id
    @Column(name = "aspect_id")
    private long id;

//    @Column(name = "name")
//    private String name;

    @Column(name = "uri")
    String uri;

    public AspectForDB() {
    }



    public AspectForDB(String name, String uri, String description) {
        this.name = name;
        this.uri = uri;
        this.description = description;
        Date date = Calendar.getInstance().getTime();
        String dateString = DateFormat.dateFormat(date);
        this.created_date = dateString;
        this.modified_date = dateString;
    }

    public AspectForDB(String name, String uri, String description, Date modified_date) {
        this.name = name;
        this.uri = uri;
        this.description = description;
        this.modified_date = DateFormat.dateFormat(modified_date);
    }

//    @Column(name= "description")
//    String description;


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
