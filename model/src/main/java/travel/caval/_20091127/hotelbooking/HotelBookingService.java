package travel.caval._20091127.hotelbooking;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-01T19:27:17.591+02:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://caval.travel/20091127/hotelBooking", name = "HotelBookingService")
@XmlSeeAlso({ObjectFactory.class})
public interface HotelBookingService {

    @WebMethod
    @RequestWrapper(localName = "getAvailableHotels", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetAvailableHotels")
    @ResponseWrapper(localName = "getAvailableHotelsResponse", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetAvailableHotelsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public travel.caval._20091127.hotelbooking.CavalHotelAvailabilityRS getAvailableHotels(
        @WebParam(name = "rq", targetNamespace = "")
        travel.caval._20091127.hotelbooking.CavalHotelAvailabilityRQ rq
    );

    @WebMethod
    @RequestWrapper(localName = "getDetailedValuation", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetDetailedValuation")
    @ResponseWrapper(localName = "getDetailedValuationResponse", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetDetailedValuationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public travel.caval._20091127.hotelbooking.CavalHotelBookingValuationRS getDetailedValuation(
        @WebParam(name = "rq", targetNamespace = "")
        travel.caval._20091127.hotelbooking.CavalHotelBookingValuationRQ rq
    );

    @WebMethod
    @RequestWrapper(localName = "getOffersList", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetOffersList")
    @ResponseWrapper(localName = "getOffersListResponse", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetOffersListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public travel.caval._20091127.hotelbooking.CavalGetOffersListRS getOffersList(
        @WebParam(name = "rq", targetNamespace = "")
        travel.caval._20091127.hotelbooking.CavalGetOffersListRQ rq
    );

    @WebMethod
    @RequestWrapper(localName = "confirmHotelBooking", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.ConfirmHotelBooking")
    @ResponseWrapper(localName = "confirmHotelBookingResponse", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.ConfirmHotelBookingResponse")
    @WebResult(name = "return", targetNamespace = "")
    public travel.caval._20091127.hotelbooking.CavalHotelBookingConfirmRS confirmHotelBooking(
        @WebParam(name = "rq", targetNamespace = "")
        travel.caval._20091127.hotelbooking.CavalHotelBookingConfirmRQ rq
    );

    @WebMethod
    @RequestWrapper(localName = "getListOfBoardTypes", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetListOfBoardTypes")
    @ResponseWrapper(localName = "getListOfBoardTypesResponse", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetListOfBoardTypesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public travel.caval._20091127.hotelbooking.CavalGetListOfBoardTypesRS getListOfBoardTypes(
        @WebParam(name = "rq", targetNamespace = "")
        travel.caval._20091127.hotelbooking.CavalGetListOfBoardTypesRQ rq
    );

    @WebMethod
    @RequestWrapper(localName = "getEstablishmentDataSheets", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetEstablishmentDataSheets")
    @ResponseWrapper(localName = "getEstablishmentDataSheetsResponse", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.GetEstablishmentDataSheetsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public travel.caval._20091127.hotelbooking.CavalGetEstablishmentDataSheetsRS getEstablishmentDataSheets(
        @WebParam(name = "rq", targetNamespace = "")
        travel.caval._20091127.hotelbooking.CavalGetEstablishmentDataSheetsRQ rq
    );

    @WebMethod
    @RequestWrapper(localName = "notifyHotelBookings", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.NotifyHotelBookings")
    @ResponseWrapper(localName = "notifyHotelBookingsResponse", targetNamespace = "http://caval.travel/20091127/hotelBooking", className = "travel.caval._20091127.hotelbooking.NotifyHotelBookingsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public travel.caval._20091127.hotelbooking.CavalHotelBookingNotificationRS notifyHotelBookings(
        @WebParam(name = "rq", targetNamespace = "")
        travel.caval._20091127.hotelbooking.CavalHotelBookingNotificationRQ rq
    );
}
