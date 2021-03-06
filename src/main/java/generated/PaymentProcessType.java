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
 * PAYMENT PROCESSING  Information definition.
 * 
 * <p>Java class for PaymentProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Associations"/>
 *         &lt;element name="Status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}PaymentStatusType">
 *                 &lt;attribute name="FailedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PartialPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="VerificationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PriceVarianceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amount">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}AwardPricing"/>
 *                   &lt;element ref="{}CombinationPricing"/>
 *                   &lt;element ref="{}SimpleCurrencyPrice"/>
 *                   &lt;element ref="{}DetailCurrencyPrice"/>
 *                   &lt;element ref="{}EncodedCurrencyPrice"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Method">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}VoucherMethod" minOccurs="0"/>
 *                   &lt;element ref="{}RedemptionMethod" minOccurs="0"/>
 *                   &lt;element ref="{}PaymentCardMethod" minOccurs="0"/>
 *                   &lt;element ref="{}OtherMethod" minOccurs="0"/>
 *                   &lt;element ref="{}MiscChargeMethod" minOccurs="0"/>
 *                   &lt;element ref="{}DirectBillMethod" minOccurs="0"/>
 *                   &lt;element ref="{}CashMethod" minOccurs="0"/>
 *                   &lt;element ref="{}BankAccountMethod" minOccurs="0"/>
 *                   &lt;element ref="{}Check" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Variance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amount" type="{}CurrencyAmountOptType"/>
 *                   &lt;element ref="{}Associations"/>
 *                   &lt;element name="Rule" type="{}PriceVarianceRuleType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Promotions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Promotion" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{}PromotionType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}Associations"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "PaymentProcessType", propOrder = {
    "associations",
    "status",
    "amount",
    "method",
    "variance",
    "promotions"
})
public class PaymentProcessType {

