package travel.caval._20091127.hotelbooking;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-01T19:27:17.601+02:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "HotelBookingService", 
                  wsdlLocation = "http://caval.travel/tech_specs/wsdls/HotelBookingService.wsdl",
                  targetNamespace = "http://caval.travel/20091127/hotelBooking") 
public class HotelBookingService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://caval.travel/20091127/hotelBooking", "HotelBookingService");
    public final static QName HotelBookingServicePort = new QName("http://caval.travel/20091127/hotelBooking", "HotelBookingServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://caval.travel/tech_specs/wsdls/HotelBookingService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HotelBookingService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://caval.travel/tech_specs/wsdls/HotelBookingService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HotelBookingService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HotelBookingService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelBookingService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HotelBookingService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HotelBookingService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HotelBookingService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HotelBookingService
     */
    @WebEndpoint(name = "HotelBookingServicePort")
    public HotelBookingService getHotelBookingServicePort() {
        return super.getPort(HotelBookingServicePort, HotelBookingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelBookingService
     */
    @WebEndpoint(name = "HotelBookingServicePort")
    public HotelBookingService getHotelBookingServicePort(WebServiceFeature... features) {
        return super.getPort(HotelBookingServicePort, HotelBookingService.class, features);
    }

}
