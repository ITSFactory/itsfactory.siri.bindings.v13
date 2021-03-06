//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.27 at 08:11:57 PM EEST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import eu.datex2.schema._1_0._1_0.DelayCodeEnum;
import eu.datex2.schema._1_0._1_0.DelaysTypeEnum;


/**
 * Type for easement info.
 * 
 * <p>Java class for DelaysStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelaysStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelayBand" type="{http://datex2.eu/schema/1_0/1_0}DelayCodeEnum" minOccurs="0"/>
 *         &lt;element name="DelayType" type="{http://datex2.eu/schema/1_0/1_0}DelaysTypeEnum" minOccurs="0"/>
 *         &lt;element name="Delay" type="{http://www.siri.org.uk/siri}PositiveDurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelaysStructure", propOrder = {
    "delayBand",
    "delayType",
    "delay"
})
public class DelaysStructure {

    @XmlElement(name = "DelayBand")
    protected DelayCodeEnum delayBand;
    @XmlElement(name = "DelayType")
    protected DelaysTypeEnum delayType;
    @XmlElement(name = "Delay")
    protected Duration delay;

    /**
     * Gets the value of the delayBand property.
     * 
     * @return
     *     possible object is
     *     {@link DelayCodeEnum }
     *     
     */
    public DelayCodeEnum getDelayBand() {
        return delayBand;
    }

    /**
     * Sets the value of the delayBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayCodeEnum }
     *     
     */
    public void setDelayBand(DelayCodeEnum value) {
        this.delayBand = value;
    }

    /**
     * Gets the value of the delayType property.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelayType() {
        return delayType;
    }

    /**
     * Sets the value of the delayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelayType(DelaysTypeEnum value) {
        this.delayType = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

}
