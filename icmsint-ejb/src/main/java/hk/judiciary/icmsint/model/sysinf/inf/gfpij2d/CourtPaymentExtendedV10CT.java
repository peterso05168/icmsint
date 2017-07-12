//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 	Court Payment
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Interface ID
 * 				c) Payment Sequence Number
 * 				d) Party Type
 * 				e) Party Number
 * 				f) Payment Date
 * 				g) Payment Center
 * 				h) Payment Type
 * 				i) Receipt Type
 * 				j) Demand Note Number
 *                 k) Dishonored Cheque Indicator
 * 				l) Receipt Number
 * 				m) Receipt Status
 * 				n) Payment Object
 * 			
 * 
 * <p>CourtPaymentExtended.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CourtPaymentExtended.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="PaymentSequenceNumber" type="{}PaymentSequenceNumber.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{}PartyType.V1.0.CT"/>
 *         &lt;element name="PartyNo" type="{}PartyNo.V1.0.CT"/>
 *         &lt;element name="PaymentDate" type="{CCT}Date.CT"/>
 *         &lt;element name="PaymentCentre" type="{}PaymentCentre.V1.0.CT"/>
 *         &lt;element name="PaymentTypeCode" type="{}PaymentTypeCode.V1.0.CT"/>
 *         &lt;element name="PaymentMethod" type="{}PaymentMethod.V1.0.CT"/>
 *         &lt;element name="DishonoredChequeIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="ReceiptNumber" type="{}ReceiptNumber.V1.0.CT"/>
 *             &lt;element name="ReceiptStatus" type="{}ReceiptStatus.V1.0.CT"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *             &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *             &lt;element name="ReceiptID" type="{}ReceiptID.V1.0.CT"/>
 *             &lt;element name="RecordStatus" type="{}RecordStatus.V1.1.CT"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="Payments" type="{}Payments.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtPaymentExtended.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "caseNumber",
    "paymentSequenceNumber",
    "prosecutionDepartmentCode",
    "departmentReferenceNumber",
    "partyType",
    "partyNo",
    "paymentDate",
    "paymentCentre",
    "paymentTypeCode",
    "paymentMethod",
    "dishonoredChequeIndicator",
    "receiptNumber",
    "receiptStatus",
    "interfaceDate",
    "demandNoteNumber",
    "receiptID",
    "recordStatus",
    "payments"
})
public class CourtPaymentExtendedV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "PaymentSequenceNumber", required = true)
    protected PaymentSequenceNumberV10CT paymentSequenceNumber;
    @XmlElement(name = "ProsecutionDepartmentCode")
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "DepartmentReferenceNumber")
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "PartyType", required = true)
    protected PartyTypeV10CT partyType;
    @XmlElement(name = "PartyNo", required = true)
    protected PartyNoV10CT partyNo;
    @XmlElement(name = "PaymentDate", required = true)
    protected DateCT paymentDate;
    @XmlElement(name = "PaymentCentre", required = true)
    protected PaymentCentreV10CT paymentCentre;
    @XmlElement(name = "PaymentTypeCode", required = true)
    protected PaymentTypeCodeV10CT paymentTypeCode;
    @XmlElement(name = "PaymentMethod", required = true)
    protected PaymentMethodV10CT paymentMethod;
    @XmlElement(name = "DishonoredChequeIndicator", required = true)
    protected FieldIndicatorV10CT dishonoredChequeIndicator;
    @XmlElement(name = "ReceiptNumber")
    protected ReceiptNumberV10CT receiptNumber;
    @XmlElement(name = "ReceiptStatus")
    protected ReceiptStatusV10CT receiptStatus;
    @XmlElement(name = "InterfaceDate")
    protected DateCT interfaceDate;
    @XmlElement(name = "DemandNoteNumber")
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "ReceiptID")
    protected ReceiptIDV10CT receiptID;
    @XmlElement(name = "RecordStatus")
    protected RecordStatusV11CT recordStatus;
    @XmlElement(name = "Payments", required = true)
    protected PaymentsV10CT payments;

    /**
     * 获取recordPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixV12CT }
     *     
     */
    public PrefixV12CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * 设置recordPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV12CT }
     *     
     */
    public void setRecordPrefix(PrefixV12CT value) {
        this.recordPrefix = value;
    }

    /**
     * 获取interfaceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public InterfaceIDV10CT getInterfaceID() {
        return interfaceID;
    }

    /**
     * 设置interfaceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public void setInterfaceID(InterfaceIDV10CT value) {
        this.interfaceID = value;
    }

    /**
     * 获取caseNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getCaseNumber() {
        return caseNumber;
    }

    /**
     * 设置caseNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setCaseNumber(CaseNumberV10CT value) {
        this.caseNumber = value;
    }

    /**
     * 获取paymentSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentSequenceNumberV10CT }
     *     
     */
    public PaymentSequenceNumberV10CT getPaymentSequenceNumber() {
        return paymentSequenceNumber;
    }

    /**
     * 设置paymentSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSequenceNumberV10CT }
     *     
     */
    public void setPaymentSequenceNumber(PaymentSequenceNumberV10CT value) {
        this.paymentSequenceNumber = value;
    }

    /**
     * 获取prosecutionDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public ProsecutionDepartmentCodeV11CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * 设置prosecutionDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public void setProsecutionDepartmentCode(ProsecutionDepartmentCodeV11CT value) {
        this.prosecutionDepartmentCode = value;
    }

    /**
     * 获取departmentReferenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public DepartmentReferenceNumberV10CT getDepartmentReferenceNumber() {
        return departmentReferenceNumber;
    }

    /**
     * 设置departmentReferenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public void setDepartmentReferenceNumber(DepartmentReferenceNumberV10CT value) {
        this.departmentReferenceNumber = value;
    }

    /**
     * 获取partyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyTypeV10CT }
     *     
     */
    public PartyTypeV10CT getPartyType() {
        return partyType;
    }

    /**
     * 设置partyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTypeV10CT }
     *     
     */
    public void setPartyType(PartyTypeV10CT value) {
        this.partyType = value;
    }

    /**
     * 获取partyNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyNoV10CT }
     *     
     */
    public PartyNoV10CT getPartyNo() {
        return partyNo;
    }

    /**
     * 设置partyNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyNoV10CT }
     *     
     */
    public void setPartyNo(PartyNoV10CT value) {
        this.partyNo = value;
    }

    /**
     * 获取paymentDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getPaymentDate() {
        return paymentDate;
    }

    /**
     * 设置paymentDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setPaymentDate(DateCT value) {
        this.paymentDate = value;
    }

    /**
     * 获取paymentCentre属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentCentreV10CT }
     *     
     */
    public PaymentCentreV10CT getPaymentCentre() {
        return paymentCentre;
    }

    /**
     * 设置paymentCentre属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCentreV10CT }
     *     
     */
    public void setPaymentCentre(PaymentCentreV10CT value) {
        this.paymentCentre = value;
    }

    /**
     * 获取paymentTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeCodeV10CT }
     *     
     */
    public PaymentTypeCodeV10CT getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * 设置paymentTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeCodeV10CT }
     *     
     */
    public void setPaymentTypeCode(PaymentTypeCodeV10CT value) {
        this.paymentTypeCode = value;
    }

    /**
     * 获取paymentMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodV10CT }
     *     
     */
    public PaymentMethodV10CT getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置paymentMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodV10CT }
     *     
     */
    public void setPaymentMethod(PaymentMethodV10CT value) {
        this.paymentMethod = value;
    }

    /**
     * 获取dishonoredChequeIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getDishonoredChequeIndicator() {
        return dishonoredChequeIndicator;
    }

    /**
     * 设置dishonoredChequeIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setDishonoredChequeIndicator(FieldIndicatorV10CT value) {
        this.dishonoredChequeIndicator = value;
    }

    /**
     * 获取receiptNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReceiptNumberV10CT }
     *     
     */
    public ReceiptNumberV10CT getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * 设置receiptNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptNumberV10CT }
     *     
     */
    public void setReceiptNumber(ReceiptNumberV10CT value) {
        this.receiptNumber = value;
    }

    /**
     * 获取receiptStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReceiptStatusV10CT }
     *     
     */
    public ReceiptStatusV10CT getReceiptStatus() {
        return receiptStatus;
    }

    /**
     * 设置receiptStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptStatusV10CT }
     *     
     */
    public void setReceiptStatus(ReceiptStatusV10CT value) {
        this.receiptStatus = value;
    }

    /**
     * 获取interfaceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getInterfaceDate() {
        return interfaceDate;
    }

    /**
     * 设置interfaceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setInterfaceDate(DateCT value) {
        this.interfaceDate = value;
    }

    /**
     * 获取demandNoteNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DemandNoteNumberV11CT }
     *     
     */
    public DemandNoteNumberV11CT getDemandNoteNumber() {
        return demandNoteNumber;
    }

    /**
     * 设置demandNoteNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DemandNoteNumberV11CT }
     *     
     */
    public void setDemandNoteNumber(DemandNoteNumberV11CT value) {
        this.demandNoteNumber = value;
    }

    /**
     * 获取receiptID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReceiptIDV10CT }
     *     
     */
    public ReceiptIDV10CT getReceiptID() {
        return receiptID;
    }

    /**
     * 设置receiptID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptIDV10CT }
     *     
     */
    public void setReceiptID(ReceiptIDV10CT value) {
        this.receiptID = value;
    }

    /**
     * 获取recordStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordStatusV11CT }
     *     
     */
    public RecordStatusV11CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置recordStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV11CT }
     *     
     */
    public void setRecordStatus(RecordStatusV11CT value) {
        this.recordStatus = value;
    }

    /**
     * 获取payments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentsV10CT }
     *     
     */
    public PaymentsV10CT getPayments() {
        return payments;
    }

    /**
     * 设置payments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsV10CT }
     *     
     */
    public void setPayments(PaymentsV10CT value) {
        this.payments = value;
    }

}
