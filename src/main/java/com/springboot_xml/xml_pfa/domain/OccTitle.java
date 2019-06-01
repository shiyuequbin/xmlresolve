package com.springboot_xml.xml_pfa.domain;


import java.util.Date;

public class OccTitle {
    private Integer ID;
    private Integer ROLES_ID;
    private String OCCTITLE_SINCEDAY;
    private String OCCTITLE_SINCEMONTH;
    private String OCCTITLE_SINCEYEAR;
    private String OCCTITLE_TODAY;
    private String OCCTITLE_TOMONTH;
    private String OCCTITLE_TOYEAR;
    private String OCCTITLE_OCCCAT;
    private String OCCTITLE_OCCTITLEVALUE;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getROLES_ID() {
        return ROLES_ID;
    }

    public void setROLES_ID(Integer ROLES_ID) {
        this.ROLES_ID = ROLES_ID;
    }

    public String getOCCTITLE_SINCEDAY() {
        return OCCTITLE_SINCEDAY;
    }

    public void setOCCTITLE_SINCEDAY(String OCCTITLE_SINCEDAY) {
        this.OCCTITLE_SINCEDAY = OCCTITLE_SINCEDAY;
    }

    public String getOCCTITLE_SINCEMONTH() {
        return OCCTITLE_SINCEMONTH;
    }

    public void setOCCTITLE_SINCEMONTH(String OCCTITLE_SINCEMONTH) {
        this.OCCTITLE_SINCEMONTH = OCCTITLE_SINCEMONTH;
    }

    public String getOCCTITLE_SINCEYEAR() {
        return OCCTITLE_SINCEYEAR;
    }

    public void setOCCTITLE_SINCEYEAR(String OCCTITLE_SINCEYEAR) {
        this.OCCTITLE_SINCEYEAR = OCCTITLE_SINCEYEAR;
    }

    public String getOCCTITLE_TODAY() {
        return OCCTITLE_TODAY;
    }

    public void setOCCTITLE_TODAY(String OCCTITLE_TODAY) {
        this.OCCTITLE_TODAY = OCCTITLE_TODAY;
    }

    public String getOCCTITLE_TOMONTH() {
        return OCCTITLE_TOMONTH;
    }

    public void setOCCTITLE_TOMONTH(String OCCTITLE_TOMONTH) {
        this.OCCTITLE_TOMONTH = OCCTITLE_TOMONTH;
    }

    public String getOCCTITLE_TOYEAR() {
        return OCCTITLE_TOYEAR;
    }

    public void setOCCTITLE_TOYEAR(String OCCTITLE_TOYEAR) {
        this.OCCTITLE_TOYEAR = OCCTITLE_TOYEAR;
    }

    public String getOCCTITLE_OCCCAT() {
        return OCCTITLE_OCCCAT;
    }

    public void setOCCTITLE_OCCCAT(String OCCTITLE_OCCCAT) {
        this.OCCTITLE_OCCCAT = OCCTITLE_OCCCAT;
    }

    public String getOCCTITLE_OCCTITLEVALUE() {
        return OCCTITLE_OCCTITLEVALUE;
    }

    public void setOCCTITLE_OCCTITLEVALUE(String OCCTITLE_OCCTITLEVALUE) {
        this.OCCTITLE_OCCTITLEVALUE = OCCTITLE_OCCTITLEVALUE;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
