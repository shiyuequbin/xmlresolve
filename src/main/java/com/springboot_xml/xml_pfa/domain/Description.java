package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

public class Description {
    private Integer ID;
    private Integer DESCS_ID;
    private String DESCRIPTION_DESCRIPTION1;
    private String DESCRIPTION_DESCRIPTION2;
    private String DESCRIPTION_DESCRIPTION3;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDESCS_ID() {
        return DESCS_ID;
    }

    public void setDESCS_ID(Integer DESCS_ID) {
        this.DESCS_ID = DESCS_ID;
    }

    public String getDESCRIPTION_DESCRIPTION1() {
        return DESCRIPTION_DESCRIPTION1;
    }

    public void setDESCRIPTION_DESCRIPTION1(String DESCRIPTION_DESCRIPTION1) {
        this.DESCRIPTION_DESCRIPTION1 = DESCRIPTION_DESCRIPTION1;
    }

    public String getDESCRIPTION_DESCRIPTION2() {
        return DESCRIPTION_DESCRIPTION2;
    }

    public void setDESCRIPTION_DESCRIPTION2(String DESCRIPTION_DESCRIPTION2) {
        this.DESCRIPTION_DESCRIPTION2 = DESCRIPTION_DESCRIPTION2;
    }

    public String getDESCRIPTION_DESCRIPTION3() {
        return DESCRIPTION_DESCRIPTION3;
    }

    public void setDESCRIPTION_DESCRIPTION3(String DESCRIPTION_DESCRIPTION3) {
        this.DESCRIPTION_DESCRIPTION3 = DESCRIPTION_DESCRIPTION3;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
