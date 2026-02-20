package com.example.OP;

public class MobileApp implements Subscriber{
    public void notify(String news){
        System.out.println("News notification  : .. " + news);
    }
    public void update(String news){
        this.notify(news);
    }
}
