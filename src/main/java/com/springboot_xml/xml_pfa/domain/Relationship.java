package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class Relationship {
    private Integer ID;
    private Integer PFA_ID;
    private String  RELATIONSHIP_CODE;
    private String  RELATIONSHIP_NAME;
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

    public Relationship() {
    }

    public Integer getPFA_ID() {
        return PFA_ID;
    }

    public void setPFA_ID(Integer PFA_ID) {
        this.PFA_ID = PFA_ID;
    }

    public String getRELATIONSHIP_CODE() {
        return RELATIONSHIP_CODE;
    }

    public void setRELATIONSHIP_CODE(String RELATIONSHIP_CODE) {
        this.RELATIONSHIP_CODE = RELATIONSHIP_CODE;
    }

    public String getRELATIONSHIP_NAME() {
        return RELATIONSHIP_NAME;
    }

    public void setRELATIONSHIP_NAME(String RELATIONSHIP_NAME) {
        this.RELATIONSHIP_NAME = RELATIONSHIP_NAME;
    }

    public Relationship(Integer PFA_ID, String RELATIONSHIP_CODE, String RELATIONSHIP_NAME) {

        this.PFA_ID = PFA_ID;
        this.RELATIONSHIP_CODE = RELATIONSHIP_CODE;
        this.RELATIONSHIP_NAME = RELATIONSHIP_NAME;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "PFA_ID=" + PFA_ID +
                ", RELATIONSHIP_CODE='" + RELATIONSHIP_CODE + '\'' +
                ", RELATIONSHIP_NAME='" + RELATIONSHIP_NAME + '\'' +
                '}';
    }
}
