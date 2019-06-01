package com.springboot_xml.xml_pfa.domain;


import java.util.Date;
import java.util.List;

public class Entity {
    private  Integer ID;
    private Integer PFA_ID;
    private String ENTITY_ID;
    private String ENTITY_ACTION;
    private String ENTITY_DATE;
    private String ENTITY_ACTIVESTATUS;
    private NameDetails nameDetails;
    private List<NameDetails_Name> nameDetails_names_entity;
    private Description_Descs description_descs;
    private DateDetails dateDetails;
    private List<Person_Date> dates_E;
    private List<Description> descriptions_entity;
    private SanctionsReferences sanctionsReferences;
    private List<Reference> references_entity;
    private List<CompanyDetails> companyDetailsList;
    private List<VesselDetails> vesselDetailsList;
    private CountryDetails countryDetails;
    private IDNumberTypes idNumberTypes;
    private List<Country> countries_entity;
    private List<IDNumberTypes_ID> idNumberTypes_ids_entity;
 //   private Blob ENTITY_PROFILENOTES;
   private byte[] ENTITY_PROFILENOTES;
    private SourceDescription sourceDescription;
    private  List<Source> sources_entity;
    private Date insertDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getPFA_ID() {
        return PFA_ID;
    }

    public void setPFA_ID(Integer PFA_ID) {
        this.PFA_ID = PFA_ID;
    }

    public SourceDescription getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(SourceDescription sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    public String getENTITY_ID() {
        return ENTITY_ID;
    }

    public void setENTITY_ID(String ENTITY_ID) {
        this.ENTITY_ID = ENTITY_ID;
    }

    public NameDetails getNameDetails() {
        return nameDetails;
    }

    public void setNameDetails(NameDetails nameDetails) {
        this.nameDetails = nameDetails;
    }

    public Description_Descs getDescription_descs() {
        return description_descs;
    }

    public void setDescription_descs(Description_Descs description_descs) {
        this.description_descs = description_descs;
    }

    public DateDetails getDateDetails() {
        return dateDetails;
    }

    public void setDateDetails(DateDetails dateDetails) {
        this.dateDetails = dateDetails;
    }

    public List<Person_Date> getDates_E() {
        return dates_E;
    }

    public void setDates_E(List<Person_Date> dates_E) {
        this.dates_E = dates_E;
    }

    public SanctionsReferences getSanctionsReferences() {
        return sanctionsReferences;
    }

    public void setSanctionsReferences(SanctionsReferences sanctionsReferences) {
        this.sanctionsReferences = sanctionsReferences;
    }

    public CountryDetails getCountryDetails() {
        return countryDetails;
    }

    public void setCountryDetails(CountryDetails countryDetails) {
        this.countryDetails = countryDetails;
    }

    public IDNumberTypes getIdNumberTypes() {
        return idNumberTypes;
    }

    public void setIdNumberTypes(IDNumberTypes idNumberTypes) {
        this.idNumberTypes = idNumberTypes;
    }

    public String getENTITY_ACTION() {
        return ENTITY_ACTION;
    }

    public void setENTITY_ACTION(String ENTITY_ACTION) {
        this.ENTITY_ACTION = ENTITY_ACTION;
    }

    public String getENTITY_DATE() {
        return ENTITY_DATE;
    }

    public void setENTITY_DATE(String ENTITY_DATE) {
        this.ENTITY_DATE = ENTITY_DATE;
    }

    public String getENTITY_ACTIVESTATUS() {
        return ENTITY_ACTIVESTATUS;
    }

    public void setENTITY_ACTIVESTATUS(String ENTITY_ACTIVESTATUS) {
        this.ENTITY_ACTIVESTATUS = ENTITY_ACTIVESTATUS;
    }

    public List<NameDetails_Name> getNameDetails_names_entity() {
        return nameDetails_names_entity;
    }

    public void setNameDetails_names_entity(List<NameDetails_Name> nameDetails_names_entity) {
        this.nameDetails_names_entity = nameDetails_names_entity;
    }

    public List<Description> getDescriptions_entity() {
        return descriptions_entity;
    }

    public void setDescriptions_entity(List<Description> descriptions_entity) {
        this.descriptions_entity = descriptions_entity;
    }

    public List<Reference> getReferences_entity() {
        return references_entity;
    }

    public void setReferences_entity(List<Reference> references_entity) {
        this.references_entity = references_entity;
    }

    public List<CompanyDetails> getCompanyDetailsList() {
        return companyDetailsList;
    }

    public void setCompanyDetailsList(List<CompanyDetails> companyDetailsList) {
        this.companyDetailsList = companyDetailsList;
    }

    public List<VesselDetails> getVesselDetailsList() {
        return vesselDetailsList;
    }

    public void setVesselDetailsList(List<VesselDetails> vesselDetailsList) {
        this.vesselDetailsList = vesselDetailsList;
    }

    public List<Country> getCountries_entity() {
        return countries_entity;
    }

    public void setCountries_entity(List<Country> countries_entity) {
        this.countries_entity = countries_entity;
    }

    public List<IDNumberTypes_ID> getIdNumberTypes_ids_entity() {
        return idNumberTypes_ids_entity;
    }

    public void setIdNumberTypes_ids_entity(List<IDNumberTypes_ID> idNumberTypes_ids_entity) {
        this.idNumberTypes_ids_entity = idNumberTypes_ids_entity;
    }

    public byte[] getENTITY_PROFILENOTES() {
        return ENTITY_PROFILENOTES;
    }

    public void setENTITY_PROFILENOTES(byte[] ENTITY_PROFILENOTES) {
        this.ENTITY_PROFILENOTES = ENTITY_PROFILENOTES;
    }

    public List<Source> getSources_entity() {
        return sources_entity;
    }

    public void setSources_entity(List<Source> sources_entity) {
        this.sources_entity = sources_entity;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
