package com.vv0rkman.dao;

import com.vv0rkman.entity.Sprint;

import java.util.Collection;

public interface SprintDAO {

    int addSprint(int id, int project_id, String name, String description, String skills);

    boolean deleteSprintById(int id);

    Sprint getSprintById(int id);

    Collection<Sprint> getSprints();

    Collection<Sprint> getSprintsByName(String name);

    Collection<Sprint> getSprintsBySkills(String skills);

    boolean updateSprint(int id, int project_id, String name, String description, String skills);

}
