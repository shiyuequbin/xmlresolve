package com.springboot_xml.xml_pfa.service;


import com.springboot_xml.xml_pfa.controller.PFAController;
import com.springboot_xml.xml_pfa.domain.*;
import com.springboot_xml.xml_pfa.mapper.*;
import com.springboot_xml.xml_pfa.save2oraclewithsax.MyDefaultHandler2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;


/**
 * stirng 默认是 ""
 * int 默认是  0
 */
@Service
@Slf4j
public class PFAService {
    private final static Logger logger = LoggerFactory.getLogger(PFAService.class);
    private List<PFA> list;
    private PFA pfa;
    private CountryName countryName;
    private Occupation occupation;
    private Relationship relationship;
    private ReferenceName referenceName;
    private Description1Name description1Name;
    private Description2Name description2Name;
    private Description3Name description3Name;
    private DateType dateType;
    private NameType nameType;
    private RoleType roleType;
    private Person person;
    // private String PE_flag; 解析的时候已经分组，所以这块不用判断
    private NameDetails nameDetails;
    private NameDetails_Name nameDetails_name;
    private NameDetails_NameValue nameDetails_nameValue;
    private NameDetails_NameValue_ON nameDetails_nameValue_on;
    private NameDetails_NameValue_SN nameDetails_nameValue_sn;
    private Description_Descs description_descs;
    private Description description;
    private Roles roles;
    private OccTitle occTitle;
    private DateDetails dateDetails;
    private Person_Date person_date;
    private DateValue dateValue;
    private Place place;
    private SanctionsReferences sanctionsReferences;
    private Reference reference;
    private Address address;
    private CountryDetails countryDetails;
    private Country country;
    private CountryValue countryValue;
    private IDNumberTypes idNumberTypes;
    private IDNumberTypes_ID idNumberTypes_id;
    private IDValue idValue;
    private Image image;
    private SourceDescription sourceDescription;
    private Source source;
    private Entity entity;
    private CompanyDetails companyDetails;
    private VesselDetails vesselDetails;
    private PublicFigure publicFigure;
    private Associate associate;
    private SpecialEntity specialEntity;

    @Autowired
    private PFAMapper pfaMapper;
    @Autowired
    private CountryNameMapper countryNameMapper;
    @Autowired
    private OccupationMapper occupationMapper;
    @Autowired
    private RelationshipMapper relationshipMapper;
    @Autowired
    private ReferenceNameMapper referenceNameMapper;
    @Autowired
    private Description1NameMapper description1NameMapper;
    @Autowired
    private Description2NameMapper description2NameMapper;
    @Autowired
    private Description3NameMapper description3NameMapper;
    @Autowired
    private DateTypeMapper dateTypeMapper;
    @Autowired
    private NameTypeMapper nameTypeMapper;
    @Autowired
    private RoleTypeMapper roleTypeMapper;
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private NameDetailsMapper nameDetailsMapper;
    @Autowired
    private NameDetails_NameMapper nameDetails_nameMapper;
    @Autowired
    private NameDetails_NameValueMapper nameDetails_nameValueMapper;
    @Autowired
    private NameDetails_NameValue_onMapper nameDetails_nameValue_onMapper;
    @Autowired
    private NameDetails_NameValue_snMapper nameDetails_nameValue_snMapper;
    @Autowired
    private Description_DescsMapper description_descsMapper;
    @Autowired
    private DescriptionMapper descriptionMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private OccTitleMapper occTitleMapper;
    @Autowired
    private DateDetailsMapper dateDetailsMapper;
    @Autowired
    private Person_DateMapper personDateMapper;
    @Autowired
    private DateValueMapper dateValueMapper;
    @Autowired
    private PlaceMapper placeMapper;
    @Autowired
    private SanctionsReferencesMapper sanctionsReferencesMapper;
    @Autowired
    private ReferenceMapper referenceMapper;
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private CountryDetailsMapper countryDetailsMapper;
    @Autowired
    private CountryMapper countryMapper;
    @Autowired
    private CountryValueMapper countryValueMapper;
    @Autowired
    private IDNumberTypesMapper idNumberTypesMapper;
    @Autowired
    private IDNumberTypes_IDMapper idNumberTypes_idMapper;
    @Autowired
    private IDValueMapper idValueMapper;
    @Autowired
    private ImageMapper imageMapper;
    @Autowired
    private SourceDescriptionMapper sourceDescriptionMapper;
    @Autowired
    private SourceMapper sourceMapper;
    @Autowired
    private EntityMapper entityMapper;
    @Autowired
    private CompanyDetailsMapper companyDetailsMapper;
    @Autowired
    private VesselDetailsMapper vesselDetailsMapper;
    @Autowired
    private PublicFigureMapper publicFigureMapper;
    @Autowired
    private AssociateMapper associateMapper;
    @Autowired
    private SpecialEntityMapper specialEntityMapper;


