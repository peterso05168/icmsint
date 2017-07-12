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
 * address details consists of 
 *                                a) Address territory
 *                                   1 - HK
 *                                   2 - KLN
 *                                   3 - NT
 *                                   4 - Outlying Islands
 *                                   5 - Others
 *                                b) Address in English (v1.2)
 *                                c) Address in Chinese (v1.2)
 *                                d) District code
 *                                e) Overseas Indicator
 *             
 * 
 * <p>Address.V1.2.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Address.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressTerritory" type="{}AddressTerritory.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="EnglishAddress" type="{}EnglishAddress.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="ChineseAddress" type="{}ChineseAddress.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="DistrictCode" type="{}DistrictCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OverseasIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address.V1.2.CT", propOrder = {
    "addressTerritory",
    "englishAddress",
    "chineseAddress",
    "districtCode",
    "overseasIndicator"
})
public class AddressV12CT {

    @XmlElement(name = "AddressTerritory")
    protected AddressTerritoryV10CT addressTerritory;
    @XmlElement(name = "EnglishAddress")
    protected EnglishAddressV12CT englishAddress;
    @XmlElement(name = "ChineseAddress")
    protected ChineseAddressV12CT chineseAddress;
    @XmlElement(name = "DistrictCode")
    protected DistrictCodeV10CT districtCode;
    @XmlElement(name = "OverseasIndicator")
    protected FieldIndicatorV10CT overseasIndicator;

    /**
     * ��ȡaddressTerritory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressTerritoryV10CT }
     *     
     */
    public AddressTerritoryV10CT getAddressTerritory() {
        return addressTerritory;
    }

    /**
     * ����addressTerritory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTerritoryV10CT }
     *     
     */
    public void setAddressTerritory(AddressTerritoryV10CT value) {
        this.addressTerritory = value;
    }

    /**
     * ��ȡenglishAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EnglishAddressV12CT }
     *     
     */
    public EnglishAddressV12CT getEnglishAddress() {
        return englishAddress;
    }

    /**
     * ����englishAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EnglishAddressV12CT }
     *     
     */
    public void setEnglishAddress(EnglishAddressV12CT value) {
        this.englishAddress = value;
    }

    /**
     * ��ȡchineseAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChineseAddressV12CT }
     *     
     */
    public ChineseAddressV12CT getChineseAddress() {
        return chineseAddress;
    }

    /**
     * ����chineseAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChineseAddressV12CT }
     *     
     */
    public void setChineseAddress(ChineseAddressV12CT value) {
        this.chineseAddress = value;
    }

    /**
     * ��ȡdistrictCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DistrictCodeV10CT }
     *     
     */
    public DistrictCodeV10CT getDistrictCode() {
        return districtCode;
    }

    /**
     * ����districtCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictCodeV10CT }
     *     
     */
    public void setDistrictCode(DistrictCodeV10CT value) {
        this.districtCode = value;
    }

    /**
     * ��ȡoverseasIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getOverseasIndicator() {
        return overseasIndicator;
    }

    /**
     * ����overseasIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setOverseasIndicator(FieldIndicatorV10CT value) {
        this.overseasIndicator = value;
    }

}
