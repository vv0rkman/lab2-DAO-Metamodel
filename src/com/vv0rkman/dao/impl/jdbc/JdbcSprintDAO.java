package com.vv0rkman.dao.impl.jdbc;

import com.vv0rkman.dao.SprintDAO;
import com.vv0rkman.entity.Sprint;

import java.util.Collection;

public class JdbcSprintDAO implements SprintDAO {
    @Override
    public int addSprint(int id, int project_id, String name, String description, String skills) {
        return 0;
    }

    @Override
    public boolean deleteSprintById(int id) {
        return false;
    }

    @Override
    public Sprint getSprintById(int id) {
        return null;
    }

    @Override
    public Collection<Sprint> getSprints() {
        return null;
    }

    @Override
    public Collection<Sprint> getSprintsByName(String name) {
        return null;
    }

    @Override
    public Collection<Sprint> getSprintsBySkills(String skills) {
        return null;
    }

    @Override
    public boolean updateSprint(int id, int project_id, String name, String description, String skills) {
        return false;
    }
}
