package com.vv0rkman.dao.impl.jdbc;

import com.vv0rkman.dboperations.CRUD;
import com.vv0rkman.dao.EmployeeDAO;
import com.vv0rkman.dboperations.Selector;
import com.vv0rkman.entity.Employee;
import com.vv0rkman.entity.Entity;
import com.vv0rkman.service.Tools;

import java.util.*;

public class JdbcEmployeeDAO extends CRUD implements EmployeeDAO, Tools {

    @Override
    public void addEmployee(String name, int salary, Long manager, int department_id) {

        addEmployee(new Employee(name, salary, manager, department_id));

    }

    @Override
    public void addEmployee(Employee employee) {

        if (CRUD.createObject(employee, object_type_id) > 0) {

            log.info("Entity Employee was created");

            LinkedHashMap<Integer, Object> preparedData = prepareData(employee, object_type_id);

            if (CRUD.setParams(employee.getId(), preparedData, true) > 0) {
                log.info("Parameters for the Employee object were inserted");
            } else
                log.info("Parameters for the Employee object not inserted");

        } else
            log.info("Entity Employee was not created");
    }

    @Override
    public void deleteEmployee(Long id) {

        if (CRUD.deleteObject(id) > 0) {
            log.info("Entity Employee deleted");
        } else
            log.info("Entity Employee not deleted");
    }

    @Override
    public Employee getEmployee(Long id) {

        LinkedHashMap employeeData = Selector.getObject(id);

        if ((employeeData.isEmpty())) {

            log.info("Entity Employee with ID " + id +" not found");
            return null;

        }

        Employee employee = new Employee();

        employee.setId(id);

        employee.setData(employeeData);

        return employee;
    }

    @Override
    public ArrayList<Employee> getEmployees() {

        ArrayList<Employee> employees = new ArrayList<>();

        LinkedHashMap<Long, LinkedHashMap<Integer, Object>> empMap = Selector.getObjects(object_type_id);

        if (empMap.isEmpty()) {

            log.info("Entities Employee not found");
            return null;
        }

        for (Object aSet : empMap.entrySet()) {

            Map.Entry empEntry = (Map.Entry) aSet;

            Employee employee = new Employee();

            employee.setId((Long) empEntry.getKey());

            LinkedHashMap params = (LinkedHashMap) empEntry.getValue();

            employee.setData(params);

            employees.add(employee);
        }

        return employees;
    }

    @Override
    public ArrayList<Employee> getEmployees(String employeeName) {

        ArrayList<Employee> employees = getEmployees();

        if (employees.isEmpty()) {

            log.info("Entities Employee with the name " + employeeName + " not found");
            return null;
        }

        ArrayList<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getName().equals(employeeName))
                result.add(employee);
        }

        return result;
    }

    @Override
    public ArrayList<Employee> getEmployees(Long managerID) {

        ArrayList<Employee> employees = getEmployees();

        if (employees.isEmpty()) {

            log.info("Entities Employee with the ID of manager " + managerID + " not found");
            return null;
        }

        ArrayList<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getManager() == managerID)
                result.add(employee);
        }

        return result;
    }

    @Override
    public void updateEmployee(Long id, String name, int salary, Long manager, int department_id) {

        updateEmployee(new Employee(id, name, salary, manager, department_id));

    }

    @Override
    public void updateEmployee(Employee employee) {

        if (CRUD.updateObject(employee) > 0) {
            log.info("Entity Employee updated");

            LinkedHashMap<Integer, Object> preparedData = prepareData(employee, object_type_id);

            if (CRUD.setParams(employee.getId(), preparedData, false) > 0) {
                log.info("Parameters for entity Employee updated");
            } else
                log.info("Parameters for entity Employee not updated");

        } else
            log.info("Entity Employee not updated");

    }

    @Override
    public LinkedHashMap<Integer, Object> prepareData(Entity entity, int object_type_id) {

        LinkedHashMap<Integer, Object> objectParams = new LinkedHashMap<>();

        Employee employee = (Employee) entity;

        objectParams.put(12, employee.getManager());
        objectParams.put(15, employee.getSalary());

        LinkedHashMap<Integer, Object> attr = Selector.getAttr(object_type_id);

        return Tools.prepareData(attr, objectParams);
    }
}
