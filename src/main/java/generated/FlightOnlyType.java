//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for a Flight with no O/D information.
 * 
 * Flight origin/ destination information.
 * 
 * <p>Java class for FlightOnlyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightOnlyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}SegmentKey" minOccurs="0"/>
 *         &lt;element ref="{}Departure"/>
 *         &lt;element ref="{}Arrival"/>
 *         &lt;element name="MarketingCarrier" type="{}MarketingCarrierFlightType"/>
 *         &lt;element ref="{}Equipment" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="OperatingCarrier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}OperatingCarrierFlightType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Disclosures" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}CabinType" minOccurs="0"/>
 *         &lt;element ref="{}ClassOfService" minOccurs="0"/>
 *         &lt;element name="Details" type="{}FlightDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightOnlyType", propOrder = {
    "segmentKey",
    "departure",
    "arrival",
    "marketingCarrier",
    "equipment",
    "operatingCarrier",
    "cabinType",
    "classOfService",
    "details"
})
public class FlightOnlyType {

    @XmlElement(name = "SegmentKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String segmentKey;
    @XmlElement(name = "Departure", required = true)
    protected Departure departure;
    @XmlElement(name = "Arrival", required = true)
    protected FlightArrivalType arrival;
    @XmlElement(name = "MarketingCarrier", required = true)
    protected MarketingCarrierFlightType marketingCarrier;
    @XmlElement(name = "Equipment")
    protected List<AircraftSummaryType> equipment;
    @XmlElement(name = "OperatingCarrier")
    protected FlightOnlyType.OperatingCarrier operatingCarrier;
    @XmlElement(name = "CabinType")
    protected CabinType cabinType;
    @XmlElement(name = "ClassOfService")
    protected FlightCOSCoreType classOfService;
    @XmlElement(name = "Details")
    protected FlightDetailType details;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the segmentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentKey() {
        return segmentKey;
    }

    /**
     * Sets the value of the segmentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentKey(String value) {
        this.segmentKey = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link Departure }
     *     
     */
    public Departure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departure }
     *     
     */
    public void setDeparture(Departure value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalType }
     *     
     */
    public FlightArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalType }
     *     
     */
    public void setArrival(FlightArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingCarrierFlightType }
     *     
     */
    public MarketingCarrierFlightType getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingCarrierFlightType }
     *     
     */
    public void setMarketingCarrier(MarketingCarrierFlightType value) {
        this.marketingCarrier = value;
    }

    /**
     * Aircraft Equipment.
     * 
     * Note: Two instances of aircraft equipment may be specified if there is a change of gauge.Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftSummaryType }
     * 
     * 
     */
    public List<AircraftSummaryType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<AircraftSummaryType>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link FlightOnlyType.OperatingCarrier }
     *     
     */
    public FlightOnlyType.OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightOnlyType.OperatingCarrier }
     *     
     */
    public void setOperatingCarrier(FlightOnlyType.OperatingCarrier value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public FlightCOSCoreType getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public void setClassOfService(FlightCOSCoreType value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailType }
     *     
     */
    public FlightDetailType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailType }
     *     
     */
    public void setDetails(FlightDetailType value) {
        this.details = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}OperatingCarrierFlightType">
     *       &lt;sequence>
     *         &lt;element ref="{}Disclosures" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "disclosures"
    })
    public static class OperatingCarrier
        extends OperatingCarrierFlightType
    {

        @XmlElement(name = "Disclosures")
        protected Disclosures disclosures;

        /**
         * Gets the value of the disclosures property.
         * 
         * @return
         *     possible object is
         *     {@link Disclosures }
         *     
         */
        public Disclosures getDisclosures() {
            return disclosures;
        }

        /**
         * Sets the value of the disclosures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Disclosures }
         *     
         */
        public void setDisclosures(Disclosures value) {
            this.disclosures = value;
        }

    }

}
