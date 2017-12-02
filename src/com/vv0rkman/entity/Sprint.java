package com.vv0rkman.entity;

public class Sprint {

    private int id;
    private int id_prj;
    private String name = "";
    private String desc = "";
    private String skills = "";

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

    public int getId_prj() {
        return id_prj;
    }

    public void setId_prj(int id_prj) {
        this.id_prj = id_prj;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
