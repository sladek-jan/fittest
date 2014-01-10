//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.10 at 09:42:24 AM CET 
//


package eu.fbk.se.fsm.xinput;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="webElementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="button"/>
 *     &lt;enumeration value="textarea"/>
 *     &lt;enumeration value="link"/>
 *     &lt;enumeration value="select"/>
 *     &lt;enumeration value="option"/>
 *     &lt;enumeration value="label"/>
 *     &lt;enumeration value="input"/>
 *     &lt;enumeration value="fTextInput"/>
 *     &lt;enumeration value="fButton"/>
 *     &lt;enumeration value="fComboBox"/>
 *     &lt;enumeration value="fCheckBox"/>
 *     &lt;enumeration value="fDateField"/>
 *     &lt;enumeration value="fDataGrid"/>
 *     &lt;enumeration value="fRadioButton"/>
 *     &lt;enumeration value="fTabNavigator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "webElementType")
@XmlEnum
public enum WebElementType {

    @XmlEnumValue("button")
    BUTTON("button"),
    @XmlEnumValue("textarea")
    TEXTAREA("textarea"),
    @XmlEnumValue("link")
    LINK("link"),
    @XmlEnumValue("select")
    SELECT("select"),
    @XmlEnumValue("option")
    OPTION("option"),
    @XmlEnumValue("label")
    LABEL("label"),
    @XmlEnumValue("input")
    INPUT("input"),
    @XmlEnumValue("fTextInput")
    F_TEXT_INPUT("fTextInput"),
    @XmlEnumValue("fButton")
    F_BUTTON("fButton"),
    @XmlEnumValue("fComboBox")
    F_COMBO_BOX("fComboBox"),
    @XmlEnumValue("fCheckBox")
    F_CHECK_BOX("fCheckBox"),
    @XmlEnumValue("fDateField")
    F_DATE_FIELD("fDateField"),
    @XmlEnumValue("fDataGrid")
    F_DATA_GRID("fDataGrid"),
    @XmlEnumValue("fRadioButton")
    F_RADIO_BUTTON("fRadioButton"),
    @XmlEnumValue("fTabNavigator")
    F_TAB_NAVIGATOR("fTabNavigator");
    private final String value;

    WebElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebElementType fromValue(String v) {
        for (WebElementType c: WebElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
