
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillFrom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillFrom">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="DFP"/>
 *     &lt;enumeration value="THIRD_PARTY"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillFrom")
@XmlEnum
public enum BillFrom {


    /**
     * 
     *                 Use default bill from. Google checks whether line item is created in DoubleClick Sales Manager.
     *                 If yes, the {@link Proposal#billingSource} will be the billing source.
     *                 Otherwise, the {@code DFP} will be the billing source.
     *               
     * 
     */
    DEFAULT,

    /**
     * 
     *                 DFP volume.
     *               
     * 
     */
    DFP,

    /**
     * 
     *                 Third-party volume.
     *               
     * 
     */
    THIRD_PARTY,

    /**
     * 
     *                 Manual volume.
     *               
     * 
     */
    MANUAL,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BillFrom fromValue(String v) {
        return valueOf(v);
    }

}
