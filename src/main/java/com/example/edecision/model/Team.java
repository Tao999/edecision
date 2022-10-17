package com.example.edecision.model;

import com.example.edecision.utils.TypeTeam;

import java.util.ArrayList;

public class Team {
    private Integer id;
    private String name;

    private ArrayList <Member> Members;
    private TypeTeam typeTeam;

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

    public ArrayList<Member> getMembers() {
        return Members;
    }

    public void setMembers(ArrayList<Member> members) {
        Members = members;
    }

    public TypeTeam getTypeTeam() {
        return typeTeam;
    }

    public void setTypeTeam(TypeTeam typeTeam) {
        this.typeTeam = typeTeam;
    }
}
