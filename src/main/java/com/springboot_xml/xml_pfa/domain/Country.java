package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class Country {
    private Integer ID ;
    private Integer COUNTRYDETAILS_ID;
    private String COUNTRY_COUNTRYTYPE;
    private CountryValue countryValue;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public CountryValue getCountryValue() {
        return countryValue;
    }

    public void setCountryValue(CountryValue countryValue) {
        this.countryValue = countryValue;
    }

    public Integer getCOUNTRYDETAILS_ID() {
        return COUNTRYDETAILS_ID;
    }

    public void setCOUNTRYDETAILS_ID(Integer COUNTRYDETAILS_ID) {
        this.COUNTRYDETAILS_ID = COUNTRYDETAILS_ID;
    }

    public String getCOUNTRY_COUNTRYTYPE() {
        return COUNTRY_COUNTRYTYPE;
    }

    public void setCOUNTRY_COUNTRYTYPE(String COUNTRY_COUNTRYTYPE) {
        this.COUNTRY_COUNTRYTYPE = COUNTRY_COUNTRYTYPE;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
