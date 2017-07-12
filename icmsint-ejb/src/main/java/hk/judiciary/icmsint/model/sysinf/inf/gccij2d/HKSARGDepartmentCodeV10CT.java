//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:47:35 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * UID = COM000035, Dictionary Entry Name = HKSARG Department. Code,
 * 			A code representing a government bureau or department or a government related organization, with code values assigned in accordance with the standardized list of government department codes.
 * 
 * <p>Java class for HKSARGDepartmentCode.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HKSARGDepartmentCode.V1.0.CT"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;CCT&gt;Code.CT"&gt;
 *       &lt;attribute name="agencyId" default="http://www.xml.gov.hk"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;enumeration value="http://www.xml.gov.hk"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="agencyName" default="www.xml.gov.hk"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;enumeration value="www.xml.gov.hk"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="codeListName" default="HKSARG Department Code"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;enumeration value="HKSARG Department Code"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HKSARGDepartmentCode.V1.0.CT", namespace = "HDC")
@XmlSeeAlso({
    ProsecutionDepartmentCodeV10CT.class,
    ProsecutionDepartmentCodeV11CT.class
})
public class HKSARGDepartmentCodeV10CT
    extends CodeCT
{


}
