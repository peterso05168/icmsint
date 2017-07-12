//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 05:38:22 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d;

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
 * <p>Java class for Numeric.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Numeric.CT"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Numeric.CT", namespace = "CCT", propOrder = {
    "value"
})
@XmlSeeAlso({
    AgeV10CT.class,
    AgeV11CT.class,
    ChapterV10CT.class,
    ChapterV11CT.class,
    VersionNumberV10CT.class,
    TimeBarOffenceV10CT.class,
    TimeBarDiscoverV10CT.class,
    HearingWeightV10CT.class,
    PenaltyWeightV10CT.class,
    VariableTypeV10CT.class,
    OrderInternalNumberV10CT.class,
    YearV10CT.class,
    MonthV10CT.class,
    WeekV10CT.class,
    DayV10CT.class,
    HourV10CT.class,
    AmountV10CT.class,
    AppealInternalNumberV10CT.class,
    ReviewInternalNumberV10CT.class,
    MinuteV10CT.class,
    MinuteV11CT.class,
    SecondV10CT.class,
    PartyNoV10CT.class,
    AmountV11CT.class,
    OffencePointV10CT.class,
    HearingElapsedTimeV10CT.class,
    PaymentSequenceNumberV10CT.class,
    ReceiptNumberV11CT.class,
    CentreNumberV10CT.class,
    WorkstationNumberV10CT.class,
    ShroffNumberV10CT.class
})
public class NumericCT {

    @XmlValue
    protected BigDecimal value;

    /**
     * Gets the value of the value property.
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
     * Sets the value of the value property.
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
