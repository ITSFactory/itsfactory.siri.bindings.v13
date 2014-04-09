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
 * Type for Subscription Request for Connection Protection.
 * 
 * <p>Java class for ConnectionTimetableSubscriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionTimetableRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTimetableSubscriptionStructure", propOrder = {
    "connectionTimetableRequest"
})
public class ConnectionTimetableSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "ConnectionTimetableRequest", required = true)
    protected ConnectionTimetableRequestStructure connectionTimetableRequest;

    /**
     * Gets the value of the connectionTimetableRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableRequestStructure }
     *     
     */
    public ConnectionTimetableRequestStructure getConnectionTimetableRequest() {
        return connectionTimetableRequest;
    }

    /**
     * Sets the value of the connectionTimetableRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableRequestStructure }
     *     
     */
    public void setConnectionTimetableRequest(ConnectionTimetableRequestStructure value) {
        this.connectionTimetableRequest = value;
    }

}
