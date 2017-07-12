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
 * Case SOD details consists of 
 *                                a) SOD Key Object
 *                                b) Short Description in English
 *                                c) Short Description in Chinese
 *                                d) Offence Description in English
 *                                e) Offence Description in Chinese
 *                                f) Law in English
 *                                g) Law in Chinese
 *             
 * 
 * <p>CaseSOD.V1.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CaseSOD.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SODKey" type="{}SODKey.V1.0.CT"/>
 *         &lt;element name="ShortDescription" type="{}ShortDescription.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ShortDescriptionChinese" type="{}ShortDescriptionChinese.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="Law" type="{}Law.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="LawChinese" type="{}LawChinese.V1.1.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSOD.V1.1.CT", propOrder = {
    "sodKey",
    "shortDescription",
    "shortDescriptionChinese",
    "offenceDescription",
    "offenceDescriptionChinese",
    "law",
    "lawChinese"
})
public class CaseSODV11CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV10CT sodKey;
    @XmlElement(name = "ShortDescription")
    protected ShortDescriptionV10CT shortDescription;
    @XmlElement(name = "ShortDescriptionChinese")
    protected ShortDescriptionChineseV11CT shortDescriptionChinese;
    @XmlElement(name = "OffenceDescription")
    protected OffenceDescriptionV11CT offenceDescription;
    @XmlElement(name = "OffenceDescriptionChinese")
    protected OffenceDescriptionChineseV12CT offenceDescriptionChinese;
    @XmlElement(name = "Law")
    protected LawV10CT law;
    @XmlElement(name = "LawChinese")
    protected LawChineseV11CT lawChinese;

    /**
     * ��ȡsodKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SODKeyV10CT }
     *     
     */
    public SODKeyV10CT getSODKey() {
        return sodKey;
    }

    /**
     * ����sodKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SODKeyV10CT }
     *     
     */
    public void setSODKey(SODKeyV10CT value) {
        this.sodKey = value;
    }

    /**
     * ��ȡshortDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShortDescriptionV10CT }
     *     
     */
    public ShortDescriptionV10CT getShortDescription() {
        return shortDescription;
    }

    /**
     * ����shortDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShortDescriptionV10CT }
     *     
     */
    public void setShortDescription(ShortDescriptionV10CT value) {
        this.shortDescription = value;
    }

    /**
     * ��ȡshortDescriptionChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShortDescriptionChineseV11CT }
     *     
     */
    public ShortDescriptionChineseV11CT getShortDescriptionChinese() {
        return shortDescriptionChinese;
    }

    /**
     * ����shortDescriptionChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShortDescriptionChineseV11CT }
     *     
     */
    public void setShortDescriptionChinese(ShortDescriptionChineseV11CT value) {
        this.shortDescriptionChinese = value;
    }

    /**
     * ��ȡoffenceDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionV11CT }
     *     
     */
    public OffenceDescriptionV11CT getOffenceDescription() {
        return offenceDescription;
    }

    /**
     * ����offenceDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionV11CT }
     *     
     */
    public void setOffenceDescription(OffenceDescriptionV11CT value) {
        this.offenceDescription = value;
    }

    /**
     * ��ȡoffenceDescriptionChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionChineseV12CT }
     *     
     */
    public OffenceDescriptionChineseV12CT getOffenceDescriptionChinese() {
        return offenceDescriptionChinese;
    }

    /**
     * ����offenceDescriptionChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV12CT }
     *     
     */
    public void setOffenceDescriptionChinese(OffenceDescriptionChineseV12CT value) {
        this.offenceDescriptionChinese = value;
    }

    /**
     * ��ȡlaw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LawV10CT }
     *     
     */
    public LawV10CT getLaw() {
        return law;
    }

    /**
     * ����law���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LawV10CT }
     *     
     */
    public void setLaw(LawV10CT value) {
        this.law = value;
    }

    /**
     * ��ȡlawChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LawChineseV11CT }
     *     
     */
    public LawChineseV11CT getLawChinese() {
        return lawChinese;
    }

    /**
     * ����lawChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LawChineseV11CT }
     *     
     */
    public void setLawChinese(LawChineseV11CT value) {
        this.lawChinese = value;
    }

}