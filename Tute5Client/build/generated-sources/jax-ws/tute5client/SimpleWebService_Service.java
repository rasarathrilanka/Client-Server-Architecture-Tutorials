
package tute5client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SimpleWebService", targetNamespace = "http://server/", wsdlLocation = "http://localhost:8080/Tutorial5WebApplication/SimpleWebService?wsdl")
public class SimpleWebService_Service
    extends Service
{

    private final static URL SIMPLEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIMPLEWEBSERVICE_EXCEPTION;
    private final static QName SIMPLEWEBSERVICE_QNAME = new QName("http://server/", "SimpleWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Tutorial5WebApplication/SimpleWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIMPLEWEBSERVICE_WSDL_LOCATION = url;
        SIMPLEWEBSERVICE_EXCEPTION = e;
    }

    public SimpleWebService_Service() {
        super(__getWsdlLocation(), SIMPLEWEBSERVICE_QNAME);
    }

    public SimpleWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIMPLEWEBSERVICE_QNAME, features);
    }

    public SimpleWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, SIMPLEWEBSERVICE_QNAME);
    }

    public SimpleWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIMPLEWEBSERVICE_QNAME, features);
    }

    public SimpleWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimpleWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SimpleWebService
     */
    @WebEndpoint(name = "SimpleWebServicePort")
    public SimpleWebService getSimpleWebServicePort() {
        return super.getPort(new QName("http://server/", "SimpleWebServicePort"), SimpleWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimpleWebService
     */
    @WebEndpoint(name = "SimpleWebServicePort")
    public SimpleWebService getSimpleWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "SimpleWebServicePort"), SimpleWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIMPLEWEBSERVICE_EXCEPTION!= null) {
            throw SIMPLEWEBSERVICE_EXCEPTION;
        }
        return SIMPLEWEBSERVICE_WSDL_LOCATION;
    }

}
