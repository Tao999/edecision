package com.example.edecision.model;

import com.example.edecision.utils.Role;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {

    private String id;
    private String title;
    private String description;
    private ArrayList<Decision>decisions;
    private HashMap<Developer,Role>participants;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Decision> getDecisions() {
        return decisions;
    }

    public void setDecisions(ArrayList<Decision> decisions) {
        this.decisions = decisions;
    }

    public HashMap<Developer, Role> getParticipants() {
        return participants;
    }

    public void setParticipants(HashMap<Developer, Role> participants) {
        this.participants = participants;
    }
}
