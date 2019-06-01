package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class Description3Name {
    private Integer ID;
    private Integer PFA_ID;
    private String DESCRIPTION3ID;
    private String DESCRIPTION2ID;
    private String DESCRIPTION3NAMEVALUE;
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

    public String getDESCRIPTION3ID() {
        return DESCRIPTION3ID;
    }

    public void setDESCRIPTION3ID(String DESCRIPTION3ID) {
        this.DESCRIPTION3ID = DESCRIPTION3ID;
    }

    public String getDESCRIPTION2ID() {
        return DESCRIPTION2ID;
    }

    public void setDESCRIPTION2ID(String DESCRIPTION2ID) {
        this.DESCRIPTION2ID = DESCRIPTION2ID;
    }

    public String getDESCRIPTION3NAMEVALUE() {
        return DESCRIPTION3NAMEVALUE;
    }

    public void setDESCRIPTION3NAMEVALUE(String DESCRIPTION3NAMEVALUE) {
        this.DESCRIPTION3NAMEVALUE = DESCRIPTION3NAMEVALUE;
    }

    public Description3Name(Integer PFA_ID, String DESCRIPTION3ID, String DESCRIPTION2ID, String DESCRIPTION3NAMEVALUE) {

        this.PFA_ID = PFA_ID;
        this.DESCRIPTION3ID = DESCRIPTION3ID;
        this.DESCRIPTION2ID = DESCRIPTION2ID;
        this.DESCRIPTION3NAMEVALUE = DESCRIPTION3NAMEVALUE;
    }

    public Description3Name() {

    }

    @Override
    public String toString() {
        return "Description3Name{" +
                "PFA_ID=" + PFA_ID +
                ", DESCRIPTION3ID='" + DESCRIPTION3ID + '\'' +
                ", DESCRIPTION2ID='" + DESCRIPTION2ID + '\'' +
                ", DESCRIPTION3NAMEVALUE='" + DESCRIPTION3NAMEVALUE + '\'' +
                '}';
    }
}
