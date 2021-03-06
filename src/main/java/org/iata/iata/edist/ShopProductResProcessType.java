//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Shop Product Response Message Processing.
 * 
 * <p>Java class for ShopProductResProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShopProductResProcessType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Alerts" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseID" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Notices" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MarketingMessages" minOccurs="0"/>
 *         &lt;element name="Group" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PrimaryContact" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Policies" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AlertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MarketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WarningInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NoticeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShopProductResProcessType", propOrder = {
    "alerts",
    "shoppingResponseID",
    "notices",
    "marketingMessages",
    "group",
    "policies"
})
public class ShopProductResProcessType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "Alerts")
    protected AlertsType alerts;
    @XmlElement(name = "ShoppingResponseID")
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "Notices")
    protected Notices notices;
    @XmlElement(name = "MarketingMessages")
    protected MarketingMessages marketingMessages;
    @XmlElement(name = "Group")
    protected ShopProductResProcessType.Group group;
    @XmlElement(name = "Policies")
    protected Policies policies;
    @XmlAttribute(name = "AlertInd")
    protected Boolean alertInd;
    @XmlAttribute(name = "MarketingInd")
    protected Boolean marketingInd;
    @XmlAttribute(name = "WarningInd")
    protected Boolean warningInd;
    @XmlAttribute(name = "NoticeInd")
    protected Boolean noticeInd;

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link AlertsType }
     *     
     */
    public AlertsType getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertsType }
     *     
     */
    public void setAlerts(AlertsType value) {
        this.alerts = value;
    }

    /**
     * Gets the value of the shoppingResponseID property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public ShoppingResponseIDType getShoppingResponseID() {
        return shoppingResponseID;
    }

    /**
     * Sets the value of the shoppingResponseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public void setShoppingResponseID(ShoppingResponseIDType value) {
        this.shoppingResponseID = value;
    }

    /**
     * Gets the value of the notices property.
     * 
     * @return
     *     possible object is
     *     {@link Notices }
     *     
     */
    public Notices getNotices() {
        return notices;
    }

    /**
     * Sets the value of the notices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notices }
     *     
     */
    public void setNotices(Notices value) {
        this.notices = value;
    }

    /**
     * Gets the value of the marketingMessages property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingMessages }
     *     
     */
    public MarketingMessages getMarketingMessages() {
        return marketingMessages;
    }

    /**
     * Sets the value of the marketingMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingMessages }
     *     
     */
    public void setMarketingMessages(MarketingMessages value) {
        this.marketingMessages = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link ShopProductResProcessType.Group }
     *     
     */
    public ShopProductResProcessType.Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShopProductResProcessType.Group }
     *     
     */
    public void setGroup(ShopProductResProcessType.Group value) {
        this.group = value;
    }

    /**
     * Message Policy information.
     * 
     * @return
     *     possible object is
     *     {@link Policies }
     *     
     */
    public Policies getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Policies }
     *     
     */
    public void setPolicies(Policies value) {
        this.policies = value;
    }

    /**
     * Gets the value of the alertInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertInd() {
        return alertInd;
    }

    /**
     * Sets the value of the alertInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertInd(Boolean value) {
        this.alertInd = value;
    }

    /**
     * Gets the value of the marketingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingInd() {
        return marketingInd;
    }

    /**
     * Sets the value of the marketingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingInd(Boolean value) {
        this.marketingInd = value;
    }

    /**
     * Gets the value of the warningInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarningInd() {
        return warningInd;
    }

    /**
     * Sets the value of the warningInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarningInd(Boolean value) {
        this.warningInd = value;
    }

    /**
     * Gets the value of the noticeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoticeInd() {
        return noticeInd;
    }

    /**
     * Sets the value of the noticeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoticeInd(Boolean value) {
        this.noticeInd = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PrimaryContact" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "primaryContact"
    })
    public static class Group {

        @XmlElement(name = "PrimaryContact")
        protected PrimaryContact primaryContact;

        /**
         * Gets the value of the primaryContact property.
         * 
         * @return
         *     possible object is
         *     {@link PrimaryContact }
         *     
         */
        public PrimaryContact getPrimaryContact() {
            return primaryContact;
        }

        /**
         * Sets the value of the primaryContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrimaryContact }
         *     
         */
        public void setPrimaryContact(PrimaryContact value) {
            this.primaryContact = value;
        }

    }

}
