//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DomainSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirlineProfile"/>
 *     &lt;enumeration value="OrderManagement"/>
 *     &lt;enumeration value="PaymentTicketing"/>
 *     &lt;enumeration value="Shopping"/>
 *     &lt;enumeration value="Utility"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DomainSimpleType")
@XmlEnum
public enum DomainSimpleType {

    @XmlEnumValue("AirlineProfile")
    AIRLINE_PROFILE("AirlineProfile"),
    @XmlEnumValue("OrderManagement")
    ORDER_MANAGEMENT("OrderManagement"),
    @XmlEnumValue("PaymentTicketing")
    PAYMENT_TICKETING("PaymentTicketing"),
    @XmlEnumValue("Shopping")
    SHOPPING("Shopping"),
    @XmlEnumValue("Utility")
    UTILITY("Utility");
    private final String value;

    DomainSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DomainSimpleType fromValue(String v) {
        for (DomainSimpleType c: DomainSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
