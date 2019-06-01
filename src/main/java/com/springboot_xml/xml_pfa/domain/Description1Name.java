package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

public class Description1Name {
    private Integer ID;
    private Integer PFA_ID;
    private String DESCRIPTION1ID;
    private String RECORDTYPE;
    private String DESCRIPTION1NAMEVALUE;
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

    public String getDESCRIPTION1ID() {
        return DESCRIPTION1ID;
    }

    public void setDESCRIPTION1ID(String DESCRIPTION1ID) {
        this.DESCRIPTION1ID = DESCRIPTION1ID;
    }

    public String getRECORDTYPE() {
        return RECORDTYPE;
    }

    public void setRECORDTYPE(String RECORDTYPE) {
        this.RECORDTYPE = RECORDTYPE;
    }

    public String getDESCRIPTION1NAMEVALUE() {
        return DESCRIPTION1NAMEVALUE;
    }

    public void setDESCRIPTION1NAMEVALUE(String DESCRIPTION1NAMEVALUE) {
        this.DESCRIPTION1NAMEVALUE = DESCRIPTION1NAMEVALUE;
    }

    public Description1Name(Integer PFA_ID, String DESCRIPTION1ID, String RECORDTYPE, String DESCRIPTION1NAMEVALUE) {

        this.PFA_ID = PFA_ID;
        this.DESCRIPTION1ID = DESCRIPTION1ID;
        this.RECORDTYPE = RECORDTYPE;
        this.DESCRIPTION1NAMEVALUE = DESCRIPTION1NAMEVALUE;
    }

    public Description1Name() {

    }

    @Override
    public String toString() {
        return "Description1Name{" +
                "PFA_ID=" + PFA_ID +
                ", DESCRIPTION1ID='" + DESCRIPTION1ID + '\'' +
                ", RECORDTYPE='" + RECORDTYPE + '\'' +
                ", DESCRIPTION1NAMEVALUE='" + DESCRIPTION1NAMEVALUE + '\'' +
                '}';
    }
}
