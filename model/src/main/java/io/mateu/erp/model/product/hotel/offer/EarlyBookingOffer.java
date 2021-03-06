package io.mateu.erp.model.product.hotel.offer;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Convert;
import javax.persistence.Entity;

@Entity
@Getter@Setter
public class EarlyBookingOffer extends AbstractHotelOffer {

    @Convert(converter = EarlyBookingOfferLineConverter.class)
    private EarlyBookingOfferLines lines = new EarlyBookingOfferLines();

}
