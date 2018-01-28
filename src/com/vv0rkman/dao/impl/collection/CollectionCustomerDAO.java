package com.vv0rkman.dao.impl.collection;

import com.vv0rkman.dao.CustomerDAO;
import com.vv0rkman.entity.Customer;

import java.util.Collection;

public class CollectionCustomerDAO implements CustomerDAO {
    @Override
    public void addCustomer(int id, String name) {

    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public Customer getCustomer(int customer_id) {
        return null;
    }

    @Override
    public Collection<Customer> getCustomers(String customerName) {
        return null;
    }

    @Override
    public Collection<Customer> getCustomers() {
        return null;
    }

    @Override
    public void updateCustomer(int id, String name) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }
}
