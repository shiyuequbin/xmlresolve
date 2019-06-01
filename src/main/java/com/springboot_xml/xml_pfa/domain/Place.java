package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class Place {
    private Integer ID;
    private Integer P_ID;
    private String PLACE_NAME;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getP_ID() {
        return P_ID;
    }

    public void setP_ID(Integer p_ID) {
        P_ID = p_ID;
    }

    public String getPLACE_NAME() {
        return PLACE_NAME;
    }

    public void setPLACE_NAME(String PLACE_NAME) {
        this.PLACE_NAME = PLACE_NAME;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
