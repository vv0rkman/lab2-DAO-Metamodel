package com.vv0rkman.dao.impl.jdbc;

import com.vv0rkman.dao.ProjectDAO;
import com.vv0rkman.entity.Project;

import java.util.Collection;

public class JdbcProjectDAO implements ProjectDAO {
    @Override
    public int addProject(int id, int customer_id, String name, String start_date, String end_date) {
        return 0;
    }

    @Override
    public boolean deleteProjectById(int id) {
        return false;
    }

    @Override
    public Project getProjectById(int id) {
        return null;
    }

    @Override
    public Collection<Project> getProjects() {
        return null;
    }

    @Override
    public Collection<Project> getProjectsByName(String name) {
        return null;
    }

    @Override
    public boolean updateEmployees(int id, int customer_id, String name, String start_date, String end_date) {
        return false;
    }
}
