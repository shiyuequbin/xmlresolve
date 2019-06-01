package com.springboot_xml.xml_pfa.domain;

import java.util.Date;
import java.util.List;

public class PFA {
    private Integer ID ;
    private String PFA_DATE;
    private String PFA_TYPE;
    private Date insertDate;
    private List<CountryName> countryNames;
    private List<Occupation> occupations;
    private List<Relationship> relationships;
    private List<ReferenceName> referenceNames;
    private List<Description1Name> description1Names;
    private List<Description2Name> description2Names;
    private List<Description3Name> description3Names;
    private List<DateType> dateTypes;
    private List<NameType> nameTypes;
    private List<RoleType> roleTypes;
    private List<Person> person;
    private List<Entity> entity;
    private List<PublicFigure> publicFigures;
    private List<SpecialEntity> specialEntities;

    @Override
    public String toString() {
        return "PFA{" +
                "ID=" + ID +
                ", PFA_DATE='" + PFA_DATE + '\'' +
                ", PFA_TYPE='" + PFA_TYPE + '\'' +
                ", insertDate=" + insertDate +
                ", countryNames=" + countryNames +
                ", occupations=" + occupations +
                ", relationships=" + relationships +
                ", referenceNames=" + referenceNames +
                ", description1Names=" + description1Names +
                ", description2Names=" + description2Names +
                ", description3Names=" + description3Names +
                ", dateTypes=" + dateTypes +
                ", nameTypes=" + nameTypes +
                ", roleTypes=" + roleTypes +
                ", person=" + person +
                ", entity=" + entity +
                ", publicFigures=" + publicFigures +
                ", specialEntities=" + specialEntities +
                '}';
    }

    public List<CountryName> getCountryNames() {
        return countryNames;
    }

    public void setCountryNames(List<CountryName> countryNames) {
        this.countryNames = countryNames;
    }

    public List<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(List<Occupation> occupations) {
        this.occupations = occupations;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public List<ReferenceName> getReferenceNames() {
        return referenceNames;
    }

    public void setReferenceNames(List<ReferenceName> referenceNames) {
        this.referenceNames = referenceNames;
    }

    public List<Description1Name> getDescription1Names() {
        return description1Names;
    }

    public void setDescription1Names(List<Description1Name> description1Names) {
        this.description1Names = description1Names;
    }

    public List<Description2Name> getDescription2Names() {
        return description2Names;
    }

    public void setDescription2Names(List<Description2Name> description2Names) {
        this.description2Names = description2Names;
    }

    public List<Description3Name> getDescription3Names() {
        return description3Names;
    }

    public void setDescription3Names(List<Description3Name> description3Names) {
        this.description3Names = description3Names;
    }

    public List<DateType> getDateTypes() {
        return dateTypes;
    }

    public void setDateTypes(List<DateType> dateTypes) {
        this.dateTypes = dateTypes;
    }

    public List<NameType> getNameTypes() {
        return nameTypes;
    }

    public void setNameTypes(List<NameType> nameTypes) {
        this.nameTypes = nameTypes;
    }

    public List<RoleType> getRoleTypes() {
        return roleTypes;
    }

    public void setRoleTypes(List<RoleType> roleTypes) {
        this.roleTypes = roleTypes;
    }

    public List<Entity> getEntity() {
        return entity;
    }

    public void setEntity(List<Entity> entity) {
        this.entity = entity;
    }

    public List<PublicFigure> getPublicFigures() {
        return publicFigures;
    }

    public void setPublicFigures(List<PublicFigure> publicFigures) {
        this.publicFigures = publicFigures;
    }

    public List<SpecialEntity> getSpecialEntities() {
        return specialEntities;
    }

    public void setSpecialEntities(List<SpecialEntity> specialEntities) {
        this.specialEntities = specialEntities;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID =ID ;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }


    public String getPFA_DATE() {
        return PFA_DATE;
    }

    public void setPFA_DATE(String PFA_DATE) {
        this.PFA_DATE = PFA_DATE;
    }

    public String getPFA_TYPE() {
        return PFA_TYPE;
    }

    public void setPFA_TYPE(String PFA_TYPE) {
        this.PFA_TYPE = PFA_TYPE;
    }
}
