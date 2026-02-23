package com.example.CRP;

public abstract class SupportHandler {
    protected SupportHandler next;

    public SupportHandler setNext(SupportHandler next){
        this.next = next;
        return this;
    }

    public abstract void handle(Ticket ticket);
}
