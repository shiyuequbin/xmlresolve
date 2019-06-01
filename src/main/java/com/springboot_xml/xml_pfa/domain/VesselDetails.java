package com.springboot_xml.xml_pfa.domain;

import java.util.Date;

/**
 * @ProjectName: dowjones
 * @Package: com.kesheng.domain
 * @ClassName: VesselDetails
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/5/16 17:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/16 17:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class VesselDetails {
    private Integer ID;
    private Integer E_ID;
    private String VESSELCALLSIGN;
    private String VESSELTYPE;
    private String VESSELTONNAGE;
    private String VESSELGRT;
    private String VESSELOWNER;
    private String VESSELFLAG;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getE_ID() {
        return E_ID;
    }

    public void setE_ID(Integer e_ID) {
        E_ID = e_ID;
    }

    public String getVESSELCALLSIGN() {
        return VESSELCALLSIGN;
    }

    public void setVESSELCALLSIGN(String VESSELCALLSIGN) {
        this.VESSELCALLSIGN = VESSELCALLSIGN;
    }

    public String getVESSELTYPE() {
        return VESSELTYPE;
    }

    public void setVESSELTYPE(String VESSELTYPE) {
        this.VESSELTYPE = VESSELTYPE;
    }

    public String getVESSELTONNAGE() {
        return VESSELTONNAGE;
    }

    public void setVESSELTONNAGE(String VESSELTONNAGE) {
        this.VESSELTONNAGE = VESSELTONNAGE;
    }

    public String getVESSELGRT() {
        return VESSELGRT;
    }

    public void setVESSELGRT(String VESSELGRT) {
        this.VESSELGRT = VESSELGRT;
    }

    public String getVESSELOWNER() {
        return VESSELOWNER;
    }

    public void setVESSELOWNER(String VESSELOWNER) {
        this.VESSELOWNER = VESSELOWNER;
    }

    public String getVESSELFLAG() {
        return VESSELFLAG;
    }

    public void setVESSELFLAG(String VESSELFLAG) {
        this.VESSELFLAG = VESSELFLAG;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
