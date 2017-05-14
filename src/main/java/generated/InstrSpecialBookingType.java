//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Instructions: Special Booking Method definition.
 * 
 * Special Need Order booking method.
 * Examples:
 * AE (by SSR-Special Service Request)
 * AF (by OSI-Other Service Information)
 * 
 * Encoding scheme: PADIS Codeset for data element 9750 - Option
 * 
 * <p>Java class for InstrSpecialBookingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrSpecialBookingType">
 *   &lt;complexContent>
 *     &lt;extension base="{}CodesetType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrSpecialBookingType")
@XmlSeeAlso({
    SpecialBookingInstrType.class
})
public class InstrSpecialBookingType
    extends CodesetType
{


}