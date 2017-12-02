package com.vv0rkman.dao.impl.collection;

import com.vv0rkman.dao.*;

public class CollectionDAOFactory extends DAOFactory {


    @Override
    public CustomerDAO getCustomerDAO() {
        return new CollectionCustomerDAO();
    }

    @Override
    public EmployeeDAO getEmployeeDAO() {
        return new CollectionEmployeeDAO();
    }

    @Override
    public ProjectDAO getProjectDAO() {
        return new CollectionProjectDAO();
    }

    @Override
    public SprintDAO getSprintDAO() {
        return new CollectionSprintDAO();
    }

    @Override
    public TaskDAO getTaskDAO() {
        return new CollectionTaskDAO();
    }
}
