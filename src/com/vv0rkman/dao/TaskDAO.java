package com.vv0rkman.dao;

import com.vv0rkman.entity.Task;

import java.util.Collection;

public interface TaskDAO {

    int addTask(int id, int sprint_id, int employee_id, String name, String estimate, String description);

    boolean deleteTaskById(int id);

    Task getTaskById(int id);

    Collection<Task> getTasks();

    Collection<Task> getTasksByName(String name);

    Collection<Task> getTasksBySkills(String skills);

    boolean updateTask(int id, int project_id, String name, String description, String skills);

}
