
package com.justonetech.biz.utils.webService.checkWebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for baseCheckManagerPosition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="baseCheckManagerPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deleteUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jdTaskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://check.webservice.pagd.justonetech.com/}checkManager" minOccurs="0"/>
 *         &lt;element name="positionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseCheckManagerPosition", propOrder = {
        "certificateCode",
        "certificateName",
        "createTime",
        "createUser",
        "deleteTime",
        "deleteUser",
        "jdTaskCode",
        "gdCode",
        "guid",
        "id",
        "isDelete",
        "isValid",
        "manager",
        "positionName",
        "positionType",
        "updateTime",
        "updateUser"
})
@XmlSeeAlso({
        CheckManagerPosition.class
})
public abstract class BaseCheckManagerPosition {

    protected String certificateCode;
    protected String certificateName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected String createUser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deleteTime;
    protected String deleteUser;
    protected String jdTaskCode;
    protected String gdCode;
    protected String guid;
    protected Long id;
    protected Boolean isDelete;
    protected Boolean isValid;
    protected CheckManager manager;
    protected String positionName;
    protected Long positionType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    protected String updateUser;

    /**
     * Gets the value of the certificateCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCertificateCode() {
        return certificateCode;
    }

    /**
     * Sets the value of the certificateCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCertificateCode(String value) {
        this.certificateCode = value;
    }

    /**
     * Gets the value of the certificateName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * Sets the value of the certificateName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCertificateName(String value) {
        this.certificateName = value;
    }

    /**
     * Gets the value of the createTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the createUser property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the deleteTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDeleteTime() {
        return deleteTime;
    }

    /**
     * Sets the value of the deleteTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDeleteTime(XMLGregorianCalendar value) {
        this.deleteTime = value;
    }

    /**
     * Gets the value of the deleteUser property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * Sets the value of the deleteUser property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeleteUser(String value) {
        this.deleteUser = value;
    }

    /**
     * Gets the value of the jdTaskCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJdTaskCode() {
        return jdTaskCode;
    }

    /**
     * Sets the value of the jdTaskCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJdTaskCode(String value) {
        this.jdTaskCode = value;
    }

    /**
     * Gets the value of the gdCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGdCode() {
        return gdCode;
    }

    /**
     * Sets the value of the gdCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGdCode(String value) {
        this.gdCode = value;
    }

    /**
     * Gets the value of the guid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isDelete property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsDelete() {
        return isDelete;
    }

    /**
     * Sets the value of the isDelete property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsDelete(Boolean value) {
        this.isDelete = value;
    }

    /**
     * Gets the value of the isValid property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the manager property.
     *
     * @return
     *     possible object is
     *     {@link CheckManager }
     *
     */
    public CheckManager getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     *
     * @param value
     *     allowed object is
     *     {@link CheckManager }
     *
     */
    public void setManager(CheckManager value) {
        this.manager = value;
    }

    /**
     * Gets the value of the positionName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * Sets the value of the positionName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPositionName(String value) {
        this.positionName = value;
    }

    /**
     * Gets the value of the positionType property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPositionType(Long value) {
        this.positionType = value;
    }

    /**
     * Gets the value of the updateTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the updateUser property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets the value of the updateUser property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

}
