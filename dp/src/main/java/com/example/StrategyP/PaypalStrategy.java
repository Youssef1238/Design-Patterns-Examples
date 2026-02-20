package com.example.StrategyP;

public class PaypalStrategy implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid " + amount + " MAD using Paypal.");
    }
}
