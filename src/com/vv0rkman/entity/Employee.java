package com.vv0rkman.entity;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee extends Entity {

    private int manager;
    private int id_dept;
    private int salary;

    public Employee(){}

    public Employee(int id, String name, int salary, int manager, int id_dept) {
        super(id, id_dept, name);

        this.manager = manager;
        this.salary = salary;
        this.id_dept = id_dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public int getId_dept() {
        return id_dept;
    }

    public void setId_dept(int id_dept) {
        this.id_dept = id_dept;
        this.parent_id = id_dept;
    }


    /**
     * @param params
     * key == attr_id
     * value == params.value
     */
    public void setData(LinkedHashMap params) {

        for (Object aParamsSet : params.entrySet()) {

            Map.Entry paramEntry = (Map.Entry) aParamsSet;

            if (paramEntry.getKey().equals(NAME)) {

                setName(paramEntry.getValue().toString());

            } else if (paramEntry.getKey().equals(PARENT_ID)) {

                setId_dept((Integer) paramEntry.getValue());

            } else if (paramEntry.getKey().equals(12)) {

                setManager((Integer) paramEntry.getValue());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee [id = " + id + ", Name: " + name + ", Department: " + id_dept +
                " , Manager ID: " + manager + "]";
    }
}
