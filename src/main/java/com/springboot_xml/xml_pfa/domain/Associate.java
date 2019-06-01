package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

public class Associate {
    private Integer ID;
    private Integer PF_ID;
    private Integer SE_ID;
    private String ASSOCIATE_ID;
    private String ASSOCIATE_CODE;
    private String ASSOCIATE_EX;
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

    @Override
    public String toString() {
        return "Associate{" +
                "PF_ID=" + PF_ID +
                ", SE_ID=" + SE_ID +
                ", ASSOCIATE_ID='" + ASSOCIATE_ID + '\'' +
                ", ASSOCIATE_CODE='" + ASSOCIATE_CODE + '\'' +
                ", ASSOCIATE_EX='" + ASSOCIATE_EX + '\'' +
                '}';
    }

    public Integer getPF_ID() {
        return PF_ID;
    }

    public void setPF_ID(Integer PF_ID) {
        this.PF_ID = PF_ID;
    }

    public Integer getSE_ID() {
        return SE_ID;
    }

    public void setSE_ID(Integer SE_ID) {
        this.SE_ID = SE_ID;
    }

    public String getASSOCIATE_ID() {
        return ASSOCIATE_ID;
    }

    public void setASSOCIATE_ID(String ASSOCIATE_ID) {
        this.ASSOCIATE_ID = ASSOCIATE_ID;
    }

    public String getASSOCIATE_CODE() {
        return ASSOCIATE_CODE;
    }

    public void setASSOCIATE_CODE(String ASSOCIATE_CODE) {
        this.ASSOCIATE_CODE = ASSOCIATE_CODE;
    }

    public String getASSOCIATE_EX() {
        return ASSOCIATE_EX;
    }

    public void setASSOCIATE_EX(String ASSOCIATE_EX) {
        this.ASSOCIATE_EX = ASSOCIATE_EX;
    }
}
