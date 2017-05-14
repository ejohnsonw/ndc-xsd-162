//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Aircraft seat row with seat map ghost row metadata definition.
 * 
 * <p>Java class for SeatMapRowNbrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapRowNbrType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>AirRowNbrSimpleType">
 *       &lt;attribute name="RowSuffix">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[A-Z]{1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RowPos">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BACK"/>
 *             &lt;enumeration value="FRONT"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapRowNbrType", propOrder = {
    "value"
})
public class SeatMapRowNbrType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "RowSuffix")
    protected String rowSuffix;
    @XmlAttribute(name = "RowPos")
    protected String rowPos;

    /**
     * Aircraft row number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the rowSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowSuffix() {
        return rowSuffix;
    }

    /**
     * Sets the value of the rowSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowSuffix(String value) {
        this.rowSuffix = value;
    }

    /**
     * Gets the value of the rowPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowPos() {
        return rowPos;
    }

    /**
     * Sets the value of the rowPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowPos(String value) {
        this.rowPos = value;
    }

}