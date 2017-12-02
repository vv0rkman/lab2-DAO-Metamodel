package com.vv0rkman.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Customer implements Serializable {

    private int id;
    private String name = "";
    private Collection<Project> projects = null;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(int id, String name, Collection<Project> collection) {
        this.id = id;
        this.name = name;
        this.projects = collection;
    }

    public Customer(int id, String name, Project project) {
        this.id = id;
        this.name = name;
        addProject(project);
    }

    public void addProject(Project p) {
        if (p != null) {
            if (projects.isEmpty() || projects == null) {
                projects = new ArrayList<>();
                projects.add(p);
            } else {
                projects.add(p);
            }
        }
    }

    public void removeProject(Project p) {
            if (p != null && (projects.contains(p))) {
                projects.remove(p);
            }
        }

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

    public Collection<Project> getProjects() {
        return projects;
    }

    public void setProjects(Collection<Project> projects) {
        this.projects = projects;
    }


    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", projects=" + projects + "]";
    }

}
