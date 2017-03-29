package com.pineone.icbms.so.interfaces.database.controller.inputdata;

import java.util.Date;

/**
 * Created by melvin on 2017. 3. 28..
 */

//NOTE: 외부로부터 입력받기 위한 Aspect 데이터 셋 구성
public class AspectData {

    String name;
    String uri;
    String description;
    Date modified_date;

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

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }
}
