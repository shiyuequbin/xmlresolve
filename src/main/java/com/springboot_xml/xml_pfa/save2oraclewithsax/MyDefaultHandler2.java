package com.springboot_xml.xml_pfa.save2oraclewithsax;

import com.springboot_xml.xml_pfa.domain.*;
import com.springboot_xml.xml_pfa.service.PFAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.*;

public class MyDefaultHandler2 extends DefaultHandler {
    private final static Logger logger = LoggerFactory.getLogger(PFAService.class);

    public Stack<String> stack = new Stack<String>();

    public List<PFA> pfas;
    // 记录当前的pfa
    public PFA pfa;

   // public Person person;
   //public NameDetails_Name nameDetails_name;
   // public NameDetails_NameValue nameDetails_nameValue;
    //countryList集合
    public List<CountryName> countryNames;
    public CountryName countryName;
   //定义一个变量区分person和entity中相同的属性
    public String PE_flag;
    //定义一个变量区分PublicFigure和SpecialEntityy中相同的属性
     public String PF_SE_flag;
    //occupationList
    public List<Occupation> occupations;
    public Occupation occupation;

    //RelationshipList
    public List<Relationship> relationships;
    public Relationship relationship;

    //SanctionsReferencesList
    public SanctionsReferences sanctionsReferences;
    public List<ReferenceName> referenceNames;
    public ReferenceName referenceName;

    // Description1List
    public List<Description1Name> description1Names;
    public Description1Name description1Name;

    //Description2List
    public List<Description2Name> description2Names;
    public Description2Name description2Name;

    //Description3List
    public List<Description3Name> description3Names;
    public Description3Name description3Name;

    //DateTypeList
    public List<DateType> dateTypes;
    public DateType dateType;

    //NameTypeList
    public List<NameType> nameTypes;
    public NameType nameType;

    //RoleTypeList
    public List<RoleType> roleTypes;
    public RoleType roleType;

    //records_Person
   public List<Person> persons;
   public Person person;

   //public List<NameDetails_Name> nameDetailsList;
   public NameDetails nameDetails;
    //RP_NameDetails_Name
    public List<NameDetails_Name> nameDetails_names_person;
    public List<NameDetails_Name> nameDetails_names_entity;
    public NameDetails_Name nameDetails_name;

    //RP_NameDetails_Name_nameValue
    public List<NameDetails_NameValue> nameDetails_nameValues;
    public NameDetails_NameValue nameDetails_nameValue;

    //RP_namedetails_name_namevalue
    public List<NameDetails_NameValue_ON> nameDetails_nameValue_ons_person;
    public List<NameDetails_NameValue_ON> nameDetails_nameValue_ons_entity;
    public NameDetails_NameValue_ON nameDetails_nameValue_on;

    public List<NameDetails_NameValue_SN> nameDetails_nameValue_sns_person;
    public List<NameDetails_NameValue_SN> nameDetails_nameValue_sns_entity;
    public NameDetails_NameValue_SN nameDetails_nameValue_sn;
    //RP_Descriptions
    public List<Description> descriptions_person;
    public List<Description> descriptions_entity;
    public Description description;
    public Description_Descs description_descs;

    //RP_RoleDetail
    public List<Roles> rolesList;
    public Roles roles;

    //RP_RoleDetail_OccTitle
    public List<OccTitle> occTitles;
    public OccTitle occTitle;

    //RP_DateDetails_date
    public List<Person_Date> dates;
    public List<Person_Date> dates_E;

    public DateDetails dateDetails;
    public Person_Date date;
    public Entity_Date date_E;

    //RP_DateDetails_datevalue
    public List<DateValue> dateValues;
    public DateValue dateValue;


    //RP_BirthPlace
    public List<Place> places;
    public Place place;
    public List<Address> addresses;
    public Address address;

    //RP_CountryDetails_Country
    public List<Country> countries_person;
    public List<Country> countries_entity;
    public Country country;

    public CountryDetails countryDetails;
    //RP_CountryDetails_Country_CountryValue
    public List<CountryValue> countryValues;
    public CountryValue countryValue;

    //RP_image
    public List<Image> images;
    public Image image;

    //RE_entity
    public List<Entity> entities;
    public Entity entity;

    //RE_reference
    public List<Reference> references_person;
    public List<Reference> references_entity;
    public Reference reference;

    //RE_CompanyDetails
    public List<CompanyDetails> companyDetailsList;
    public CompanyDetails companyDetails;

    //RE_VesselDetails
    public List<VesselDetails> vesselDetailsList;
    public VesselDetails vesselDetails;

    //RE_IDNumberTypes_id
    public List<IDNumberTypes_ID> idNumberTypes_ids_person;
    public List<IDNumberTypes_ID> idNumberTypes_ids_entity;
    public IDNumberTypes_ID idNumberTypes_id;

    public IDNumberTypes idNumberTypes;
    //RE_IDNUMTYPE_IDvalue
    public List<IDValue> idValues;
    public IDValue idValue;

    public SourceDescription sourceDescription;
    //RE_source
    public List<Source> sources_person;
    public List<Source> sources_entity;
    public Source source;

   //Associations_publishfigure
    public List<PublicFigure> publicFigures;
    public PublicFigure publicFigure;

    //Associations_Associate
    public List<Associate> associates_pub;
    public List<Associate> associates_spec;
    public Associate associate;

    //Associations_publishfigure
    public List<SpecialEntity> specialEntities;
    public SpecialEntity specialEntity;

