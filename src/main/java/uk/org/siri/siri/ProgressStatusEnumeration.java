//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.27 at 08:11:57 PM EEST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressStatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgressStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="onTime"/>
 *     &lt;enumeration value="early"/>
 *     &lt;enumeration value="delayed"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="arrived"/>
 *     &lt;enumeration value="noReport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgressStatusEnumeration")
@XmlEnum
public enum ProgressStatusEnumeration {


    /**
     * Service is on time.
     * 
     */
    @XmlEnumValue("onTime")
    ON_TIME("onTime"),

    /**
     * Service is earlier than expected
     * 
     */
    @XmlEnumValue("early")
    EARLY("early"),

    /**
     * Service is delayed.
     * 
     */
    @XmlEnumValue("delayed")
    DELAYED("delayed"),

    /**
     * Service is on cancelled.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * Service has arrived.
     * 
     */
    @XmlEnumValue("arrived")
    ARRIVED("arrived"),

    /**
     * There is no information about the service
     * 
     */
    @XmlEnumValue("noReport")
    NO_REPORT("noReport");
    private final String value;

    ProgressStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgressStatusEnumeration fromValue(String v) {
        for (ProgressStatusEnumeration c: ProgressStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
