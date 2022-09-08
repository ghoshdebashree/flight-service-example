package com.transaction.flightserviceexample.EXCEPTION;

public class InsufficientAmountException extends RuntimeException{
    public InsufficientAmountException(String msg){
        super(msg);
    }
}
