package com.springboot_xml.xml_pfa.domain;


import java.util.Date;
import java.util.List;

public class Person {
    private Integer ID;
    private Integer PFA_ID;
    private String PERSON_ID;
    private String PERSON_ACTION;
    private String PERSON_DATE;
    private String PERSON_GENDER;
    private String PERSON_ACTIVESTATUS;
    private String PERSON_DECEASED;
    private Date insertDate;
    private NameDetails nameDetails;
    private List<NameDetails_Name> nameDetails_names_person;
    private Description_Descs description_descs;
    private List<Description> descriptions_person;
    private List<Roles> rolesList;
    private DateDetails dateDetails;
    private List<Person_Date> dates;
    private Place place;
    private SanctionsReferences sanctionsReferences;
    private List<Reference> references_person;
    private List<Address> addresses;
    private List<Country> countries_person;
    private CountryDetails countryDetails;
    private IDNumberTypes idNumberTypes;
    private List<IDNumberTypes_ID> idNumberTypes_ids_person;
    //private Blob PERSON_PROFILENOTES;
    private byte[] PERSON_PROFILENOTES;
    private List<Image> images;
    private SourceDescription sourceDescription;
    private  List<Source> sources_person;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getPFA_ID() {
        return PFA_ID;
    }

    public SanctionsReferences getSanctionsReferences() {
        return sanctionsReferences;
    }

    public void setSanctionsReferences(SanctionsReferences sanctionsReferences) {
        this.sanctionsReferences = sanctionsReferences;
    }

    public SourceDescription getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(SourceDescription sourceDescription) {
        this.sourceDescription = sourceDescription;
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

    public void setPFA_ID(Integer PFA_ID) {
        this.PFA_ID = PFA_ID;
    }

    public String getPERSON_ID() {
        return PERSON_ID;
    }

    public void setPERSON_ID(String PERSON_ID) {
        this.PERSON_ID = PERSON_ID;
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

    public String getPERSON_ACTION() {
        return PERSON_ACTION;
    }

    public void setPERSON_ACTION(String PERSON_ACTION) {
        this.PERSON_ACTION = PERSON_ACTION;
    }

    public NameDetails getNameDetails() {
        return nameDetails;
    }

    public void setNameDetails(NameDetails nameDetails) {
        this.nameDetails = nameDetails;
    }

    public String getPERSON_DATE() {
        return PERSON_DATE;
    }

    public void setPERSON_DATE(String PERSON_DATE) {
        this.PERSON_DATE = PERSON_DATE;
    }

    public String getPERSON_GENDER() {
        return PERSON_GENDER;
    }

    public void setPERSON_GENDER(String PERSON_GENDER) {
        this.PERSON_GENDER = PERSON_GENDER;
    }

    public String getPERSON_ACTIVESTATUS() {
        return PERSON_ACTIVESTATUS;
    }

    public void setPERSON_ACTIVESTATUS(String PERSON_ACTIVESTATUS) {
        this.PERSON_ACTIVESTATUS = PERSON_ACTIVESTATUS;
    }

    public String getPERSON_DECEASED() {
        return PERSON_DECEASED;
    }

    public void setPERSON_DECEASED(String PERSON_DECEASED) {
        this.PERSON_DECEASED = PERSON_DECEASED;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public List<NameDetails_Name> getNameDetails_names_person() {
        return nameDetails_names_person;
    }

    public void setNameDetails_names_person(List<NameDetails_Name> nameDetails_names_person) {
        this.nameDetails_names_person = nameDetails_names_person;
    }

    public List<Description> getDescriptions_person() {
        return descriptions_person;
    }

    public void setDescriptions_person(List<Description> descriptions_person) {
        this.descriptions_person = descriptions_person;
    }

    public List<Roles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Roles> rolesList) {
        this.rolesList = rolesList;
    }

    public List<Person_Date> getDates() {
        return dates;
    }

    public void setDates(List<Person_Date> dates) {
        this.dates = dates;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public List<Reference> getReferences_person() {
        return references_person;
    }

    public void setReferences_person(List<Reference> references_person) {
        this.references_person = references_person;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Country> getCountries_person() {
        return countries_person;
    }

    public void setCountries_person(List<Country> countries_person) {
        this.countries_person = countries_person;
    }

    public List<IDNumberTypes_ID> getIdNumberTypes_ids_person() {
        return idNumberTypes_ids_person;
    }

    public void setIdNumberTypes_ids_person(List<IDNumberTypes_ID> idNumberTypes_ids_person) {
        this.idNumberTypes_ids_person = idNumberTypes_ids_person;
    }

    public byte[] getPERSON_PROFILENOTES() {
        return PERSON_PROFILENOTES;
    }

    public void setPERSON_PROFILENOTES(byte[] PERSON_PROFILENOTES) {
        this.PERSON_PROFILENOTES = PERSON_PROFILENOTES;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Source> getSources_person() {
        return sources_person;
    }

    public void setSources_person(List<Source> sources_person) {
        this.sources_person = sources_person;
    }
}
