package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

public class Image {
    private Integer ID;
    private Integer P_ID;
    private String IMAGE_URL;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getP_ID() {
        return P_ID;
    }

    public void setP_ID(Integer p_ID) {
        P_ID = p_ID;
    }

    public String getIMAGE_URL() {
        return IMAGE_URL;
    }

    public void setIMAGE_URL(String IMAGE_URL) {
        this.IMAGE_URL = IMAGE_URL;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
