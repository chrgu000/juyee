package com.justonetech.biz.utils.webService.checkWebservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-01-09T09:50:18.992+08:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "CheckWebServiceImplService", 
                  wsdlLocation = "file:/E:/svn/biz/trunk/java/src/main/java/com/justonetech/biz/utils/webService/checkWebservice/checkWebService.wsdl",
                  targetNamespace = "http://check.webservice.pagd.justonetech.com/") 
public class CheckWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://check.webservice.pagd.justonetech.com/", "CheckWebServiceImplService");
    public final static QName CheckWebServiceImplPort = new QName("http://check.webservice.pagd.justonetech.com/", "CheckWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/svn/biz/trunk/java/src/main/java/com/justonetech/biz/utils/webService/checkWebservice/checkWebService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CheckWebServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/svn/biz/trunk/java/src/main/java/com/justonetech/biz/utils/webService/checkWebservice/checkWebService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CheckWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CheckWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CheckWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns CheckWebService
     */
    @WebEndpoint(name = "CheckWebServiceImplPort")
    public CheckWebService getCheckWebServiceImplPort() {
        return super.getPort(CheckWebServiceImplPort, CheckWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CheckWebService
     */
    @WebEndpoint(name = "CheckWebServiceImplPort")
    public CheckWebService getCheckWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(CheckWebServiceImplPort, CheckWebService.class, features);
    }

}
