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
 * <p>Java class for PathDirectionEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PathDirectionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="oneWay"/>
 *     &lt;enumeration value="twoWay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PathDirectionEnumeration")
@XmlEnum
public enum PathDirectionEnumeration {

    @XmlEnumValue("oneWay")
    ONE_WAY("oneWay"),
    @XmlEnumValue("twoWay")
    TWO_WAY("twoWay");
    private final String value;

    PathDirectionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PathDirectionEnumeration fromValue(String v) {
        for (PathDirectionEnumeration c: PathDirectionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
