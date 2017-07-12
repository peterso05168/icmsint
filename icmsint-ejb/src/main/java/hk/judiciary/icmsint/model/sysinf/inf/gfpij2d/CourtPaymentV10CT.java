//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
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
 * 				j) Dishonored Cheque Indicator
 * 				k) Receipt Number
 * 				l) Receipt Status
 * 				m) Payment Object				
 * 			
 * 
 * <p>CourtPayment.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CourtPayment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="PaymentSequenceNumber" type="{}PaymentSequenceNumber.V1.0.CT"/>
 *         &lt;element name="PartyType" type="{}PartyType.V1.0.CT"/>
 *         &lt;element name="PartyNo" type="{}PartyNo.V1.0.CT"/>
 *         &lt;element name="PaymentDate" type="{CCT}Date.CT"/>
 *         &lt;element name="PaymentCentre" type="{}PaymentCentre.V1.0.CT"/>
 *         &lt;element name="PaymentTypeCode" type="{}PaymentTypeCode.V1.0.CT"/>
 *         &lt;element name="PaymentMethod" type="{}PaymentMethod.V1.0.CT"/>
 *         &lt;element name="DishonoredChequeIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="ReceiptNumber" type="{}ReceiptNumber.V1.0.CT"/>
 *         &lt;element name="ReceiptStatus" type="{}ReceiptStatus.V1.0.CT"/>
 *         &lt;element name="Payments" type="{}Payments.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtPayment.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "paymentSequenceNumber",
    "partyType",
    "partyNo",
    "paymentDate",
    "paymentCentre",
    "paymentTypeCode",
    "paymentMethod",
    "dishonoredChequeIndicator",
    "receiptNumber",
    "receiptStatus",
    "payments"
})
public class CourtPaymentV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "PaymentSequenceNumber", required = true)
    protected PaymentSequenceNumberV10CT paymentSequenceNumber;
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
    @XmlElement(name = "ReceiptNumber", required = true)
    protected ReceiptNumberV10CT receiptNumber;
    @XmlElement(name = "ReceiptStatus", required = true)
    protected ReceiptStatusV10CT receiptStatus;
    @XmlElement(name = "Payments", required = true)
    protected PaymentsV10CT payments;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PrefixV10CT }
     *     
     */
    public PrefixV10CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * ����recordPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV10CT }
     *     
     */
    public void setRecordPrefix(PrefixV10CT value) {
        this.recordPrefix = value;
    }

    /**
     * ��ȡinterfaceID���Ե�ֵ��
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
     * ����interfaceID���Ե�ֵ��
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
     * ��ȡpaymentSequenceNumber���Ե�ֵ��
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
     * ����paymentSequenceNumber���Ե�ֵ��
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
     * ��ȡpartyType���Ե�ֵ��
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
     * ����partyType���Ե�ֵ��
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
     * ��ȡpartyNo���Ե�ֵ��
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
     * ����partyNo���Ե�ֵ��
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
     * ��ȡpaymentDate���Ե�ֵ��
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
     * ����paymentDate���Ե�ֵ��
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
     * ��ȡpaymentCentre���Ե�ֵ��
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
     * ����paymentCentre���Ե�ֵ��
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
     * ��ȡpaymentTypeCode���Ե�ֵ��
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
     * ����paymentTypeCode���Ե�ֵ��
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
     * ��ȡpaymentMethod���Ե�ֵ��
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
     * ����paymentMethod���Ե�ֵ��
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
     * ��ȡdishonoredChequeIndicator���Ե�ֵ��
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
     * ����dishonoredChequeIndicator���Ե�ֵ��
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
     * ��ȡreceiptNumber���Ե�ֵ��
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
     * ����receiptNumber���Ե�ֵ��
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
     * ��ȡreceiptStatus���Ե�ֵ��
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
     * ����receiptStatus���Ե�ֵ��
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
     * ��ȡpayments���Ե�ֵ��
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
     * ����payments���Ե�ֵ��
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
