package com.vv0rkman.entity;

public class Task {

    private int id;
    private int id_sprt;
    private int id_emp;
    private String name = "";
    private String estimate = "";
    private String desc = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_sprt() {
        return id_sprt;
    }

    public void setId_sprt(int id_sprt) {
        this.id_sprt = id_sprt;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
