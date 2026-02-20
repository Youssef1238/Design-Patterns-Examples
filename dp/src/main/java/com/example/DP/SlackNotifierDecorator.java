package com.example.DP;

public class SlackNotifierDecorator extends BaseNotifierDecorator{

    public SlackNotifierDecorator(INotifier wrappee){
        super(wrappee);
    }

    public void send(String message){
        super.send(message);
        System.out.println("sending through Slack : .. " + message);
    }
}
