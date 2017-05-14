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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER ITEM TIME LIMIT SET (collection) definition.
 * 
 * <p>Java class for OfferItemTimeLimitSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemTimeLimitSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeLimit" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}PriceGuaranteeTimeLimit"/>
 *                   &lt;element ref="{}TicketByTimeLimit"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{}ObjAssociationAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemTimeLimitSetType", propOrder = {
    "timeLimit"
})
public class OfferItemTimeLimitSetType {

    @XmlElement(name = "TimeLimit", required = true)
    protected List<OfferItemTimeLimitSetType.TimeLimit> timeLimit;

    /**
     * Gets the value of the timeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemTimeLimitSetType.TimeLimit }
     * 
     * 
     */
    public List<OfferItemTimeLimitSetType.TimeLimit> getTimeLimit() {
        if (timeLimit == null) {
            timeLimit = new ArrayList<OfferItemTimeLimitSetType.TimeLimit>();
        }
        return this.timeLimit;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}PriceGuaranteeTimeLimit"/>
     *         &lt;element ref="{}TicketByTimeLimit"/>
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
    @XmlType(name = "", propOrder = {
        "priceGuaranteeTimeLimit",
        "ticketByTimeLimit"
    })
    public static class TimeLimit {

        @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
        protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
        @XmlElement(name = "TicketByTimeLimit", required = true)
        protected TicketByTimeLimitType ticketByTimeLimit;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the priceGuaranteeTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link PriceGuaranteeTimeLimit }
         *     
         */
        public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
            return priceGuaranteeTimeLimit;
        }

        /**
         * Sets the value of the priceGuaranteeTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceGuaranteeTimeLimit }
         *     
         */
        public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
            this.priceGuaranteeTimeLimit = value;
        }

        /**
         * Gets the value of the ticketByTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public TicketByTimeLimitType getTicketByTimeLimit() {
            return ticketByTimeLimit;
        }

        /**
         * Sets the value of the ticketByTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public void setTicketByTimeLimit(TicketByTimeLimitType value) {
            this.ticketByTimeLimit = value;
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

}
