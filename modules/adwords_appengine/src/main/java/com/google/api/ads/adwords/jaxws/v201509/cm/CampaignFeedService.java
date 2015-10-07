
package com.google.api.ads.adwords.jaxws.v201509.cm;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CampaignFeedService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201509/CampaignFeedService?wsdl")
public class CampaignFeedService
    extends Service
{

    private final static URL CAMPAIGNFEEDSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAMPAIGNFEEDSERVICE_EXCEPTION;
    private final static QName CAMPAIGNFEEDSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201509", "CampaignFeedService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201509/CampaignFeedService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMPAIGNFEEDSERVICE_WSDL_LOCATION = url;
        CAMPAIGNFEEDSERVICE_EXCEPTION = e;
    }

    public CampaignFeedService() {
        super(__getWsdlLocation(), CAMPAIGNFEEDSERVICE_QNAME);
    }

    public CampaignFeedService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CampaignFeedServiceInterface
     */
    @WebEndpoint(name = "CampaignFeedServiceInterfacePort")
    public CampaignFeedServiceInterface getCampaignFeedServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201509", "CampaignFeedServiceInterfacePort"), CampaignFeedServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CampaignFeedServiceInterface
     */
    @WebEndpoint(name = "CampaignFeedServiceInterfacePort")
    public CampaignFeedServiceInterface getCampaignFeedServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201509", "CampaignFeedServiceInterfacePort"), CampaignFeedServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMPAIGNFEEDSERVICE_EXCEPTION!= null) {
            throw CAMPAIGNFEEDSERVICE_EXCEPTION;
        }
        return CAMPAIGNFEEDSERVICE_WSDL_LOCATION;
    }

}
