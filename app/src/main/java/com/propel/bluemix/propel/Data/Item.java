package com.propel.bluemix.propel.Data;

import com.ibm.mobile.services.data.IBMDataObject;
import com.ibm.mobile.services.data.IBMDataObjectSpecialization;

import java.util.Date;

@IBMDataObjectSpecialization("Item")
public class Item extends IBMDataObject {
    String name;
    String description;
    Date post_date;

    public Item(Date post_date, String name, String description) {
        this.post_date = post_date;
        this.name = name;
        this.description = description;
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

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }
}
