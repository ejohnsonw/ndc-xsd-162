//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 10:55:06 PM EDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * COMMON NOTICES definition.
 * 
 * <p>Java class for NoticeBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Localization" type="{}LocalizationNoticeType" minOccurs="0"/>
 *         &lt;element name="InfoPolicies" type="{}InfoPolicyNoticeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeBaseType", propOrder = {
    "localization",
    "infoPolicies"
})
public class NoticeBaseType {

    @XmlElement(name = "Localization")
    protected LocalizationNoticeType localization;
    @XmlElement(name = "InfoPolicies")
    protected InfoPolicyNoticeType infoPolicies;

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationNoticeType }
     *     
     */
    public LocalizationNoticeType getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationNoticeType }
     *     
     */
    public void setLocalization(LocalizationNoticeType value) {
        this.localization = value;
    }

    /**
     * Gets the value of the infoPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPolicyNoticeType }
     *     
     */
    public InfoPolicyNoticeType getInfoPolicies() {
        return infoPolicies;
    }

    /**
     * Sets the value of the infoPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPolicyNoticeType }
     *     
     */
    public void setInfoPolicies(InfoPolicyNoticeType value) {
        this.infoPolicies = value;
    }

}
