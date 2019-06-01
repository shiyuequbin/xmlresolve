package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class RoleType {
    private Integer ID;
    private Integer PFA_ID;
    private String ROLETYPE_ID;
    private String ROLETYPE_NAME;
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

    public String getROLETYPE_ID() {
        return ROLETYPE_ID;
    }

    public void setROLETYPE_ID(String ROLETYPE_ID) {
        this.ROLETYPE_ID = ROLETYPE_ID;
    }

    public String getROLETYPE_NAME() {
        return ROLETYPE_NAME;
    }

    public void setROLETYPE_NAME(String ROLETYPE_NAME) {
        this.ROLETYPE_NAME = ROLETYPE_NAME;
    }

    public RoleType(Integer PFA_ID, String ROLETYPE_ID, String ROLETYPE_NAME) {

        this.PFA_ID = PFA_ID;
        this.ROLETYPE_ID = ROLETYPE_ID;
        this.ROLETYPE_NAME = ROLETYPE_NAME;
    }

    public RoleType() {

    }

    @Override
    public String toString() {
        return "RoleType{" +
                "PFA_ID=" + PFA_ID +
                ", ROLETYPE_ID='" + ROLETYPE_ID + '\'' +
                ", ROLETYPE_NAME='" + ROLETYPE_NAME + '\'' +
                '}';
    }
}
