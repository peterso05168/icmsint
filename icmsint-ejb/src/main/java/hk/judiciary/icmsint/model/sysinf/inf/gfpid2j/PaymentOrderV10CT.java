//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * payment order details version 1.0 consists of
 * 								a) Payment Type
 * 								b) Payment Amount
 * 								c) Payment Currency
 * 								d) Payment Parameter
 * 
 *             
 * 
 * <p>PaymentOrder.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentOrder.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{}PaymentType.V1.0.CT"/>
 *         &lt;element name="Amount" type="{}Amount.V1.0.CT"/>
 *         &lt;element name="Currency" type="{}CurrencyCode.V1.0.CT"/>
 *         &lt;element name="Parameter" type="{}PaymentParameter.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOrder.V1.0.CT", propOrder = {
    "type",
    "amount",
    "currency",
    "parameter"
})
public class PaymentOrderV10CT {

    @XmlElement(name = "Type", required = true)
    protected PaymentTypeV10CT type;
    @XmlElement(name = "Amount", required = true)
    protected AmountV10CT amount;
    @XmlElement(name = "Currency", required = true)
    protected CurrencyCodeV10CT currency;
    @XmlElement(name = "Parameter")
    protected PaymentParameterV10CT parameter;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeV10CT }
     *     
     */
    public PaymentTypeV10CT getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeV10CT }
     *     
     */
    public void setType(PaymentTypeV10CT value) {
        this.type = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setAmount(AmountV10CT value) {
        this.amount = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeV10CT }
     *     
     */
    public CurrencyCodeV10CT getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeV10CT }
     *     
     */
    public void setCurrency(CurrencyCodeV10CT value) {
        this.currency = value;
    }

    /**
     * 获取parameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentParameterV10CT }
     *     
     */
    public PaymentParameterV10CT getParameter() {
        return parameter;
    }

    /**
     * 设置parameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentParameterV10CT }
     *     
     */
    public void setParameter(PaymentParameterV10CT value) {
        this.parameter = value;
    }

}
