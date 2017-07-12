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
 * Ofference Description
 * 	               a) PGBL Allow
 * 	               b) Contrary to Law in English
 * 	               c) Contrary to Law in Chinese
 * 	               d) Offence Description in English
 * 	               e) Offence Description in Chinse
 * 	               f) Charge Particulars in English
 * 	               g) Charge Particulars in Chinese
 * 			
 * 
 * <p>OffenceDesc.V1.2.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OffenceDesc.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PGBLAllow" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ContraryToLaw" type="{}ContraryToLaw.V1.0.CT"/>
 *         &lt;element name="ContraryToLawChinese" type="{}ContraryToLawChinese.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.2.CT"/>
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.3.CT" minOccurs="0"/>
 *         &lt;element name="ChargeParticular" type="{}ChargeParticular.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ChargeParticularChinese" type="{}ChargeParticularChinese.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceDesc.V1.2.CT", propOrder = {
    "pgblAllow",
    "contraryToLaw",
    "contraryToLawChinese",
    "offenceDescription",
    "offenceDescriptionChinese",
    "chargeParticular",
    "chargeParticularChinese"
})
public class OffenceDescV12CT {

    @XmlElement(name = "PGBLAllow")
    protected FieldIndicatorV10CT pgblAllow;
    @XmlElement(name = "ContraryToLaw", required = true)
    protected ContraryToLawV10CT contraryToLaw;
    @XmlElement(name = "ContraryToLawChinese")
    protected ContraryToLawChineseV10CT contraryToLawChinese;
    @XmlElement(name = "OffenceDescription", required = true)
    protected OffenceDescriptionV12CT offenceDescription;
    @XmlElement(name = "OffenceDescriptionChinese")
    protected OffenceDescriptionChineseV13CT offenceDescriptionChinese;
    @XmlElement(name = "ChargeParticular")
    protected ChargeParticularV10CT chargeParticular;
    @XmlElement(name = "ChargeParticularChinese")
    protected ChargeParticularChineseV10CT chargeParticularChinese;

    /**
     * ��ȡpgblAllow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getPGBLAllow() {
        return pgblAllow;
    }

    /**
     * ����pgblAllow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setPGBLAllow(FieldIndicatorV10CT value) {
        this.pgblAllow = value;
    }

    /**
     * ��ȡcontraryToLaw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContraryToLawV10CT }
     *     
     */
    public ContraryToLawV10CT getContraryToLaw() {
        return contraryToLaw;
    }

    /**
     * ����contraryToLaw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContraryToLawV10CT }
     *     
     */
    public void setContraryToLaw(ContraryToLawV10CT value) {
        this.contraryToLaw = value;
    }

    /**
     * ��ȡcontraryToLawChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContraryToLawChineseV10CT }
     *     
     */
    public ContraryToLawChineseV10CT getContraryToLawChinese() {
        return contraryToLawChinese;
    }

    /**
     * ����contraryToLawChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContraryToLawChineseV10CT }
     *     
     */
    public void setContraryToLawChinese(ContraryToLawChineseV10CT value) {
        this.contraryToLawChinese = value;
    }

    /**
     * ��ȡoffenceDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionV12CT }
     *     
     */
    public OffenceDescriptionV12CT getOffenceDescription() {
        return offenceDescription;
    }

    /**
     * ����offenceDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionV12CT }
     *     
     */
    public void setOffenceDescription(OffenceDescriptionV12CT value) {
        this.offenceDescription = value;
    }

    /**
     * ��ȡoffenceDescriptionChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionChineseV13CT }
     *     
     */
    public OffenceDescriptionChineseV13CT getOffenceDescriptionChinese() {
        return offenceDescriptionChinese;
    }

    /**
     * ����offenceDescriptionChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV13CT }
     *     
     */
    public void setOffenceDescriptionChinese(OffenceDescriptionChineseV13CT value) {
        this.offenceDescriptionChinese = value;
    }

    /**
     * ��ȡchargeParticular���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChargeParticularV10CT }
     *     
     */
    public ChargeParticularV10CT getChargeParticular() {
        return chargeParticular;
    }

    /**
     * ����chargeParticular���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeParticularV10CT }
     *     
     */
    public void setChargeParticular(ChargeParticularV10CT value) {
        this.chargeParticular = value;
    }

    /**
     * ��ȡchargeParticularChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChargeParticularChineseV10CT }
     *     
     */
    public ChargeParticularChineseV10CT getChargeParticularChinese() {
        return chargeParticularChinese;
    }

    /**
     * ����chargeParticularChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeParticularChineseV10CT }
     *     
     */
    public void setChargeParticularChinese(ChargeParticularChineseV10CT value) {
        this.chargeParticularChinese = value;
    }

}
