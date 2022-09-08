package com.transaction.flightserviceexample.REPOSITORY;

import com.transaction.flightserviceexample.ENTITY.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
