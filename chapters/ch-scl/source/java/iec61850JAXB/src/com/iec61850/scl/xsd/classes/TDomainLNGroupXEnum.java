//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.11 at 11:11:14 PM BOT 
//


package com.iec61850.scl.xsd.classes;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for tDomainLNGroupXEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tDomainLNGroupXEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;pattern value="X[A-Z]*"/>
 *     &lt;enumeration value="XCBR"/>
 *     &lt;enumeration value="XSWI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TDomainLNGroupXEnum {

    XCBR,
    XSWI;

    public String value() {
        return name();
    }

    public static TDomainLNGroupXEnum fromValue(String v) {
        return valueOf(v);
    }

}