package com.springboot_xml.xml_pfa.domain;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: dowjones
 * @Package: com.kesheng.domain
 * @ClassName: PublicFigure
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/5/16 16:52
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/16 16:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PublicFigure {
    private Integer ID;
    private Integer PFA_ID;
    private Integer PF_ID;
    private List<Associate> associates_pub;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<Associate> getAssociates_pub() {
        return associates_pub;
    }

    public void setAssociates_pub(List<Associate> associates_pub) {
        this.associates_pub = associates_pub;
    }

    public Integer getPFA_ID() {
        return PFA_ID;
    }

    public void setPFA_ID(Integer PFA_ID) {
        this.PFA_ID = PFA_ID;
    }

    public Integer getPF_ID() {
        return PF_ID;
    }

    public void setPF_ID(Integer PF_ID) {
        this.PF_ID = PF_ID;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {

        this.insertDate = insertDate;
    }

    @Override
    public String toString() {
        return "PublicFigure{" +
                "ID=" + ID +
                ", PFA_ID=" + PFA_ID +
                ", PF_ID=" + PF_ID +
                ", associates_pub=" + associates_pub +
                ", insertDate=" + insertDate +
                '}';
    }
}
