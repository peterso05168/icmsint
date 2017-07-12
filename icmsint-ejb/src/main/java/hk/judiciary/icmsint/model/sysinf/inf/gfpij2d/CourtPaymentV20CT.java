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
 * 				a) Record Prefix
 * 				b) Case Number
 * 				c) Prosecution Department Code
 * 				d) Department Reference Number /
 * 					Demand Note Number
 * 				e) Payment Sequence Number
 * 				f) Party Type
 * 				g) Party Number
 * 				h) Payment Date
 * 				i) Payment Center
 * 				j) Payment Type
 * 				k) Payment Method
 * 				l) Dishonored Cheque Indicator
 * 				m) Receipt Number / Receipt ID
 * 				n) Record Status
 * 					o) Payment Object
 * 						or
 * 					o) Penalty 
 * 					p) Additional Penalty
 * 					q) Court Costs
 * 			
 * 
 * <p>CourtPayment.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CourtPayment.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;choice>
 *           &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *           &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;/choice>
 *         &lt;element name="PaymentSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="PartyType" type="{}PartyType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PartyNo" type="{}PartyNo.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{CCT}Date.CT"/>
 *         &lt;element name="PaymentCentre" type="{}PaymentCentre.V1.0.CT"/>
 *         &lt;element name="PaymentTypeCode" type="{}PaymentTypeCode.V1.0.CT"/>
 *         &lt;element name="PaymentMethod" type="{}PaymentMethod.V1.0.CT"/>
 *         &lt;element name="DishonoredChequeIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;choice>
 *           &lt;element name="ReceiptNumber" type="{}ReceiptNumber.V1.0.CT"/>
 *           &lt;element name="ReceiptID" type="{}ReceiptID.V1.0.CT"/>
 *         &lt;/choice>
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.2.CT"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Payments" type="{}Payments.V1.0.CT"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="Penalty" type="{}Amount.V1.0.CT"/>
 *             &lt;element name="AdditionalPenalty" type="{}Amount.V1.0.CT"/>
 *             &lt;element name="CourtCosts" type="{}Amount.V1.0.CT"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtPayment.V2.0.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "departmentReferenceNumber",
    "demandNoteNumber",
    "paymentSequenceNumber",
    "partyType",
    "partyNo",
    "paymentDate",
    "paymentCentre",
    "paymentTypeCode",
    "paymentMethod",
    "dishonoredChequeIndicator",
    "receiptNumber",
    "receiptID",
    "recordStatus",
    "payments",
    "penalty",
    "additionalPenalty",
    "courtCosts"
})
public class CourtPaymentV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "DepartmentReferenceNumber")
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "DemandNoteNumber")
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "PaymentSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT paymentSequenceNumber;
    @XmlElement(name = "PartyType")
    protected PartyTypeV10CT partyType;
    @XmlElement(name = "PartyNo")
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
    @XmlElement(name = "ReceiptID")
    protected ReceiptIDV10CT receiptID;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV12CT recordStatus;
    @XmlElement(name = "Payments")
    protected PaymentsV10CT payments;
    @XmlElement(name = "Penalty")
    protected AmountV10CT penalty;
    @XmlElement(name = "AdditionalPenalty")
    protected AmountV10CT additionalPenalty;
    @XmlElement(name = "CourtCosts")
    protected AmountV10CT courtCosts;

    /**
     * 获取recordPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixV13CT }
     *     
     */
    public PrefixV13CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * 设置recordPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV13CT }
     *     
     */
    public void setRecordPrefix(PrefixV13CT value) {
        this.recordPrefix = value;
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
     * 获取paymentSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public RecordSequenceNumberV10CT getPaymentSequenceNumber() {
        return paymentSequenceNumber;
    }

    /**
     * 设置paymentSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public void setPaymentSequenceNumber(RecordSequenceNumberV10CT value) {
        this.paymentSequenceNumber = value;
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
     *     {@link RecordStatusV12CT }
     *     
     */
    public RecordStatusV12CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置recordStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV12CT }
     *     
     */
    public void setRecordStatus(RecordStatusV12CT value) {
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

    /**
     * 获取penalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getPenalty() {
        return penalty;
    }

    /**
     * 设置penalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setPenalty(AmountV10CT value) {
        this.penalty = value;
    }

    /**
     * 获取additionalPenalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getAdditionalPenalty() {
        return additionalPenalty;
    }

    /**
     * 设置additionalPenalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setAdditionalPenalty(AmountV10CT value) {
        this.additionalPenalty = value;
    }

    /**
     * 获取courtCosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getCourtCosts() {
        return courtCosts;
    }

    /**
     * 设置courtCosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setCourtCosts(AmountV10CT value) {
        this.courtCosts = value;
    }

}
