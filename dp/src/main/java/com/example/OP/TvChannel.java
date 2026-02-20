package com.example.OP;

public class TvChannel implements Subscriber{
    public void broadcast(String news){
        System.out.println("broadcasting news : .. " + news);
    }
    public void update(String news){
        this.broadcast(news);
    }
}
