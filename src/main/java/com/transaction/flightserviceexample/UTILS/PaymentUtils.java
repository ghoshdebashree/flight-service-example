package com.transaction.flightserviceexample.UTILS;

import com.transaction.flightserviceexample.EXCEPTION.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String, Double> paymentMap = new HashMap<>();
    static  {
            paymentMap.put("acc1", 12000.0);
            paymentMap.put("acc2", 10000.0);
            paymentMap.put("acc3", 5000.0);
            paymentMap.put("acc4", 8000.0);
        }

    public static boolean validateCreditAmount(String accNo, double paidAmount){
        if(paidAmount>paymentMap.get(accNo)){
            throw new InsufficientAmountException("Insufficient balance ..");
        }
        else{
            return true;

        }

    }

}