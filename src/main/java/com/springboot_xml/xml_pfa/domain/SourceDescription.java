package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

/**
 * @ProjectName: dowjones
 * @Package: com.kesheng.domain
 * @ClassName: SourceDescription
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/5/16 17:00
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/16 17:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SourceDescription {
    private Integer ID;
    private Integer P_ID;
    private Integer E_ID;
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

    public Integer getE_ID() {
        return E_ID;
    }

    public void setE_ID(Integer e_ID) {
        E_ID = e_ID;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
