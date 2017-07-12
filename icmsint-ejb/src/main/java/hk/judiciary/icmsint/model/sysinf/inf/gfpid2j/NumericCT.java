//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Numeric information that is assigned or is determined by calculation, counting, or sequencing. It does not require a unit of quantity or unit of measure.
 * 			
 * 
 * <p>Numeric.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Numeric.CT">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Numeric.CT", namespace = "CCT", propOrder = {
    "value"
})
@XmlSeeAlso({
    MonthV10CT.class,
    AgeV11CT.class,
    OrderInternalNumberV10CT.class,
    MinuteV10CT.class,
    PartyNoV10CT.class,
    YearV10CT.class,
    TimeBarDiscoverV10CT.class,
    ReviewInternalNumberV10CT.class,
    ChapterV10CT.class,
    AmountV10CT.class,
    SecondV10CT.class,
    AppealInternalNumberV10CT.class,
    AgeV10CT.class,
    ChapterV11CT.class,
    DayV10CT.class,
    AmountV11CT.class,
    HourV10CT.class,
    VersionNumberV10CT.class,
    MinuteV11CT.class,
    TimeBarOffenceV10CT.class,
    WeekV10CT.class,
    VariableTypeV10CT.class,
    PenaltyWeightV10CT.class,
    OffencePointV10CT.class,
    HearingWeightV10CT.class
})
public class NumericCT {

    @XmlValue
    protected BigDecimal value;

    /**
     * ��ȡvalue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
