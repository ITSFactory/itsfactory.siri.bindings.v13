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


/**
 * Type for access control.
 * 
 * <p>Java class for GeneralMessageCapabilityAccessControlStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageCapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *       &lt;sequence>
 *         &lt;element name="CheckInfoChannelRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageCapabilityAccessControlStructure", propOrder = {
    "checkInfoChannelRef"
})
public class GeneralMessageCapabilityAccessControlStructure
    extends CapabilityAccessControlStructure
{

    @XmlElement(name = "CheckInfoChannelRef", defaultValue = "true")
    protected boolean checkInfoChannelRef;

    /**
     * Gets the value of the checkInfoChannelRef property.
     * 
     */
    public boolean isCheckInfoChannelRef() {
        return checkInfoChannelRef;
    }

    /**
     * Sets the value of the checkInfoChannelRef property.
     * 
     */
    public void setCheckInfoChannelRef(boolean value) {
        this.checkInfoChannelRef = value;
    }

}
