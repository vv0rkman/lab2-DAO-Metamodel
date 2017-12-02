package com.vv0rkman.entity;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name = "";
    private int manager;
    private int id_dept;

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

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public int getId_dept() {
        return id_dept;
    }

    public void setId_dept(int id_dept) {
        this.id_dept = id_dept;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", Name: " + name + ", Department: " + id_dept + "]";
    }
}
