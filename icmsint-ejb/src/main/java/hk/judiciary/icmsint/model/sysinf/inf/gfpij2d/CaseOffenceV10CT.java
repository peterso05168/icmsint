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
 * case offence details consists of 
 *                                a) Offence Date
 *                                b) Offence Time
 *                                c) Offence Location 
 *             
 * 
 * <p>CaseOffence.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CaseOffence.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="OffenceTime" type="{CCT}Time.CT"/>
 *         &lt;element name="OffenceLocation" type="{}Address.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseOffence.V1.0.CT", propOrder = {
    "offenceDate",
    "offenceTime",
    "offenceLocation"
})
public class CaseOffenceV10CT {

    @XmlElement(name = "OffenceDate", required = true)
    protected DateCT offenceDate;
    @XmlElement(name = "OffenceTime", required = true)
    protected TimeCT offenceTime;
    @XmlElement(name = "OffenceLocation", required = true)
    protected AddressV10CT offenceLocation;

    /**
     * ��ȡoffenceDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getOffenceDate() {
        return offenceDate;
    }

    /**
     * ����offenceDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setOffenceDate(DateCT value) {
        this.offenceDate = value;
    }

    /**
     * ��ȡoffenceTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getOffenceTime() {
        return offenceTime;
    }

    /**
     * ����offenceTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setOffenceTime(TimeCT value) {
        this.offenceTime = value;
    }

    /**
     * ��ȡoffenceLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressV10CT }
     *     
     */
    public AddressV10CT getOffenceLocation() {
        return offenceLocation;
    }

    /**
     * ����offenceLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV10CT }
     *     
     */
    public void setOffenceLocation(AddressV10CT value) {
        this.offenceLocation = value;
    }

}