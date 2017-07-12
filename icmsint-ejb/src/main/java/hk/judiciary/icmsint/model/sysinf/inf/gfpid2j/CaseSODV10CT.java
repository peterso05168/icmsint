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
 * <p>CaseSOD.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CaseSOD.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SODKey" type="{}SODKey.V1.0.CT"/>
 *         &lt;element name="ShortDescription" type="{}ShortDescription.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ShortDescriptionChinese" type="{}ShortDescriptionChinese.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Law" type="{}Law.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="LawChinese" type="{}LawChinese.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSOD.V1.0.CT", propOrder = {
    "sodKey",
    "shortDescription",
    "shortDescriptionChinese",
    "offenceDescription",
    "offenceDescriptionChinese",
    "law",
    "lawChinese"
})
public class CaseSODV10CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV10CT sodKey;
    @XmlElement(name = "ShortDescription")
    protected ShortDescriptionV10CT shortDescription;
    @XmlElement(name = "ShortDescriptionChinese")
    protected ShortDescriptionChineseV10CT shortDescriptionChinese;
    @XmlElement(name = "OffenceDescription")
    protected OffenceDescriptionV10CT offenceDescription;
    @XmlElement(name = "OffenceDescriptionChinese")
    protected OffenceDescriptionChineseV10CT offenceDescriptionChinese;
    @XmlElement(name = "Law")
    protected LawV10CT law;
    @XmlElement(name = "LawChinese")
    protected LawChineseV10CT lawChinese;

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
     *     {@link ShortDescriptionChineseV10CT }
     *     
     */
    public ShortDescriptionChineseV10CT getShortDescriptionChinese() {
        return shortDescriptionChinese;
    }

    /**
     * ����shortDescriptionChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShortDescriptionChineseV10CT }
     *     
     */
    public void setShortDescriptionChinese(ShortDescriptionChineseV10CT value) {
        this.shortDescriptionChinese = value;
    }

    /**
     * ��ȡoffenceDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionV10CT }
     *     
     */
    public OffenceDescriptionV10CT getOffenceDescription() {
        return offenceDescription;
    }

    /**
     * ����offenceDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionV10CT }
     *     
     */
    public void setOffenceDescription(OffenceDescriptionV10CT value) {
        this.offenceDescription = value;
    }

    /**
     * ��ȡoffenceDescriptionChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionChineseV10CT }
     *     
     */
    public OffenceDescriptionChineseV10CT getOffenceDescriptionChinese() {
        return offenceDescriptionChinese;
    }

    /**
     * ����offenceDescriptionChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV10CT }
     *     
     */
    public void setOffenceDescriptionChinese(OffenceDescriptionChineseV10CT value) {
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
     *     {@link LawChineseV10CT }
     *     
     */
    public LawChineseV10CT getLawChinese() {
        return lawChinese;
    }

    /**
     * ����lawChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LawChineseV10CT }
     *     
     */
    public void setLawChinese(LawChineseV10CT value) {
        this.lawChinese = value;
    }

}
