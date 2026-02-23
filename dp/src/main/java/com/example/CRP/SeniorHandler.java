package com.example.CRP;

public class SeniorHandler extends SupportHandler {
    public void handle(Ticket ticket){
        if(ticket.getDifficulty() == 3)
            System.out.println("Senior resolved: " + ticket.getDescription());
        else System.out.println("Senior cannot handle. no other handler, Exiting..");
    }
}
