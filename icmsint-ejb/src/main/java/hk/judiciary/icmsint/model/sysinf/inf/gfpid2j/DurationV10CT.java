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
 * Duration consists of
 *                                a) Minute
 *                                b) Second
 *             
 * 
 * <p>Duration.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Duration.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Minute" type="{}Minute.V1.1.CT"/>
 *         &lt;element name="Second" type="{}Second.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Duration.V1.0.CT", propOrder = {
    "minute",
    "second"
})
public class DurationV10CT {

    @XmlElement(name = "Minute", required = true)
    protected MinuteV11CT minute;
    @XmlElement(name = "Second", required = true)
    protected SecondV10CT second;

    /**
     * ��ȡminute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MinuteV11CT }
     *     
     */
    public MinuteV11CT getMinute() {
        return minute;
    }

    /**
     * ����minute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MinuteV11CT }
     *     
     */
    public void setMinute(MinuteV11CT value) {
        this.minute = value;
    }

    /**
     * ��ȡsecond���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SecondV10CT }
     *     
     */
    public SecondV10CT getSecond() {
        return second;
    }

    /**
     * ����second���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SecondV10CT }
     *     
     */
    public void setSecond(SecondV10CT value) {
        this.second = value;
    }

}
