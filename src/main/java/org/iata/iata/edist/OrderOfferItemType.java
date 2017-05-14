//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER ITEM IN ORDER definition.
 * 
 * <p>Java class for OrderOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderOfferItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemType"/>
 *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST}OfferItemTimeLimitSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderOfferItemType", propOrder = {
    "offerItemID",
    "offerItemType",
    "timeLimits"
})
public class OrderOfferItemType {

    @XmlElement(name = "OfferItemID", required = true)
    protected ItemIDType offerItemID;
    @XmlElement(name = "OfferItemType", required = true)
    protected OfferItemType offerItemType;
    @XmlElement(name = "TimeLimits")
    protected OfferItemTimeLimitSetType timeLimits;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setOfferItemID(ItemIDType value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the offerItemType property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemType }
     *     
     */
    public OfferItemType getOfferItemType() {
        return offerItemType;
    }

    /**
     * Sets the value of the offerItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemType }
     *     
     */
    public void setOfferItemType(OfferItemType value) {
        this.offerItemType = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemTimeLimitSetType }
     *     
     */
    public OfferItemTimeLimitSetType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemTimeLimitSetType }
     *     
     */
    public void setTimeLimits(OfferItemTimeLimitSetType value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }

}
