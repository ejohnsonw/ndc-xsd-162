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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for OPERATING CARRIER Supplier Role with Optional Flight Number.
 * 
 * <p>Java class for OperatingCarrierFlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingCarrierFlightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber" minOccurs="0"/>
 *         &lt;element name="ResBookDesigCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/>
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
@XmlType(name = "OperatingCarrierFlightType", propOrder = {
    "airlineID",
    "name",
    "flightNumber",
    "resBookDesigCode"
})
@XmlSeeAlso({
    org.iata.iata.edist.CouponFlightSegmentType.OperatingCarrier.class,
    org.iata.iata.edist.CouponSoldAirlineType.OperatingCarrier.class,
    org.iata.iata.edist.FlightItemOfferType.Flight.OperatingCarrier.class,
    org.iata.iata.edist.ListOfFlightSegmentType.OperatingCarrier.class,
    org.iata.iata.edist.FlightOnlyType.OperatingCarrier.class,
    org.iata.iata.edist.FlightType.Flight.OperatingCarrier.class
})
public class OperatingCarrierFlightType {

    @XmlElement(name = "AirlineID")
    protected AirlineID airlineID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FlightNumber")
    protected FlightNumber flightNumber;
    @XmlElement(name = "ResBookDesigCode")
    protected String resBookDesigCode;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * A two-character alpha-numeric code assigned according to the IATA Resolution 762 or a three-letter airline designator assigned by ICAO.  Refer to IATA Airline Coding Directory.
     * 
     * @return
     *     possible object is
     *     {@link AirlineID }
     *     
     */
    public AirlineID getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineID }
     *     
     */
    public void setAirlineID(AirlineID value) {
        this.airlineID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link FlightNumber }
     *     
     */
    public FlightNumber getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightNumber }
     *     
     */
    public void setFlightNumber(FlightNumber value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the resBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * Sets the value of the resBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
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