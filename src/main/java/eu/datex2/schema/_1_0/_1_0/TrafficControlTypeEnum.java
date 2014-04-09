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
 * <p>Java class for TrafficControlTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficControlTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="activeSpeedControl"/>
 *     &lt;enumeration value="hardShoulderRunning"/>
 *     &lt;enumeration value="operatorImposedLimitOrRestriction"/>
 *     &lt;enumeration value="rampMeteringActive"/>
 *     &lt;enumeration value="rerouting"/>
 *     &lt;enumeration value="tollGatesOpen"/>
 *     &lt;enumeration value="vehicleStorageActive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficControlTypeEnum")
@XmlEnum
public enum TrafficControlTypeEnum {


    /**
     * Automatic speed control measures are in place at the specified location, whereby mandatory speed limits are set based on the output from traffic sensing equipment.
     * 
     */
    @XmlEnumValue("activeSpeedControl")
    ACTIVE_SPEED_CONTROL("activeSpeedControl"),

    /**
     * Active traffic management is operating whereby hardshoulder running is permitted.
     * 
     */
    @XmlEnumValue("hardShoulderRunning")
    HARD_SHOULDER_RUNNING("hardShoulderRunning"),

    /**
     * Operator imposed temporary limit of some type.
     * 
     */
    @XmlEnumValue("operatorImposedLimitOrRestriction")
    OPERATOR_IMPOSED_LIMIT_OR_RESTRICTION("operatorImposedLimitOrRestriction"),

    /**
     * Ramp metering is now active at the specified location.
     * 
     */
    @XmlEnumValue("rampMeteringActive")
    RAMP_METERING_ACTIVE("rampMeteringActive"),

    /**
     * Rerouting of traffic is now active at the specified location.
     * 
     */
    @XmlEnumValue("rerouting")
    REROUTING("rerouting"),

    /**
     * Toll gates are open with no fee collection at the specified location.
     * 
     */
    @XmlEnumValue("tollGatesOpen")
    TOLL_GATES_OPEN("tollGatesOpen"),

    /**
     * Vehicles are being stored on the roadway and/or at a rest area or service area at the specified location.
     * 
     */
    @XmlEnumValue("vehicleStorageActive")
    VEHICLE_STORAGE_ACTIVE("vehicleStorageActive");
    private final String value;

    TrafficControlTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficControlTypeEnum fromValue(String v) {
        for (TrafficControlTypeEnum c: TrafficControlTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
