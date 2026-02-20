package com.example.DP;

public class EmailNotifier implements INotifier{
    public void send(String message){
        System.out.println("sending through Email : .. " + message);
    }
}
