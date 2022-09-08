package com.transaction.flightserviceexample.DTO;

import com.transaction.flightserviceexample.ENTITY.PassengerInfo;
import com.transaction.flightserviceexample.ENTITY.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
