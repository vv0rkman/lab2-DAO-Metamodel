package com.vv0rkman.dboperations;

import com.vv0rkman.dao.impl.jdbc.JdbcDAOFactory;
import com.vv0rkman.entity.Entity;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class CRUD {

    protected static int createObject(Entity entity, int object_type_id) {
        String insertObjString =
                "INSERT INTO OBJECTS (object_id, parent_id, object_name, object_type_id) " +
                        "SELECT ?, ?, ?, ? " +
                        "FROM DUAL " +
                        "WHERE NOT EXISTS (" +
                        "    SELECT OBJECTS.OBJECT_ID " +
                        "    FROM OBJECTS " +
                        "    WHERE OBJECTS.OBJECT_ID = ?" +
                        ")";

        try (
                Connection conn = JdbcDAOFactory.createConnectionWithPool();
                PreparedStatement stmt = conn.prepareStatement(insertObjString)) {

            stmt.setInt(1, entity.getId());
            stmt.setInt(5, entity.getId());

            if (entity.getParent_id() == 0) {
                stmt.setNull(2, Types.INTEGER);
            } else{
                stmt.setInt(2, entity.getParent_id());
            }

            stmt.setString(3, entity.getName());

            stmt.setInt(4, object_type_id);

            return stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    protected static int deleteObject(int object_id) {
        String deleteObjString = "DELETE FROM OBJECTS WHERE OBJECT_ID = ?";

        try (
                Connection conn = JdbcDAOFactory.createConnectionWithPool();
                PreparedStatement stmt = conn.prepareStatement(deleteObjString)) {

            stmt.setInt(1, object_id);

            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    protected static int setParams(int object_id, LinkedHashMap<Integer, Object> preparedData, boolean insert) {
        String paramsString;

        if (insert) {
            paramsString =
                    "INSERT INTO PARAMS (text_value, number_value, date_value, attr_id, object_id) VALUES (?,?,?,?,?)";
        } else {
            paramsString =
                    "UPDATE PARAMS SET text_value = ?, number_value = ?, date_value = ?, attr_id = ? WHERE OBJECT_ID = ?";
        }

        int count = 0;

        try (
                Connection conn = JdbcDAOFactory.createConnectionWithPool();
                PreparedStatement stmt = conn.prepareStatement(paramsString)) {

            stmt.setInt(5, object_id);

            for (Map.Entry<Integer, Object> data : preparedData.entrySet()) {

                if (data.getValue() instanceof String) {
                    stmt.setString(1, data.getValue().toString());
                    stmt.setNull(2, Types.INTEGER);
                    stmt.setNull(3, Types.DATE);
                } else if (data.getValue() instanceof Integer) {
                    stmt.setInt(2, ((Integer) (data.getValue())));
                    stmt.setNull(1, Types.VARCHAR);
                    stmt.setNull(3, Types.DATE);
                } else if (data.getValue() instanceof java.util.Date) {
                    stmt.setDate(3, new Date(((java.util.Date) data.getValue()).getTime()));
                    stmt.setNull(2, Types.INTEGER);
                    stmt.setNull(1, Types.VARCHAR);
                }

                stmt.setInt(4, data.getKey());

                stmt.executeUpdate();
                count++;
            }
            return count;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    protected static int updateObject(Entity entity) {
        String updateObjectString = "UPDATE OBJECTS SET object_name = ?, parent_id = ? WHERE OBJECT_ID = ?";

        try (
                Connection conn = JdbcDAOFactory.createConnectionWithPool();
                PreparedStatement stmt = conn.prepareStatement(updateObjectString)) {

            stmt.setString(1, entity.getName());

            if (entity.getParent_id() == 0) {
                stmt.setNull(2, Types.INTEGER);
            } else{
                stmt.setInt(2, entity.getParent_id());
            }

            stmt.setInt(3, entity.getId());

            return stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

//    protected static int updateParams(LinkedHashMap<Integer, Object> preparedData, int object_id) {
//        String updateParamsString =
//                "UPDATE PARAMS SET text_value = ?, number_value = ?, date_value = ?, attr_id = ?, object_id = ?";
//
//        int count = 0;
//
//        try (
//                Connection conn = JdbcDAOFactory.createConnectionWithPool();
//                PreparedStatement stmt = conn.prepareStatement(updateParamsString)) {
//
//            stmt.setInt(5, object_id);
//
//            for (Map.Entry<Integer, Object> prpdData : preparedData.entrySet()) {
//
//                if (prpdData.getValue() instanceof String) {
//                    stmt.setString(1, prpdData.getValue().toString());
//                    stmt.setNull(2, Types.INTEGER);
//                    stmt.setNull(3, Types.DATE);
//                } else if (prpdData.getValue() instanceof Integer) {
//                    stmt.setInt(2, ((Integer) (prpdData.getValue())));
//                    stmt.setNull(1, Types.VARCHAR);
//                    stmt.setNull(3, Types.DATE);
//                } else if (prpdData.getValue() instanceof java.util.Date) {
//                    stmt.setDate(3, new Date(((java.util.Date) prpdData.getValue()).getTime()));
//                    stmt.setNull(2, Types.INTEGER);
//                    stmt.setNull(1, Types.VARCHAR);
//                }
//
//                stmt.setInt(4, prpdData.getKey());
//
//                stmt.executeUpdate();
//                count++;
//            }
//            return count;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return count;
//    }
}
