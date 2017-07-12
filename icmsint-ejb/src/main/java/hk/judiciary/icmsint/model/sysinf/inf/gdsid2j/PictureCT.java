//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:40:40 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A set of finite-length sequences of binary octets.
 * 			  characterSetCode - The character set of the binary object if the mime type is text. Reference IETF RFC 2045, 2046, 2047.
 * 			  encodingCode - The decoding algorithm of the binary object. Reference IETF RFC 2045, 2046, 2047.
 * 			  fileName - The filename of the encoded binary object. Reference IETF RFC 2045, 2046, 2047.
 * 			  format - The format of the binary content.
 * 			  mimeCode - The mime type of the binary object. Reference IETF RFC 2045, 2046, 2047.
 * 			  objectUri - The Uniform Resource Identifier that identifies where the binary object is located.
 * 			
 * 
 * <p>Java class for Picture.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Picture.CT">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="characterSetCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="encodingCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="mimeCode" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="objectUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Picture.CT", namespace = "CCT", propOrder = {
    "value"
})
public class PictureCT {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "characterSetCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String characterSetCode;
    @XmlAttribute(name = "encodingCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String encodingCode;
    @XmlAttribute(name = "fileName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fileName;
    @XmlAttribute(name = "format")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String format;
    @XmlAttribute(name = "mimeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mimeCode;
    @XmlAttribute(name = "objectUri")
    @XmlSchemaType(name = "anyURI")
    protected String objectUri;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the characterSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Sets the value of the characterSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSetCode(String value) {
        this.characterSetCode = value;
    }

    /**
     * Gets the value of the encodingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingCode() {
        return encodingCode;
    }

    /**
     * Sets the value of the encodingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingCode(String value) {
        this.encodingCode = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the mimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeCode() {
        return mimeCode;
    }

    /**
     * Sets the value of the mimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeCode(String value) {
        this.mimeCode = value;
    }

    /**
     * Gets the value of the objectUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectUri() {
        return objectUri;
    }

    /**
     * Sets the value of the objectUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectUri(String value) {
        this.objectUri = value;
    }

}
