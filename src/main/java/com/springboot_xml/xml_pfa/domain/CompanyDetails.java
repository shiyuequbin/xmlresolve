package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class CompanyDetails {
    private Integer ID;
    private Integer E_ID;
    private String ADDRESSLINE;
    private String ADDRESSCITY;
    private String ADDRESSCOUNTRY;
    private String URL;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getE_ID() {
        return E_ID;
    }

    public void setE_ID(Integer e_ID) {
        E_ID = e_ID;
    }

    public String getADDRESSLINE() {
        return ADDRESSLINE;
    }

    public void setADDRESSLINE(String ADDRESSLINE) {
        this.ADDRESSLINE = ADDRESSLINE;
    }

    public String getADDRESSCITY() {
        return ADDRESSCITY;
    }

    public void setADDRESSCITY(String ADDRESSCITY) {
        this.ADDRESSCITY = ADDRESSCITY;
    }

    public String getADDRESSCOUNTRY() {
        return ADDRESSCOUNTRY;
    }

    public void setADDRESSCOUNTRY(String ADDRESSCOUNTRY) {
        this.ADDRESSCOUNTRY = ADDRESSCOUNTRY;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
