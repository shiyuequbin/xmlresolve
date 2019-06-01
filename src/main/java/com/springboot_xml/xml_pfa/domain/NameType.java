package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class NameType {
    private Integer ID;
    private Integer PFA_ID;
    private String NAMETYPE_NAMETYPEID;
    private String NAMETYPE_RECORDTYPE;
    private String NAMETYPE_NAMETYPEVALUE;
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

    public String getNAMETYPE_NAMETYPEID() {
        return NAMETYPE_NAMETYPEID;
    }

    public void setNAMETYPE_NAMETYPEID(String NAMETYPE_NAMETYPEID) {
        this.NAMETYPE_NAMETYPEID = NAMETYPE_NAMETYPEID;
    }

    public String getNAMETYPE_RECORDTYPE() {
        return NAMETYPE_RECORDTYPE;
    }

    public void setNAMETYPE_RECORDTYPE(String NAMETYPE_RECORDTYPE) {
        this.NAMETYPE_RECORDTYPE = NAMETYPE_RECORDTYPE;
    }

    public String getNAMETYPE_NAMETYPEVALUE() {
        return NAMETYPE_NAMETYPEVALUE;
    }

    public void setNAMETYPE_NAMETYPEVALUE(String NAMETYPE_NAMETYPEVALUE) {
        this.NAMETYPE_NAMETYPEVALUE = NAMETYPE_NAMETYPEVALUE;
    }

    public NameType(Integer PFA_ID, String NAMETYPE_NAMETYPEID, String NAMETYPE_RECORDTYPE, String NAMETYPE_NAMETYPEVALUE) {

        this.PFA_ID = PFA_ID;
        this.NAMETYPE_NAMETYPEID = NAMETYPE_NAMETYPEID;
        this.NAMETYPE_RECORDTYPE = NAMETYPE_RECORDTYPE;
        this.NAMETYPE_NAMETYPEVALUE = NAMETYPE_NAMETYPEVALUE;
    }

    public NameType() {

    }

    @Override
    public String toString() {
        return "NameType{" +
                "PFA_ID=" + PFA_ID +
                ", NAMETYPE_NAMETYPEID='" + NAMETYPE_NAMETYPEID + '\'' +
                ", NAMETYPE_RECORDTYPE='" + NAMETYPE_RECORDTYPE + '\'' +
                ", NAMETYPE_NAMETYPEVALUE='" + NAMETYPE_NAMETYPEVALUE + '\'' +
                '}';
    }
}
