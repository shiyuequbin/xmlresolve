package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

public class DateType {
    private  Integer ID;
    private Integer PFA_ID;
    private String DATETYPE_RECORDTYPE;
    private String DATETYPE_ID;
    private String DATETYPE_NAME;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Integer getPFA_ID() {
        return PFA_ID;
    }

    public void setPFA_ID(Integer PFA_ID) {
        this.PFA_ID = PFA_ID;
    }

    public String getDATETYPE_RECORDTYPE() {
        return DATETYPE_RECORDTYPE;
    }

    public void setDATETYPE_RECORDTYPE(String DATETYPE_RECORDTYPE) {
        this.DATETYPE_RECORDTYPE = DATETYPE_RECORDTYPE;
    }

    public String getDATETYPE_ID() {
        return DATETYPE_ID;
    }

    public void setDATETYPE_ID(String DATETYPE_ID) {
        this.DATETYPE_ID = DATETYPE_ID;
    }

    public String getDATETYPE_NAME() {
        return DATETYPE_NAME;
    }

    public void setDATETYPE_NAME(String DATETYPE_NAME) {
        this.DATETYPE_NAME = DATETYPE_NAME;
    }

    public DateType(Integer PFA_ID, String DATETYPE_RECORDTYPE, String DATETYPE_ID, String DATETYPE_NAME) {

        this.PFA_ID = PFA_ID;
        this.DATETYPE_RECORDTYPE = DATETYPE_RECORDTYPE;
        this.DATETYPE_ID = DATETYPE_ID;
        this.DATETYPE_NAME = DATETYPE_NAME;
    }

    public DateType() {

    }

    @Override
    public String toString() {
        return "DateType{" +
                "PFA_ID=" + PFA_ID +
                ", DATETYPE_RECORDTYPE='" + DATETYPE_RECORDTYPE + '\'' +
                ", DATETYPE_ID='" + DATETYPE_ID + '\'' +
                ", DATETYPE_NAME='" + DATETYPE_NAME + '\'' +
                '}';
    }
}