    //@Transactional
    //@PostConstruct
   // public void savePFA(String path) throws Exception {
        public void savePFA(String path)  {
        //1.创建SAXParser对象
        SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = null;
            try {
                parser = factory.newSAXParser();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            }
            MyDefaultHandler2 myDefaultHandler2 = new MyDefaultHandler2();
        //2.调用parse方法
        /**
         * 参数一： xml文档
         * 参数二： DefaultHandler的子类   MyDefaultHandler()为自定义
         */
     //parser.parse(new File("C:\\Users\\QuBin\\Desktop\\道琼斯\\Factiva_PFA_Feed_XML\\PFA2_201903092200_D.xml"), myDefaultHandler2);
     //parser.parse(new File("/root/ajxml/PFA2_201902282200_F.xml"), myDefaultHandler2);

      /*      InputStream is = null;
            try {
                is = new FileInputStream(path);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String s="";
            String configContentStr = "";
            try {
                while((s=br.readLine())!=null) {
                    configContentStr = configContentStr+s;
                }
            } catch (IOException e) {

                e.printStackTrace();
            }
            try {
                parser.parse(new File(configContentStr), myDefaultHandler2);
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            try {
                parser.parse(new File(path), myDefaultHandler2);
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            list = myDefaultHandler2.pfas;
        //logger.info(list.toString());
        //获取当前的标识  PE_flag = myDefaultHandler2.PE_flag;
        //	System.out.println(list.toString());


        for (PFA eachpfa : list) {
            pfa = new PFA();
            countryName = new CountryName();
            occupation = new Occupation();
            relationship = new Relationship();
            referenceName = new ReferenceName();
            description1Name = new Description1Name();
            description2Name = new Description2Name();
            description3Name = new Description3Name();
            dateType = new DateType();
            nameType = new NameType();
            roleType = new RoleType();
            person = new Person();
            associate = new Associate();


            entity = new Entity();
            //pfa
            pfa.setID(eachpfa.getID());
            if (null != eachpfa.getPFA_DATE()) {
                pfa.setPFA_DATE(eachpfa.getPFA_DATE());
            } else {
                pfa.setPFA_DATE("");
            }
            if (null != eachpfa.getPFA_TYPE()) {
                pfa.setPFA_TYPE(eachpfa.getPFA_TYPE());
            } else {
                pfa.setPFA_TYPE("");
            }
            pfa.setInsertDate(new Date());
           // logger.info(pfa.toString());
      //      pfaMapper.insert(pfa);
        //countryname
            for (CountryName cn : eachpfa.getCountryNames()) {
                countryName.setID(cn.getID());
                countryName.setPFA_ID(pfa.getID());
                if (null != cn.getCOUNTRYNAME_CODE()) {
                    countryName.setCOUNTRYNAME_CODE(cn.getCOUNTRYNAME_CODE());
                } else {
                    countryName.setCOUNTRYNAME_CODE("");
                }
                if (null != cn.getCOUNTRYNAME_NAME()) {
                    countryName.setCOUNTRYNAME_NAME(cn.getCOUNTRYNAME_CODE());
                } else {
                    countryName.setCOUNTRYNAME_NAME("");
                }
                if (null != cn.getCOUNTRYNAME_ISTERRITORY()) {
                    countryName.setCOUNTRYNAME_ISTERRITORY(cn.getCOUNTRYNAME_ISTERRITORY());
                } else {
                    countryName.setCOUNTRYNAME_ISTERRITORY("");
                }
                if (null != cn.getCOUNTRYNAME_PROFILEURL()) {
                    countryName.setCOUNTRYNAME_PROFILEURL(cn.getCOUNTRYNAME_PROFILEURL());
                } else {
                    countryName.setCOUNTRYNAME_PROFILEURL("");
                }
                countryName.setInsertDate(new Date());
                countryNameMapper.insert(countryName);
            }
            //Occupation
            for (Occupation ot : eachpfa.getOccupations()) {
                occupation.setID(ot.getID());
                occupation.setPFA_ID(pfa.getID());
                if (null != ot.getOCCUPATION_CODE()) {
                    occupation.setOCCUPATION_CODE(ot.getOCCUPATION_CODE());
                } else {
                    occupation.setOCCUPATION_CODE("");
                }
                if (null != ot.getOCCUPATION_NAME()) {
                    occupation.setOCCUPATION_NAME(ot.getOCCUPATION_NAME());
                } else {
                    occupation.setOCCUPATION_NAME("");
                }
                occupation.setInsertDate(new Date());
                occupationMapper.insert(occupation);
            }
            //Relationship
            for (Relationship rs : eachpfa.getRelationships()) {
                relationship.setID(rs.getID());
                relationship.setPFA_ID(pfa.getID());
                if (null != rs.getRELATIONSHIP_CODE()) {
                    relationship.setRELATIONSHIP_CODE(rs.getRELATIONSHIP_CODE());
                } else {
                    relationship.setRELATIONSHIP_CODE("");
                }
                if (null != rs.getRELATIONSHIP_NAME()) {
                    relationship.setRELATIONSHIP_NAME(rs.getRELATIONSHIP_NAME());
                } else {
                    relationship.setRELATIONSHIP_NAME("");
                }
                relationship.setInsertDate(new Date());
                relationshipMapper.insert(relationship);
            }
            //reference
            for (ReferenceName rn : eachpfa.getReferenceNames()) {
                referenceName.setID(rn.getID());
                referenceName.setPFA_ID(pfa.getID());
                if (null != rn.getREFERENCENAME_CODE()) {
                    referenceName.setREFERENCENAME_CODE(rn.getREFERENCENAME_CODE());
                } else {
                    referenceName.setREFERENCENAME_CODE("");
                }
                if (null != rn.getREFERENCENAME_NAME()) {
                    referenceName.setREFERENCENAME_NAME(rn.getREFERENCENAME_NAME());
                } else {
                    referenceName.setREFERENCENAME_NAME("");
                }
                if (null != rn.getREFERENCENAME_STATUS()) {
                    referenceName.setREFERENCENAME_STATUS(rn.getREFERENCENAME_STATUS());
                } else {
                    referenceName.setREFERENCENAME_STATUS("");
                }
                if (null != rn.getREFERENCENAME_DESCRIPTION2ID()) {
                    referenceName.setREFERENCENAME_DESCRIPTION2ID(rn.getREFERENCENAME_DESCRIPTION2ID());
                } else {
                    referenceName.setREFERENCENAME_DESCRIPTION2ID("");
                }
                referenceName.setInsertDate(new Date());
                referenceNameMapper.insert(referenceName);
            }
            //Description1Name
            for (Description1Name dn : eachpfa.getDescription1Names()) {
                description1Name.setID(dn.getID());
                description1Name.setPFA_ID(pfa.getID());
                if (null != dn.getDESCRIPTION1ID()) {
                    description1Name.setDESCRIPTION1ID(dn.getDESCRIPTION1ID());
                } else {
                    description1Name.setDESCRIPTION1ID("");
                }
                if (null != dn.getRECORDTYPE()) {
                    description1Name.setRECORDTYPE(dn.getRECORDTYPE());
                } else {
                    description1Name.setRECORDTYPE("");
                }
                if (null != dn.getDESCRIPTION1NAMEVALUE()) {
                    description1Name.setDESCRIPTION1NAMEVALUE(dn.getDESCRIPTION1NAMEVALUE());
                } else {
                    description1Name.setDESCRIPTION1NAMEVALUE("");
                }
                description1Name.setInsertDate(new Date());
                description1NameMapper.insert(description1Name);
            }
            //Description2Name
            for (Description2Name dn : eachpfa.getDescription2Names()) {
                description2Name.setID(dn.getID());
                description2Name.setPFA_ID(pfa.getID());
                if (null != dn.getDESCRIPTION2ID()) {
                    description2Name.setDESCRIPTION2ID(dn.getDESCRIPTION2ID());
                } else {
                    description2Name.setDESCRIPTION2ID("");
                }
                if (null != dn.getDESCRIPTION1ID()) {
                    description2Name.setDESCRIPTION1ID(dn.getDESCRIPTION1ID());
                } else {
                    description2Name.setDESCRIPTION1ID("");
                }
                if (null != dn.getDESCRIPTION2NAMEVALUE()) {
                    description2Name.setDESCRIPTION2NAMEVALUE(dn.getDESCRIPTION2NAMEVALUE());
                } else {
                    description2Name.setDESCRIPTION2NAMEVALUE("");
                }
                description2Name.setInsertDate(new Date());
                description2NameMapper.insert(description2Name);
            }
            //Description3Name
            for (Description3Name dn : eachpfa.getDescription3Names()) {
                description3Name.setID(dn.getID());
                description3Name.setPFA_ID(pfa.getID());
                if (null != dn.getDESCRIPTION3ID()) {
                    description3Name.setDESCRIPTION3ID(dn.getDESCRIPTION3ID());
                } else {
                    description3Name.setDESCRIPTION3ID("");
                }
                if (null != dn.getDESCRIPTION2ID()) {
                    description3Name.setDESCRIPTION2ID(dn.getDESCRIPTION2ID());
                } else {
                    description3Name.setDESCRIPTION2ID("");
                }
                if (null != dn.getDESCRIPTION3NAMEVALUE()) {
                    description3Name.setDESCRIPTION3NAMEVALUE(dn.getDESCRIPTION3NAMEVALUE());
                } else {
                    description3Name.setDESCRIPTION3NAMEVALUE("");
                }
                description3Name.setInsertDate(new Date());
                description3NameMapper.insert(description3Name);
            }
            //DateType
            for (DateType dn : eachpfa.getDateTypes()) {
                dateType.setID(dn.getID());
                dateType.setPFA_ID(pfa.getID());
                if (null != dn.getDATETYPE_RECORDTYPE()) {
                    dateType.setDATETYPE_RECORDTYPE(dn.getDATETYPE_RECORDTYPE());
                } else {
                    dateType.setDATETYPE_RECORDTYPE("");
                }
                if (null != dn.getDATETYPE_ID()) {
                    dateType.setDATETYPE_ID(dn.getDATETYPE_ID());
                } else {
                    dateType.setDATETYPE_ID("");
                }
                if (null != dn.getDATETYPE_NAME()) {
                    dateType.setDATETYPE_NAME(dn.getDATETYPE_NAME());
                } else {
                    dateType.setDATETYPE_NAME("");
                }
                dateType.setInsertDate(new Date());
                dateTypeMapper.insert(dateType);
            }
            //nametype
            for (NameType dn : eachpfa.getNameTypes()) {
                nameType.setID(dn.getID());
                nameType.setPFA_ID(pfa.getID());
                if (null != dn.getNAMETYPE_NAMETYPEID()) {
                    nameType.setNAMETYPE_NAMETYPEID(dn.getNAMETYPE_NAMETYPEID());
                } else {
                    nameType.setNAMETYPE_NAMETYPEID("");
                }
                if (null != dn.getNAMETYPE_RECORDTYPE()) {
                    nameType.setNAMETYPE_RECORDTYPE(dn.getNAMETYPE_RECORDTYPE());
                } else {
                    nameType.setNAMETYPE_RECORDTYPE("");
                }
                if (null != dn.getNAMETYPE_NAMETYPEVALUE()) {
                    nameType.setNAMETYPE_NAMETYPEVALUE(dn.getNAMETYPE_NAMETYPEVALUE());
                } else {
                    nameType.setNAMETYPE_NAMETYPEVALUE("");
                }
                nameType.setInsertDate(new Date());
                nameTypeMapper.insert(nameType);
            }
            //roletype
            for (RoleType dn : eachpfa.getRoleTypes()) {
                roleType.setID(dn.getID());
                roleType.setPFA_ID(pfa.getID());
                if (null != dn.getROLETYPE_ID()) {
                    roleType.setROLETYPE_ID(dn.getROLETYPE_ID());
                } else {
                    roleType.setROLETYPE_ID("");
                }
                if (null != dn.getROLETYPE_NAME()) {
                    roleType.setROLETYPE_NAME(dn.getROLETYPE_NAME());
                } else {
                    roleType.setROLETYPE_NAME("");
                }
                roleType.setInsertDate(new Date());
                roleTypeMapper.insert(roleType);
            }
            //person
            for (Person eachperson : eachpfa.getPerson()) {
                person.setID(eachperson.getID());
                person.setPFA_ID(pfa.getID());
                if (null != eachperson.getPERSON_ID()) {
                    person.setPERSON_ID(eachperson.getPERSON_ID());
                } else {
                    person.setPERSON_ID("");
                }
                if (null != eachperson.getPERSON_ACTION()) {
                    person.setPERSON_ACTION(eachperson.getPERSON_ACTION());
                } else {
                    person.setPERSON_ACTION("");
                }
                if (null != eachperson.getPERSON_DATE()) {
                    person.setPERSON_DATE(eachperson.getPERSON_DATE());
                } else {
                    person.setPERSON_DATE("");
                }
                if (null != eachperson.getPERSON_GENDER()) {
                    person.setPERSON_GENDER(eachperson.getPERSON_GENDER());
                } else {
                    person.setPERSON_GENDER("");
                }
                if (null != eachperson.getPERSON_ACTIVESTATUS()) {
                    person.setPERSON_ACTIVESTATUS(eachperson.getPERSON_ACTIVESTATUS());
                } else {
                    person.setPERSON_ACTIVESTATUS("");
                }
                if (null != eachperson.getPERSON_DECEASED()) {
                    person.setPERSON_DECEASED(eachperson.getPERSON_DECEASED());
                } else {
                    person.setPERSON_DECEASED("");
                }
                if (null != eachperson.getPERSON_PROFILENOTES()) {
                    person.setPERSON_PROFILENOTES(eachperson.getPERSON_PROFILENOTES());
                } else {
                    person.setPERSON_PROFILENOTES("".getBytes());
                }
                person.setInsertDate(new Date());
               // logger.info(person.toString());
                personMapper.insert(person);

                //对于person下的对象，创建第一个person的时候创建一个新的对象
                nameDetails = new NameDetails();
                nameDetails_name = new NameDetails_Name();
                nameDetails_nameValue = new NameDetails_NameValue();
                description_descs = new Description_Descs();
                description = new Description();
                roles = new Roles();
                dateDetails = new DateDetails();
                place = new Place();
                sanctionsReferences = new SanctionsReferences();
                address = new Address();
                countryDetails = new CountryDetails();


                //namedetails
                //从当前的person中拿到namedetails的ID
                nameDetails.setID(eachperson.getNameDetails().getID());
                nameDetails.setP_ID(person.getID());
                //没有E_ID默认给0.
                nameDetails.setE_ID(0);
                nameDetails.setInsertDate(new Date());
                nameDetailsMapper.insert(nameDetails);
                //namedetails_name
                if(null != eachperson.getNameDetails_names_person()){
                    for (NameDetails_Name dn : eachperson.getNameDetails_names_person()) {
                        nameDetails_name.setID(dn.getID());
                        //拿到中间表的ID
                        nameDetails_name.setNAMEDETAILS_ID(nameDetails.getID());
                        if (null != dn.getNAMETYPE()) {
                            nameDetails_name.setNAMETYPE(dn.getNAMETYPE());
                        } else {
                            nameDetails_name.setNAMETYPE("");
                        }
                        nameDetails_name.setInsertDate(new Date());
                        nameDetails_nameMapper.insert(nameDetails_name);
                        //name下创建value
                        nameDetails_nameValue = new NameDetails_NameValue();

                        //namedetails_namevalue
                        //从当前的name中拿到每个namevalue的值。
                        //    =  dn.getNameDetails_nameValue()
                        if(null!=dn.getNameDetails_nameValue()){
                            nameDetails_nameValue.setID(dn.getNameDetails_nameValue().getID());
                            nameDetails_nameValue.setNAME_ID(nameDetails_name.getID());
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_TITLEHONORIFIC()) {
                                nameDetails_nameValue.setNAMEVALUE_TITLEHONORIFIC(dn.getNameDetails_nameValue().getNAMEVALUE_TITLEHONORIFIC());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_TITLEHONORIFIC("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_FIRSTNAME()) {
                                nameDetails_nameValue.setNAMEVALUE_FIRSTNAME(dn.getNameDetails_nameValue().getNAMEVALUE_FIRSTNAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_FIRSTNAME("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_MIDDLENAME()) {
                                nameDetails_nameValue.setNAMEVALUE_MIDDLENAME(dn.getNameDetails_nameValue().getNAMEVALUE_MIDDLENAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_MIDDLENAME("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_SURNAME()) {
                                nameDetails_nameValue.setNAMEVALUE_SURNAME(dn.getNameDetails_nameValue().getNAMEVALUE_SURNAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_SURNAME("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_MAIDENNAME()) {
                                nameDetails_nameValue.setNAMEVALUE_MAIDENNAME(dn.getNameDetails_nameValue().getNAMEVALUE_MAIDENNAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_MAIDENNAME("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_SUFFIX()) {
                                nameDetails_nameValue.setNAMEVALUE_SUFFIX(dn.getNameDetails_nameValue().getNAMEVALUE_SUFFIX());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_SUFFIX("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_ENTITYNAME()) {
                                nameDetails_nameValue.setNAMEVALUE_ENTITYNAME(dn.getNameDetails_nameValue().getNAMEVALUE_ENTITYNAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_ENTITYNAME("");
                            }
                            nameDetails_nameValue.setInsertDate(new Date());
                            if(null !=nameDetails_name.getID()){
                                nameDetails_nameValueMapper.insert(nameDetails_nameValue);
                            }

                            nameDetails_nameValue_on = new NameDetails_NameValue_ON();
                            nameDetails_nameValue_sn = new NameDetails_NameValue_SN();

                            //NameDetails_NameValue_ON
                            if(null!=dn.getNameDetails_nameValue().getNameDetails_nameValue_ons_person()){
                                List<NameDetails_NameValue_ON> nameDetails_nameValue_ons = dn.getNameDetails_nameValue().getNameDetails_nameValue_ons_person();
                                for (NameDetails_NameValue_ON nno : nameDetails_nameValue_ons) {
                                    nameDetails_nameValue_on.setNAMEVALUE_ID(nameDetails_nameValue.getID());
                                    nameDetails_nameValue_on.setID(nno.getID());
                                    if (null != nno.getNAMEVALUE_ORIGINALSCRIPTNAME()) {
                                        nameDetails_nameValue_on.setNAMEVALUE_ORIGINALSCRIPTNAME(nno.getNAMEVALUE_ORIGINALSCRIPTNAME());
                                    } else {
                                        nameDetails_nameValue_on.setNAMEVALUE_ORIGINALSCRIPTNAME("");
                                    }
                                    nameDetails_nameValue_on.setInsertDate(new Date());
                                    // logger.info(nameDetails_nameValue_on.toString());
                                //*Integer namevalue_id = nameDetails_nameValue_on.getNAMEVALUE_ID();
                                /*if(namevalue_id == null ){
                                    System.out.println("-----:---------");
                                }*/
                                    if(null != nameDetails_nameValue_on.getNAMEVALUE_ID() && null !=nno.getID()){
                                        nameDetails_nameValue_onMapper.insert(nameDetails_nameValue_on);
                                    }
                                }
                            }
                            //NameDetails_NameValue_SN
                            if(null!=dn.getNameDetails_nameValue().getNameDetails_nameValue_sns_person()){

                                for (NameDetails_NameValue_SN nns : dn.getNameDetails_nameValue().getNameDetails_nameValue_sns_person()) {
                                    nameDetails_nameValue_sn.setNAMEVALUE_ID(nameDetails_name.getID());
                                    nameDetails_nameValue_sn.setID(nns.getID());
                                    if (null != nns.getNAMEVALUE_SINGLESTRINGNAME()) {
                                        nameDetails_nameValue_sn.setNAMEVALUE_SINGLESTRINGNAME(nns.getNAMEVALUE_SINGLESTRINGNAME());
                                    } else {
                                        nameDetails_nameValue_sn.setNAMEVALUE_SINGLESTRINGNAME("");
                                    }
                                    nameDetails_nameValue_sn.setInsertDate(new Date());
                                    if(null != nameDetails_nameValue_on.getNAMEVALUE_ID()){

                                        nameDetails_nameValue_snMapper.insert(nameDetails_nameValue_sn);
                                    }
                                }
                            }
                        }

                    }
                }

                //description_descs
                description_descs.setID(eachperson.getDescription_descs().getID());
                description_descs.setP_ID(eachperson.getID());
                description_descs.setE_ID(0);
                description_descs.setInsertDate(new Date());
                description_descsMapper.insert(description_descs);
                //description
                for (Description des : eachperson.getDescriptions_person()) {
                    description.setID(des.getID());
                    description.setDESCS_ID(description_descs.getID());
                    if (null != des.getDESCRIPTION_DESCRIPTION1()) {
                        description.setDESCRIPTION_DESCRIPTION1(des.getDESCRIPTION_DESCRIPTION1());
                    } else {
                        description.setDESCRIPTION_DESCRIPTION1("");
                    }
                    if (null != des.getDESCRIPTION_DESCRIPTION2()) {
                        description.setDESCRIPTION_DESCRIPTION2(des.getDESCRIPTION_DESCRIPTION2());
                    } else {
                        description.setDESCRIPTION_DESCRIPTION2("");
                    }
                    if (null != des.getDESCRIPTION_DESCRIPTION3()) {
                        description.setDESCRIPTION_DESCRIPTION3(des.getDESCRIPTION_DESCRIPTION3());
                    } else {
                        if(null !=description_descs.getID() ){
                            description.setDESCRIPTION_DESCRIPTION3("");
                        }
                    }
                    description.setInsertDate(new Date());
                    if(null !=description_descs.getID() ){
                        descriptionMapper.insert(description);
                    }


                }
                //roles
                if(null!=eachperson.getRolesList()){
                    for (Roles des : eachperson.getRolesList()) {
                        roles.setID(des.getID());
                        roles.setP_ID(eachperson.getID());
                        if (null != des.getROLES_ROLETYPE()) {
                            roles.setROLES_ROLETYPE(des.getROLES_ROLETYPE());
                        } else {
                            roles.setROLES_ROLETYPE("");
                        }
                        roles.setInsertDate(new Date());
                        roleMapper.insert(roles);
                        //OccTitle
                        if(null!=des.getOccTitle()){
                            occTitle = new OccTitle();
                            occTitle.setID(des.getOccTitle().getID());
                            occTitle.setROLES_ID(roles.getID());
                            if (null != des.getOccTitle().getOCCTITLE_SINCEDAY()) {
                                occTitle.setOCCTITLE_SINCEDAY(des.getOccTitle().getOCCTITLE_SINCEDAY());
                            } else {
                                occTitle.setOCCTITLE_SINCEDAY("");
                            }
                            if (null != des.getOccTitle().getOCCTITLE_SINCEMONTH()) {
                                occTitle.setOCCTITLE_SINCEMONTH(des.getOccTitle().getOCCTITLE_SINCEMONTH());
                            } else {
                                occTitle.setOCCTITLE_SINCEMONTH("");
                            }
                            if (null != des.getOccTitle().getOCCTITLE_SINCEYEAR()) {
                                occTitle.setOCCTITLE_SINCEYEAR(des.getOccTitle().getOCCTITLE_SINCEYEAR());
                            } else {
                                occTitle.setOCCTITLE_SINCEYEAR("");
                            }
                            if (null != des.getOccTitle().getOCCTITLE_TODAY()) {
                                occTitle.setOCCTITLE_TODAY(des.getOccTitle().getOCCTITLE_TODAY());
                            } else {
                                occTitle.setOCCTITLE_TODAY("");
                            }
                            if (null != des.getOccTitle().getOCCTITLE_TOMONTH()) {
                                occTitle.setOCCTITLE_TOMONTH(des.getOccTitle().getOCCTITLE_TOMONTH());
                            } else {
                                occTitle.setOCCTITLE_TOMONTH("");
                            }
                            if (null != des.getOccTitle().getOCCTITLE_TOYEAR()) {
                                occTitle.setOCCTITLE_TOYEAR(des.getOccTitle().getOCCTITLE_TOYEAR());
                            } else {
                                occTitle.setOCCTITLE_TOYEAR("");
                            }
                            if (null != des.getOccTitle().getOCCTITLE_OCCCAT()) {
                                occTitle.setOCCTITLE_OCCCAT(des.getOccTitle().getOCCTITLE_OCCCAT());
                            } else {
                                occTitle.setOCCTITLE_OCCCAT("");
                            }
                            if (null != des.getOccTitle().getOCCTITLE_OCCTITLEVALUE()) {
                                occTitle.setOCCTITLE_OCCTITLEVALUE(des.getOccTitle().getOCCTITLE_OCCTITLEVALUE());
                            } else {
                                occTitle.setOCCTITLE_OCCTITLEVALUE("");
                            }
                            occTitle.setInsertDate(new Date());
                            if(null!=roles.getID()){
                                occTitleMapper.insert(occTitle);
                            }
                        }

                    }
                }

                //datedetails
                dateDetails.setID(eachperson.getDateDetails().getID());
                dateDetails.setP_ID(eachperson.getID());
                dateDetails.setE_ID(0);
                dateDetails.setInsertDate(new Date());
                dateDetailsMapper.insert(dateDetails);
                //person_date
                person_date = new Person_Date();
                if(null!=eachperson.getDates()){
                    for (Person_Date pd : eachperson.getDates()) {
                        person_date.setID(pd.getID());
                        person_date.setDATEDETAILS_ID(dateDetails.getID());
                        if (null != pd.getDATE_DATETYPE()) {
                            person_date.setDATE_DATETYPE(pd.getDATE_DATETYPE());
                        } else {
                            person_date.setDATE_DATETYPE("");
                        }
                        person_date.setInsertDate(new Date());
                        if(null !=dateDetails.getID()){
                            personDateMapper.insert(person_date);
                        }
                        //datevalue
                        dateValue = new DateValue();
                        if(null!=pd.getDateValues()){

                            for (DateValue value : pd.getDateValues()) {
                                dateValue.setID(value.getID());
                                dateValue.setDATE_ID(person_date.getID());
                                if (null == value.getDATEVALUE_DAY()) {
                                    dateValue.setDATEVALUE_DAY("");
                                } else {
                                    dateValue.setDATEVALUE_DAY(value.getDATEVALUE_DAY());
                                    // log.debug(value.getDATEVALUE_DAY().toString());
                                }
                                if (null == value.getDATEVALUE_MONTH()) {
                                    dateValue.setDATEVALUE_MONTH("");
                                } else {
                                    dateValue.setDATEVALUE_MONTH(value.getDATEVALUE_MONTH());
                                }
                                if (null == value.getDATEVALUE_YEAR()) {
                                    dateValue.setDATEVALUE_YEAR("");
                                } else {
                                    dateValue.setDATEVALUE_YEAR(value.getDATEVALUE_YEAR());
                                }
                                if (null == value.getDATEVALUE_DNOTES()) {
                                    dateValue.setDATEVALUE_DNOTES("");
                                } else {
                                    dateValue.setDATEVALUE_DNOTES(value.getDATEVALUE_DNOTES());
                                }
                                dateValue.setInsertDate(new Date());
                             /*   log.debug(dateValue.toString());
                                DateValue d = new DateValue();
                                d.setID(999999999);
                                d.setDATE_ID(999999999);
                                d.setDATEVALUE_DAY("qqqqqqqqqqqqqq");
                                d.setDATEVALUE_MONTH("wwwwwwwww");
                                d.setDATEVALUE_YEAR("eeeeeeeeeee");
                                d.setDATEVALUE_DNOTES("sdsdsdsdsdsd");
                                System.out.println(d.toString());
                                System.exit(0);*/

                                if((null !=person_date.getID()) && null!= this.dateValue.getDATEVALUE_MONTH()&& null!= this.dateValue.getDATEVALUE_YEAR()){
                                    dateValueMapper.insert(this.dateValue);
                                }
                            }
                        }
                    }
                }


                //place
                if(null!=eachperson.getPlace()){
                    place.setID(eachperson.getPlace().getID());
                    place.setP_ID(eachperson.getID());
                    if (null != eachperson.getPlace().getPLACE_NAME()) {
                        place.setPLACE_NAME(eachperson.getPlace().getPLACE_NAME());
                    } else {
                        place.setPLACE_NAME("");
                    }
                    place.setInsertDate(new Date());
                    placeMapper.insert(place);
                }

                //SanctionsReferences
                sanctionsReferences.setID(eachperson.getSanctionsReferences().getID());
                sanctionsReferences.setE_ID(0);
                sanctionsReferences.setP_ID(eachperson.getID());
                sanctionsReferences.setInsertDate(new Date());
                sanctionsReferencesMapper.insert(sanctionsReferences);
                //reference
                reference = new Reference();
                if(null!=eachperson.getReferences_person()){
                    for (Reference r : eachperson.getReferences_person()) {
                        reference.setID(r.getID());
                        reference.setSANCTIONSREFERENCES_ID(sanctionsReferences.getID());
                        if (null != r.getREFERENCE_SINCEDAY()) {
                            reference.setREFERENCE_SINCEDAY(r.getREFERENCE_SINCEDAY());
                        } else {
                            reference.setREFERENCE_SINCEDAY("");
                        }
                        if (null != r.getREFERENCE_SINCEMONTH()) {
                            reference.setREFERENCE_SINCEMONTH(r.getREFERENCE_SINCEMONTH());
                        } else {
                            reference.setREFERENCE_SINCEMONTH("");
                        }
                        if (null != r.getREFERENCE_SINCEYEAR()) {
                            reference.setREFERENCE_SINCEYEAR(r.getREFERENCE_SINCEYEAR());
                        } else {
                            reference.setREFERENCE_SINCEYEAR("");
                        }
                        if (null != r.getREFERENCE_TODAY()) {
                            reference.setREFERENCE_TODAY(r.getREFERENCE_TODAY());
                        } else {
                            reference.setREFERENCE_TODAY("");
                        }
                        if (null != r.getREFERENCE_TOMONTH()) {
                            reference.setREFERENCE_TOMONTH(r.getREFERENCE_TOMONTH());
                        } else {
                            reference.setREFERENCE_TOMONTH("");
                        }
                        if (null != r.getREFERENCE_TOYEAR()) {
                            reference.setREFERENCE_TOYEAR(r.getREFERENCE_TOYEAR());
                        } else {
                            reference.setREFERENCE_TOYEAR("");
                        }
                        if (null != r.getREFERENCE_REFERENCEVALUE()) {
                            reference.setREFERENCE_REFERENCEVALUE(r.getREFERENCE_REFERENCEVALUE());
                        } else {
                            reference.setREFERENCE_REFERENCEVALUE("");
                        }
                        reference.setInsertDate(new Date());
                        if(null !=sanctionsReferences.getID()){
                            referenceMapper.insert(reference);
                        }
                    }
                }

                //address
                for (Address add : eachperson.getAddresses()) {
                    address.setID(add.getID());
                    address.setP_ID(eachperson.getID());
                    if (null != add.getADDRESS_ADDRESSLINE()) {
                        address.setADDRESS_ADDRESSLINE(add.getADDRESS_ADDRESSLINE());
                    } else {
                        address.setADDRESS_ADDRESSLINE("");
                    }
                    if (null != add.getADDRESS_ADDRESSCITY()) {
                        address.setADDRESS_ADDRESSCITY(add.getADDRESS_ADDRESSCITY());
                    } else {
                        address.setADDRESS_ADDRESSCITY("");
                    }
                    if (null != add.getADDRESS_ADDRESSCOUNTRY()) {
                        address.setADDRESS_ADDRESSCOUNTRY(add.getADDRESS_ADDRESSCOUNTRY());
                    } else {
                        address.setADDRESS_ADDRESSCOUNTRY("");
                    }
                    if (null != add.getADDRESS_URL()) {
                        address.setADDRESS_URL(add.getADDRESS_URL());
                    } else {
                        address.setADDRESS_URL("");
                    }
                    address.setInsertDate(new Date());
                    addressMapper.insert(address);

                }

                //countrydetails
                countryDetails.setID(eachperson.getCountryDetails().getID());
                countryDetails.setP_ID(eachperson.getID());
                countryDetails.setE_ID(0);
                countryDetails.setInsertDate(new Date());
                countryDetailsMapper.insert(countryDetails);

                if(null !=eachperson.getCountries_person() ){
                    country = new Country();
                    for (Country con : eachperson.getCountries_person()) {
                        country.setID(con.getID());
                        country.setCOUNTRYDETAILS_ID(countryDetails.getID());
                        if (null != con.getCOUNTRY_COUNTRYTYPE()) {
                            country.setCOUNTRY_COUNTRYTYPE(con.getCOUNTRY_COUNTRYTYPE());
                        } else {
                            if(null!=countryDetails.getID()){
                                country.setCOUNTRY_COUNTRYTYPE("");
                            }
                        }
                        country.setInsertDate(new Date());
                        if(null!=countryDetails.getID()){
                            countryMapper.insert(country);
                        }
                        //countryvalue

                        if(null!=countryValue){
                            countryValue = new CountryValue();
                            countryValue.setID(con.getCountryValue().getID());
                            countryValue.setCOUNTRY_ID(country.getID());
                            if (null != con.getCountryValue().getCOUNTRYVALUE_CODE()) {
                                countryValue.setCOUNTRYVALUE_CODE(con.getCountryValue().getCOUNTRYVALUE_CODE());
                            } else {
                                countryValue.setCOUNTRYVALUE_CODE("");
                            }
                            countryValue.setInsertDate(new Date());
                            if(null != countryValue.getInsertDate() ){
                                countryValueMapper.insert(countryValue);
                            }
                        }
                    }
                }

                //idnumtype
                if(null !=eachperson.getIdNumberTypes() ){
                    idNumberTypes = new IDNumberTypes();
                    idNumberTypes.setID(eachperson.getIdNumberTypes().getID());
                    idNumberTypes.setP_ID(eachperson.getID());
                    idNumberTypes.setE_ID(0);
                    idNumberTypes.setInsertDate(new Date());
                    idNumberTypesMapper.insert(idNumberTypes);
                    //idnumtypeid
                    idNumberTypes_id = new IDNumberTypes_ID();
                    for (IDNumberTypes_ID idNumberTypesId : eachperson.getIdNumberTypes_ids_person()) {
                        idNumberTypes_id.setID(idNumberTypesId.getID());
                        idNumberTypes_id.setIDNUMBERTYPES_ID(idNumberTypes.getID());
                        if (null != idNumberTypesId.getID_IDTYPE()) {
                            idNumberTypes_id.setID_IDTYPE(idNumberTypesId.getID_IDTYPE());
                        } else {
                            idNumberTypes_id.setID_IDTYPE("");
                        }
                        idNumberTypes_id.setInsertDate(new Date());
                        if(null != idNumberTypes.getID()){
                            idNumberTypes_idMapper.insert(idNumberTypes_id);
                        }
                        if(null!=idValue){
                            idValue = new IDValue();
                            idValue.setID(idNumberTypesId.getIdValue().getID());
                            idValue.setID_ID(idNumberTypes_id.getID());
                            if (null != idNumberTypesId.getIdValue().getIDVALUE_IDNOTES()) {
                                idValue.setIDVALUE_IDNOTES(idNumberTypesId.getIdValue().getIDVALUE_IDNOTES());
                            } else {
                                idValue.setIDVALUE_IDNOTES("null".getBytes());
                            }
                            if (null != idNumberTypesId.getIdValue().getIDVALUE_IDVALUEVALUE()) {
                                idValue.setIDVALUE_IDVALUEVALUE(idNumberTypesId.getIdValue().getIDVALUE_IDVALUEVALUE());
                            } else {
                                idValue.setIDVALUE_IDVALUEVALUE("");
                            }
                            idValue.setInsertDate(new Date());
                            if(null !=idNumberTypes_id.getID()){
                                idValueMapper.insert(idValue);
                            }
                        }

                    }
                }

                //image
                if(null!=eachperson.getImages()){
                    image = new Image();
                    for (Image i : eachperson.getImages()) {
                        image.setID(i.getID());
                        image.setP_ID(eachperson.getID());
                        if (null != i.getIMAGE_URL()) {
                            image.setIMAGE_URL(i.getIMAGE_URL());
                        } else {
                            image.setIMAGE_URL("");
                        }
                        image.setInsertDate(new Date());
                        //todo 数据库中的imageURL是int类型。所以错误
                       imageMapper.insert(image);
                    }
                }

                //sourvedescription
                sourceDescription = new SourceDescription();
                sourceDescription.setID(eachperson.getSourceDescription().getID());
                sourceDescription.setE_ID(0);
                sourceDescription.setP_ID(eachperson.getID());
                sourceDescription.setInsertDate(new Date());
                sourceDescriptionMapper.insert(sourceDescription);

                //source
                if(null!=eachperson.getSources_person()){
                    source = new Source();
                    for (Source i : eachperson.getSources_person()) {
                        source.setID(i.getID());
                        source.setSOURCEDESCRIPTION_ID(sourceDescription.getID());
                        if (null != i.getSOURCE_NAME()) {
                            source.setSOURCE_NAME(i.getSOURCE_NAME());
                        } else {
                            source.setSOURCE_NAME("");
                        }
                        source.setInsertDate(new Date());
                        if(null != sourceDescription.getID()){
                            sourceMapper.insert(source);
                        }
                    }
                }


            }

            //Entity
            if(null !=eachpfa.getEntity()) {
                for (Entity eachentity : eachpfa.getEntity()) {
                    entity.setID(eachentity.getID());
                    entity.setPFA_ID(pfa.getID());
                    if (null != eachentity.getENTITY_ID()) {
                        entity.setENTITY_ID(eachentity.getENTITY_ID());
                    } else {
                        entity.setENTITY_ID("");
                    }
                    if (null != eachentity.getENTITY_ACTION()) {
                        entity.setENTITY_ACTION(eachentity.getENTITY_ACTION());
                    } else {
                        entity.setENTITY_ACTION("");
                    }
                    if (null != eachentity.getENTITY_DATE()) {
                        entity.setENTITY_DATE(eachentity.getENTITY_DATE());
                    } else {
                        entity.setENTITY_DATE("");
                    }
                    if (null != eachentity.getENTITY_ACTIVESTATUS()) {
                        entity.setENTITY_ACTIVESTATUS(eachentity.getENTITY_ACTIVESTATUS());
                    } else {
                        entity.setENTITY_ACTIVESTATUS("");
                    }
                    if (null != eachentity.getENTITY_PROFILENOTES()) {
                        entity.setENTITY_PROFILENOTES(eachentity.getENTITY_PROFILENOTES());
                    } else {

                        entity.setENTITY_PROFILENOTES("".getBytes());
                    }
                    entity.setInsertDate(new Date());
                    entityMapper.insert(entity);

                    //对于entity下的对象，创建第一个entity的时候创建一个新的对象
                    nameDetails = new NameDetails();
                    nameDetails_name = new NameDetails_Name();
                    nameDetails_nameValue = new NameDetails_NameValue();
                    description_descs = new Description_Descs();
                    description = new Description();
                    dateDetails = new DateDetails();
                    sanctionsReferences = new SanctionsReferences();

                    countryDetails = new CountryDetails();


                    //namedetails
                    //从当前的person中拿到namedetails的ID
                    nameDetails.setID(eachentity.getNameDetails().getID());
                    nameDetails.setP_ID(0);
                    //没有E_ID默认给0.
                    nameDetails.setE_ID(entity.getID());
                    nameDetails.setInsertDate(new Date());
                    nameDetailsMapper.insert(nameDetails);
                    //namedetails_name
                    if (null != eachentity.getNameDetails_names_entity()) {
                        for (NameDetails_Name dn : eachentity.getNameDetails_names_entity()) {
                            nameDetails_name.setID(dn.getID());
                            //拿到中间表的ID
                            nameDetails_name.setNAMEDETAILS_ID(nameDetails.getID());
                            if (null != dn.getNAMETYPE()) {
                                nameDetails_name.setNAMETYPE(dn.getNAMETYPE());
                            } else {
                                nameDetails_name.setNAMETYPE("");
                            }
                            nameDetails_name.setInsertDate(new Date());
                            nameDetails_nameMapper.insert(nameDetails_name);
                            //name下创建value
                            nameDetails_nameValue = new NameDetails_NameValue();

                            //namedetails_namevalue
                            //从当前的name中拿到每个namevalue的值。
                            nameDetails_nameValue.setID(dn.getNameDetails_nameValue().getID());
                            nameDetails_nameValue.setNAME_ID(nameDetails_name.getID());
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_TITLEHONORIFIC()) {
                                nameDetails_nameValue.setNAMEVALUE_TITLEHONORIFIC(dn.getNameDetails_nameValue().getNAMEVALUE_TITLEHONORIFIC());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_TITLEHONORIFIC("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_FIRSTNAME()) {
                                nameDetails_nameValue.setNAMEVALUE_FIRSTNAME(dn.getNameDetails_nameValue().getNAMEVALUE_FIRSTNAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_FIRSTNAME("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_MIDDLENAME()) {
                                nameDetails_nameValue.setNAMEVALUE_MIDDLENAME(dn.getNameDetails_nameValue().getNAMEVALUE_MIDDLENAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_MIDDLENAME("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_SURNAME()) {
                                nameDetails_nameValue.setNAMEVALUE_SURNAME(dn.getNameDetails_nameValue().getNAMEVALUE_SURNAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_SURNAME("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_MAIDENNAME()) {
                                nameDetails_nameValue.setNAMEVALUE_MAIDENNAME(dn.getNameDetails_nameValue().getNAMEVALUE_MAIDENNAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_MAIDENNAME("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_SUFFIX()) {
                                nameDetails_nameValue.setNAMEVALUE_SUFFIX(dn.getNameDetails_nameValue().getNAMEVALUE_SUFFIX());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_SUFFIX("");
                            }
                            if (null != dn.getNameDetails_nameValue().getNAMEVALUE_ENTITYNAME()) {
                                nameDetails_nameValue.setNAMEVALUE_ENTITYNAME(dn.getNameDetails_nameValue().getNAMEVALUE_ENTITYNAME());
                            } else {
                                nameDetails_nameValue.setNAMEVALUE_ENTITYNAME("");
                            }
                            nameDetails_nameValue.setInsertDate(new Date());
                            if (null != nameDetails_name.getID()) {
                                nameDetails_nameValueMapper.insert(nameDetails_nameValue);
                            }

                            nameDetails_nameValue_on = new NameDetails_NameValue_ON();
                            nameDetails_nameValue_sn = new NameDetails_NameValue_SN();

                            //NameDetails_NameValue_ON
                            if (null != dn.getNameDetails_nameValue().getNameDetails_nameValue_ons_entity()) {
                                for (NameDetails_NameValue_ON nno : dn.getNameDetails_nameValue().getNameDetails_nameValue_ons_entity()) {
                                    nameDetails_nameValue_on.setNAMEVALUE_ID(nameDetails_name.getID());
                                    nameDetails_nameValue_on.setID(nno.getID());
                                    if (null != nno.getNAMEVALUE_ORIGINALSCRIPTNAME()) {
                                        nameDetails_nameValue_on.setNAMEVALUE_ORIGINALSCRIPTNAME(nno.getNAMEVALUE_ORIGINALSCRIPTNAME());
                                    } else {
                                        nameDetails_nameValue_on.setNAMEVALUE_ORIGINALSCRIPTNAME("");
                                    }
                                    nameDetails_nameValue_on.setInsertDate(new Date());
                                    if (null != nameDetails_nameValue_on.getNAMEVALUE_ID()) {
                                        nameDetails_nameValue_onMapper.insert(nameDetails_nameValue_on);
                                    }

                                }
                            }

                            //NameDetails_NameValue_SN
                            if (null != dn.getNameDetails_nameValue().getNameDetails_nameValue_sns_entity()) {
                                for (NameDetails_NameValue_SN nns : dn.getNameDetails_nameValue().getNameDetails_nameValue_sns_entity()) {
                                    nameDetails_nameValue_sn.setNAMEVALUE_ID(nameDetails_name.getID());
                                    nameDetails_nameValue_sn.setID(nns.getID());
                                    if (null != nns.getNAMEVALUE_SINGLESTRINGNAME()) {
                                        nameDetails_nameValue_sn.setNAMEVALUE_SINGLESTRINGNAME(nns.getNAMEVALUE_SINGLESTRINGNAME());
                                    } else {
                                        nameDetails_nameValue_sn.setNAMEVALUE_SINGLESTRINGNAME("");
                                    }
                                    nameDetails_nameValue_sn.setInsertDate(new Date());
                                    if (null != nameDetails_nameValue_on.getNAMEVALUE_ID()) {
                                        nameDetails_nameValue_snMapper.insert(nameDetails_nameValue_sn);
                                    }

                                }
                            }

                        }
                    }

                    //description_descs
                    description_descs.setID(eachentity.getDescription_descs().getID());
                    description_descs.setP_ID(0);
                    description_descs.setE_ID(eachentity.getID());
                    description_descs.setInsertDate(new Date());
                    description_descsMapper.insert(description_descs);
                    //description
                    for (Description des : eachentity.getDescriptions_entity()) {
                        description.setID(des.getID());
                        description.setDESCS_ID(description_descs.getID());
                        if (null != des.getDESCRIPTION_DESCRIPTION1()) {
                            description.setDESCRIPTION_DESCRIPTION1(des.getDESCRIPTION_DESCRIPTION1());
                        } else {
                            description.setDESCRIPTION_DESCRIPTION1("");
                        }
                        if (null != des.getDESCRIPTION_DESCRIPTION2()) {
                            description.setDESCRIPTION_DESCRIPTION2(des.getDESCRIPTION_DESCRIPTION2());
                        } else {
                            description.setDESCRIPTION_DESCRIPTION2("");
                        }
                        if (null != des.getDESCRIPTION_DESCRIPTION3()) {
                            description.setDESCRIPTION_DESCRIPTION3(des.getDESCRIPTION_DESCRIPTION3());
                        } else {
                            description.setDESCRIPTION_DESCRIPTION3("");
                        }
                        description.setInsertDate(new Date());
                        if (null != description_descs.getID()) {
                            descriptionMapper.insert(description);
                        }

                    }
                    //datedetails
                    dateDetails.setID(eachentity.getDateDetails().getID());
                    dateDetails.setP_ID(0);
                    dateDetails.setE_ID(eachentity.getID());
                    dateDetails.setInsertDate(new Date());
                    dateDetailsMapper.insert(dateDetails);
                    //person_date 这个存的都是date。
                    person_date = new Person_Date();
                    if (null != eachentity.getDates_E()) {
                        for (Person_Date pd : eachentity.getDates_E()) {
                            person_date.setID(pd.getID());
                            person_date.setDATEDETAILS_ID(dateDetails.getID());
                            if (null != pd.getDATE_DATETYPE()) {
                                person_date.setDATE_DATETYPE(pd.getDATE_DATETYPE());
                            } else {
                                person_date.setDATE_DATETYPE("");
                            }
                            person_date.setInsertDate(new Date());
                            if (null != dateDetails.getID()) {
                                personDateMapper.insert(person_date);
                            }
                            //datevalue
                            dateValue = new DateValue();
                            for (DateValue value : pd.getDateValues()) {
                                dateValue.setID(value.getID());
                                dateValue.setDATE_ID(person_date.getID());
                                if (null != value.getDATEVALUE_DAY()) {
                                    dateValue.setDATEVALUE_DAY(value.getDATEVALUE_DAY());
                                } else {
                                    dateValue.setDATEVALUE_DAY("");
                                }
                                if (null != value.getDATEVALUE_MONTH()) {
                                    dateValue.setDATEVALUE_DAY(value.getDATEVALUE_MONTH());
                                } else {
                                    dateValue.setDATEVALUE_MONTH("");
                                }
                                if (null != value.getDATEVALUE_YEAR()) {
                                    dateValue.setDATEVALUE_DAY(value.getDATEVALUE_YEAR());
                                } else {
                                    dateValue.setDATEVALUE_YEAR("");
                                }
                                if (null != value.getDATEVALUE_DNOTES()) {
                                    dateValue.setDATEVALUE_DAY(value.getDATEVALUE_DNOTES());
                                } else {
                                    dateValue.setDATEVALUE_DNOTES("");
                                }
                                dateValue.setInsertDate(new Date());
                                if (null != person_date.getID()) {
                                    dateValueMapper.insert(dateValue);
                                }
                            }
                        }
                    }

                    //SanctionsReferences
                    sanctionsReferences.setID(eachentity.getSanctionsReferences().getID());
                    sanctionsReferences.setE_ID(eachentity.getID());
                    sanctionsReferences.setP_ID(0);
                    sanctionsReferences.setInsertDate(new Date());
                    sanctionsReferencesMapper.insert(sanctionsReferences);
                    //reference
                    if (null != eachentity.getReferences_entity()) {
                        reference = new Reference();
                        for (Reference r : eachentity.getReferences_entity()) {
                            reference.setID(r.getID());
                            reference.setSANCTIONSREFERENCES_ID(sanctionsReferences.getID());
                            if (null != r.getREFERENCE_SINCEDAY()) {
                                reference.setREFERENCE_SINCEDAY(r.getREFERENCE_SINCEDAY());
                            } else {
                                reference.setREFERENCE_SINCEDAY("");
                            }
                            if (null != r.getREFERENCE_SINCEMONTH()) {
                                reference.setREFERENCE_SINCEMONTH(r.getREFERENCE_SINCEMONTH());
                            } else {
                                reference.setREFERENCE_SINCEMONTH("");
                            }
                            if (null != r.getREFERENCE_SINCEYEAR()) {
                                reference.setREFERENCE_SINCEYEAR(r.getREFERENCE_SINCEYEAR());
                            } else {
                                reference.setREFERENCE_SINCEYEAR("");
                            }
                            if (null != r.getREFERENCE_TODAY()) {
                                reference.setREFERENCE_TODAY(r.getREFERENCE_TODAY());
                            } else {
                                reference.setREFERENCE_TODAY("");
                            }
                            if (null != r.getREFERENCE_TOMONTH()) {
                                reference.setREFERENCE_TOMONTH(r.getREFERENCE_TOMONTH());
                            } else {
                                reference.setREFERENCE_TOMONTH("");
                            }
                            if (null != r.getREFERENCE_TOYEAR()) {
                                reference.setREFERENCE_TOYEAR(r.getREFERENCE_TOYEAR());
                            } else {
                                reference.setREFERENCE_TOYEAR("");
                            }
                            if (null != r.getREFERENCE_REFERENCEVALUE()) {
                                reference.setREFERENCE_REFERENCEVALUE(r.getREFERENCE_REFERENCEVALUE());
                            } else {
                                reference.setREFERENCE_REFERENCEVALUE("");
                            }
                            reference.setInsertDate(new Date());
                            if (null != sanctionsReferences.getID()) {
                                referenceMapper.insert(reference);
                            }

                        }
                    }

                    //companyDetails
                    companyDetails = new CompanyDetails();
                    for (CompanyDetails add : eachentity.getCompanyDetailsList()) {
                        companyDetails.setID(add.getID());
                        companyDetails.setE_ID(eachentity.getID());
                        if (null != add.getADDRESSLINE()) {
                            companyDetails.setADDRESSLINE(add.getADDRESSLINE());
                        } else {
                            companyDetails.setADDRESSLINE("");
                        }
                        if (null != add.getADDRESSCITY()) {
                            companyDetails.setADDRESSCITY(add.getADDRESSCITY());
                        } else {
                            companyDetails.setADDRESSCITY("");
                        }
                        if (null != add.getADDRESSCOUNTRY()) {
                            companyDetails.setADDRESSCOUNTRY(add.getADDRESSCOUNTRY());
                        } else {
                            companyDetails.setADDRESSCOUNTRY("");
                        }
                        if (null != add.getURL()) {
                            companyDetails.setURL(add.getURL());
                        } else {
                            companyDetails.setURL("");
                        }
                        companyDetails.setInsertDate(new Date());
                        if (null != add.getID()) {
                            companyDetailsMapper.insert(companyDetails);
                        }

                    }//VesselDetails
                    if(null !=eachentity.getVesselDetailsList()){
                        vesselDetails = new VesselDetails();
                        for (VesselDetails add : eachentity.getVesselDetailsList()) {
                            vesselDetails.setID(add.getID());
                            vesselDetails.setE_ID(eachentity.getID());
                            if (null == add.getVESSELCALLSIGN()) {
                                vesselDetails.setVESSELCALLSIGN("");
                            } else {
                                vesselDetails.setVESSELCALLSIGN(add.getVESSELCALLSIGN());

                            }
                            if (null == add.getVESSELTYPE()) {
                                vesselDetails.setVESSELTYPE("");
                            } else {
                                vesselDetails.setVESSELTYPE(add.getVESSELTYPE());
                            }
                            if (null == add.getVESSELTONNAGE()) {
                                vesselDetails.setVESSELTONNAGE("");
                            } else {
                                vesselDetails.setVESSELTONNAGE(add.getVESSELTONNAGE());
                            }
                            if (null == add.getVESSELGRT()) {
                                vesselDetails.setVESSELGRT("");
                            } else {
                                vesselDetails.setVESSELGRT(add.getVESSELGRT());
                            }
                            if (null == add.getVESSELOWNER()) {
                                vesselDetails.setVESSELOWNER("");
                            } else {
                                vesselDetails.setVESSELOWNER(add.getVESSELOWNER());
                            }
                            if (null == add.getVESSELFLAG()) {
                                vesselDetails.setVESSELFLAG("");
                            } else {
                                vesselDetails.setVESSELFLAG(add.getVESSELFLAG());
                            }
                            vesselDetails.setInsertDate(new Date());
                            if (null != add.getID()) {
                                vesselDetailsMapper.insert(vesselDetails);
                            }

                        }
                    }


                    //countrydetails
                    countryDetails.setID(eachentity.getCountryDetails().getID());
                    countryDetails.setP_ID(0);
                    countryDetails.setE_ID(entity.getID());
                    countryDetails.setInsertDate(new Date());
                    countryDetailsMapper.insert(countryDetails);

                    if (null != eachentity.getCountries_entity()) {
                        country = new Country();
                        for (Country con : eachentity.getCountries_entity()) {
                            country.setID(con.getID());
                            country.setCOUNTRYDETAILS_ID(countryDetails.getID());
                            if (null != con.getCOUNTRY_COUNTRYTYPE()) {
                                country.setCOUNTRY_COUNTRYTYPE(con.getCOUNTRY_COUNTRYTYPE());
                            } else {
                                country.setCOUNTRY_COUNTRYTYPE("");
                            }
                            country.setInsertDate(new Date());
                            countryMapper.insert(country);
                            //countryvalue
                            countryValue = new CountryValue();
                            countryValue.setID(con.getCountryValue().getID());
                            countryValue.setCOUNTRY_ID(country.getID());
                            if (null != con.getCountryValue().getCOUNTRYVALUE_CODE()) {
                                countryValue.setCOUNTRYVALUE_CODE(con.getCountryValue().getCOUNTRYVALUE_CODE());
                            } else {
                                countryValue.setCOUNTRYVALUE_CODE("");
                            }
                            countryValue.setInsertDate(new Date());
                            countryValueMapper.insert(countryValue);
                        }
                    }



                if (null != eachentity.getIdNumberTypes()) {
                    //idnumtype
                    idNumberTypes = new IDNumberTypes();
                    idNumberTypes.setID(eachentity.getIdNumberTypes().getID());
                    idNumberTypes.setP_ID(0);
                    idNumberTypes.setE_ID(eachentity.getID());
                    idNumberTypes.setInsertDate(new Date());
                    idNumberTypesMapper.insert(idNumberTypes);
                    //idnumtypeid
                    idNumberTypes_id = new IDNumberTypes_ID();
                    for (IDNumberTypes_ID idNumberTypesId : eachentity.getIdNumberTypes_ids_entity()) {
                        idNumberTypes_id.setID(idNumberTypesId.getID());
                        idNumberTypes_id.setIDNUMBERTYPES_ID(idNumberTypes.getID());
                        if (null != idNumberTypesId.getID_IDTYPE()) {
                            idNumberTypes_id.setID_IDTYPE(idNumberTypesId.getID_IDTYPE());
                        } else {
                            idNumberTypes_id.setID_IDTYPE("");
                        }
                        idNumberTypes_id.setInsertDate(new Date());
                        if (null != idNumberTypes.getID()) {
                            idNumberTypes_idMapper.insert(idNumberTypes_id);
                        }

                        idValue = new IDValue();
                        idValue.setID(idNumberTypesId.getIdValue().getID());
                        idValue.setID_ID(idNumberTypes_id.getID());
                        if (null != idNumberTypesId.getIdValue().getIDVALUE_IDNOTES()) {
                            idValue.setIDVALUE_IDNOTES(idNumberTypesId.getIdValue().getIDVALUE_IDNOTES());
                        } else {
                            idValue.setIDVALUE_IDNOTES("null".getBytes());
                        }
                        if (null != idNumberTypesId.getIdValue().getIDVALUE_IDVALUEVALUE()) {
                            idValue.setIDVALUE_IDVALUEVALUE(idNumberTypesId.getIdValue().getIDVALUE_IDVALUEVALUE());
                        } else {
                            idValue.setIDVALUE_IDVALUEVALUE("");
                        }


                        if (null != idNumberTypes_id.getID()) {
                            idValue.setInsertDate(new Date());
                            idValueMapper.insert(idValue);
                        }

                    }
                }


                //sourcedescription
                sourceDescription = new SourceDescription();
                sourceDescription.setID(eachentity.getSourceDescription().getID());
                sourceDescription.setE_ID(eachentity.getID());
                sourceDescription.setP_ID(0);
                sourceDescription.setInsertDate(new Date());
                sourceDescriptionMapper.insert(sourceDescription);

                //source
                if (null != eachentity.getSources_entity()) {
                    source = new Source();
                    for (Source i : eachentity.getSources_entity()) {
                        source.setID(i.getID());
                        source.setSOURCEDESCRIPTION_ID(sourceDescription.getID());
                        if (null != i.getSOURCE_NAME()) {
                            source.setSOURCE_NAME(i.getSOURCE_NAME());
                        } else {
                            source.setSOURCE_NAME("");
                        }
                        source.setInsertDate(new Date());
                        if (null != sourceDescription.getID()) {
                            sourceMapper.insert(source);
                        }

                    }
                }

                }
                }


            //PublicFigure
       //     logger.error("PublicFigure start"+ JSON.toJSON(eachpfa.getPublicFigures()).toString());
            if(null != eachpfa.getPublicFigures())
                publicFigure = new PublicFigure();
                for (PublicFigure f : eachpfa.getPublicFigures()) {
                    publicFigure.setID(f.getID());
                    publicFigure.setPFA_ID(pfa.getID());
                    publicFigure.setPF_ID(f.getPF_ID());
                    publicFigure.setInsertDate(new Date());
                    log.debug(f.toString());
                    publicFigureMapper.insert(publicFigure);

                    //aasociate
                    for (Associate a : f.getAssociates_pub()) {
                        associate.setID(a.getID());
                        associate.setPF_ID(publicFigure.getPF_ID());
                        associate.setSE_ID(0);
                        if (null != a.getASSOCIATE_ID()) {
                            associate.setASSOCIATE_ID(a.getASSOCIATE_ID());
                        } else {
                            associate.setASSOCIATE_ID("");
                        }
                        if (null != a.getASSOCIATE_CODE()) {
                            associate.setASSOCIATE_CODE(a.getASSOCIATE_CODE());
                        } else {
                            associate.setASSOCIATE_CODE("");
                        }
                        if (null != a.getASSOCIATE_EX()) {
                            associate.setASSOCIATE_EX(a.getASSOCIATE_EX());
                        } else {
                            associate.setASSOCIATE_EX("");
                        }
                        associate.setInsertDate(new Date());
                        //log.debug(associate.toString());
                        associateMapper.insert(associate);
                    }
                }



             //SpecialEntity
            if(null !=eachpfa.getSpecialEntities()){
                specialEntity = new SpecialEntity();
                for (SpecialEntity f : eachpfa.getSpecialEntities()) {
                    specialEntity.setID(f.getID());
                    specialEntity.setPFA_ID(pfa.getID());
                    specialEntity.setSE_ID(f.getSE_ID());
                    specialEntity.setInsertDate(new Date());
                    log.debug(specialEntity.toString());
                    specialEntityMapper.insert(specialEntity);

                    //aasociate
                    for (Associate a : f.getAssociates_spec()) {
                        associate.setID(a.getID());
                        associate.setPF_ID(0);
                        associate.setSE_ID(a.getSE_ID());
                        if (null != a.getASSOCIATE_ID()) {
                            associate.setASSOCIATE_ID(a.getASSOCIATE_ID());
                        } else {
                            associate.setASSOCIATE_ID("");
                        }
                        if (null != a.getASSOCIATE_CODE()) {
                            associate.setASSOCIATE_CODE(a.getASSOCIATE_CODE());
                        } else {
                            associate.setASSOCIATE_CODE("");
                        }
                        if (null != a.getASSOCIATE_EX()) {
                            associate.setASSOCIATE_EX(a.getASSOCIATE_EX());
                        } else {
                            associate.setASSOCIATE_EX("");
                        }
                        associate.setInsertDate(new Date());
                        log.debug(associate.toString()+"111111");
                        associateMapper.insert(associate);
                    }
                }
            }
            pfaMapper.insert(pfa);
        }

        }


    }

