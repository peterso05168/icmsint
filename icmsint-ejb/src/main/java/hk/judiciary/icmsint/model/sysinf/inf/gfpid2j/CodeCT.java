//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A character string (letters, figures or symbols) that for brevity and/or language independence may be used to represent or replace a definitive value or text of an attribute.
 * 			  agencyId - The identification of the agency that maintains the code list.
 * 			  agencyName - The name of the agency that maintains the code list.
 * 			  codeListId - The identification of the code list, e.g. the URL of a source that publishes the code list.
 * 			  codeListName - The name of the code list.
 * 			  codeListVersion - The version of the code list.
 * 			  codeName - The textual equivalent of the code content.
 * 			
 * 
 * <p>Code.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Code.CT">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="agencyId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="agencyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="codeListId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="codeListName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="codeListVersion" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="codeName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.CT", namespace = "CCT", propOrder = {
    "value"
})
@XmlSeeAlso({
    BailBookSerialNumberV10CT.class,
    ChargeTypeV10CT.class,
    IdentificationTypeV10CT.class,
    TimeBarMethodV10CT.class,
    StatusV10CT.class,
    BailTypeV10CT.class,
    OffenceDescFormatV10CT.class,
    CaseTypeV10CT.class,
    AmendmentActionV10CT.class,
    ProcessStatusV10CT.class,
    AddressTerritoryV10CT.class,
    HearingOutcomeV10CT.class,
    PeriodTypeV10CT.class,
    PleaTypeV10CT.class,
    PrefixV13CT.class,
    RecordStatusV10CT.class,
    HearingMagistrateCodeV11CT.class,
    RecordTypeV10CT.class,
    ApplicationStatusV10CT.class,
    DqrEntitlementIndV10CT.class,
    AppealAppliedPartyV10CT.class,
    CurrencyCodeV10CT.class,
    DocumentStatusV10CT.class,
    OffenceDateTypeV10CT.class,
    PartyTypeV10CT.class,
    RecordStatusV12CT.class,
    LanguageV11CT.class,
    BailiffDistrictCodeV10CT.class,
    RecordStatusV11CT.class,
    DefendantTypeV10CT.class,
    ReviewAppliedPartyV10CT.class,
    DistrictCodeV10CT.class,
    ApplyPartyV10CT.class,
    PaymentTypeV10CT.class,
    LanguageV10CT.class,
    PreferredWarrantTypeV10CT.class,
    ProsecutionDepartmentStationV10CT.class,
    FixedPenaltyFineCodeV10CT.class,
    PrefixV10CT.class,
    BailiffDistrictV10CT.class,
    SubmitPartyV10CT.class,
    BailRegisterNumberV10CT.class,
    DICTypeV10CT.class,
    DepartmentReferenceNumberV10CT.class,
    PrefixV11CT.class,
    FixedPenaltyCostsCodeV10CT.class,
    ProsecutionDepartmentUnitV10CT.class,
    HearingTypeV10CT.class,
    HearingMagistrateCodeV10CT.class,
    OffenceDateFormatV10CT.class,
    RelationshipCodeV10CT.class,
    DICTypeV11CT.class,
    IDNumberTypeV10CT.class,
    DocumentReferenceNumberV10CT.class,
    OrderCodeV10CT.class,
    CourtSysV10CT.class,
    PrefixV12CT.class,
    PersonGenderCodeV10CT.class,
    HKSARGDepartmentCodeV10CT.class
})
public class CodeCT {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "agencyId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String agencyId;
    @XmlAttribute(name = "agencyName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String agencyName;
    @XmlAttribute(name = "codeListId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codeListId;
    @XmlAttribute(name = "codeListName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codeListName;
    @XmlAttribute(name = "codeListVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codeListVersion;
    @XmlAttribute(name = "codeName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codeName;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取agencyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * 设置agencyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyId(String value) {
        this.agencyId = value;
    }

    /**
     * 获取agencyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * 设置agencyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * 获取codeListId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListId() {
        return codeListId;
    }

    /**
     * 设置codeListId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListId(String value) {
        this.codeListId = value;
    }

    /**
     * 获取codeListName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListName() {
        return codeListName;
    }

    /**
     * 设置codeListName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListName(String value) {
        this.codeListName = value;
    }

    /**
     * 获取codeListVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * 设置codeListVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

    /**
     * 获取codeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 设置codeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeName(String value) {
        this.codeName = value;
    }

}
