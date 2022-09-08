package com.transaction.flightserviceexample.ENTITY;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PAYMENT_INFO")
@Entity
public class PaymentInfo {

    @Id
    private String paymentId;
    private String accountNo;
    private double amount;
    private String cardType;
    private Long passengerId;
}
