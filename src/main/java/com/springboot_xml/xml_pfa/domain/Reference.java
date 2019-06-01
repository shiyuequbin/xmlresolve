package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

/**
 * @ProjectName: dowjones
 * @Package: com.kesheng.domain
 * @ClassName: Reference
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/5/16 16:54
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/16 16:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Reference {
    private Integer ID;
    private Integer SANCTIONSREFERENCES_ID;
    private String REFERENCE_SINCEDAY;
    private String REFERENCE_SINCEMONTH;
    private String REFERENCE_SINCEYEAR;
    private String REFERENCE_TODAY;
    private String REFERENCE_TOMONTH;
    private String REFERENCE_TOYEAR;
    private String REFERENCE_REFERENCEVALUE;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getSANCTIONSREFERENCES_ID() {
        return SANCTIONSREFERENCES_ID;
    }

    public void setSANCTIONSREFERENCES_ID(Integer SANCTIONSREFERENCES_ID) {
        this.SANCTIONSREFERENCES_ID = SANCTIONSREFERENCES_ID;
    }

    public String getREFERENCE_SINCEDAY() {
        return REFERENCE_SINCEDAY;
    }

    public void setREFERENCE_SINCEDAY(String REFERENCE_SINCEDAY) {
        this.REFERENCE_SINCEDAY = REFERENCE_SINCEDAY;
    }

    public String getREFERENCE_SINCEMONTH() {
        return REFERENCE_SINCEMONTH;
    }

    public void setREFERENCE_SINCEMONTH(String REFERENCE_SINCEMONTH) {
        this.REFERENCE_SINCEMONTH = REFERENCE_SINCEMONTH;
    }

    public String getREFERENCE_SINCEYEAR() {
        return REFERENCE_SINCEYEAR;
    }

    public void setREFERENCE_SINCEYEAR(String REFERENCE_SINCEYEAR) {
        this.REFERENCE_SINCEYEAR = REFERENCE_SINCEYEAR;
    }

    public String getREFERENCE_TODAY() {
        return REFERENCE_TODAY;
    }

    public void setREFERENCE_TODAY(String REFERENCE_TODAY) {
        this.REFERENCE_TODAY = REFERENCE_TODAY;
    }

    public String getREFERENCE_TOMONTH() {
        return REFERENCE_TOMONTH;
    }

    public void setREFERENCE_TOMONTH(String REFERENCE_TOMONTH) {
        this.REFERENCE_TOMONTH = REFERENCE_TOMONTH;
    }

    public String getREFERENCE_TOYEAR() {
        return REFERENCE_TOYEAR;
    }

    public void setREFERENCE_TOYEAR(String REFERENCE_TOYEAR) {
        this.REFERENCE_TOYEAR = REFERENCE_TOYEAR;
    }

    public String getREFERENCE_REFERENCEVALUE() {
        return REFERENCE_REFERENCEVALUE;
    }

    public void setREFERENCE_REFERENCEVALUE(String REFERENCE_REFERENCEVALUE) {
        this.REFERENCE_REFERENCEVALUE = REFERENCE_REFERENCEVALUE;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
