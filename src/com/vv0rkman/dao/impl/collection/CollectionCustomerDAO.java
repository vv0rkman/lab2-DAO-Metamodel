package com.vv0rkman.dao.impl.collection;

import com.vv0rkman.dao.CustomerDAO;
import com.vv0rkman.entity.Customer;

import java.util.Collection;

public class CollectionCustomerDAO implements CustomerDAO {
    @Override
    public int addCustomer(int id, String name) {
        return 0;
    }

    @Override
    public boolean deleteCustomerById(int id) {
        return false;
    }

    @Override
    public boolean deleteCustomerByName(String name) {
        return false;
    }

    @Override
    public Customer getCustomerById(int customer_id) {
        return null;
    }

    @Override
    public Customer getCustomerByName(String name) {
        return null;
    }

    @Override
    public Collection<Customer> getCustomers() {
        return null;
    }

    @Override
    public boolean updateCustomer(int id, String name) {
        return false;
    }
}
