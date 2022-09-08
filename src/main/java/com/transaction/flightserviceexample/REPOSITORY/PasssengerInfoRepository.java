package com.transaction.flightserviceexample.REPOSITORY;

import com.transaction.flightserviceexample.ENTITY.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasssengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
