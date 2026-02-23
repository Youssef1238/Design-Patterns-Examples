package com.example.CRP;

public class BotHandler extends SupportHandler{
    public void handle(Ticket ticket){
        if(ticket.getDifficulty() == 1)
            System.out.println("Bot resolved: " + ticket.getDescription());
        else if (this.next != null){
            System.out.println("Bot cannot handle. Escalating...");
            next.handle(ticket);
        }  
        else System.out.println("Bot cannot handle. no other handler, Exiting..");
    }
}
