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
 * court payment for distress warrant information consists of
 * 				a) Record Prefix
 * 				b) Interface Date
 * 				c) Payment Date
 * 				d) Payment Centre
 * 				e) Receipt Type
 * 				f) Department Reference Number
 * 				g) Distress Warrant Case Number
 * 				h) Court Costs Amount
 * 				i) Dishonored Cheque Indicator
 * 				j) Receipt ID
 * 				k) Record Status
 *             
 * 
 * <p>FixedPenaltyDistressWarrantCourtPayment.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyDistressWarrantCourtPayment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.1.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="PaymentDate" type="{CCT}Date.CT"/>
 *         &lt;element name="PaymentCentre" type="{}PaymentCentre.V1.0.CT"/>
 *         &lt;element name="ReceiptType" type="{}PaymentMethod.V1.0.CT"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *         &lt;element name="DistressWarrantNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="DistressWarrantCosts" type="{}Amount.V1.1.CT"/>
 *         &lt;element name="DishonoredChequeIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="ReceiptID" type="{}ReceiptID.V1.0.CT"/>
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyDistressWarrantCourtPayment.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceDate",
    "paymentDate",
    "paymentCentre",
    "receiptType",
    "departmentReferenceNumber",
    "distressWarrantNumber",
    "distressWarrantCosts",
    "dishonoredChequeIndicator",
    "receiptID",
    "recordStatus"
})
public class FixedPenaltyDistressWarrantCourtPaymentV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV11CT recordPrefix;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "PaymentDate", required = true)
    protected DateCT paymentDate;
    @XmlElement(name = "PaymentCentre", required = true)
    protected PaymentCentreV10CT paymentCentre;
    @XmlElement(name = "ReceiptType", required = true)
    protected PaymentMethodV10CT receiptType;
    @XmlElement(name = "DepartmentReferenceNumber", required = true)
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "DistressWarrantNumber", required = true)
    protected CaseNumberV10CT distressWarrantNumber;
    @XmlElement(name = "DistressWarrantCosts", required = true)
    protected AmountV11CT distressWarrantCosts;
    @XmlElement(name = "DishonoredChequeIndicator", required = true)
    protected FieldIndicatorV10CT dishonoredChequeIndicator;
    @XmlElement(name = "ReceiptID", required = true)
    protected ReceiptIDV10CT receiptID;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV11CT recordStatus;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PrefixV11CT }
     *     
     */
    public PrefixV11CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * ����recordPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV11CT }
     *     
     */
    public void setRecordPrefix(PrefixV11CT value) {
        this.recordPrefix = value;
    }

    /**
     * ��ȡinterfaceDate���Ե�ֵ��
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
     * ����interfaceDate���Ե�ֵ��
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
     * ��ȡreceiptType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodV10CT }
     *     
     */
    public PaymentMethodV10CT getReceiptType() {
        return receiptType;
    }

    /**
     * ����receiptType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodV10CT }
     *     
     */
    public void setReceiptType(PaymentMethodV10CT value) {
        this.receiptType = value;
    }

    /**
     * ��ȡdepartmentReferenceNumber���Ե�ֵ��
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
     * ����departmentReferenceNumber���Ե�ֵ��
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
     * ��ȡdistressWarrantNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getDistressWarrantNumber() {
        return distressWarrantNumber;
    }

    /**
     * ����distressWarrantNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setDistressWarrantNumber(CaseNumberV10CT value) {
        this.distressWarrantNumber = value;
    }

    /**
     * ��ȡdistressWarrantCosts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmountV11CT }
     *     
     */
    public AmountV11CT getDistressWarrantCosts() {
        return distressWarrantCosts;
    }

    /**
     * ����distressWarrantCosts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV11CT }
     *     
     */
    public void setDistressWarrantCosts(AmountV11CT value) {
        this.distressWarrantCosts = value;
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
     * ��ȡreceiptID���Ե�ֵ��
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
     * ����receiptID���Ե�ֵ��
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
     * ��ȡrecordStatus���Ե�ֵ��
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
     * ����recordStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV11CT }
     *     
     */
    public void setRecordStatus(RecordStatusV11CT value) {
        this.recordStatus = value;
    }

}
