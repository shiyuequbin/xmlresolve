package com.springboot_xml.xml_pfa.domain;

import java.util.Date;


public class Roles {
    private Integer ID;
    private Integer P_ID;
    private String ROLES_ROLETYPE;
    private OccTitle occTitle;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public OccTitle getOccTitle() {
        return occTitle;
    }

    public void setOccTitle(OccTitle occTitle) {
        this.occTitle = occTitle;
    }

    public Integer getP_ID() {
        return P_ID;
    }

    public void setP_ID(Integer p_ID) {
        P_ID = p_ID;
    }

    public String getROLES_ROLETYPE() {
        return ROLES_ROLETYPE;
    }

    public void setROLES_ROLETYPE(String ROLES_ROLETYPE) {
        this.ROLES_ROLETYPE = ROLES_ROLETYPE;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
