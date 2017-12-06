package com.vv0rkman.dao;

import com.vv0rkman.entity.Employee;

import java.util.Collection;

public interface EmployeeDAO {

    int addEmployee(int id, String name, int manager, int department_id);

    boolean deleteEmployeeById(int id);

    Employee getEmployeeById(int id);

    Collection<Employee> getEmployees();

    Collection<Employee> getEmployeesByName(String name);

    Collection<Employee> getEmployeesByManager(int mgr);

    boolean updateEmployee(int id, String name, int manager, int department_id);

}

