package com.vv0rkman.service;

import com.vv0rkman.entity.Entity;

import java.lang.Object;
import java.text.SimpleDateFormat;
import java.util.*;

public interface Tools {

    static Long generateID() {

        Date dNow = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmss");

        String datetime = ft.format(dNow);

        Random randomNumber = new Random();

        datetime += randomNumber.nextInt(1000 - 100 + 1 ) + 100;

        Long id = new Long(datetime);

        return id;
    }

    LinkedHashMap<Integer, Object> prepareData(Entity entity, int object_type_id);


    /**
     * objectParams.key => attr_name
     * objectParams.value => attr_value
     * attr.value => attr_name
     * attr.key => attr.id
     *
     * @param objectParams
     */
    static LinkedHashMap<Integer, Object> prepareData(LinkedHashMap<Integer, Object> attr,
                                                      LinkedHashMap<Integer, Object> objectParams) {

        LinkedHashMap<Integer, Object> result = new LinkedHashMap<>();

        for (Map.Entry<Integer, Object> empData : objectParams.entrySet()) {

            for (Map.Entry<Integer, Object> attrData : attr.entrySet()) {

                if (empData.getKey().equals(attrData.getKey())) {

                    result.put(attrData.getKey(), empData.getValue());
                }
            }
        }

        return result;
    }
}