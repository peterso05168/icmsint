//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
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
 * <p>PaymentOrder.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡamount���Ե�ֵ��
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
     * ����amount���Ե�ֵ��
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
     * ��ȡcurrency���Ե�ֵ��
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
     * ����currency���Ե�ֵ��
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
     * ��ȡparameter���Ե�ֵ��
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
     * ����parameter���Ե�ֵ��
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
