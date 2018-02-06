package com.vv0rkman;

import com.vv0rkman.dao.CustomerDAO;
import com.vv0rkman.dao.EmployeeDAO;
import com.vv0rkman.dao.impl.jdbc.JdbcCustomerDAO;
import com.vv0rkman.dao.impl.jdbc.JdbcEmployeeDAO;
import com.vv0rkman.entity.Customer;
import com.vv0rkman.entity.Employee;
import com.vv0rkman.service.Tools;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        JdbcCustomerDAO a = new JdbcCustomerDAO();
////        Customer customer = new Customer(19,"text");
//        //a.addCustomer(customer);
        Employee employee = new Employee("Scott", 1111, 55L, 61);
        JdbcEmployeeDAO employeeDAO = new JdbcEmployeeDAO();
//        employeeDAO.addEmployee(employee);
        //employeeDAO.deleteEmployee(599);
        //employeeDAO.updateEmployee(666, "ttt", 55, 61);
//
//        try {
//            Employee ee = employeeDAO .getEmployee(599);
//            System.out.println(ee.toString());
//        }catch (NullPointerException e){
//            System.out.println("Please, insert another ID");
//        }

        //employeeDAO.addEmployee(employee);
        //System.out.println(employeeDAO.getEmployee(599));

//        employee.setManager(53);
//
//        employeeDAO.updateEmployee(employee);

        ArrayList<Employee> employees = employeeDAO.getEmployees();

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

//        Customer customer = new Customer(9, 0, "Test");
//        CustomerDAO customerDAO = new JdbcCustomerDAO();
//        customerDAO.addCustomer(customer);
//        System.out.println(customerDAO.getCustomer(9).toString());
//        customer.setName("Test2");
//        customerDAO.updateCustomer(customer);
//        System.out.println(customerDAO.getCustomer(9).toString());
//
//        for (Customer customer1: customerDAO.getCustomers()){
//            System.out.println(customer1.toString());
//        }
//
//        customerDAO.deleteCustomer(9);
//
//        for (Customer customer1: customerDAO.getCustomers("Test")){
//            System.out.println(customer1.toString());
//        }

//        for (Customer customer1: customerDAO.getCustomers()){
//            System.out.println(customer1.toString());
//        }

    }
}
