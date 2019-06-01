package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class NameDetails_Name {
    private Integer ID;
    private Integer NAMEDETAILS_ID;
    private String NAMETYPE;
    private NameDetails_NameValue nameDetails_nameValue;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public NameDetails_NameValue getNameDetails_nameValue() {
        return nameDetails_nameValue;
    }

    public void setNameDetails_nameValue(NameDetails_NameValue nameDetails_nameValue) {
        this.nameDetails_nameValue = nameDetails_nameValue;
    }

    public Integer getNAMEDETAILS_ID() {
        return NAMEDETAILS_ID;
    }

    public void setNAMEDETAILS_ID(Integer NAMEDETAILS_ID) {
        this.NAMEDETAILS_ID = NAMEDETAILS_ID;
    }

    public String getNAMETYPE() {
        return NAMETYPE;
    }

    public void setNAMETYPE(String NAMETYPE) {
        this.NAMETYPE = NAMETYPE;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
