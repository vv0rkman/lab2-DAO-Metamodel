package com.vv0rkman.dao;

import com.vv0rkman.entity.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

public interface EmployeeDAO {

    Logger log = Logger.getLogger(EmployeeDAO.class.getName());

    int object_type_id = 5;

    void addEmployee(String name, int salary, Long manager, int department_id);

    void addEmployee(Employee employee);

    void deleteEmployee(Long id);

    Employee getEmployee(Long id);

    ArrayList<Employee> getEmployees();

    Collection<Employee> getEmployees(String employeeName);

    Collection<Employee> getEmployees(Long managerID);

    void updateEmployee(Long id, String name, int salary, Long manager, int department_id);

    void updateEmployee(Employee employee);

}

