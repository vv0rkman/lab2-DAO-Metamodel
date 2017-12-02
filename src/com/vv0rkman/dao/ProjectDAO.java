package com.vv0rkman.dao;

import com.vv0rkman.entity.Project;

import java.util.Collection;

public interface ProjectDAO {

    int addProject(int id, int customer_id, String name, String start_date, String end_date);

    boolean deleteProjectById(int id);

    Project getProjectById(int id);

    Collection<Project> getProjects();

    Collection<Project> getProjectsByName(String name);

    boolean updateEmployees(int id, int customer_id, String name, String start_date, String end_date);

}
