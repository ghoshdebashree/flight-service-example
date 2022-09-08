package com.transaction.flightserviceexample;

import com.transaction.flightserviceexample.DTO.FlightBookingAcknowledgement;
import com.transaction.flightserviceexample.DTO.FlightBookingRequest;
import com.transaction.flightserviceexample.SERVICE.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlightServiceExampleApplication {

	@Autowired
	private FlightBookingService service;

	@PostMapping("/bookFlight")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
		return service.bookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

}