    public HashMap<Integer,List<Object>>  map;
    /**
     * 开始文档时调用
     */
    @Override
    public void startDocument() throws SAXException {
        pfas = new ArrayList<PFA>();
        //只有一个，创建一次是可以的
        nameDetails = new NameDetails();
        description = new Description();
        dateDetails = new DateDetails();
        address = new Address();
        description_descs = new Description_Descs();
        sanctionsReferences = new SanctionsReferences();
        countryDetails = new CountryDetails();
        idNumberTypes = new IDNumberTypes();
        sourceDescription = new SourceDescription();
        image = new Image();
        companyDetails = new CompanyDetails();



    }

    /**
     * 开始标签时调用
     *
     * @param qName:      表示开始标签的标签名
     * @param attributes: 表示开始标签内包含的属性列表
     */
    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {


        if ("PFA".equals(qName)) {
            pfa = new PFA();
            persons = new ArrayList<Person>();
            entities = new ArrayList<Entity>();
            countryNames = new ArrayList<CountryName>();
            occupations = new ArrayList<Occupation>();
            relationships = new ArrayList<Relationship>();
            referenceNames = new ArrayList<ReferenceName>();
            description1Names = new ArrayList<Description1Name>();
            description2Names = new ArrayList<Description2Name>();
            description3Names = new ArrayList<Description3Name>();
            dateTypes = new ArrayList<DateType>();
            nameTypes = new ArrayList<NameType>();
            roleTypes = new ArrayList<RoleType>();
            publicFigures = new ArrayList<PublicFigure>();
            specialEntities = new ArrayList<SpecialEntity>();

            for (int i = 0;  /*attributes!=null &&*/ i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("date".equals(attrName)) {
                    pfa.setPFA_DATE(attrValue);
                } else if ("type".equals(attrName)) {
                    pfa.setPFA_TYPE(attrValue);
                }
            }
            pfa.setID(Math.abs(Math.abs(UUID.randomUUID().hashCode())));
            pfa.setInsertDate(new Date());

        } else if ("CountryName".equals(qName)) {
            countryName = new CountryName();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("code".equals(attrName)) {
                    countryName.setCOUNTRYNAME_CODE(attrValue);
                } else if ("name".equals(attrName)) {
                    countryName.setCOUNTRYNAME_NAME(attrValue);
                } else if ("IsTerritory".equals(attrName)) {
                    countryName.setCOUNTRYNAME_ISTERRITORY(attrValue);
                } else if ("ProfileURL".equals(attrName)) {
                    countryName.setCOUNTRYNAME_PROFILEURL(attrValue);
                }
            }
            countryName.setID(Math.abs(UUID.randomUUID().hashCode()));
            countryName.setPFA_ID(pfa.getID());
            countryName.setInsertDate(new Date());
            countryNames.add(countryName);

        }else if ("Occupation".equals(qName)) {
            occupation = new Occupation();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("code".equals(attrName)) {
                    occupation.setOCCUPATION_CODE(attrValue);
                } else if ("name".equals(attrName)) {
                    occupation.setOCCUPATION_NAME(attrValue);
                }
            }
            occupation.setID(Math.abs(UUID.randomUUID().hashCode()));
            occupation.setPFA_ID(pfa.getID());
            occupation.setInsertDate(new Date());
            occupations.add(occupation);

        }else if ("Relationship".equals(qName)) {
            relationship = new Relationship();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("code".equals(attrName)) {
                    relationship.setRELATIONSHIP_CODE(attrValue);
                } else if ("name".equals(attrName)) {
                    relationship.setRELATIONSHIP_NAME(attrValue);
                }
            }
            relationship.setID(Math.abs(UUID.randomUUID().hashCode()));
            relationship.setPFA_ID(pfa.getID());
            relationship.setInsertDate(new Date());
            relationships.add(relationship);

        }else if ("ReferenceName".equals(qName)) {
            referenceName = new ReferenceName();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("code".equals(attrName)) {
                    referenceName.setREFERENCENAME_CODE(attrValue);
                } else if ("name".equals(attrName)) {
                    referenceName.setREFERENCENAME_NAME(attrValue);
                } else if ("status".equals(attrName)) {
                    referenceName.setREFERENCENAME_STATUS(attrValue);
                } else if ("Description2Id".equals(attrName)) {
                    referenceName.setREFERENCENAME_DESCRIPTION2ID(attrValue);
                }
            }
            referenceName.setID(Math.abs(UUID.randomUUID().hashCode()));
            referenceName.setPFA_ID(pfa.getID());
            referenceName.setInsertDate(new Date());
            referenceNames.add(referenceName);

        }else if ("Description1Name".equals(qName)) {
            description1Name = new Description1Name();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("Description1Id".equals(attrName)) {
                    description1Name.setDESCRIPTION1ID(attrValue);
                } else if ("RecordType".equals(attrName)) {
                    description1Name.setRECORDTYPE(attrValue);
                }
            }
            description1Name.setInsertDate(new Date());
            description1Name.setID(Math.abs(UUID.randomUUID().hashCode()));
        }else if ("Description2Name".equals(qName)) {
            description2Name = new Description2Name();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("Description2Id".equals(attrName)) {
                    description2Name.setDESCRIPTION2ID(attrValue);
                } else if ("Description1Id".equals(attrName)) {
                    description2Name.setDESCRIPTION1ID(attrValue);
                }
            }
            description2Name.setInsertDate(new Date());
            description2Name.setID(Math.abs(UUID.randomUUID().hashCode()));
        } else if ("Description3Name".equals(qName)) {
            description3Name = new Description3Name();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("Description3Id".equals(attrName)) {
                    description3Name.setDESCRIPTION3ID(attrValue);
                } else if ("Description2Id".equals(attrName)) {
                    description3Name.setDESCRIPTION2ID(attrValue);
                }
            }
            description3Name.setID(Math.abs(UUID.randomUUID().hashCode()));
            description3Name.setInsertDate(new Date());

        }else if ("DateType".equals(qName)) {
            dateType = new DateType();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("RecordType".equals(attrName)) {
                    dateType.setDATETYPE_RECORDTYPE(attrValue);
                } else if ("Id".equals(attrName)) {
                    dateType.setDATETYPE_ID(attrValue);
                } else if ("name".equals(attrName)) {
                    dateType.setDATETYPE_NAME(attrValue);
                }
            }
            dateType.setID(Math.abs(UUID.randomUUID().hashCode()));
            dateType.setPFA_ID(pfa.getID());
            dateType.setInsertDate(new Date());
            dateTypes.add(dateType);

        }else if ("NameType".equals(qName)) {
            nameType = new NameType();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("NameTypeID".equals(attrName)) {
                    nameType.setNAMETYPE_NAMETYPEID(attrValue);
                } else if ("RecordType".equals(attrName)) {
                    nameType.setNAMETYPE_RECORDTYPE(attrValue);
                }
            }
            nameType.setInsertDate(new Date());
            nameType.setID(Math.abs(UUID.randomUUID().hashCode()));
        }else if ("RoleType".equals(qName)) {
            roleType = new RoleType();
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("Id".equals(attrName)) {
                    roleType.setROLETYPE_ID(attrValue);
                } else if ("name".equals(attrName)) {
                    roleType.setROLETYPE_NAME(attrValue);
                }
            }
            roleType.setID(Math.abs(UUID.randomUUID().hashCode()));
            roleType.setPFA_ID(pfa.getID());
            roleType.setInsertDate(new Date());
            roleTypes.add(roleType);

        }else if ("Person".equals(qName)) {
            person = new Person();
            nameDetails_names_person = new ArrayList<NameDetails_Name>();
            descriptions_person = new ArrayList<Description>();
            sources_person= new ArrayList<Source>();
            rolesList = new ArrayList<Roles>();
            dates = new ArrayList<Person_Date>();
            places = new ArrayList<Place>();
            countries_person = new ArrayList<Country>();
            images = new ArrayList<Image>();
            references_person = new ArrayList<Reference>();
            addresses = new ArrayList<Address>();
            idNumberTypes_ids_person = new ArrayList<IDNumberTypes_ID>();
            person.setID(Math.abs(UUID.randomUUID().hashCode()));
            PE_flag = "Person_flag";
            // 初始化 所有中间表的 id
            //name 中间表 设置一个新的namedetail_ID ，给下方的namedetails_name用
            nameDetails.setID(Math.abs(UUID.randomUUID().hashCode()));
            nameDetails.setP_ID(person.getID());
            //dec 中间表
            description_descs.setP_ID(person.getID());
            description_descs.setID(Math.abs(UUID.randomUUID().hashCode()));
           //
            dateDetails.setID(Math.abs(UUID.randomUUID().hashCode()));
            dateDetails.setP_ID(person.getID());

           //sanctionreforence
            sanctionsReferences.setID(Math.abs(UUID.randomUUID().hashCode()));
            sanctionsReferences.setP_ID(person.getID());

            //
            countryDetails.setID(Math.abs(UUID.randomUUID().hashCode()));
            countryDetails.setP_ID(person.getID());

            idNumberTypes.setID(Math.abs(UUID.randomUUID().hashCode()));
            idNumberTypes.setP_ID(person.getID());

            //
            sourceDescription.setID(Math.abs(UUID.randomUUID().hashCode()));
            sourceDescription.setP_ID(person.getID());

            //
            image.setID(Math.abs(UUID.randomUUID().hashCode()));
            image.setP_ID(person.getID());

            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("id".equals(attrName)) {
                    person.setPERSON_ID(attrValue);
                } else if ("action".equals(attrName)) {
                    person.setPERSON_ACTION(attrValue);
                } else if ("date".equals(attrName)) {
                    person.setPERSON_DATE(attrValue);
                }else if ("NameType".equals(attrName)) {
                    nameDetails_name.setNAMETYPE(attrValue);
                }
            }

            //person.setInsertDate(new java.util.Date());
            // pfa.getPerson().add(person); 所有读完在添加；
        } else if ("Entity".equals(qName)) {
            entity = new Entity();
            nameDetails_names_entity = new ArrayList<NameDetails_Name>();
            sources_entity = new ArrayList<Source>();
            descriptions_entity = new ArrayList<Description>();
            dates_E = new ArrayList<Person_Date>();
            countries_entity = new ArrayList<Country>();
            references_entity = new ArrayList<Reference>();
            companyDetailsList =  new ArrayList<CompanyDetails>();
            vesselDetailsList = new ArrayList<VesselDetails>();
            idNumberTypes_ids_entity = new ArrayList<IDNumberTypes_ID>();
            entity.setID(Math.abs(UUID.randomUUID().hashCode()));
            PE_flag = "Entity_flag";
             //
            nameDetails.setID(Math.abs(UUID.randomUUID().hashCode()));
            nameDetails.setE_ID(entity.getID());
            //
            description_descs.setE_ID(entity.getID());
            description_descs.setID(Math.abs(UUID.randomUUID().hashCode()));
                //
            dateDetails.setID(Math.abs(UUID.randomUUID().hashCode()));
            dateDetails.setE_ID(entity.getID());
            //
            sanctionsReferences.setID(Math.abs(UUID.randomUUID().hashCode()));
            sanctionsReferences.setE_ID(entity.getID());

            //
            countryDetails.setID(Math.abs(UUID.randomUUID().hashCode()));
            countryDetails.setE_ID(entity.getID());

            //
            idNumberTypes.setID(Math.abs(UUID.randomUUID().hashCode()));
            idNumberTypes.setE_ID(entity.getID());

            //
            sourceDescription.setID(Math.abs(UUID.randomUUID().hashCode()));
            sourceDescription.setE_ID(entity.getID());

            //
            companyDetails.setID(Math.abs(UUID.randomUUID().hashCode()));
            companyDetails.setE_ID(entity.getID());

            //


            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("id".equals(attrName)) {
                    entity.setENTITY_ID(attrValue);
                }else if ("action".equals(attrName)) {
                    entity.setENTITY_ACTION(attrValue);
                }else if ("date".equals(attrName)) {
                    entity.setENTITY_DATE(attrValue);
                }
            }

        }else if ("Name".equals(qName)) {
            nameDetails_name = new NameDetails_Name();
            nameDetails_nameValues = new ArrayList<NameDetails_NameValue>();

            nameDetails_name.setID(Math.abs(UUID.randomUUID().hashCode()));
           //person创建的时候有一个设置namedetails，person<-namedetails<-name
            nameDetails_name.setNAMEDETAILS_ID(nameDetails.getID());
            //每次进来有一个新的
            nameDetails_nameValue = new NameDetails_NameValue();
            nameDetails_nameValue_ons_person = new ArrayList<NameDetails_NameValue_ON>();
            nameDetails_nameValue_sns_person = new ArrayList<NameDetails_NameValue_SN>();
            nameDetails_nameValue_ons_entity = new ArrayList<NameDetails_NameValue_ON>();
            nameDetails_nameValue_sns_entity = new ArrayList<NameDetails_NameValue_SN>();

            nameDetails_nameValue.setID(Math.abs(UUID.randomUUID().hashCode()));
            nameDetails_nameValue.setNAME_ID(nameDetails_name.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("NameType".equals(attrName)) {
                    nameDetails_name.setNAMETYPE(attrValue);
                }
            }
            nameDetails_name.setInsertDate(new Date());

        }
        else if ("Description".equals(qName)) {
            description = new Description();
            description.setID(Math.abs(UUID.randomUUID().hashCode()));
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("Description1".equals(attrName)) {
                    description.setDESCRIPTION_DESCRIPTION1(attrValue);
                } else if ("Description2".equals(attrName)) {
                    description.setDESCRIPTION_DESCRIPTION2(attrValue);
                } else if ("Description3".equals(attrName)) {
                    description.setDESCRIPTION_DESCRIPTION3(attrValue);
                }
            }
            description.setDESCS_ID(description_descs.getID());
            description.setInsertDate(new Date());
            //定义两个数组，根据定义的变量添加道不同list

        }else if ("Roles".equals(qName)) {
            roles = new Roles();
            occTitles = new ArrayList<OccTitle>();
            roles.setID(Math.abs(UUID.randomUUID().hashCode()));
            roles.setP_ID(person.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("RoleType".equals(attrName)) {
                    roles.setROLES_ROLETYPE(attrValue);
                }
            }
            roles.setInsertDate(new Date());
        }else if ("OccTitle".equals(qName)) {
            occTitle = new OccTitle();
            occTitle.setID(Math.abs(UUID.randomUUID().hashCode()));
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("SinceMonth".equals(attrName)) {
                    occTitle.setOCCTITLE_SINCEMONTH(attrValue);
                } else if ("SinceYear".equals(attrName)) {
                    occTitle.setOCCTITLE_SINCEYEAR(attrValue);
                } else if ("OccCat".equals(attrName)) {
                    occTitle.setOCCTITLE_OCCCAT(attrValue);
                }
            }
            occTitle.setInsertDate(new Date());


        } else if ("Date".equals(qName)) {
            date = new Person_Date();
            dateValues = new ArrayList<DateValue>();
            date.setID(Math.abs(UUID.randomUUID().hashCode()));
            date.setDATEDETAILS_ID(dateDetails.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("DateType".equals(attrName)) {
                    date.setDATE_DATETYPE(attrValue);
                }
            }
            date.setInsertDate(new Date());
        }else if ("DateValue".equals(qName)) {
            dateValue = new DateValue();
            dateValue.setID(Math.abs(UUID.randomUUID().hashCode()));
             dateValue.setDATE_ID(date.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("Day".equals(attrName)) {
                    dateValue.setDATEVALUE_DAY(attrValue);
                }else if ("Month".equals(attrName)) {
                    dateValue.setDATEVALUE_MONTH(attrValue);
                }else if ("Year".equals(attrName)) {
                    dateValue.setDATEVALUE_YEAR(attrValue);
                }else if ("Dnotes".equals(attrName)) {
                    dateValue.setDATEVALUE_DNOTES(attrValue);
                }
            }
            dateValue.setInsertDate(new Date());
            dateValues.add(dateValue);

        } else if ("Place".equals(qName)) {
            place = new Place();
            place.setID(Math.abs(UUID.randomUUID().hashCode()));
            place.setP_ID(person.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("name".equals(attrName)) {
                    place.setPLACE_NAME(attrValue);
                }
            }
            place.setInsertDate(new Date());

        }else if ("Reference".equals(qName)) {
            reference = new Reference();
            reference.setID(Math.abs(UUID.randomUUID().hashCode()));
            reference.setSANCTIONSREFERENCES_ID(sanctionsReferences.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("SinceDay".equals(attrName)) {
                    reference.setREFERENCE_SINCEDAY(attrValue);
                }else if ("SinceMonth".equals(attrName)) {
                    reference.setREFERENCE_SINCEMONTH(attrValue);
                }else if ("SinceYear".equals(attrName)) {
                    reference.setREFERENCE_SINCEYEAR(attrValue);
                }else if ("ToDay".equals(attrName)) {
                    reference.setREFERENCE_TODAY(attrValue);
                }else if ("ToMonth".equals(attrName)) {
                    reference.setREFERENCE_TOMONTH(attrValue);
                }else if ("ToYear".equals(attrName)) {
                    reference.setREFERENCE_TOYEAR(attrValue);
                }
            }

        } else if ("Country".equals(qName)) {
            country = new Country();
            countryValues = new ArrayList<CountryValue>();
            country.setID(Math.abs(UUID.randomUUID().hashCode()));
            country.setCOUNTRYDETAILS_ID(countryDetails.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("CountryType".equals(attrName)) {
                    country.setCOUNTRY_COUNTRYTYPE(attrValue);
                }
                country.setInsertDate(new Date());

            }
        }else if ("CountryValue".equals(qName)) {
                countryValue = new CountryValue();
            countryValue.setID(Math.abs(UUID.randomUUID().hashCode()));
            countryValue.setCOUNTRY_ID(country.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                    String attrName = attributes.getQName(i);
                    String attrValue = attributes.getValue(i);
                    if ("Code".equals(attrName)) {
                        countryValue.setCOUNTRYVALUE_CODE(attrValue);
                    }
                }
                countryValue.setInsertDate(new Date());
             country.setCountryValue(countryValue);

            }else if ("ID".equals(qName)) {
            idNumberTypes_id = new IDNumberTypes_ID();
            idValues = new ArrayList<IDValue>();
            idNumberTypes_id.setID(Math.abs(UUID.randomUUID().hashCode()));
            idNumberTypes_id.setIDNUMBERTYPES_ID(idNumberTypes.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("IDType".equals(attrName)) {
                    idNumberTypes_id.setID_IDTYPE(attrValue);
                }
            }
            idNumberTypes_id.setInsertDate(new Date());
        }else if ("IDValue".equals(qName)) {
            idValue = new IDValue();
            idValue.setID(Math.abs(UUID.randomUUID().hashCode()));
            idValue.setID_ID(idNumberTypes_id.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("IDnotes".equals(attrName)) {
                        idValue.setIDVALUE_IDNOTES(attrValue.getBytes());
                }
            }
            idValue.setInsertDate(new Date());
        }else if ("Source".equals(qName)) {
            source = new Source();
            source.setID(Math.abs(UUID.randomUUID().hashCode()));
            source.setSOURCEDESCRIPTION_ID(sourceDescription.getID());
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("name".equals(attrName)) {
                    source.setSOURCE_NAME(attrValue);
                }
            }
            source.setInsertDate(new Date());

        }else if ("Image".equals(qName)) {
            image = new Image();
            image.setID(Math.abs(UUID.randomUUID().hashCode()));
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("URL".equals(attrName)) {
                    image.setIMAGE_URL(attrValue);
                }
            }
            image.setInsertDate(new Date());
        }else if ("PublicFigure".equals(qName)) {
            publicFigure = new PublicFigure();
            associates_pub = new ArrayList<Associate>();
            publicFigure.setPFA_ID(pfa.getID());
            PF_SE_flag = "PF";
            publicFigure.setID(Math.abs(UUID.randomUUID().hashCode()));
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("id".equals(attrName)) {
                    publicFigure.setPF_ID(Integer.valueOf(attrValue));
                }
            }
            publicFigure.setInsertDate(new Date());


        }else if ("Associate".equals(qName)) {
            associate = new Associate();
            associate.setID(Math.abs(UUID.randomUUID().hashCode()));
           if(PF_SE_flag .equals("PF") ){
               associate.setPF_ID(publicFigure.getPF_ID());
               associate.setSE_ID(0);
           }else if(PF_SE_flag .equals("SE") ){
               associate.setPF_ID(0);
               associate.setSE_ID(specialEntity.getSE_ID());
           }
             for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("id".equals(attrName)) {
                    associate.setASSOCIATE_ID(attrValue);
                }else if ("code".equals(attrName)) {
                    associate.setASSOCIATE_CODE(attrValue);
                }else if ("ex".equals(attrName)) {
                    associate.setASSOCIATE_EX(attrValue);
                }
            }
            associate.setInsertDate(new Date());

        }else if ("SpecialEntity".equals(qName)) {
            specialEntity = new SpecialEntity();
            associates_spec = new ArrayList<Associate>();
            PF_SE_flag="SE";
            specialEntity.setPFA_ID(pfa.getID());
            specialEntity.setID(Math.abs(UUID.randomUUID().hashCode()));
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                if ("id".equals(attrName)) {
                    specialEntity.setSE_ID(Integer.valueOf(attrValue));
                }
            }
            specialEntity.setInsertDate(new Date());


        }


      //  logger.error( qName);
        // 将标签名压入栈
        stack.push(qName);


    }


    /**
     * 读到文本内容的时调用
     *
     * @param ch:     表示当前读完的所有文本内容
     * @param start：  表示当前文本内容的开始位置
     * @param length: 表示当前文本内容的长度
     *                char[]（                                       张三              20）   100
     *                98 2
     */
    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        companyDetails = new CompanyDetails();
        vesselDetails = new VesselDetails();




        // 取出标签名
        String tag = stack.peek();
        if ("Description1Name".equals(tag)) {
            description1Name.setDESCRIPTION1NAMEVALUE(new String(ch, start, length));
            description1Name.setPFA_ID(pfa.getID());
            description1Names.add(description1Name);

        } else if ("Description2Name".equals(tag)) {
            description2Name.setDESCRIPTION2NAMEVALUE(new String(ch, start, length));
            description2Name.setPFA_ID(pfa.getID());
            description2Names.add(description2Name);

        } else if ("Description3Name".equals(tag)) {
            description3Name.setDESCRIPTION3NAMEVALUE(new String(ch, start, length));
            description3Name.setPFA_ID(pfa.getID());
            description3Names.add(description3Name);

        } else if ("NameType".equals(tag)) {
            nameType.setNAMETYPE_NAMETYPEVALUE(new String(ch, start, length));
            nameType.setPFA_ID(pfa.getID());
            nameTypes.add(nameType);

        } else if ("Gender".equals(tag)) {
            person.setPERSON_GENDER(new String(ch, start, length));
        } else if ("ActiveStatus".equals(tag)) {
            person.setPERSON_ACTIVESTATUS(new String(ch, start, length));
        } else if ("Deceased".equals(tag)) {
            person.setPERSON_DECEASED(new String(ch, start, length));
        } else if ("FirstName".equals(tag)) {
            nameDetails_nameValue.setNAMEVALUE_FIRSTNAME(new String(ch, start, length));
        } else if ("MiddleName".equals(tag)) {
            nameDetails_nameValue.setNAMEVALUE_MIDDLENAME(new String(ch, start, length));
        } else if ("Surname".equals(tag)) {
            nameDetails_nameValue.setNAMEVALUE_SURNAME(new String(ch, start, length));
            nameDetails_nameValue.setInsertDate(new Date());

        }else if ("OriginalScriptName".equals(tag)) {
            nameDetails_nameValue_on = new NameDetails_NameValue_ON();
            nameDetails_nameValue_on.setNAMEVALUE_ID(nameDetails_nameValue.getID());
            nameDetails_nameValue_on.setID(Math.abs(UUID.randomUUID().hashCode()));
            nameDetails_nameValue_on.setNAMEVALUE_ORIGINALSCRIPTNAME(new String(ch, start, length));
            nameDetails_nameValue_on.setInsertDate(new Date());

           //将多个_on添加到集合
            if(PE_flag .equals ("Person_flag") ){
                nameDetails_nameValue_ons_person.add(nameDetails_nameValue_on);
            }else if(PE_flag.equals("Entity_flag" ) ){
                nameDetails_nameValue_ons_entity.add(nameDetails_nameValue_on);
            }


        } else if ("SingleStringName".equals(tag)) {
            nameDetails_nameValue_sn = new NameDetails_NameValue_SN();
                nameDetails_nameValue_sn.setNAMEVALUE_SINGLESTRINGNAME(new String(ch, start, length));
                nameDetails_nameValue_sn.setNAMEVALUE_ID(nameDetails_nameValue.getID());
                 nameDetails_nameValue_sn.setID(Math.abs(UUID.randomUUID().hashCode()));
                 nameDetails_nameValue_sn.setInsertDate(new Date());
            if(PE_flag .equals ("Person_flag") ){
                nameDetails_nameValue_sns_person.add(nameDetails_nameValue_sn);
            }else if(PE_flag.equals("Entity_flag" ) ){
                nameDetails_nameValue_sns_entity.add(nameDetails_nameValue_sn);
            }
            if(PE_flag.equals ("Person_flag") ){
                nameDetails_nameValue_sns_person.add(nameDetails_nameValue_sn);
                // 给namedetailsname_value  赋值
                nameDetails_nameValue.setNameDetails_nameValue_sns_person(nameDetails_nameValue_sns_person);
            }else if(PE_flag.equals ("Entity_flag" )){
                nameDetails_nameValue_sns_entity.add(nameDetails_nameValue_sn);
                nameDetails_nameValue.setNameDetails_nameValue_sns_entity(nameDetails_nameValue_sns_entity);
            }
            }
        else if ("OccTitle".equals(tag)) {
            occTitle.setOCCTITLE_OCCTITLEVALUE(new String(ch, start, length));
            roles.setID(Math.abs(UUID.randomUUID().hashCode()));
            occTitle.setID(Math.abs(UUID.randomUUID().hashCode()));
            occTitle.setROLES_ID(roles.getID());
            roles.setOccTitle(occTitle);
            roles.setP_ID(person.getID());

        }else if ("ActiveStatus".equals(tag)) {
            entity.setENTITY_ACTIVESTATUS(new String(ch, start, length));
            entity.setInsertDate(new Date());

        }
        else if ( " ProfileNotes".equals(tag)) {

        }else if ("Reference".equals(tag)) {
            reference.setREFERENCE_REFERENCEVALUE(new String(ch, start, length));
            reference.setInsertDate(new Date());

        }else if ("AddressLine".equals(tag)) {
            if(PE_flag .equals ("Person_flag") ){
                address.setADDRESS_ADDRESSLINE(new String(ch, start, length));
            }else if(PE_flag .equals("Entity_flag")  ){
                companyDetails.setADDRESSLINE(new String(ch, start, length));
            }
        }else if ("AddressCity".equals(tag)) {
            if(PE_flag .equals ("Person_flag") ){
                address.setADDRESS_ADDRESSCITY(new String(ch, start, length));
            }else if(PE_flag .equals ("Entity_flag") ){
                companyDetails.setADDRESSCITY(new String(ch, start, length));
            }
        }else if ("AddressCountry".equals(tag)) {
            if(PE_flag .equals ("Person_flag") ){
                address.setADDRESS_ADDRESSCOUNTRY(new String(ch, start, length));
            }else if(PE_flag .equals( "Entity_flag") ){
                companyDetails.setADDRESSCOUNTRY(new String(ch, start, length));
            }

        }else if ("AddressURL".equals(tag)) {
            if(PE_flag .equals ("Person_flag") ){
                address.setADDRESS_URL(new String(ch, start, length));
            }else if(PE_flag .equals("Entity_flag")  ){
                companyDetails.setURL(new String(ch, start, length));
            }

        }else if ("IDValue".equals(tag)) {
            idValue.setIDVALUE_IDVALUEVALUE(new String(ch, start, length));
            idNumberTypes_id.setIdValue(idValue);
        }


        else if ("VesselCallSign".equals(tag)) {
            vesselDetails.setVESSELCALLSIGN(new String(ch, start, length));
        }else if ("VesselType".equals(tag)) {
            vesselDetails.setVESSELTYPE(new String(ch, start, length));
        }else if ("VesselTonnage".equals(tag)) {
            vesselDetails.setVESSELTONNAGE(new String(ch, start, length));
        }else if ("VesselGRT".equals(tag)) {
            vesselDetails.setVESSELGRT(new String(ch, start, length));
        }else if ("VesselOwner".equals(tag)) {
            vesselDetails.setVESSELOWNER(new String(ch, start, length));
        }else if ("VesselFlag".equals(tag)) {
            vesselDetails.setVESSELFLAG(new String(ch, start, length));

        }

    }

        /**
         * 结束标签时调用
         * @param qName: 结束标签的标签名称
         */
        @Override
        public void endElement (String uri, String localName, String qName)
            throws SAXException {



          if ("CountryList".equals(qName)) {
                pfa.setCountryNames(countryNames);
            } else if ("OccupationList".equals(qName)) {
               pfa.setOccupations(occupations);
            }else if ("RelationshipList".equals(qName)) {
               pfa.setRelationships(relationships);
           }else if ("SanctionsReferencesList".equals(qName)) {
               pfa.setReferenceNames(referenceNames);
           }else if ("Description1List".equals(qName)) {
               pfa.setDescription1Names(description1Names);
           }else if ("Description2List".equals(qName)) {
               pfa.setDescription2Names(description2Names);
           }else if ("Description3List".equals(qName)) {
               pfa.setDescription3Names(description3Names);
           }else if ("DateTypeList".equals(qName)) {
               pfa.setDateTypes(dateTypes);
           }else if ("NameTypeList".equals(qName)) {
               pfa.setNameTypes(nameTypes);
           }else if ("RoleTypeList".equals(qName)) {
               pfa.setRoleTypes(roleTypes);
           }else if ("Name".equals(qName)) {
                if(PE_flag .equals("Person_flag")){
                    if(nameDetails_nameValue_ons_person.size()>0){
                        nameDetails_nameValue.setNameDetails_nameValue_ons_person(nameDetails_nameValue_ons_person);
                    }
                    //将namevalue赋值给name
                    //当前的namevalue中只有当前的on.
                    nameDetails_name.setNameDetails_nameValue(nameDetails_nameValue);
                    //namevalue_on和namevalue_sn不确定有，所以在结束时判断
                    //name属于当前的details
                    nameDetails_name.setNAMEDETAILS_ID(nameDetails.getID());
                    //name添加到namedetails  list中
                    nameDetails_names_person.add(nameDetails_name);

                }else if(PE_flag .equals("Entity_flag") ){
                    if(nameDetails_nameValue_sns_person.size()>0) {
                        nameDetails_nameValue.setNameDetails_nameValue_ons_entity(nameDetails_nameValue_ons_entity);
                    }
                    nameDetails_name.setNAMEDETAILS_ID(nameDetails.getID());
                    //将namevalue赋值给name
                    nameDetails_name.setNameDetails_nameValue(nameDetails_nameValue);
                    nameDetails_names_entity.add(nameDetails_name);
                }
            }else if ("NameDetails".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){
                   //当所有对象添加完成 后（当结束标签为NameDetails）list 放到person中
                   person.setNameDetails_names_person(nameDetails_names_person);
               }else if(PE_flag .equals ("Entity_flag") ){

                   entity.setNameDetails_names_entity(nameDetails_names_entity);
               }
           }
            else if ("Description".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){ //如果当前变量时person，将namedetails添加到person的数组
                   descriptions_person.add(description);
               }else if(PE_flag .equals("Entity_flag")  ){
                   descriptions_entity.add(description);
               }
           }
           else if ("Descriptions".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){
                   person.setDescriptions_person(descriptions_person);
               }else if(PE_flag .equals("Entity_flag")  ){
                   entity.setDescriptions_entity(descriptions_entity);
               }
           }else if ("Roles".equals(qName)) {
               rolesList.add(roles);
           }else if ("RoleDetail".equals(qName)) {
               person.setRolesList(rolesList);
           }else if ("Date".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){
                   date.setDateValues(dateValues);
                   dates.add(date);
               }else if(PE_flag .equals("Entity_flag")  ){
                   date.setDateValues(dateValues);
                   dates_E.add(date);
               }
           }else if ("DateDetails".equals(qName)) {
               person.setDates(dates);
           }else if ("BirthPlace".equals(qName)) {
              person.setPlace(place);

           }  else if ("Reference".equals(qName)) {
               if(PE_flag .equals("Person_flag" ) ){ //如果当前变量时person，将namedetails添加到person的数组
                   references_person.add(reference);
               }else if(PE_flag .equals("Entity_flag")  ){
                   references_entity.add(reference);
               }
           }
           else if ("SanctionsReferences".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){
                   person.setReferences_person(references_person);
               }else if(PE_flag .equals("Entity_flag")  ){
                   entity.setReferences_entity(references_entity);
               }
           }else if ("Address".equals(qName)) {
               address.setID(Math.abs(UUID.randomUUID().hashCode()));
               address.setP_ID(person.getID());
                   addresses.add(address);
                   //最后list中会有多个，取最后一个。
               }else if ("CompanyDetails".equals(qName)) {
               companyDetailsList.add(companyDetails);
               //最后list中会有多个，取最后一个。解决方案，在最后entity结束时再添加

           } else if ("Country".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){
                   countries_person.add(country);
               }else if(PE_flag .equals("Entity_flag")  ){
                   countries_entity.add(country);
               }
           }else if ("CountryDetails".equals(qName)) {
               if(PE_flag .equals ("Person_flag") ){
                   person.setCountries_person(countries_person);
               }else if(PE_flag .equals("Entity_flag")){
                   entity.setCountries_entity(countries_entity);
               }
           }else if ("ID".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){
                   idNumberTypes_id.setIdValue(idValue);
                   idNumberTypes_ids_person.add(idNumberTypes_id);
               }else if(PE_flag .equals("Entity_flag")  ){
                   idNumberTypes_id.setIdValue(idValue);
                  idNumberTypes_ids_entity.add(idNumberTypes_id);
               }
           }else if ("IDNumberTypes".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){
                   person.setIdNumberTypes(idNumberTypes);
                   person.setIdNumberTypes_ids_person(idNumberTypes_ids_person);
               }else if(PE_flag .equals("Entity_flag")  ){
                   entity.setIdNumberTypes(idNumberTypes);
                   entity.setIdNumberTypes_ids_entity(idNumberTypes_ids_entity);
               }
           }else if ("Source".equals(qName)) {
               if(PE_flag .equals("Person_flag")  ){
                  sources_person.add(source);
               }else if(PE_flag .equals("Entity_flag")  ){
                  sources_entity.add(source);
               }
           }else if ("SourceDescription".equals(qName)) {
               if(PE_flag .equals("Person_flag" ) ){
                  person.setSources_person(sources_person);
               }else if(PE_flag .equals("Entity_flag")  ){
                   entity.setSources_entity(sources_entity);
               }
           }else if ("Image".equals(qName)) {
               images.add(image);
           }else if ("Images".equals(qName)) {
              person.setImages(images);
           }else if ("VesselDetails".equals(qName)) {
               vesselDetails.setID(Math.abs(UUID.randomUUID().hashCode()));
               vesselDetails.setE_ID(entity.getID());
               vesselDetailsList.add(vesselDetails);
           }else if ("Associate".equals(qName)) {
               if(PF_SE_flag .equals ("PF") ){
                   associates_pub.add(associate);
               }else if(PF_SE_flag .equals( "SE" )){
                   associates_spec.add(associate);
               }
           } else if ("PublicFigure".equals(qName)) {

                  publicFigure.setAssociates_pub(associates_pub);
                  publicFigures.add(publicFigure);

           }else if ("SpecialEntity".equals(qName)) {
               specialEntity.setAssociates_spec(associates_spec);
               specialEntities.add(specialEntity);
           } else if ("Person".equals(qName)) {

               person.setNameDetails(nameDetails);
               person.setDescription_descs(description_descs);
               person.setDateDetails(dateDetails);
               person.setSanctionsReferences(sanctionsReferences);
               person.setCountryDetails(countryDetails);
               person.setSourceDescription(sourceDescription);

                persons.add(person);
                //最后person结束时在添加addresslist。
               person.setAddresses(addresses);
                pfa.setPerson(persons);
            }else if ("Entity".equals(qName)) {
               entity.setNameDetails(nameDetails);
               entity.setDescription_descs(description_descs);
               entity.setDateDetails(dateDetails);
               entity.setSanctionsReferences(sanctionsReferences);
               entity.setCountryDetails(countryDetails);
               entity.setSourceDescription(sourceDescription);
               entity.setCompanyDetailsList(companyDetailsList);
               if(vesselDetailsList.size()>0){
                   entity.setVesselDetailsList(vesselDetailsList);
               }
               entities.add(entity);
                pfa.setEntity(entities);
            } else if ("PFA".equals(qName)) {
               pfa.setPublicFigures(publicFigures);
               pfa.setSpecialEntities(specialEntities);
                pfas.add(pfa);
            }
              /*  System.out.println("Pfa info: -------");PublicFigure
                //System.out.println("    date: " + person.getName().getNameType());
                System.out.println("    type: " + pfa.getPFA_TYPE());
            }*/
        }
        /**
         * 结束文档时调用
         */
        @Override
        public void endDocument() throws SAXException {
            System.out.println("MyDefaultHandler.endDocument()");
        }


    public List<PFA> getPfas(){
            return pfas;
        }

    }



