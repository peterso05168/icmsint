//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Chinese address lines version 1.1
 * 
 * <p>ChineseAddress.V1.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChineseAddress.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChineseAddressLine" type="{}ChineseAddressLine.V1.1.CT" maxOccurs="5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChineseAddress.V1.1.CT", propOrder = {
    "chineseAddressLine"
})
public class ChineseAddressV11CT {

    @XmlElement(name = "ChineseAddressLine", required = true)
    protected List<ChineseAddressLineV11CT> chineseAddressLine;

    /**
     * Gets the value of the chineseAddressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chineseAddressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChineseAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChineseAddressLineV11CT }
     * 
     * 
     */
    public List<ChineseAddressLineV11CT> getChineseAddressLine() {
        if (chineseAddressLine == null) {
            chineseAddressLine = new ArrayList<ChineseAddressLineV11CT>();
        }
        return this.chineseAddressLine;
    }

}
