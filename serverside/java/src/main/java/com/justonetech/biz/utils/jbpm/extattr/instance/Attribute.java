//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2009.03.26 at 03:35:54 下午 CST
//


package com.justonetech.biz.utils.jbpm.extattr.instance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}All" minOccurs="0"/>
 *         &lt;element ref="{}None" minOccurs="0"/>
 *         &lt;element ref="{}Values" minOccurs="0"/>
 *         &lt;element ref="{}Expression" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "all",
    "none",
    "values",
    "expression"
})
@XmlRootElement(name = "Attribute")
public class Attribute {

    @XmlElement(name = "All")
    protected Object all;
    @XmlElement(name = "None")
    protected Object none;
    @XmlElement(name = "Values")
    protected Values values;
    @XmlElement(name = "Expression")
    protected String expression;
    @XmlAttribute(name = "Code", required = true)
    protected String code;

    /**
     * Gets the value of the all property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setAll(Object value) {
        this.all = value;
    }

    /**
     * Gets the value of the none property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getNone() {
        return none;
    }

    /**
     * Sets the value of the none property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setNone(Object value) {
        this.none = value;
    }

    /**
     * Gets the value of the values property.
     *
     * @return
     *     possible object is
     *     {@link Values }
     *
     */
    public Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     *
     * @param value
     *     allowed object is
     *     {@link Values }
     *
     */
    public void setValues(Values value) {
        this.values = value;
    }

    /**
     * Gets the value of the expression property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

}
