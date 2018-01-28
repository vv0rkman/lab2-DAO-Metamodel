package com.vv0rkman.dao.impl.jdbc;

import com.vv0rkman.dboperations.CRUD;
import com.vv0rkman.dao.CustomerDAO;
import com.vv0rkman.dboperations.Selector;
import com.vv0rkman.entity.Customer;
import com.vv0rkman.entity.Entity;
import com.vv0rkman.service.Tools;

import java.util.*;

public class JdbcCustomerDAO extends CRUD implements CustomerDAO, Tools {

    @Override
    public void addCustomer(int id, String name) {

        addCustomer(new Customer(id, 0, name));

    }

    @Override
    public void addCustomer(Customer customer) {

        if (CRUD.createObject(customer, object_type_id) > 0) {

            log.info("Entity Customer was created");

//            LinkedHashMap<Integer, Object> preparedData = prepareData(customer, object_type_id);
//
//            if (!(preparedData.isEmpty())) {
//
//                if (CRUD.setParams(customer.getId(), preparedData, true) > 0) {
//                    log.info("Parameters for the Customer object were inserted");
//                } else
//                    log.info("Parameters for the Customer object not inserted");
//            } else
//                log.info("Parameters for the Customer object not inserted");

        } else
            log.info("Entity Customer was not created");
    }

    @Override
    public void deleteCustomer(int id) {

        if (CRUD.deleteObject(id) > 0) {
            log.info("Entity deleted");
        } else
            log.info("Entity not deleted");

    }

    @Override
    public Customer getCustomer(int customer_id) {

        LinkedHashMap customerData = Selector.getObject(customer_id);

        if ((customerData.isEmpty())) {

            log.info("Entity Customer with ID " + customer_id + " not found");
            return null;

        }

        Customer customer = new Customer();

        customer.setId(customer_id);

        customer.setData(customerData);

        return customer;
    }

    @Override
    public ArrayList<Customer> getCustomers(String customerName) {

        ArrayList<Customer> customers = getCustomers();

        if (customers.isEmpty()) {

            log.info("Entities Customer with the name " + customerName + " not found");

            return null;
        }

        ArrayList<Customer> result = new ArrayList<>();

        for (Customer customer : customers) {

            if (customer.getName().equals(customerName)) {

                result.add(customer);
            }
        }

        return result;
    }

    @Override
    public ArrayList<Customer> getCustomers() {

        ArrayList<Customer> customers = new ArrayList<>();

        LinkedHashMap<Integer, LinkedHashMap<Integer, Object>> empMap = Selector.getObjects(object_type_id);

        if (empMap.isEmpty()) {

            log.info("Entities Customer not found");
            return null;
        }

        for (Object aSet : empMap.entrySet()) {

            Map.Entry empEntry = (Map.Entry) aSet;

            Customer customer = new Customer();

            customer.setId((Integer) empEntry.getKey());

            LinkedHashMap params = (LinkedHashMap) empEntry.getValue();

            customer.setData(params);

            customers.add(customer);
        }

        return customers;
    }

    @Override
    public void updateCustomer(int id, String name) {
        updateCustomer(new Customer(id, 0 , name));
    }

    @Override
    public void updateCustomer(Customer customer) {

        if (CRUD.updateObject(customer) > 0) {
            log.info("Entity Customer updated");

//            LinkedHashMap<Integer, Object> preparedData = prepareData(customer, object_type_id);
//
//            if (CRUD.setParams(customer.getId(), preparedData, false) > 0) {
//                log.info("Parameters for entity Customer updated");
//            } else
//                log.info("Parameters for entity Customer not updated");

        } else
            log.info("Entity Customer not updated");

    }

    @Override
    public LinkedHashMap<Integer, Object> prepareData(Entity entity, int object_type_id) {

        LinkedHashMap<Integer, Object> objectParams = new LinkedHashMap<>();

        Customer customer = (Customer) entity;

        LinkedHashMap<Integer, Object> attr = Selector.getAttr(object_type_id);

        return Tools.prepareData(attr, objectParams);
    }
}
