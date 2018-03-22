package com.vv0rkman.entity;

import com.vv0rkman.service.Tools;

import java.io.Serializable;

public class Entity implements Serializable {

    static final int PARENT_ID = 2;
    static final int NAME = 1;

    long id;
    long parent_id;
    String name;

    Entity(){}

    Entity(long parent_id, String name) {
        this.id = Tools.generateID();
        this.parent_id = parent_id;
        this.name = name;
    }

    Entity(long id, long parent_id, String name) {
        this.id = id;
        this.parent_id = parent_id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getParent_id() {
        return parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
