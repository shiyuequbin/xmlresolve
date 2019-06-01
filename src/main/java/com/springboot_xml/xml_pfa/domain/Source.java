package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

/**
 * @ProjectName: dowjones
 * @Package: com.kesheng.domain
 * @ClassName: Source
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/5/16 16:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/16 16:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Source {
    private Integer ID;
    private Integer SOURCEDESCRIPTION_ID;
    private String SOURCE_NAME;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getSOURCEDESCRIPTION_ID() {
        return SOURCEDESCRIPTION_ID;
    }

    public void setSOURCEDESCRIPTION_ID(Integer SOURCEDESCRIPTION_ID) {
        this.SOURCEDESCRIPTION_ID = SOURCEDESCRIPTION_ID;
    }

    public String getSOURCE_NAME() {
        return SOURCE_NAME;
    }

    public void setSOURCE_NAME(String SOURCE_NAME) {
        this.SOURCE_NAME = SOURCE_NAME;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
