package com.vv0rkman.dao.impl.collection;

import com.vv0rkman.dao.EmployeeDAO;
import com.vv0rkman.entity.Employee;

import java.util.Collection;

public class CollectionEmployeeDAO implements EmployeeDAO {
    @Override
    public int addEmployee(int id, String name, int manager, int department_id) {
        return 0;
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        return false;
    }

    @Override
    public Employee getEmployeeById(int department_id) {
        return null;
    }

    @Override
    public Collection<Employee> getEmployees() {
        return null;
    }

    @Override
    public Collection<Employee> getEmployeesByName() {
        return null;
    }

    @Override
    public Collection<Employee> getEmployeesByManager() {
        return null;
    }

    @Override
    public boolean updateEmployees(int id, String name, int manager, int department_id) {
        return false;
    }
}
