package com.springboot_xml.xml_pfa.domain;


import java.util.Date;
import java.util.List;

public class NameDetails_NameValue {
    private Integer ID;
    private Integer NAME_ID;
    private String NAMEVALUE_TITLEHONORIFIC;
    private String NAMEVALUE_FIRSTNAME;
    private String NAMEVALUE_MIDDLENAME;
    private String NAMEVALUE_SURNAME;
    private String NAMEVALUE_MAIDENNAME;
    private String NAMEVALUE_SUFFIX;
    private String NAMEVALUE_ENTITYNAME;
    private List<NameDetails_NameValue_ON> nameDetails_nameValue_ons_person;
    private List<NameDetails_NameValue_ON> nameDetails_nameValue_ons_entity;
    private List<NameDetails_NameValue_SN> nameDetails_nameValue_sns_person;
    private List<NameDetails_NameValue_SN> nameDetails_nameValue_sns_entity;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<NameDetails_NameValue_ON> getNameDetails_nameValue_ons_person() {
        return nameDetails_nameValue_ons_person;
    }

    public void setNameDetails_nameValue_ons_person(List<NameDetails_NameValue_ON> nameDetails_nameValue_ons_person) {
        this.nameDetails_nameValue_ons_person = nameDetails_nameValue_ons_person;
    }

    public List<NameDetails_NameValue_ON> getNameDetails_nameValue_ons_entity() {
        return nameDetails_nameValue_ons_entity;
    }

    public void setNameDetails_nameValue_ons_entity(List<NameDetails_NameValue_ON> nameDetails_nameValue_ons_entity) {
        this.nameDetails_nameValue_ons_entity = nameDetails_nameValue_ons_entity;
    }

    public List<NameDetails_NameValue_SN> getNameDetails_nameValue_sns_person() {
        return nameDetails_nameValue_sns_person;
    }

    public void setNameDetails_nameValue_sns_person(List<NameDetails_NameValue_SN> nameDetails_nameValue_sns_person) {
        this.nameDetails_nameValue_sns_person = nameDetails_nameValue_sns_person;
    }

    public List<NameDetails_NameValue_SN> getNameDetails_nameValue_sns_entity() {
        return nameDetails_nameValue_sns_entity;
    }

    public void setNameDetails_nameValue_sns_entity(List<NameDetails_NameValue_SN> nameDetails_nameValue_sns_entity) {
        this.nameDetails_nameValue_sns_entity = nameDetails_nameValue_sns_entity;
    }

    public Integer getNAME_ID() {
        return NAME_ID;
    }

    public void setNAME_ID(Integer NAME_ID) {
        this.NAME_ID = NAME_ID;
    }

    public String getNAMEVALUE_TITLEHONORIFIC() {
        return NAMEVALUE_TITLEHONORIFIC;
    }

    public void setNAMEVALUE_TITLEHONORIFIC(String NAMEVALUE_TITLEHONORIFIC) {
        this.NAMEVALUE_TITLEHONORIFIC = NAMEVALUE_TITLEHONORIFIC;
    }

    public String getNAMEVALUE_FIRSTNAME() {
        return NAMEVALUE_FIRSTNAME;
    }

    public void setNAMEVALUE_FIRSTNAME(String NAMEVALUE_FIRSTNAME) {
        this.NAMEVALUE_FIRSTNAME = NAMEVALUE_FIRSTNAME;
    }

    public String getNAMEVALUE_MIDDLENAME() {
        return NAMEVALUE_MIDDLENAME;
    }

    public void setNAMEVALUE_MIDDLENAME(String NAMEVALUE_MIDDLENAME) {
        this.NAMEVALUE_MIDDLENAME = NAMEVALUE_MIDDLENAME;
    }

    public String getNAMEVALUE_SURNAME() {
        return NAMEVALUE_SURNAME;
    }

    public void setNAMEVALUE_SURNAME(String NAMEVALUE_SURNAME) {
        this.NAMEVALUE_SURNAME = NAMEVALUE_SURNAME;
    }

    public String getNAMEVALUE_MAIDENNAME() {
        return NAMEVALUE_MAIDENNAME;
    }

    public void setNAMEVALUE_MAIDENNAME(String NAMEVALUE_MAIDENNAME) {
        this.NAMEVALUE_MAIDENNAME = NAMEVALUE_MAIDENNAME;
    }

    public String getNAMEVALUE_SUFFIX() {
        return NAMEVALUE_SUFFIX;
    }

    public void setNAMEVALUE_SUFFIX(String NAMEVALUE_SUFFIX) {
        this.NAMEVALUE_SUFFIX = NAMEVALUE_SUFFIX;
    }

    public String getNAMEVALUE_ENTITYNAME() {
        return NAMEVALUE_ENTITYNAME;
    }

    public void setNAMEVALUE_ENTITYNAME(String NAMEVALUE_ENTITYNAME) {
        this.NAMEVALUE_ENTITYNAME = NAMEVALUE_ENTITYNAME;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
