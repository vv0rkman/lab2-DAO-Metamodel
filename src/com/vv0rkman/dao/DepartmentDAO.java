package com.vv0rkman.dao;

import com.vv0rkman.entity.Department;

import java.util.Collection;

public interface DepartmentDAO {

    int addDepartment(int id, String name, String location);

    boolean deleteDepartmentById(int id);

    Department getDepartmentById(int department_id);

    Collection<Department> getDepartments();

    Collection<Department> getDepartmentsByName(String name);

    Collection<Department> getDepartmentsByLocation(String location);

    boolean updateDepartment(int id, String name, String location);

}
