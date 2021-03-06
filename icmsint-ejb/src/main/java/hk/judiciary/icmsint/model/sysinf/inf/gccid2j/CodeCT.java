//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:51:00 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccid2j;

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
 * <p>Java class for Code.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Code.CT"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="agencyId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="agencyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="codeListId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="codeListName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="codeListVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="codeName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.CT", namespace = "CCT", propOrder = {
    "value"
})
@XmlSeeAlso({
    IdentificationTypeV10CT.class,
    IDNumberTypeV10CT.class,
    CourtSysV10CT.class,
    CaseTypeV10CT.class,
    HearingTypeV10CT.class,
    HearingMagistrateCodeV10CT.class,
    HearingMagistrateCodeV11CT.class,
    LanguageV10CT.class,
    LanguageV11CT.class,
    AddressTerritoryV10CT.class,
    DistrictCodeV10CT.class,
    DepartmentReferenceNumberV10CT.class,
    ProsecutionDepartmentUnitV10CT.class,
    ProsecutionDepartmentStationV10CT.class,
    DefendantTypeV10CT.class,
    BailiffDistrictCodeV10CT.class,
    StatusV10CT.class,
    FixedPenaltyFineCodeV10CT.class,
    FixedPenaltyCostsCodeV10CT.class,
    HearingOutcomeV10CT.class,
    DICTypeV10CT.class,
    DICTypeV11CT.class,
    DqrEntitlementIndV10CT.class,
    OrderCodeV10CT.class,
    CurrencyCodeV10CT.class,
    AppealAppliedPartyV10CT.class,
    ReviewAppliedPartyV10CT.class,
    PaymentTypeV10CT.class,
    PrefixV10CT.class,
    PrefixV11CT.class,
    PrefixV12CT.class,
    PrefixV13CT.class,
    OffenceDateFormatV10CT.class,
    TimeBarMethodV10CT.class,
    OffenceDescFormatV10CT.class,
    ProcessStatusV10CT.class,
    RecordStatusV10CT.class,
    RecordStatusV11CT.class,
    RecordStatusV12CT.class,
    ApplicationStatusV10CT.class,
    PartyTypeV10CT.class,
    PreferredWarrantTypeV10CT.class,
    RecordTypeV10CT.class,
    PleaTypeV10CT.class,
    AmendmentActionV10CT.class,
    ChargeTypeV10CT.class,
    OffenceDateTypeV10CT.class,
    PeriodTypeV10CT.class,
    BailTypeV10CT.class,
    RelationshipCodeV10CT.class,
    BailRegisterNumberV10CT.class,
    BailBookSerialNumberV10CT.class,
    AmendmentReferenceNumberV10CT.class,
    DocumentReferenceNumberV10CT.class,
    SubmitPartyV10CT.class,
    DocumentStatusV10CT.class,
    ApplyPartyV10CT.class,
    BailiffDistrictV10CT.class,
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
     * Gets the value of the value property.
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
     * Sets the value of the value property.
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
     * Gets the value of the agencyId property.
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
     * Sets the value of the agencyId property.
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
     * Gets the value of the agencyName property.
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
     * Sets the value of the agencyName property.
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
     * Gets the value of the codeListId property.
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
     * Sets the value of the codeListId property.
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
     * Gets the value of the codeListName property.
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
     * Sets the value of the codeListName property.
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
     * Gets the value of the codeListVersion property.
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
     * Sets the value of the codeListVersion property.
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
     * Gets the value of the codeName property.
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
     * Sets the value of the codeName property.
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
