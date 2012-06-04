
/*
 * 
 */

package org.mulesoft.samples.loan;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2011-12-16T16:39:30.934-08:00
 * Generated source version: 2.3.3
 * 
 */


@WebServiceClient(name = "LoanRequest", 
                  wsdlLocation = "file:/Users/albinkjellin/Documents/mule/workspace/CXF-Sample/src/main/resources/loanservice.wsdl",
                  targetNamespace = "http://www.mulesoft.org/demo/LoanRequest/") 
public class LoanRequest_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.mulesoft.org/demo/LoanRequest/", "LoanRequest");
    public final static QName LoanRequestSOAP = new QName("http://www.mulesoft.org/demo/LoanRequest/", "LoanRequestSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/albinkjellin/Documents/mule/workspace/CXF-Sample/src/main/resources/loanservice.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/Users/albinkjellin/Documents/mule/workspace/CXF-Sample/src/main/resources/loanservice.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public LoanRequest_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoanRequest_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoanRequest_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    /*
    public LoanRequest_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
*/
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    /*
    public LoanRequest_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }
*/
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    /*
    public LoanRequest_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }
    */

    /**
     * 
     * @return
     *     returns LoanRequest
     */
    @WebEndpoint(name = "LoanRequestSOAP")
    public LoanRequest getLoanRequestSOAP() {
        return super.getPort(LoanRequestSOAP, LoanRequest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoanRequest
     */
    @WebEndpoint(name = "LoanRequestSOAP")
    public LoanRequest getLoanRequestSOAP(WebServiceFeature... features) {
        return super.getPort(LoanRequestSOAP, LoanRequest.class, features);
    }

}
