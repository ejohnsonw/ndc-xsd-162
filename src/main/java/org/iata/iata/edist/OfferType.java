//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer definition.
 * 
 * <p>Java class for OfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferItemDetailType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType")
@XmlSeeAlso({
    org.iata.iata.edist.ShopProductRS.Response.Offers.Offer.class,
    org.iata.iata.edist.ItinReshopRS.Response.ReShopOffers.ReShopOffer.class,
    org.iata.iata.edist.InvDiscrepencyAlertType.AlternateOffers.AlternateOffer.class,
    org.iata.iata.edist.FlightPriceRS.AirlineOffers.AirlineOffer.class,
    org.iata.iata.edist.AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer.class,
    org.iata.iata.edist.ItinReshopAlertsType.OrderItemExceptions.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer.class,
    org.iata.iata.edist.ItinReshopAlertsType.OrderItemExceptions.Exception.InvDiscrepency.AlternateOffers.AlternateOffer.class,
    org.iata.iata.edist.ItinReshopAlertsType.OrderItemExceptions.Exception.Eligibility.AlternateOffers.AlternateOffer.class
})
public class OfferType
    extends OfferItemDetailType
{


}
