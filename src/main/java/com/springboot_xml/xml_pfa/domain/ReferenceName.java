package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class ReferenceName {
    private Integer ID;
    private Integer PFA_ID;
    private String REFERENCENAME_CODE;
    private String REFERENCENAME_NAME;
    private String REFERENCENAME_STATUS;
    private String REFERENCENAME_DESCRIPTION2ID;
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

    public String getREFERENCENAME_CODE() {
        return REFERENCENAME_CODE;
    }

    public void setREFERENCENAME_CODE(String REFERENCENAME_CODE) {
        this.REFERENCENAME_CODE = REFERENCENAME_CODE;
    }

    public String getREFERENCENAME_NAME() {
        return REFERENCENAME_NAME;
    }

    public void setREFERENCENAME_NAME(String REFERENCENAME_NAME) {
        this.REFERENCENAME_NAME = REFERENCENAME_NAME;
    }

    public String getREFERENCENAME_STATUS() {
        return REFERENCENAME_STATUS;
    }

    public void setREFERENCENAME_STATUS(String REFERENCENAME_STATUS) {
        this.REFERENCENAME_STATUS = REFERENCENAME_STATUS;
    }

    public String getREFERENCENAME_DESCRIPTION2ID() {
        return REFERENCENAME_DESCRIPTION2ID;
    }

    public void setREFERENCENAME_DESCRIPTION2ID(String REFERENCENAME_DESCRIPTION2ID) {
        this.REFERENCENAME_DESCRIPTION2ID = REFERENCENAME_DESCRIPTION2ID;
    }

    public ReferenceName(Integer PFA_ID, String REFERENCENAME_CODE, String REFERENCENAME_NAME, String REFERENCENAME_STATUS, String REFERENCENAME_DESCRIPTION2ID) {

        this.PFA_ID = PFA_ID;
        this.REFERENCENAME_CODE = REFERENCENAME_CODE;
        this.REFERENCENAME_NAME = REFERENCENAME_NAME;
        this.REFERENCENAME_STATUS = REFERENCENAME_STATUS;
        this.REFERENCENAME_DESCRIPTION2ID = REFERENCENAME_DESCRIPTION2ID;
    }

    public ReferenceName() {

    }

    @Override
    public String toString() {
        return "ReferenceName{" +
                "PFA_ID=" + PFA_ID +
                ", REFERENCENAME_CODE='" + REFERENCENAME_CODE + '\'' +
                ", REFERENCENAME_NAME='" + REFERENCENAME_NAME + '\'' +
                ", REFERENCENAME_STATUS='" + REFERENCENAME_STATUS + '\'' +
                ", REFERENCENAME_DESCRIPTION2ID='" + REFERENCENAME_DESCRIPTION2ID + '\'' +
                '}';
    }
}
