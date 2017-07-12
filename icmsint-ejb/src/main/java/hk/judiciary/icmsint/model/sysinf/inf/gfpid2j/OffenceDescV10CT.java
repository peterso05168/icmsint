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
 * Ofference Description
 * 	               a) PGBL Allow
 * 	               b) Law in English
 * 	               c) Law in Chinese
 * 	               d) Short Description in English
 * 	               e) Short Description in Chinse
 * 	               f) Long Description in English
 * 	               g) Long Description in Chinese
 * 			
 * 
 * <p>OffenceDesc.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OffenceDesc.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PGBLAllow" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Law" type="{}Law.V1.0.CT"/>
 *         &lt;element name="LawChinese" type="{}LawChinese.V1.1.CT"/>
 *         &lt;element name="ShortDescription" type="{}ShortDescription.V1.0.CT"/>
 *         &lt;element name="ShortDescriptionChinese" type="{}ShortDescriptionChinese.V1.1.CT"/>
 *         &lt;element name="LongDescription" type="{}OffenceDescription.V1.0.CT"/>
 *         &lt;element name="LongDescriptionChinese" type="{}OffenceDescriptionChinese.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceDesc.V1.0.CT", propOrder = {
    "pgblAllow",
    "law",
    "lawChinese",
    "shortDescription",
    "shortDescriptionChinese",
    "longDescription",
    "longDescriptionChinese"
})
public class OffenceDescV10CT {

    @XmlElement(name = "PGBLAllow")
    protected FieldIndicatorV10CT pgblAllow;
    @XmlElement(name = "Law", required = true)
    protected LawV10CT law;
    @XmlElement(name = "LawChinese", required = true)
    protected LawChineseV11CT lawChinese;
    @XmlElement(name = "ShortDescription", required = true)
    protected ShortDescriptionV10CT shortDescription;
    @XmlElement(name = "ShortDescriptionChinese", required = true)
    protected ShortDescriptionChineseV11CT shortDescriptionChinese;
    @XmlElement(name = "LongDescription", required = true)
    protected OffenceDescriptionV10CT longDescription;
    @XmlElement(name = "LongDescriptionChinese", required = true)
    protected OffenceDescriptionChineseV11CT longDescriptionChinese;

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
     * ��ȡlongDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionV10CT }
     *     
     */
    public OffenceDescriptionV10CT getLongDescription() {
        return longDescription;
    }

    /**
     * ����longDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionV10CT }
     *     
     */
    public void setLongDescription(OffenceDescriptionV10CT value) {
        this.longDescription = value;
    }

    /**
     * ��ȡlongDescriptionChinese���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionChineseV11CT }
     *     
     */
    public OffenceDescriptionChineseV11CT getLongDescriptionChinese() {
        return longDescriptionChinese;
    }

    /**
     * ����longDescriptionChinese���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV11CT }
     *     
     */
    public void setLongDescriptionChinese(OffenceDescriptionChineseV11CT value) {
        this.longDescriptionChinese = value;
    }

}
