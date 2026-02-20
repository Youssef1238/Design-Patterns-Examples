package com.example.DP;

public abstract class BaseNotifierDecorator implements INotifier{
    private INotifier wrappee;
    public BaseNotifierDecorator(INotifier wrappee){
        this.wrappee = wrappee;
    }
    public void send(String message){
        this.wrappee.send(message);
    }
}
