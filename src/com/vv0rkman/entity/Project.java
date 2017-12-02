package com.vv0rkman.entity;

public class Project {

    private int id;
    private int id_cust;
    private String name = "";
    private String start_Date = "";
    private String end_Date = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cust() {
        return id_cust;
    }

    public void setId_cust(int id_cust) {
        this.id_cust = id_cust;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(String start_Date) {
        this.start_Date = start_Date;
    }

    public String getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(String end_Date) {
        this.end_Date = end_Date;
    }
}
