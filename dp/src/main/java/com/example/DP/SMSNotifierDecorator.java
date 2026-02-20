package com.example.DP;

public class SMSNotifierDecorator extends BaseNotifierDecorator{

    public SMSNotifierDecorator(INotifier wrappee){
        super(wrappee);
    }

    public void send(String message){
        super.send(message);
        System.out.println("sending through SMS : .. " + message);
    }

}
