
package travel.caval._20091127.hotelbooking;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-01T19:27:17.598+02:00
 * Generated source version: 3.1.7
 * 
 */
 
public class HotelBookingService_HotelBookingServicePort_Server{

    protected HotelBookingService_HotelBookingServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new HotelBookingServicePortImpl();
        String address = "http://localhost:8080/serveis/caval/20091127/soap/HotelBookingService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new HotelBookingService_HotelBookingServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}