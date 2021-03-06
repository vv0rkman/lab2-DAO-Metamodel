package com.vv0rkman.dao;

import com.vv0rkman.entity.Customer;

import java.util.Collection;
import java.util.logging.Logger;

public interface CustomerDAO {
    //for Customer type of object = 1
    int object_type_id = 1;

    Logger log = Logger.getLogger(EmployeeDAO.class.getName());

    void addCustomer(String name);

    void addCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer getCustomer(Long customer_id);

    Collection<Customer> getCustomers(String customerName);

    Collection<Customer> getCustomers();

    void updateCustomer(Long id, String name);

    void updateCustomer(Customer customer);
}
