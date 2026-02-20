package com.example.StrategyP;

public class CryptoStrategy implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid " + amount + " MAD using Bitcoin Wallet.");
    }
}
