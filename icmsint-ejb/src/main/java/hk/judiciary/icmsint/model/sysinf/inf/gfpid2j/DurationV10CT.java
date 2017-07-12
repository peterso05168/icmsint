//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
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
 * <p>Duration.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取minute属性的值。
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
     * 设置minute属性的值。
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
     * 获取second属性的值。
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
     * 设置second属性的值。
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
