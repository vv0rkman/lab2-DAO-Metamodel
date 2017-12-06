package com.vv0rkman.dao.impl.collection;

import com.vv0rkman.dao.EmployeeDAO;
import com.vv0rkman.entity.Employee;
import service.IDGenerator;

import java.util.Collection;

public class CollectionEmployeeDAO implements EmployeeDAO {
	private ArrayList<Employee> empList;
	
	CollectionEmployeeDAO(){
		empList = new ArrayList<>();
	}
	
    @Override
    public int addEmployee(int id, String name, int manager, int department_id) {
        BigInteger id = IDGenerator.generateCollectionId(id);		
		empList.add(new Employee(id, emp_name, department));
        return id;
    }

    @Override
    public boolean deleteEmployeeById(int id) {
		for (Employee employee : empList) {
			if (employee.getId() == id) {
				empList.remove(employee);
				return true;
			}
		}
		return false;
    }

    @Override
    public Employee getEmployeeById(int department_id) {
        for (Employee employee : empList) {
			if (employee.getId() == id) {
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
    public Collection<Employee> getEmployeesByName(String name) {
		ArrayList<Employee> empByName = new ArrayList<>();
        for (Employee employee : empList) {
			if (employee.getName().equals(name)) {
				empByName.add(employee);
			}
		}
		return empByName;
    }

    @Override
    public Collection<Employee> getEmployeesByManager(int mgr) {
        ArrayList<Employee> empByMgr = new ArrayList<>();
        for (Employee employee : empList) {
			if (employee.getManager() == mgr) {
				empByMgr.add(employee);
			}
		}
		return empByName;
    }

    @Override
    public boolean updateEmployee(int id, String name, int manager, int department_id) {
        for (Employee employee : empList) {
			if (employee.getId() == id) {
				employee.setName(name);
				employee.setManager(manager);
				employee.setId_dept(department_id);
				return true;
			}
		}
		return false;
    }
}
