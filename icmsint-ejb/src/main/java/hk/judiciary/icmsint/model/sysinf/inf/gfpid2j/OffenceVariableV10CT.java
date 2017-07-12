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
 * Ofference Variable		   
 *                            a) Offence Variable Code
 *                            b) Offence Variable Name/Description
 *                            c) Offence Variable Value
 *                            d) Offence Variable Value Chinese
 * 			
 * 
 * <p>OffenceVariable.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OffenceVariable.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffenceVarCode" type="{}VariableNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceVarDesc" type="{}VariableDescription.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceVarValue" type="{}OffenceVarValue.V1.0.CT"/>
 *         &lt;element name="OffenceVarValueChinese" type="{}OffenceVarValueChinese.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceVariable.V1.0.CT", propOrder = {
    "offenceVarCode",
    "offenceVarDesc",
    "offenceVarValue",
    "offenceVarValueChinese"
})
public class OffenceVariableV10CT {

    @XmlElement(name = "OffenceVarCode")
    protected VariableNumberV10CT offenceVarCode;
    @XmlElement(name = "OffenceVarDesc")
    protected VariableDescriptionV10CT offenceVarDesc;
    @XmlElement(name = "OffenceVarValue", required = true)
    protected OffenceVarValueV10CT offenceVarValue;
    @XmlElement(name = "OffenceVarValueChinese")
    protected OffenceVarValueChineseV10CT offenceVarValueChinese;

    /**
     * ��ȡoffenceVarCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public VariableNumberV10CT getOffenceVarCode() {
        return offenceVarCode;
    }

    /**
     * ����offenceVarCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public void setOffenceVarCode(VariableNumberV10CT value) {
        this.offenceVarCode = value;
    }

    /**
     * ��ȡoffenceVarDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public VariableDescriptionV10CT getOffenceVarDesc() {
        return offenceVarDesc;
    }

    /**
     * ����offenceVarDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public void setOffenceVarDesc(VariableDescriptionV10CT value) {
        this.offenceVarDesc = value;
    }

    /**
     * ��ȡoffenceVarValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceVarValueV10CT }
     *     
     */
    public OffenceVarValueV10CT getOffenceVarValue() {
        return offenceVarValue;
    }

    /**
     * ����offenceVarValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceVarValueV10CT }
     *     
     */
    public void setOffenceVarValue(OffenceVarValueV10CT value) {
        this.offenceVarValue = value;
    }

    /**
     * ��ȡoffenceVarValueChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceVarValueChineseV10CT }
     *     
     */
    public OffenceVarValueChineseV10CT getOffenceVarValueChinese() {
        return offenceVarValueChinese;
    }

    /**
     * ����offenceVarValueChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceVarValueChineseV10CT }
     *     
     */
    public void setOffenceVarValueChinese(OffenceVarValueChineseV10CT value) {
        this.offenceVarValueChinese = value;
    }

}
