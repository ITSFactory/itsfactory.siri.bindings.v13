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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A geographic or geometric area defined by a TPEG-Loc structure which may include height information for additional geospatial descrimination.
 * 
 * <p>Java class for TPEGAreaLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGAreaLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegLocationType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc01AreaLocationSubtypeEnum"/>
 *         &lt;element name="tpegheight" type="{http://datex2.eu/schema/1_0/1_0}TPEGHeight" minOccurs="0"/>
 *         &lt;element name="tpegareaLocationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGAreaLocation", propOrder = {
    "tpegLocationType",
    "tpegheight",
    "tpegareaLocationExtension"
})
@XmlSeeAlso({
    TPEGGeometricArea.class,
    TPEGNamedOnlyArea.class
})
public abstract class TPEGAreaLocation {

    @XmlElement(required = true)
    protected TPEGLoc01AreaLocationSubtypeEnum tpegLocationType;
    protected TPEGHeight tpegheight;
    protected ExtensionType tpegareaLocationExtension;

    /**
     * Gets the value of the tpegLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc01AreaLocationSubtypeEnum }
     *     
     */
    public TPEGLoc01AreaLocationSubtypeEnum getTpegLocationType() {
        return tpegLocationType;
    }

    /**
     * Sets the value of the tpegLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc01AreaLocationSubtypeEnum }
     *     
     */
    public void setTpegLocationType(TPEGLoc01AreaLocationSubtypeEnum value) {
        this.tpegLocationType = value;
    }

    /**
     * Gets the value of the tpegheight property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGHeight }
     *     
     */
    public TPEGHeight getTpegheight() {
        return tpegheight;
    }

    /**
     * Sets the value of the tpegheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGHeight }
     *     
     */
    public void setTpegheight(TPEGHeight value) {
        this.tpegheight = value;
    }

    /**
     * Gets the value of the tpegareaLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegareaLocationExtension() {
        return tpegareaLocationExtension;
    }

    /**
     * Sets the value of the tpegareaLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegareaLocationExtension(ExtensionType value) {
        this.tpegareaLocationExtension = value;
    }

}
