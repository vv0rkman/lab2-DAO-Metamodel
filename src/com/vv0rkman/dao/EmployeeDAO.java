package com.vv0rkman.dao;

import com.vv0rkman.entity.Employee;

import java.util.Collection;
import java.util.logging.Logger;

public interface EmployeeDAO {

    Logger log = Logger.getLogger(EmployeeDAO.class.getName());

    int object_type_id = 5;

    void addEmployee(int id, String name, int salary, int manager, int department_id);

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee getEmployee(int id);

    Collection<Employee> getEmployees();

    Collection<Employee> getEmployees(String employeeName);

    Collection<Employee> getEmployees(int managerID);

    void updateEmployee(int id, String name, int salary, int manager, int department_id);

    void updateEmployee(Employee employee);

}

