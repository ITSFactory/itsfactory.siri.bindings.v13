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
 * <p>Java class for ReservedSpaceFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservedSpaceFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="lounge"/>
 *     &lt;enumeration value="hall"/>
 *     &lt;enumeration value="meetingpoint"/>
 *     &lt;enumeration value="groupPoint"/>
 *     &lt;enumeration value="reception"/>
 *     &lt;enumeration value="shelter"/>
 *     &lt;enumeration value="seats"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservedSpaceFacilityEnumeration")
@XmlEnum
public enum ReservedSpaceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lounge")
    LOUNGE("lounge"),
    @XmlEnumValue("hall")
    HALL("hall"),
    @XmlEnumValue("meetingpoint")
    MEETINGPOINT("meetingpoint"),
    @XmlEnumValue("groupPoint")
    GROUP_POINT("groupPoint"),
    @XmlEnumValue("reception")
    RECEPTION("reception"),
    @XmlEnumValue("shelter")
    SHELTER("shelter"),
    @XmlEnumValue("seats")
    SEATS("seats");
    private final String value;

    ReservedSpaceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservedSpaceFacilityEnumeration fromValue(String v) {
        for (ReservedSpaceFacilityEnumeration c: ReservedSpaceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
