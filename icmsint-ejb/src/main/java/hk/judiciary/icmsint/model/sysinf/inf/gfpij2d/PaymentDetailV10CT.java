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
 * Payment detail
 *                                a) Payment Item Internal Number
 *                                b) Payment Order Code (e.g.FPP, COS,...)
 *                                c) Paid Amount                               
 *             
 * 
 * <p>PaymentDetail.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取paymentItemInternalNumber属性的值。
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
     * 设置paymentItemInternalNumber属性的值。
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
     * 获取paymentCode属性的值。
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
     * 设置paymentCode属性的值。
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
     * 获取paymentCodeAmount属性的值。
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
     * 设置paymentCodeAmount属性的值。
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
