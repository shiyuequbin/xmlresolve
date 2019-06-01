package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class DateValue {
    private Integer ID;
    private Integer DATE_ID;
    private String DATEVALUE_DAY;
    private String DATEVALUE_MONTH;
    private String DATEVALUE_YEAR;
    private String DATEVALUE_DNOTES;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDATE_ID() {
        return DATE_ID;
    }

    public void setDATE_ID(Integer DATE_ID) {
        this.DATE_ID = DATE_ID;
    }

    public String getDATEVALUE_DAY() {
        return DATEVALUE_DAY;
    }

    public void setDATEVALUE_DAY(String DATEVALUE_DAY) {
        this.DATEVALUE_DAY = DATEVALUE_DAY;
    }

    public String getDATEVALUE_MONTH() {
        return DATEVALUE_MONTH;
    }

    public void setDATEVALUE_MONTH(String DATEVALUE_MONTH) {
        this.DATEVALUE_MONTH = DATEVALUE_MONTH;
    }

    public String getDATEVALUE_YEAR() {
        return DATEVALUE_YEAR;
    }

    public void setDATEVALUE_YEAR(String DATEVALUE_YEAR) {
        this.DATEVALUE_YEAR = DATEVALUE_YEAR;
    }

    public String getDATEVALUE_DNOTES() {
        return DATEVALUE_DNOTES;
    }

    public void setDATEVALUE_DNOTES(String DATEVALUE_DNOTES) {
        this.DATEVALUE_DNOTES = DATEVALUE_DNOTES;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {

        this.insertDate = insertDate;
    }

    @Override
    public String toString() {
        return "DateValue{" +
                "ID=" + ID +
                ", DATE_ID=" + DATE_ID +
                ", DATEVALUE_DAY='" + DATEVALUE_DAY + '\'' +
                ", DATEVALUE_MONTH='" + DATEVALUE_MONTH + '\'' +
                ", DATEVALUE_YEAR='" + DATEVALUE_YEAR + '\'' +
                ", DATEVALUE_DNOTES='" + DATEVALUE_DNOTES + '\'' +
                ", insertDate=" + insertDate +
                '}';
    }
}
