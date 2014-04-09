//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.27 at 08:11:57 PM EEST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthOfYearEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthOfYearEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="january"/>
 *     &lt;enumeration value="february"/>
 *     &lt;enumeration value="march"/>
 *     &lt;enumeration value="april"/>
 *     &lt;enumeration value="may"/>
 *     &lt;enumeration value="june"/>
 *     &lt;enumeration value="july"/>
 *     &lt;enumeration value="august"/>
 *     &lt;enumeration value="september"/>
 *     &lt;enumeration value="october"/>
 *     &lt;enumeration value="november"/>
 *     &lt;enumeration value="december"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonthOfYearEnum")
@XmlEnum
public enum MonthOfYearEnum {


    /**
     * The month of January.
     * 
     */
    @XmlEnumValue("january")
    JANUARY("january"),

    /**
     * The month of February.
     * 
     */
    @XmlEnumValue("february")
    FEBRUARY("february"),

    /**
     * The month of March.
     * 
     */
    @XmlEnumValue("march")
    MARCH("march"),

    /**
     * The month of April.
     * 
     */
    @XmlEnumValue("april")
    APRIL("april"),

    /**
     * The month of May.
     * 
     */
    @XmlEnumValue("may")
    MAY("may"),

    /**
     * The month of June.
     * 
     */
    @XmlEnumValue("june")
    JUNE("june"),

    /**
     * The month of July.
     * 
     */
    @XmlEnumValue("july")
    JULY("july"),

    /**
     * The month of August.
     * 
     */
    @XmlEnumValue("august")
    AUGUST("august"),

    /**
     * The month of September.
     * 
     */
    @XmlEnumValue("september")
    SEPTEMBER("september"),

    /**
     * The month of October.
     * 
     */
    @XmlEnumValue("october")
    OCTOBER("october"),

    /**
     * The month of November.
     * 
     */
    @XmlEnumValue("november")
    NOVEMBER("november"),

    /**
     * The month of December.
     * 
     */
    @XmlEnumValue("december")
    DECEMBER("december");
    private final String value;

    MonthOfYearEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthOfYearEnum fromValue(String v) {
        for (MonthOfYearEnum c: MonthOfYearEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
