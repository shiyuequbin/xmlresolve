package com.springboot_xml.xml_pfa.domain;


import java.util.List;

public class Person_Date {
    private Integer ID;
    private Integer DATEDETAILS_ID;
    private String DATE_DATETYPE;
    private List<DateValue> dateValues;
    private java.util.Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<DateValue> getDateValues() {
        return dateValues;
    }

    public void setDateValues(List<DateValue> dateValues) {
        this.dateValues = dateValues;
    }

    public Integer getDATEDETAILS_ID() {
        return DATEDETAILS_ID;
    }

    public void setDATEDETAILS_ID(Integer DATEDETAILS_ID) {
        this.DATEDETAILS_ID = DATEDETAILS_ID;
    }

    public String getDATE_DATETYPE() {
        return DATE_DATETYPE;
    }

    public void setDATE_DATETYPE(String DATE_DATETYPE) {
        this.DATE_DATETYPE = DATE_DATETYPE;
    }

    public java.util.Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(java.util.Date insertDate) {
        this.insertDate = insertDate;
    }
}
