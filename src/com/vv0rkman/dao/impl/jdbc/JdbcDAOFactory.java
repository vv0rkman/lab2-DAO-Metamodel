package com.vv0rkman.dao.impl.jdbc;

import com.sun.xml.internal.ws.util.Pool;
import com.vv0rkman.dao.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;
import oracle.ucp.jdbc.PoolDataSourceFactory;
import oracle.ucp.jdbc.PoolDataSource;

public class JdbcDAOFactory extends DAOFactory {

    private static final String DRIVER = "oracle.jdbc.pool.OracleDataSource";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_LOGIN = "viktor";
    private static final String DB_PASSWORD = "qwerty";//

    public static Connection createConnection(){
        Connection conn = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found");
            e.printStackTrace();
        }

        try{
            conn = DriverManager.getConnection(URL,DB_LOGIN,DB_PASSWORD);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static Connection createConnectionWithPool(){
        Connection conn = null;
        PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();

        try {
            pds.setConnectionFactoryClassName(DRIVER);
            pds.setURL(URL);
            pds.setUser(DB_LOGIN);
            pds.setPassword(DB_PASSWORD);
            pds.setDataSourceName("Lab2Metamodel");
            pds.setInitialPoolSize(5);

            conn = pds.getConnection();

            return conn;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public CustomerDAO getCustomerDAO() {
        return new JdbcCustomerDAO();
    }

    @Override
    public EmployeeDAO getEmployeeDAO() {
        return new JdbcEmployeeDAO();
    }

    @Override
    public ProjectDAO getProjectDAO() {
        return new JdbcProjectDAO();
    }

    @Override
    public SprintDAO getSprintDAO() {
        return new JdbcSprintDAO();
    }

    @Override
    public TaskDAO getTaskDAO() {
        return new JdbcTaskDAO();
    }
}
