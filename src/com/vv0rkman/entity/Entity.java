package com.vv0rkman.entity;

import java.io.Serializable;

public class Entity implements Serializable {

    protected static final int PARENT_ID = 2;
    protected static final int NAME = 1;

    int id;
    int parent_id;
    String name;

    Entity(){}

    Entity(int id, int parent_id, String name) {
        this.id = id;
        this.parent_id = parent_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
