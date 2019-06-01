package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class Occupation {
    private Integer ID;
    private Integer PFA_ID;
    private String  OCCUPATION_CODE;
    private String  OCCUPATION_NAME;
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

    public Occupation() {
    }

    public Occupation(Integer PFA_ID, String OCCUPATION_CODE, String OCCUPATION_NAME) {
        this.PFA_ID = PFA_ID;
        this.OCCUPATION_CODE = OCCUPATION_CODE;
        this.OCCUPATION_NAME = OCCUPATION_NAME;
    }

    public Integer getPFA_ID() {
        return PFA_ID;
    }

    public void setPFA_ID(Integer PFA_ID) {
        this.PFA_ID = PFA_ID;
    }

    public String getOCCUPATION_CODE() {
        return OCCUPATION_CODE;
    }

    public void setOCCUPATION_CODE(String OCCUPATION_CODE) {
        this.OCCUPATION_CODE = OCCUPATION_CODE;
    }

    public String getOCCUPATION_NAME() {
        return OCCUPATION_NAME;
    }

    public void setOCCUPATION_NAME(String OCCUPATION_NAME) {
        this.OCCUPATION_NAME = OCCUPATION_NAME;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "PFA_ID=" + PFA_ID +
                ", OCCUPATION_CODE='" + OCCUPATION_CODE + '\'' +
                ", OCCUPATION_NAME='" + OCCUPATION_NAME + '\'' +
                '}';
    }
}
