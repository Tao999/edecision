package com.example.edecision.model;

import java.util.Date;

public class Decision {
    private Integer id;
    private String name;
    private String description;
    private Date delay;
    private Date creation_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDelay() {
        return delay;
    }

    public void setDelay(Date delay) {
        this.delay = delay;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }
}
