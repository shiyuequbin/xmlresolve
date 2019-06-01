package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class NameDetails_NameValue_ON {
    private Integer ID;
    private Integer NAMEVALUE_ID;
    private String NAMEVALUE_ORIGINALSCRIPTNAME;
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

    public Integer getNAMEVALUE_ID() {
        return NAMEVALUE_ID;
    }

    public void setNAMEVALUE_ID(Integer NAMEVALUE_ID) {
        this.NAMEVALUE_ID = NAMEVALUE_ID;
    }

    public String getNAMEVALUE_ORIGINALSCRIPTNAME() {
        return NAMEVALUE_ORIGINALSCRIPTNAME;
    }

    public void setNAMEVALUE_ORIGINALSCRIPTNAME(String NAMEVALUE_ORIGINALSCRIPTNAME) {
        this.NAMEVALUE_ORIGINALSCRIPTNAME = NAMEVALUE_ORIGINALSCRIPTNAME;
    }

    @Override
    public String toString() {
        return "NameDetails_NameValue_ON{" +
                "ID=" + ID +
                ", NAMEVALUE_ID=" + NAMEVALUE_ID +
                ", NAMEVALUE_ORIGINALSCRIPTNAME='" + NAMEVALUE_ORIGINALSCRIPTNAME + '\'' +
                ", insertDate=" + insertDate +
                '}';
    }
}
