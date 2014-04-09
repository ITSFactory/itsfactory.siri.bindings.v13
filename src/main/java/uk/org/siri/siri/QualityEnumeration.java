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
 * <p>Java class for QualityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="certain"/>
 *     &lt;enumeration value="veryReliable"/>
 *     &lt;enumeration value="reliable"/>
 *     &lt;enumeration value="probablyReliable"/>
 *     &lt;enumeration value="unconfirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QualityEnumeration")
@XmlEnum
public enum QualityEnumeration {

    @XmlEnumValue("certain")
    CERTAIN("certain"),
    @XmlEnumValue("veryReliable")
    VERY_RELIABLE("veryReliable"),
    @XmlEnumValue("reliable")
    RELIABLE("reliable"),
    @XmlEnumValue("probablyReliable")
    PROBABLY_RELIABLE("probablyReliable"),
    @XmlEnumValue("unconfirmed")
    UNCONFIRMED("unconfirmed");
    private final String value;

    QualityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityEnumeration fromValue(String v) {
        for (QualityEnumeration c: QualityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
