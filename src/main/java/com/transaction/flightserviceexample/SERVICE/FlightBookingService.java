package com.transaction.flightserviceexample.SERVICE;

import com.transaction.flightserviceexample.DTO.FlightBookingAcknowledgement;
import com.transaction.flightserviceexample.DTO.FlightBookingRequest;
import com.transaction.flightserviceexample.ENTITY.PassengerInfo;
import com.transaction.flightserviceexample.ENTITY.PaymentInfo;
import com.transaction.flightserviceexample.REPOSITORY.PasssengerInfoRepository;
import com.transaction.flightserviceexample.REPOSITORY.PaymentInfoRepository;
import com.transaction.flightserviceexample.UTILS.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PasssengerInfoRepository passsengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
        FlightBookingAcknowledgement acknowledgement = null;
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passsengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateCreditAmount(paymentInfo.getAccountNo(),passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
    }
}
