package com.vv0rkman.dao;

import com.vv0rkman.entity.Customer;

import java.util.Collection;

public interface CustomerDAO {

    int addCustomer(int id, String name);

    boolean deleteCustomerById(int id);

    boolean deleteCustomerByName(String name);

    Customer getCustomerById(int customer_id);

    Customer getCustomerByName(String name);

    Collection<Customer> getCustomers();

    boolean updateCustomer(int id, String name);

}
