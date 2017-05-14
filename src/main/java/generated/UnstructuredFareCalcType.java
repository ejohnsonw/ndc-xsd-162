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
 * COUPON-RELATED UNSTRUCTURED FARE CALCULATION definition.
 * 
 * <p>Java class for UnstructuredFareCalcType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredFareCalcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purpose" type="{}CouponPurposeListType" minOccurs="0"/>
 *         &lt;element name="PricingCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9a-zA-Z]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportingCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9a-zA-Z]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Info" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="67"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "UnstructuredFareCalcType", propOrder = {
    "purpose",
    "pricingCode",
    "reportingCode",
    "info"
})
public class UnstructuredFareCalcType {

    @XmlElement(name = "Purpose")
    protected CouponPurposeListType purpose;
    @XmlElement(name = "PricingCode")
    protected String pricingCode;
    @XmlElement(name = "ReportingCode")
    protected String reportingCode;
    @XmlElement(name = "Info")
    protected String info;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CouponPurposeListType }
     *     
     */
    public CouponPurposeListType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponPurposeListType }
     *     
     */
    public void setPurpose(CouponPurposeListType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the pricingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCode() {
        return pricingCode;
    }

    /**
     * Sets the value of the pricingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingCode(String value) {
        this.pricingCode = value;
    }

    /**
     * Gets the value of the reportingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingCode() {
        return reportingCode;
    }

    /**
     * Sets the value of the reportingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingCode(String value) {
        this.reportingCode = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

}
