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
 * Payment detail
 *                                a) Payment Item Internal Number
 *                                b) Payment Order Code (e.g.FPP, COS,...)
 *                                c) Paid Amount                               
 *             
 * 
 * <p>PaymentDetail.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentItemInternalNumber" type="{}PaymentItemInternalNumber.V1.0.CT"/>
 *         &lt;element name="PaymentCode" type="{}PaymentCode.V1.0.CT"/>
 *         &lt;element name="PaymentCodeAmount" type="{}Amount.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail.V1.0.CT", propOrder = {
    "paymentItemInternalNumber",
    "paymentCode",
    "paymentCodeAmount"
})
public class PaymentDetailV10CT {

    @XmlElement(name = "PaymentItemInternalNumber", required = true)
    protected PaymentItemInternalNumberV10CT paymentItemInternalNumber;
    @XmlElement(name = "PaymentCode", required = true)
    protected PaymentCodeV10CT paymentCode;
    @XmlElement(name = "PaymentCodeAmount", required = true)
    protected AmountV10CT paymentCodeAmount;

    /**
     * ��ȡpaymentItemInternalNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PaymentItemInternalNumberV10CT }
     *     
     */
    public PaymentItemInternalNumberV10CT getPaymentItemInternalNumber() {
        return paymentItemInternalNumber;
    }

    /**
     * ����paymentItemInternalNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentItemInternalNumberV10CT }
     *     
     */
    public void setPaymentItemInternalNumber(PaymentItemInternalNumberV10CT value) {
        this.paymentItemInternalNumber = value;
    }

    /**
     * ��ȡpaymentCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PaymentCodeV10CT }
     *     
     */
    public PaymentCodeV10CT getPaymentCode() {
        return paymentCode;
    }

    /**
     * ����paymentCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCodeV10CT }
     *     
     */
    public void setPaymentCode(PaymentCodeV10CT value) {
        this.paymentCode = value;
    }

    /**
     * ��ȡpaymentCodeAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getPaymentCodeAmount() {
        return paymentCodeAmount;
    }

    /**
     * ����paymentCodeAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setPaymentCodeAmount(AmountV10CT value) {
        this.paymentCodeAmount = value;
    }

}
