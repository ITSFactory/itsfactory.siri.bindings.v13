//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.27 at 08:11:57 PM EEST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A location defined by reference to a predefined location.
 * 
 * <p>Java class for LocationByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationByReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Location">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationReference" type="{http://datex2.eu/schema/1_0/1_0}Reference"/>
 *         &lt;element name="locationByReferenceExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationByReference", propOrder = {
    "predefinedLocationReference",
    "locationByReferenceExtension"
})
public class LocationByReference
    extends Location
{

    @XmlElement(required = true)
    protected String predefinedLocationReference;
    protected ExtensionType locationByReferenceExtension;

    /**
     * Gets the value of the predefinedLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationReference() {
        return predefinedLocationReference;
    }

    /**
     * Sets the value of the predefinedLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationReference(String value) {
        this.predefinedLocationReference = value;
    }

    /**
     * Gets the value of the locationByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationByReferenceExtension() {
        return locationByReferenceExtension;
    }

    /**
     * Sets the value of the locationByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationByReferenceExtension(ExtensionType value) {
        this.locationByReferenceExtension = value;
    }

}
