package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class CountryName {

    private  Integer ID;
    private Integer PFA_ID;
    private String COUNTRYNAME_CODE;
    private String COUNTRYNAME_NAME;
    private String COUNTRYNAME_ISTERRITORY;
    private String COUNTRYNAME_PROFILEURL;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getPFA_ID() {
        return PFA_ID;
    }

    public void setPFA_ID(Integer PFA_ID) {
        this.PFA_ID = PFA_ID;
    }

    public String getCOUNTRYNAME_CODE() {
        return COUNTRYNAME_CODE;
    }

    public void setCOUNTRYNAME_CODE(String COUNTRYNAME_CODE) {
        this.COUNTRYNAME_CODE = COUNTRYNAME_CODE;
    }

    public String getCOUNTRYNAME_NAME() {
        return COUNTRYNAME_NAME;
    }

    public void setCOUNTRYNAME_NAME(String COUNTRYNAME_NAME) {
        this.COUNTRYNAME_NAME = COUNTRYNAME_NAME;
    }

    public String getCOUNTRYNAME_ISTERRITORY() {
        return COUNTRYNAME_ISTERRITORY;
    }

    public void setCOUNTRYNAME_ISTERRITORY(String COUNTRYNAME_ISTERRITORY) {
        this.COUNTRYNAME_ISTERRITORY = COUNTRYNAME_ISTERRITORY;
    }

    public String getCOUNTRYNAME_PROFILEURL() {
        return COUNTRYNAME_PROFILEURL;
    }

    public void setCOUNTRYNAME_PROFILEURL(String COUNTRYNAME_PROFILEURL) {
        this.COUNTRYNAME_PROFILEURL = COUNTRYNAME_PROFILEURL;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}

