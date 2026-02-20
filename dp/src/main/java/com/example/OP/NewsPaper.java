package com.example.OP;

public class NewsPaper implements Subscriber{
    public void update(String news){
        this.print(news);
    }
    public void print(String news){
        System.out.println("Printing news : .. " + news);
    }
}
