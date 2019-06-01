package com.springboot_xml.xml_pfa.domain;

import java.util.Date;
import java.util.List;


public class SpecialEntity {
    private Integer ID;
    private Integer PFA_ID;
    private Integer SE_ID;
    private Date insertDate;
    private List<Associate> associates_spec;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<Associate> getAssociates_spec() {
        return associates_spec;
    }

    public void setAssociates_spec(List<Associate> associates_spec) {
        this.associates_spec = associates_spec;
    }

    public Integer getPFA_ID() {
        return PFA_ID;
    }

    public void setPFA_ID(Integer PFA_ID) {
        this.PFA_ID = PFA_ID;
    }

    public Integer getSE_ID() {
        return SE_ID;
    }

    public void setSE_ID(Integer SE_ID) {
        this.SE_ID = SE_ID;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    @Override
    public String toString() {
        return "SpecialEntity{" +
                "ID=" + ID +
                ", PFA_ID=" + PFA_ID +
                ", SE_ID=" + SE_ID +
                ", insertDate=" + insertDate +
                ", associates_spec=" + associates_spec +
                '}';
    }
}
