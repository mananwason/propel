package com.propel.bluemix.propel.Data;

import java.sql.Time;
import java.util.Date;

/**
 * Created by MananWason on 27-06-2015.
 */
public class Item {
    String goal;
    String description;
    Date post_date;


    public Item(String goal) {
        this.goal = goal;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
