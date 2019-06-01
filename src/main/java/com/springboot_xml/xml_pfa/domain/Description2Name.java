package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class Description2Name {
    private Integer ID;
    private Integer PFA_ID;
    private String DESCRIPTION2ID;
    private String DESCRIPTION1ID;
    private String DESCRIPTION2NAMEVALUE;
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

    public String getDESCRIPTION2ID() {
        return DESCRIPTION2ID;
    }

    public void setDESCRIPTION2ID(String DESCRIPTION2ID) {
        this.DESCRIPTION2ID = DESCRIPTION2ID;
    }

    public String getDESCRIPTION1ID() {
        return DESCRIPTION1ID;
    }

    public void setDESCRIPTION1ID(String DESCRIPTION1ID) {
        this.DESCRIPTION1ID = DESCRIPTION1ID;
    }

    public String getDESCRIPTION2NAMEVALUE() {
        return DESCRIPTION2NAMEVALUE;
    }

    public void setDESCRIPTION2NAMEVALUE(String DESCRIPTION2NAMEVALUE) {
        this.DESCRIPTION2NAMEVALUE = DESCRIPTION2NAMEVALUE;
    }

    public Description2Name(Integer PFA_ID, String DESCRIPTION2ID, String DESCRIPTION1ID, String DESCRIPTION2NAMEVALUE) {

        this.PFA_ID = PFA_ID;
        this.DESCRIPTION2ID = DESCRIPTION2ID;
        this.DESCRIPTION1ID = DESCRIPTION1ID;
        this.DESCRIPTION2NAMEVALUE = DESCRIPTION2NAMEVALUE;
    }

    public Description2Name() {

    }

    @Override
    public String toString() {
        return "Description2Name{" +
                "PFA_ID=" + PFA_ID +
                ", DESCRIPTION2ID='" + DESCRIPTION2ID + '\'' +
                ", DESCRIPTION1ID='" + DESCRIPTION1ID + '\'' +
                ", DESCRIPTION2NAMEVALUE='" + DESCRIPTION2NAMEVALUE + '\'' +
                '}';
    }
}
