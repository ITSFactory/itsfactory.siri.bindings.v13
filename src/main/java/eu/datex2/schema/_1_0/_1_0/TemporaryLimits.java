//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.27 at 08:11:57 PM EEST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Temporary limits imposed by the network/road operator at a location on the road network which may be advisory or mandatory.
 * 
 * <p>Java class for TemporaryLimits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemporaryLimits">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficControl">
 *       &lt;sequence>
 *         &lt;element name="temporarySpeedLimit" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="temporaryLimitsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryLimits", propOrder = {
    "temporarySpeedLimit",
    "temporaryLimitsExtension"
})
public class TemporaryLimits
    extends TrafficControl
{

    protected Float temporarySpeedLimit;
    protected ExtensionType temporaryLimitsExtension;

    /**
     * Gets the value of the temporarySpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemporarySpeedLimit() {
        return temporarySpeedLimit;
    }

    /**
     * Sets the value of the temporarySpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemporarySpeedLimit(Float value) {
        this.temporarySpeedLimit = value;
    }

    /**
     * Gets the value of the temporaryLimitsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemporaryLimitsExtension() {
        return temporaryLimitsExtension;
    }

    /**
     * Sets the value of the temporaryLimitsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemporaryLimitsExtension(ExtensionType value) {
        this.temporaryLimitsExtension = value;
    }

}
