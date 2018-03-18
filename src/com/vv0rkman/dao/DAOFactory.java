package com.vv0rkman.dao;

import com.vv0rkman.dao.impl.collection.CollectionDAOFactory;
import com.vv0rkman.dao.impl.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

    public enum DAOType {
        COLLECTION, XML, TEXTFILE, BINARYFILE, JDBC
    }

    public abstract CustomerDAO getCustomerDAO();

    public abstract EmployeeDAO getEmployeeDAO();

    public abstract ProjectDAO getProjectDAO();

    public abstract SprintDAO getSprintDAO();

    public abstract TaskDAO getTaskDAO();

    public static DAOFactory getDAOFactory(DAOType whichFactory) {
        switch (whichFactory) {
            case COLLECTION:
                return new CollectionDAOFactory();
            /*case XML:
                return new XmlDAOFactory();
            case TEXTFILE:
                return new TxtDAOFactory();
            case BINARYFILE:
                return new BinDAOFactory();*/
            case JDBC:
                return new JdbcDAOFactory();
            default:
                return null;
        }
    }

}
