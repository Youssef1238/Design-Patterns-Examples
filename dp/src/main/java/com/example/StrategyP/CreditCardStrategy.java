package com.example.StrategyP;

public class CreditCardStrategy implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid " + amount + " MAD using Credit Card.");
    }
}
