package com.vv0rkman.dao.impl.jdbc;

import com.vv0rkman.dao.TaskDAO;
import com.vv0rkman.entity.Task;

import java.util.Collection;

public class JdbcTaskDAO implements TaskDAO {
    @Override
    public int addTask(int id, int sprint_id, int employee_id, String name, String estimate, String description) {
        return 0;
    }

    @Override
    public boolean deleteTaskById(int id) {
        return false;
    }

    @Override
    public Task getTaskById(int id) {
        return null;
    }

    @Override
    public Collection<Task> getTasks() {
        return null;
    }

    @Override
    public Collection<Task> getTasksByName(String name) {
        return null;
    }

    @Override
    public Collection<Task> getTasksBySkills(String skills) {
        return null;
    }

    @Override
    public boolean updateTask(int id, int project_id, String name, String description, String skills) {
        return false;
    }
}