    @XmlElement(name = "Associations", required = true)
    protected OrderItemAssociationType associations;
    @XmlElement(name = "Status", required = true)
    protected PaymentProcessType.Status status;
    @XmlElement(name = "Amount", required = true)
    protected PaymentProcessType.Amount amount;
    @XmlElement(name = "Method", required = true)
    protected PaymentProcessType.Method method;
    @XmlElement(name = "Variance")
    protected PaymentProcessType.Variance variance;
    @XmlElement(name = "Promotions")
    protected PaymentProcessType.Promotions promotions;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Association(s), including Passenger and Group.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public OrderItemAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public void setAssociations(OrderItemAssociationType value) {
        this.associations = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Status }
     *     
     */
    public PaymentProcessType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Status }
     *     
     */
    public void setStatus(PaymentProcessType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Amount }
     *     
     */
    public PaymentProcessType.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Amount }
     *     
     */
    public void setAmount(PaymentProcessType.Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Method }
     *     
     */
    public PaymentProcessType.Method getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Method }
     *     
     */
    public void setMethod(PaymentProcessType.Method value) {
        this.method = value;
    }

    /**
     * Gets the value of the variance property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Variance }
     *     
     */
    public PaymentProcessType.Variance getVariance() {
        return variance;
    }

    /**
     * Sets the value of the variance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Variance }
     *     
     */
    public void setVariance(PaymentProcessType.Variance value) {
        this.variance = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Promotions }
     *     
     */
    public PaymentProcessType.Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Promotions }
     *     
     */
    public void setPromotions(PaymentProcessType.Promotions value) {
        this.promotions = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{}AwardPricing"/>
     *         &lt;element ref="{}CombinationPricing"/>
     *         &lt;element ref="{}SimpleCurrencyPrice"/>
     *         &lt;element ref="{}DetailCurrencyPrice"/>
     *         &lt;element ref="{}EncodedCurrencyPrice"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "awardPricing",
        "combinationPricing",
        "simpleCurrencyPrice",
        "detailCurrencyPrice",
        "encodedCurrencyPrice"
    })
    public static class Amount {

        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "SimpleCurrencyPrice")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice")
        protected EncodedPriceType encodedCurrencyPrice;

        /**
         * Gets the value of the awardPricing property.
         * 
         * @return
         *     possible object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public AwardPriceUnitType getAwardPricing() {
            return awardPricing;
        }

        /**
         * Sets the value of the awardPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public void setAwardPricing(AwardPriceUnitType value) {
            this.awardPricing = value;
        }

        /**
         * Gets the value of the combinationPricing property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceType }
         *     
         */
        public CombinationPriceType getCombinationPricing() {
            return combinationPricing;
        }

        /**
         * Sets the value of the combinationPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceType }
         *     
         */
        public void setCombinationPricing(CombinationPriceType value) {
            this.combinationPricing = value;
        }

        /**
         * Gets the value of the simpleCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
            return simpleCurrencyPrice;
        }

        /**
         * Sets the value of the simpleCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
            this.simpleCurrencyPrice = value;
        }

        /**
         * Gets the value of the detailCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public DetailCurrencyPriceType getDetailCurrencyPrice() {
            return detailCurrencyPrice;
        }

        /**
         * Sets the value of the detailCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
            this.detailCurrencyPrice = value;
        }

        /**
         * Gets the value of the encodedCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link EncodedPriceType }
         *     
         */
        public EncodedPriceType getEncodedCurrencyPrice() {
            return encodedCurrencyPrice;
        }

        /**
         * Sets the value of the encodedCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link EncodedPriceType }
         *     
         */
        public void setEncodedCurrencyPrice(EncodedPriceType value) {
            this.encodedCurrencyPrice = value;
        }

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
     *         &lt;element ref="{}VoucherMethod" minOccurs="0"/>
     *         &lt;element ref="{}RedemptionMethod" minOccurs="0"/>
     *         &lt;element ref="{}PaymentCardMethod" minOccurs="0"/>
     *         &lt;element ref="{}OtherMethod" minOccurs="0"/>
     *         &lt;element ref="{}MiscChargeMethod" minOccurs="0"/>
     *         &lt;element ref="{}DirectBillMethod" minOccurs="0"/>
     *         &lt;element ref="{}CashMethod" minOccurs="0"/>
     *         &lt;element ref="{}BankAccountMethod" minOccurs="0"/>
     *         &lt;element ref="{}Check" minOccurs="0"/>
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
        "voucherMethod",
        "redemptionMethod",
        "paymentCardMethod",
        "otherMethod",
        "miscChargeMethod",
        "directBillMethod",
        "cashMethod",
        "bankAccountMethod",
        "check"
    })
    public static class Method {

        @XmlElement(name = "VoucherMethod")
        protected VoucherMethodType voucherMethod;
        @XmlElement(name = "RedemptionMethod")
        protected RedemptionMethodType redemptionMethod;
        @XmlElement(name = "PaymentCardMethod")
        protected PaymentCardMethodType paymentCardMethod;
        @XmlElement(name = "OtherMethod")
        protected OtherMethodType otherMethod;
        @XmlElement(name = "MiscChargeMethod")
        protected MiscChargeMethodType miscChargeMethod;
        @XmlElement(name = "DirectBillMethod")
        protected DirectBillMethodType directBillMethod;
        @XmlElement(name = "CashMethod")
        protected CashMethodType cashMethod;
        @XmlElement(name = "BankAccountMethod")
        protected BankAccountMethodType bankAccountMethod;
        @XmlElement(name = "Check")
        protected Check check;

        /**
         * Gets the value of the voucherMethod property.
         * 
         * @return
         *     possible object is
         *     {@link VoucherMethodType }
         *     
         */
        public VoucherMethodType getVoucherMethod() {
            return voucherMethod;
        }

        /**
         * Sets the value of the voucherMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoucherMethodType }
         *     
         */
        public void setVoucherMethod(VoucherMethodType value) {
            this.voucherMethod = value;
        }

        /**
         * Gets the value of the redemptionMethod property.
         * 
         * @return
         *     possible object is
         *     {@link RedemptionMethodType }
         *     
         */
        public RedemptionMethodType getRedemptionMethod() {
            return redemptionMethod;
        }

        /**
         * Sets the value of the redemptionMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link RedemptionMethodType }
         *     
         */
        public void setRedemptionMethod(RedemptionMethodType value) {
            this.redemptionMethod = value;
        }

        /**
         * Gets the value of the paymentCardMethod property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardMethodType }
         *     
         */
        public PaymentCardMethodType getPaymentCardMethod() {
            return paymentCardMethod;
        }

        /**
         * Sets the value of the paymentCardMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardMethodType }
         *     
         */
        public void setPaymentCardMethod(PaymentCardMethodType value) {
            this.paymentCardMethod = value;
        }

        /**
         * Gets the value of the otherMethod property.
         * 
         * @return
         *     possible object is
         *     {@link OtherMethodType }
         *     
         */
        public OtherMethodType getOtherMethod() {
            return otherMethod;
        }

        /**
         * Sets the value of the otherMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherMethodType }
         *     
         */
        public void setOtherMethod(OtherMethodType value) {
            this.otherMethod = value;
        }

        /**
         * Gets the value of the miscChargeMethod property.
         * 
         * @return
         *     possible object is
         *     {@link MiscChargeMethodType }
         *     
         */
        public MiscChargeMethodType getMiscChargeMethod() {
            return miscChargeMethod;
        }

        /**
         * Sets the value of the miscChargeMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscChargeMethodType }
         *     
         */
        public void setMiscChargeMethod(MiscChargeMethodType value) {
            this.miscChargeMethod = value;
        }

        /**
         * Gets the value of the directBillMethod property.
         * 
         * @return
         *     possible object is
         *     {@link DirectBillMethodType }
         *     
         */
        public DirectBillMethodType getDirectBillMethod() {
            return directBillMethod;
        }

        /**
         * Sets the value of the directBillMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectBillMethodType }
         *     
         */
        public void setDirectBillMethod(DirectBillMethodType value) {
            this.directBillMethod = value;
        }

        /**
         * Gets the value of the cashMethod property.
         * 
         * @return
         *     possible object is
         *     {@link CashMethodType }
         *     
         */
        public CashMethodType getCashMethod() {
            return cashMethod;
        }

        /**
         * Sets the value of the cashMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link CashMethodType }
         *     
         */
        public void setCashMethod(CashMethodType value) {
            this.cashMethod = value;
        }

        /**
         * Gets the value of the bankAccountMethod property.
         * 
         * @return
         *     possible object is
         *     {@link BankAccountMethodType }
         *     
         */
        public BankAccountMethodType getBankAccountMethod() {
            return bankAccountMethod;
        }

        /**
         * Sets the value of the bankAccountMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAccountMethodType }
         *     
         */
        public void setBankAccountMethod(BankAccountMethodType value) {
            this.bankAccountMethod = value;
        }

        /**
         * Check (Cheque) Payment
         * 
         * @return
         *     possible object is
         *     {@link Check }
         *     
         */
        public Check getCheck() {
            return check;
        }

        /**
         * Sets the value of the check property.
         * 
         * @param value
         *     allowed object is
         *     {@link Check }
         *     
         */
        public void setCheck(Check value) {
            this.check = value;
        }

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
     *         &lt;element name="Promotion" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{}PromotionType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}Associations"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
    @XmlType(name = "", propOrder = {
        "promotion"
    })
    public static class Promotions {

        @XmlElement(name = "Promotion", required = true)
        protected List<PaymentProcessType.Promotions.Promotion> promotion;

        /**
         * Gets the value of the promotion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentProcessType.Promotions.Promotion }
         * 
         * 
         */
        public List<PaymentProcessType.Promotions.Promotion> getPromotion() {
            if (promotion == null) {
                promotion = new ArrayList<PaymentProcessType.Promotions.Promotion>();
            }
            return this.promotion;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{}PromotionType">
         *       &lt;sequence>
         *         &lt;element ref="{}Associations"/>
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
            "associations"
        })
        public static class Promotion
            extends PromotionType
        {

            @XmlElement(name = "Associations", required = true)
            protected OrderItemAssociationType associations;

            /**
             * Association(s), including Passenger and Group.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public OrderItemAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public void setAssociations(OrderItemAssociationType value) {
                this.associations = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}PaymentStatusType">
     *       &lt;attribute name="FailedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PartialPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="VerificationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PriceVarianceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Status
        extends PaymentStatusType
    {

        @XmlAttribute(name = "FailedPaymentInd")
        protected Boolean failedPaymentInd;
        @XmlAttribute(name = "PartialPaymentInd")
        protected Boolean partialPaymentInd;
        @XmlAttribute(name = "VerificationInd")
        protected Boolean verificationInd;
        @XmlAttribute(name = "PriceVarianceInd")
        protected Boolean priceVarianceInd;

        /**
         * Gets the value of the failedPaymentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFailedPaymentInd() {
            return failedPaymentInd;
        }

        /**
         * Sets the value of the failedPaymentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFailedPaymentInd(Boolean value) {
            this.failedPaymentInd = value;
        }

        /**
         * Gets the value of the partialPaymentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPartialPaymentInd() {
            return partialPaymentInd;
        }

        /**
         * Sets the value of the partialPaymentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPartialPaymentInd(Boolean value) {
            this.partialPaymentInd = value;
        }

        /**
         * Gets the value of the verificationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVerificationInd() {
            return verificationInd;
        }

        /**
         * Sets the value of the verificationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVerificationInd(Boolean value) {
            this.verificationInd = value;
        }

        /**
         * Gets the value of the priceVarianceInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPriceVarianceInd() {
            return priceVarianceInd;
        }

        /**
         * Sets the value of the priceVarianceInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPriceVarianceInd(Boolean value) {
            this.priceVarianceInd = value;
        }

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
     *         &lt;element name="Amount" type="{}CurrencyAmountOptType"/>
     *         &lt;element ref="{}Associations"/>
     *         &lt;element name="Rule" type="{}PriceVarianceRuleType" minOccurs="0"/>
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
        "amount",
        "associations",
        "rule"
    })
    public static class Variance {

        @XmlElement(name = "Amount", required = true)
        protected CurrencyAmountOptType amount;
        @XmlElement(name = "Associations", required = true)
        protected OrderItemAssociationType associations;
        @XmlElement(name = "Rule")
        protected PriceVarianceRuleType rule;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setAmount(CurrencyAmountOptType value) {
            this.amount = value;
        }

        /**
         * Association(s), including Passenger and Group.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemAssociationType }
         *     
         */
        public OrderItemAssociationType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemAssociationType }
         *     
         */
        public void setAssociations(OrderItemAssociationType value) {
            this.associations = value;
        }

        /**
         * Gets the value of the rule property.
         * 
         * @return
         *     possible object is
         *     {@link PriceVarianceRuleType }
         *     
         */
        public PriceVarianceRuleType getRule() {
            return rule;
        }

        /**
         * Sets the value of the rule property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceVarianceRuleType }
         *     
         */
        public void setRule(PriceVarianceRuleType value) {
            this.rule = value;
        }

    }

}
