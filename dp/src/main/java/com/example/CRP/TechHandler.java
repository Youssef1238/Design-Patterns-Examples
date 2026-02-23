package com.example.CRP;

public class TechHandler extends SupportHandler{
    
    public void handle(Ticket ticket){
        if(ticket.getDifficulty() == 2)
            System.out.println("Tech resolved: " + ticket.getDescription());
        else if (this.next != null){
            System.out.println("Tech cannot handle. Escalating...");
            next.handle(ticket);
        }  
        else System.out.println("Tech cannot handle. no other handler, Exiting..");
    }
}
