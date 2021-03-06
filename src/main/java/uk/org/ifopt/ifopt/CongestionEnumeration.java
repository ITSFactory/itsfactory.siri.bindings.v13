//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.27 at 08:11:57 PM EEST 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CongestionEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CongestionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noWaiting"/>
 *     &lt;enumeration value="queue"/>
 *     &lt;enumeration value="crowding"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CongestionEnumeration")
@XmlEnum
public enum CongestionEnumeration {

    @XmlEnumValue("noWaiting")
    NO_WAITING("noWaiting"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("crowding")
    CROWDING("crowding"),
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    CongestionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CongestionEnumeration fromValue(String v) {
        for (CongestionEnumeration c: CongestionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
