package com.vv0rkman.entity;

import java.util.LinkedHashMap;
import java.util.Map;

public class Customer extends Entity {

    public Customer(){}

    public Customer(Long id, int parent_id, String name) {
        super(id, parent_id, name);
    }

    public Customer(int parent_id, String name) {
        super(parent_id, name);
    }

    public void setData(LinkedHashMap params) {

        for (Object aParamsSet : params.entrySet()) {

            Map.Entry paramEntry = (Map.Entry) aParamsSet;

            if (paramEntry.getKey().equals(NAME)) {

                setName(paramEntry.getValue().toString());

            }
        }
    }

    @Override
    public String toString() {
        return "Customer [id = " + id + ", name = " + name + "]";
    }

}
