package com.vv0rkman.entity;

import com.vv0rkman.service.Tools;

import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Project extends Entity {

    private long id_cust;
    private Date start_Date;
    private Date end_Date;

    public Project() {

    }

    public Project(String name, long id_cust, Date start_Date, Date end_Date) {

        super(Tools.generateID(), id_cust, name);

        this.id_cust = id_cust;

        this.start_Date = start_Date;

        this.end_Date = end_Date;

    }

    public Project(long id, String name, long id_cust, Date start_Date, Date end_Date) {

        super(id, id_cust, name);

        this.id_cust = id_cust;

        this.start_Date = start_Date;

        this.end_Date = end_Date;
    }

    public long getId_cust() {
        return id_cust;
    }

    public void setId_cust(long id_cust) {
        this.id_cust = id_cust;
    }

    public Date getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(Date start_Date) {
        this.start_Date = start_Date;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(Date end_Date) {
        this.end_Date = end_Date;
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

                setId_cust((Long) paramEntry.getValue());

            } else if (paramEntry.getKey().equals(3)) {

                setStart_Date((Date) paramEntry.getValue());

            } else if (paramEntry.getKey().equals(4)) {

                setEnd_Date((Date) paramEntry.getValue());
            }
        }
    }
}
