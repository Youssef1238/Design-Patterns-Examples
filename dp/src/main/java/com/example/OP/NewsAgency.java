package com.example.OP;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    /* TvChannel tvChannel;
    MobileApp mobileApp; */

    /* public NewsAgency(TvChannel tvChannel,MobileApp mobileApp){
        this.tvChannel = tvChannel;
        this.mobileApp = mobileApp;
    } */

    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void setNews(String news){
        /* tvChannel.broadcast(news);
        mobileApp.notify(news); */
        for(Subscriber sub: this.subscribers) sub.update(news);
    }
}
