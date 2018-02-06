package com.vv0rkman.dao.impl.collection;

import com.vv0rkman.dao.EmployeeDAO;
import com.vv0rkman.entity.Employee;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEmployeeDAO implements EmployeeDAO {
    private ArrayList<Employee> empList;

    CollectionEmployeeDAO() {
        empList = new ArrayList<>();
    }

    @Override
    public void addEmployee(String name, int salary, Long manager, int department_id) {
        //BigInteger id = Tools.generateCollectionId(id);
        empList.add(new Employee(name, salary, manager, department_id));
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Long id) {
        for (Employee employee : empList) {
            if (employee.getId() == id) {
                empList.remove(employee);
            }
        }
    }

    @Override
    public Employee getEmployee(Long department_id) {
        for (Employee employee : empList) {
            if (employee.getId_dept() == department_id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public Collection<Employee> getEmployees() {
        return empList;
    }

    @Override
    public Collection<Employee> getEmployees(String employeeName) {
        ArrayList<Employee> empByName = new ArrayList<>();
        for (Employee employee : empList) {
            if (employee.getName().equals(employeeName)) {
                empByName.add(employee);
            }
        }
        return empByName;
    }

    @Override
    public Collection<Employee> getEmployees(Long managerID) {
        ArrayList<Employee> empByMgr = new ArrayList<>();
        for (Employee employee : empList) {
            if (employee.getManager() == managerID) {
                empByMgr.add(employee);
            }
        }
        return empByMgr;
    }

    @Override
    public void updateEmployee(Long id, String name, int salary, Long manager, int department_id) {
        for (Employee employee : empList) {
            if (employee.getId() == id) {
                employee.setName(name);
                employee.setManager(manager);
                employee.setId_dept(department_id);
                employee.setSalary(salary);
            }
        }
    }

    @Override
    public void updateEmployee(Employee employee) {

    }
}
