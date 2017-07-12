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
 *                                b) Address in English (v1.1)
 *                                c) Address in Chinese (v1.1)
 *                                d) District code
 *             
 * 
 * <p>Address.V1.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Address.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressTerritory" type="{}AddressTerritory.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="EnglishAddress" type="{}EnglishAddress.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="ChineseAddress" type="{}ChineseAddress.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="DistrictCode" type="{}DistrictCode.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address.V1.1.CT", propOrder = {
    "addressTerritory",
    "englishAddress",
    "chineseAddress",
    "districtCode"
})
public class AddressV11CT {

    @XmlElement(name = "AddressTerritory")
    protected AddressTerritoryV10CT addressTerritory;
    @XmlElement(name = "EnglishAddress")
    protected EnglishAddressV11CT englishAddress;
    @XmlElement(name = "ChineseAddress")
    protected ChineseAddressV11CT chineseAddress;
    @XmlElement(name = "DistrictCode")
    protected DistrictCodeV10CT districtCode;

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
     *     {@link EnglishAddressV11CT }
     *     
     */
    public EnglishAddressV11CT getEnglishAddress() {
        return englishAddress;
    }

    /**
     * ����englishAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EnglishAddressV11CT }
     *     
     */
    public void setEnglishAddress(EnglishAddressV11CT value) {
        this.englishAddress = value;
    }

    /**
     * ��ȡchineseAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChineseAddressV11CT }
     *     
     */
    public ChineseAddressV11CT getChineseAddress() {
        return chineseAddress;
    }

    /**
     * ����chineseAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChineseAddressV11CT }
     *     
     */
    public void setChineseAddress(ChineseAddressV11CT value) {
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

}
