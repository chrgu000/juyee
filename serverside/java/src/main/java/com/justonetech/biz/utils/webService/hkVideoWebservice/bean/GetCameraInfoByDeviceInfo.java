package com.justonetech.biz.utils.webService.hkVideoWebservice.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "indexCode"
})
@XmlRootElement(name = "getCameraInfoByDeviceInfo", namespace = "http://webservice.cms.hikvision.com")
public class GetCameraInfoByDeviceInfo {

    @XmlElementRef(name = "sessionId", namespace = "http://webservice.cms.hikvision.com", type = JAXBElement.class)
    protected JAXBElement<String> sessionId;
    @XmlElementRef(name = "indexCode", namespace = "http://webservice.cms.hikvision.com", type = JAXBElement.class)
    protected JAXBElement<String> indexCode;

    /**
     * 获取sessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSessionId() {
        return sessionId;
    }

    /**
     * 设置sessionId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSessionId(JAXBElement<String> value) {
        this.sessionId = value;
    }

    /**
     * 获取indexCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getIndexCode() {
        return indexCode;
    }

    /**
     * 设置indexCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndexCode(JAXBElement<String> value) {
        this.indexCode = value;
    }

}
