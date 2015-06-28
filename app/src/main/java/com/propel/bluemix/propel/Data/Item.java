package com.propel.bluemix.propel.Data;

import java.util.Date;

/**
 * Created by MananWason on 27-06-2015.
 */
public class Item {
    String goal;
    String description;
    Date post_date;

    public Item(Date post_date, String goal, String description) {
        this.post_date = post_date;
        this.goal = goal;
        this.description = description;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
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
