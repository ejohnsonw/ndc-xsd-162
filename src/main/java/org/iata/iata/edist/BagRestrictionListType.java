//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagRestrictionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagRestrictionListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Party"/>
 *     &lt;enumeration value="Traveler"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BagRestrictionListType")
@XmlEnum
public enum BagRestrictionListType {

    @XmlEnumValue("Party")
    PARTY("Party"),
    @XmlEnumValue("Traveler")
    TRAVELER("Traveler");
    private final String value;

    BagRestrictionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagRestrictionListType fromValue(String v) {
        for (BagRestrictionListType c: BagRestrictionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
