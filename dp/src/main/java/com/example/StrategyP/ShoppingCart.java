package com.example.StrategyP;

public class ShoppingCart {
    private int amount = 0;
    private PaymentStrategy paymentStrategy;

    public void addItem(int price){
        this.amount += price;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(){
        if(this.paymentStrategy != null){
            this.paymentStrategy.pay(amount);
        }else{
            System.out.println("No Payment method is selected !");
        }
    }
}
