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
 * Offence Date and Time
 * 
 * <p>OffenceDateTime.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OffenceDateTime.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="OffenceTime" type="{CCT}Time.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceDateTime.V1.0.CT", propOrder = {
    "offenceDate",
    "offenceTime"
})
public class OffenceDateTimeV10CT {

    @XmlElement(name = "OffenceDate", required = true)
    protected DateCT offenceDate;
    @XmlElement(name = "OffenceTime", required = true)
    protected TimeCT offenceTime;

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

}
