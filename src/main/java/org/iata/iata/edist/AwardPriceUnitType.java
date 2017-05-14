//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AWARD/ REDEMPTION PRICE BASIS UNIT definition.
 * 
 * <p>Java class for AwardPriceUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardPriceUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Redemption" type="{http://www.iata.org/IATA/EDIST}AwardRedemptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardPriceUnitType", propOrder = {
    "redemption"
})
public class AwardPriceUnitType {

    @XmlElement(name = "Redemption", required = true)
    protected AwardRedemptionType redemption;

    /**
     * Gets the value of the redemption property.
     * 
     * @return
     *     possible object is
     *     {@link AwardRedemptionType }
     *     
     */
    public AwardRedemptionType getRedemption() {
        return redemption;
    }

    /**
     * Sets the value of the redemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardRedemptionType }
     *     
     */
    public void setRedemption(AwardRedemptionType value) {
        this.redemption = value;
    }

}
