package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class IDNumberTypes_ID {
    private Integer ID;
    private Integer IDNUMBERTYPES_ID;
    private IDValue idValue;
    private String ID_IDTYPE;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public IDValue getIdValue() {
        return idValue;
    }

    public void setIdValue(IDValue idValue) {
        this.idValue = idValue;
    }

    public Integer getIDNUMBERTYPES_ID() {
        return IDNUMBERTYPES_ID;
    }

    public void setIDNUMBERTYPES_ID(Integer IDNUMBERTYPES_ID) {
        this.IDNUMBERTYPES_ID = IDNUMBERTYPES_ID;
    }

    public String getID_IDTYPE() {
        return ID_IDTYPE;
    }

    public void setID_IDTYPE(String ID_IDTYPE) {
        this.ID_IDTYPE = ID_IDTYPE;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
