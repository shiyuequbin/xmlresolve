package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class Address {
    private Integer ID;
    private Integer P_ID;
    private String ADDRESS_ADDRESSLINE;
    private String ADDRESS_ADDRESSCITY;
    private String ADDRESS_ADDRESSCOUNTRY;
    private String ADDRESS_URL;
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
        return "Address{" +
                "P_ID=" + P_ID +
                ", ADDRESS_ADDRESSLINE='" + ADDRESS_ADDRESSLINE + '\'' +
                ", ADDRESS_ADDRESSCITY='" + ADDRESS_ADDRESSCITY + '\'' +
                ", ADDRESS_ADDRESSCOUNTRY='" + ADDRESS_ADDRESSCOUNTRY + '\'' +
                ", ADDRESS_URL='" + ADDRESS_URL + '\'' +
                '}';
    }

    public Integer getP_ID() {
        return P_ID;
    }

    public void setP_ID(Integer p_ID) {
        P_ID = p_ID;
    }

    public String getADDRESS_ADDRESSLINE() {
        return ADDRESS_ADDRESSLINE;
    }

    public void setADDRESS_ADDRESSLINE(String ADDRESS_ADDRESSLINE) {
        this.ADDRESS_ADDRESSLINE = ADDRESS_ADDRESSLINE;
    }

    public String getADDRESS_ADDRESSCITY() {
        return ADDRESS_ADDRESSCITY;
    }

    public void setADDRESS_ADDRESSCITY(String ADDRESS_ADDRESSCITY) {
        this.ADDRESS_ADDRESSCITY = ADDRESS_ADDRESSCITY;
    }

    public String getADDRESS_ADDRESSCOUNTRY() {
        return ADDRESS_ADDRESSCOUNTRY;
    }

    public void setADDRESS_ADDRESSCOUNTRY(String ADDRESS_ADDRESSCOUNTRY) {
        this.ADDRESS_ADDRESSCOUNTRY = ADDRESS_ADDRESSCOUNTRY;
    }

    public String getADDRESS_URL() {
        return ADDRESS_URL;
    }

    public void setADDRESS_URL(String ADDRESS_URL) {
        this.ADDRESS_URL = ADDRESS_URL;
    }
}
