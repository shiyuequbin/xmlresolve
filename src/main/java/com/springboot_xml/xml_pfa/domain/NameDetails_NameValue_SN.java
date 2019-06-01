package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class NameDetails_NameValue_SN {
    private Integer ID;
    private Integer NAMEVALUE_ID;
    private String NAMEVALUE_SINGLESTRINGNAME;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getNAMEVALUE_ID() {
        return NAMEVALUE_ID;
    }

    public void setNAMEVALUE_ID(Integer NAMEVALUE_ID) {
        this.NAMEVALUE_ID = NAMEVALUE_ID;
    }

    public String getNAMEVALUE_SINGLESTRINGNAME() {
        return NAMEVALUE_SINGLESTRINGNAME;
    }

    public void setNAMEVALUE_SINGLESTRINGNAME(String NAMEVALUE_SINGLESTRINGNAME) {
        this.NAMEVALUE_SINGLESTRINGNAME = NAMEVALUE_SINGLESTRINGNAME;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
