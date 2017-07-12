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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A character string (i.e. a finite set of characters) generally in the form of words of a language.
 * 			  languageCode - The code of the language used in the corresponding text as defined in ISO 639.
 * 			
 * 
 * <p>Text.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Text.CT">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Text.CT", namespace = "CCT", propOrder = {
    "value"
})
@XmlSeeAlso({
    PaymentParameterV10CT.class,
    OffenceCodeV10CT.class,
    PhoneNumberV10CT.class,
    OffenceDescriptionV12CT.class,
    VariableNumberV10CT.class,
    AuthorizeUserIDV10CT.class,
    SupplementCodeV10CT.class,
    ReportFrequencyV10CT.class,
    ChineseAddressLineV11CT.class,
    AmendmentDataNameV10CT.class,
    DocumentTypeV10CT.class,
    SubLegislativeV11CT.class,
    LawV10CT.class,
    SpecialArrangementV10CT.class,
    OffenceDescriptionChineseV12CT.class,
    OffenceVarValueChineseV10CT.class,
    SectionV11CT.class,
    AppealRegisterNumberV10CT.class,
    OffenceDescriptionChineseV11CT.class,
    VehicleRegistrationMarkDigitV10CT.class,
    AmendmentDataValueV10CT.class,
    AddressLineV10CT.class,
    DemandNoteNumberV11CT.class,
    ParagraphV11CT.class,
    ItemToBeBroughtV10CT.class,
    SubParagraphV11CT.class,
    RelationshipTextV10CT.class,
    DemandNoteNumberV10CT.class,
    OffenceCodeTypeV10CT.class,
    DocumentTitleV10CT.class,
    SectionV10CT.class,
    InterfaceIDV10CT.class,
    ContraryToLawV10CT.class,
    StaffNumberV10CT.class,
    VariableDescriptionV10CT.class,
    LEAReferenceNumberV10CT.class,
    VariableDescriptionChineseV10CT.class,
    VersionNumberV11CT.class,
    HrngGroupIDV10CT.class,
    FixedPenaltyApplicationNatureV10CT.class,
    ApplicationSourceIDV10CT.class,
    SubParagraphV10CT.class,
    LawChineseV10CT.class,
    OffenceDescriptionChineseV10CT.class,
    AdditionalSectionV10CT.class,
    MWISNoticeNumberV10CT.class,
    ShortDescriptionV10CT.class,
    ChargeParticularChineseV10CT.class,
    DqrEntitlementListV10CT.class,
    InterfaceOffenceCodeV10CT.class,
    ParagraphV10CT.class,
    ShortDescriptionChineseV10CT.class,
    OtherIDNumberV10CT.class,
    OffenceDescriptionV10CT.class,
    VariableDescriptionChineseV11CT.class,
    PhoneNumberV11CT.class,
    RemarkLineV10CT.class,
    LawChineseV11CT.class,
    ChargeParticularV10CT.class,
    BailRemandIdentifierV10CT.class,
    EnglishAddressLineV11CT.class,
    ContraryToLawChineseV10CT.class,
    InputUserIDV10CT.class,
    VehicleRegistrationMarkV10CT.class,
    ShortDescriptionChineseV11CT.class,
    SubSectionV10CT.class,
    SubLegislativeV10CT.class,
    HearingResultDescriptionV10CT.class,
    OffenceDescriptionV11CT.class,
    BailConditionV10CT.class,
    OffenceDescriptionChineseV13CT.class,
    SubSectionV11CT.class,
    DocumentFormatV10CT.class,
    SupplementCodeV11CT.class,
    OffenceVarValueV10CT.class,
    OffenceDateFreetextV10CT.class,
    HostReturnCodeV10CT.class,
    ChineseCommercialCodeExtensionNumberTextV10CT.class,
    ChineseCommercialCodeFourDigitCodeTextV10CT.class,
    PersonEnglishStructuredNamePersonNamePrefixTextV10CT.class,
    PersonEnglishStructuredNamePersonNameSuffixTextV10CT.class,
    HKIDNumberCheckDigitTextV10CT.class
})
public class TextCT {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "languageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;

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
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
