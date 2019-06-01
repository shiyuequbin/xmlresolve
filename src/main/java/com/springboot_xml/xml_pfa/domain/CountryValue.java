package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class CountryValue {
    private Integer ID;
    private Integer COUNTRY_ID;
    private String COUNTRYVALUE_CODE;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public void setCOUNTRY_ID(Integer COUNTRY_ID) {
        this.COUNTRY_ID = COUNTRY_ID;
    }

    public String getCOUNTRYVALUE_CODE() {
        return COUNTRYVALUE_CODE;
    }

    public void setCOUNTRYVALUE_CODE(String COUNTRYVALUE_CODE) {
        this.COUNTRYVALUE_CODE = COUNTRYVALUE_CODE;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
