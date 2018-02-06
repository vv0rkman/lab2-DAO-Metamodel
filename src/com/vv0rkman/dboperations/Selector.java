package com.vv0rkman.dboperations;

import com.vv0rkman.dao.impl.jdbc.JdbcDAOFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;

public class Selector {

    public static LinkedHashMap<Integer, Object> getAttr(int object_type_id) {

        String selectAttrString =
                "SELECT ATTR_ID, ATTR_NAME FROM ATTR WHERE OBJECT_TYPE_ID = " + object_type_id;

        LinkedHashMap<Integer, Object> attr = new LinkedHashMap<>();

        try (
                Connection conn = JdbcDAOFactory.createConnectionWithPool();
                Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(selectAttrString);

            while (rs.next()) {
                attr.put(rs.getInt(1), rs.getObject(2));
            }

            return attr;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attr;
    }

    public static LinkedHashMap getObject(Long object_id) {

        String selectObjectString =
                "SELECT o.OBJECT_ID, o.PARENT_ID, o.OBJECT_NAME, a.ATTR_ID, p.NUMBER_VALUE, p.TEXT_VALUE, p.DATE_VALUE " +
                        "FROM OBJECTS o " +
                        "INNER  JOIN PARAMS p ON p.OBJECT_ID = o.OBJECT_ID " +
                        "JOIN ATTR a ON a.ATTR_ID = p.ATTR_ID " +
                        "AND o.OBJECT_ID = " + object_id;

        ResultSet rs;

        boolean hasParams = true;

        LinkedHashMap<Integer, Object> objectParams = new LinkedHashMap<>();

        try (
                Connection conn = JdbcDAOFactory.createConnectionWithPool();
                Statement stmt = conn.createStatement()) {

            rs = stmt.executeQuery(selectObjectString);

            if (!rs.isBeforeFirst()) {

                selectObjectString =
                        "SELECT o.OBJECT_ID, o.PARENT_ID, o.OBJECT_NAME " +
                                "FROM OBJECTS o " +
                                "WHERE o.OBJECT_TYPE_ID = " + object_id;

                rs = stmt.executeQuery(selectObjectString);

                hasParams = false;
            }

            while (rs.next()) {

                objectParams.put(1, rs.getString(3));

                if (rs.getObject(2) != null) {
                    objectParams.put(2, rs.getInt(2));
                } else {
                    objectParams.put(2, 0);
                }

                if (hasParams) {

                    if (rs.getInt(5) != 0) {
                        objectParams.put(rs.getInt(4), rs.getInt(5));
                    }
                    if (rs.getString(6) != null) {
                        objectParams.put(rs.getInt(4), rs.getString(6));
                    }
                    if (rs.getDate(7) != null) {
                        objectParams.put(rs.getInt(4), rs.getDate(7));
                    }
                }
            }

            return objectParams;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return objectParams;
    }

    public static LinkedHashMap<Long, LinkedHashMap<Integer, Object>> getObjects(int object_type_id) {

        String selectObjectString =
                "SELECT o.OBJECT_ID, o.PARENT_ID, o.OBJECT_NAME, a.ATTR_ID, p.NUMBER_VALUE, p.TEXT_VALUE, p.DATE_VALUE " +
                        "FROM OBJECTS o " +
                        "INNER  JOIN PARAMS p ON p.OBJECT_ID = o.OBJECT_ID " +
                        "INNER JOIN ATTR a ON a.ATTR_ID = p.ATTR_ID " +
                        "WHERE o.OBJECT_TYPE_ID = " + object_type_id;

        ResultSet rs;

        boolean hasParams = true;

        Long id = 0L;

        LinkedHashMap<Long, LinkedHashMap<Integer, Object>> objects = new LinkedHashMap<>();
        LinkedHashMap<Integer, Object> objectParams = new LinkedHashMap<>();

        try (
                Connection conn = JdbcDAOFactory.createConnectionWithPool();
                Statement stmt = conn.createStatement()) {

            rs = stmt.executeQuery(selectObjectString);

            if (!rs.isBeforeFirst()) {

                selectObjectString =
                        "SELECT o.OBJECT_ID, o.PARENT_ID, o.OBJECT_NAME " +
                                "FROM OBJECTS o " +
                                "WHERE o.OBJECT_TYPE_ID = " + object_type_id;

                rs = stmt.executeQuery(selectObjectString);

                hasParams = false;
            }

            while (rs.next()) {

                if (rs.getLong(1) == id) {
                    objects.put(id, objectParams);
                } else {
                    id = rs.getLong(1);
                    objectParams = new LinkedHashMap<>();
                    objects.put(id, objectParams);
                }

                objectParams.put(1, rs.getString(3));

                if (rs.getObject(2) != null) {
                    objectParams.put(2, rs.getInt(2));
                } else {
                    objectParams.put(2, 0);
                }

                if (hasParams) {

                    if (rs.getInt(5) != 0) {
                        objectParams.put(rs.getInt(4), rs.getInt(5));
                    }
                    if (rs.getString(6) != null) {
                        objectParams.put(rs.getInt(4), rs.getString(6));
                    }
                    if (rs.getDate(7) != null) {
                        objectParams.put(rs.getInt(4), rs.getDate(7));
                    }
                }
            }

            return objects;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return objects;
    }


}
