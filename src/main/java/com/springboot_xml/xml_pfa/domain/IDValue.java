package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class IDValue {
    private Integer ID;
    private Integer ID_ID;
    //private Blob IDVALUE_IDNOTES;
    private byte[] IDVALUE_IDNOTES;
    private String IDVALUE_IDVALUEVALUE;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID_ID() {
        return ID_ID;
    }

    public void setID_ID(Integer ID_ID) {
        this.ID_ID = ID_ID;
    }

    public byte[] getIDVALUE_IDNOTES() {
        return IDVALUE_IDNOTES;
    }

    public void setIDVALUE_IDNOTES(byte[] IDVALUE_IDNOTES) {
        this.IDVALUE_IDNOTES = IDVALUE_IDNOTES;
    }

    public String getIDVALUE_IDVALUEVALUE() {
        return IDVALUE_IDVALUEVALUE;
    }

    public void setIDVALUE_IDVALUEVALUE(String IDVALUE_IDVALUEVALUE) {
        this.IDVALUE_IDVALUEVALUE = IDVALUE_IDVALUEVALUE;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
