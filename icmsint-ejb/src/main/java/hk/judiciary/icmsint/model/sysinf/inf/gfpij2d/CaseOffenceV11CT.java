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
 *                                a) From Offence Date
 *                                b) From Offence Time
 *                                c) To Offence Date
 *                                d) To Offence Time
 * 							   e) Offence Location
 * 							   f) Multiple Offence Location Indicator
 * 							   g) Duration: Minute, Second
 * 							   h) Vehicle Registration Mark
 * 			
 * 
 * <p>CaseOffence.V1.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CaseOffence.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromOffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="FromOffenceTime" type="{CCT}Time.CT"/>
 *         &lt;element name="ToOffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="ToOffenceTime" type="{CCT}Time.CT"/>
 *         &lt;element name="OffenceLocation" type="{}Address.V1.0.CT"/>
 *         &lt;element name="MultiLocationIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Duration" type="{}Duration.V1.0.CT"/>
 *         &lt;element name="VehicleRegistrationMark" type="{}VehicleRegistrationMark.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseOffence.V1.1.CT", propOrder = {
    "fromOffenceDate",
    "fromOffenceTime",
    "toOffenceDate",
    "toOffenceTime",
    "offenceLocation",
    "multiLocationIndicator",
    "duration",
    "vehicleRegistrationMark"
})
public class CaseOffenceV11CT {

    @XmlElement(name = "FromOffenceDate", required = true)
    protected DateCT fromOffenceDate;
    @XmlElement(name = "FromOffenceTime", required = true)
    protected TimeCT fromOffenceTime;
    @XmlElement(name = "ToOffenceDate", required = true)
    protected DateCT toOffenceDate;
    @XmlElement(name = "ToOffenceTime", required = true)
    protected TimeCT toOffenceTime;
    @XmlElement(name = "OffenceLocation", required = true)
    protected AddressV10CT offenceLocation;
    @XmlElement(name = "MultiLocationIndicator")
    protected FieldIndicatorV10CT multiLocationIndicator;
    @XmlElement(name = "Duration", required = true)
    protected DurationV10CT duration;
    @XmlElement(name = "VehicleRegistrationMark")
    protected VehicleRegistrationMarkV10CT vehicleRegistrationMark;

    /**
     * ��ȡfromOffenceDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFromOffenceDate() {
        return fromOffenceDate;
    }

    /**
     * ����fromOffenceDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFromOffenceDate(DateCT value) {
        this.fromOffenceDate = value;
    }

    /**
     * ��ȡfromOffenceTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getFromOffenceTime() {
        return fromOffenceTime;
    }

    /**
     * ����fromOffenceTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setFromOffenceTime(TimeCT value) {
        this.fromOffenceTime = value;
    }

    /**
     * ��ȡtoOffenceDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getToOffenceDate() {
        return toOffenceDate;
    }

    /**
     * ����toOffenceDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setToOffenceDate(DateCT value) {
        this.toOffenceDate = value;
    }

    /**
     * ��ȡtoOffenceTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getToOffenceTime() {
        return toOffenceTime;
    }

    /**
     * ����toOffenceTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setToOffenceTime(TimeCT value) {
        this.toOffenceTime = value;
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

    /**
     * ��ȡmultiLocationIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getMultiLocationIndicator() {
        return multiLocationIndicator;
    }

    /**
     * ����multiLocationIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setMultiLocationIndicator(FieldIndicatorV10CT value) {
        this.multiLocationIndicator = value;
    }

    /**
     * ��ȡduration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DurationV10CT }
     *     
     */
    public DurationV10CT getDuration() {
        return duration;
    }

    /**
     * ����duration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DurationV10CT }
     *     
     */
    public void setDuration(DurationV10CT value) {
        this.duration = value;
    }

    /**
     * ��ȡvehicleRegistrationMark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VehicleRegistrationMarkV10CT }
     *     
     */
    public VehicleRegistrationMarkV10CT getVehicleRegistrationMark() {
        return vehicleRegistrationMark;
    }

    /**
     * ����vehicleRegistrationMark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRegistrationMarkV10CT }
     *     
     */
    public void setVehicleRegistrationMark(VehicleRegistrationMarkV10CT value) {
        this.vehicleRegistrationMark = value;
    }

}
