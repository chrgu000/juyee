package com.justonetech.biz.utils.webService.checkWebservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-01-09T09:50:18.978+08:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://check.webservice.pagd.justonetech.com/", name = "CheckWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface CheckWebService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCheckDeviceInfoListForWorker", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.GetCheckDeviceInfoListForWorker")
    @WebMethod
    @ResponseWrapper(localName = "getCheckDeviceInfoListForWorkerResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.GetCheckDeviceInfoListForWorkerResponse")
    public java.lang.String getCheckDeviceInfoListForWorker(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCheckInfoListForWorker", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.GetCheckInfoListForWorker")
    @WebMethod
    @ResponseWrapper(localName = "getCheckInfoListForWorkerResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.GetCheckInfoListForWorkerResponse")
    public java.lang.String getCheckInfoListForWorker(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteGdInfo", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteGdInfo")
    @WebMethod
    @ResponseWrapper(localName = "deleteGdInfoResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteGdInfoResponse")
    public java.lang.String deleteGdInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteCheckManager", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteCheckManager")
    @WebMethod
    @ResponseWrapper(localName = "deleteCheckManagerResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteCheckManagerResponse")
    public java.lang.String deleteCheckManager(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCheckDeviceInfoList", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.GetCheckDeviceInfoList")
    @WebMethod
    @ResponseWrapper(localName = "getCheckDeviceInfoListResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.GetCheckDeviceInfoListResponse")
    public java.lang.String getCheckDeviceInfoList(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveCheckManagerPosition", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckManagerPosition")
    @WebMethod
    @ResponseWrapper(localName = "saveCheckManagerPositionResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckManagerPositionResponse")
    public java.lang.String saveCheckManagerPosition(
        @WebParam(name = "arg0", targetNamespace = "")
        com.justonetech.biz.utils.webService.checkWebservice.CheckManagerPosition arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveCheckDeviceInfo", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckDeviceInfo")
    @WebMethod
    @ResponseWrapper(localName = "saveCheckDeviceInfoResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckDeviceInfoResponse")
    public java.lang.String saveCheckDeviceInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        com.justonetech.biz.utils.webService.checkWebservice.CheckDeviceInfo arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveCheckManager", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckManager")
    @WebMethod
    @ResponseWrapper(localName = "saveCheckManagerResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckManagerResponse")
    public java.lang.String saveCheckManager(
        @WebParam(name = "arg0", targetNamespace = "")
        com.justonetech.biz.utils.webService.checkWebservice.CheckManager arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveCheckFingerPrint", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckFingerPrint")
    @WebMethod
    @ResponseWrapper(localName = "saveCheckFingerPrintResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckFingerPrintResponse")
    public java.lang.String saveCheckFingerPrint(
        @WebParam(name = "arg0", targetNamespace = "")
        com.justonetech.biz.utils.webService.checkWebservice.CheckFingerPrint arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveGdInfo", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveGdInfo")
    @WebMethod
    @ResponseWrapper(localName = "saveGdInfoResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveGdInfoResponse")
    public java.lang.String saveGdInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteCheckManagerPosition", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteCheckManagerPosition")
    @WebMethod
    @ResponseWrapper(localName = "deleteCheckManagerPositionResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteCheckManagerPositionResponse")
    public java.lang.String deleteCheckManagerPosition(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCheckInfoList", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.GetCheckInfoList")
    @WebMethod
    @ResponseWrapper(localName = "getCheckInfoListResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.GetCheckInfoListResponse")
    public java.lang.String getCheckInfoList(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveCheckDeviceInfoForWorker", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckDeviceInfoForWorker")
    @WebMethod
    @ResponseWrapper(localName = "saveCheckDeviceInfoForWorkerResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckDeviceInfoForWorkerResponse")
    public java.lang.String saveCheckDeviceInfoForWorker(
        @WebParam(name = "arg0", targetNamespace = "")
        com.justonetech.biz.utils.webService.checkWebservice.CheckDeviceInfo arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteCheckFingerPrint", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteCheckFingerPrint")
    @WebMethod
    @ResponseWrapper(localName = "deleteCheckFingerPrintResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteCheckFingerPrintResponse")
    public java.lang.String deleteCheckFingerPrint(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteCheckDeviceInfo", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteCheckDeviceInfo")
    @WebMethod
    @ResponseWrapper(localName = "deleteCheckDeviceInfoResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.DeleteCheckDeviceInfoResponse")
    public java.lang.String deleteCheckDeviceInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveCheckManagerForWorker", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckManagerForWorker")
    @WebMethod
    @ResponseWrapper(localName = "saveCheckManagerForWorkerResponse", targetNamespace = "http://check.webservice.pagd.justonetech.com/", className = "com.justonetech.biz.utils.webService.checkWebservice.SaveCheckManagerForWorkerResponse")
    public java.lang.String saveCheckManagerForWorker(
        @WebParam(name = "arg0", targetNamespace = "")
        com.justonetech.biz.utils.webService.checkWebservice.CheckManager arg0
    );
}
