package com.example.StateP.States;

import com.example.StateP.Document;
import com.example.StateP.State;

public class PublishedState implements State{
    public void publish(Document doc){
        System.out.println("Document is already published !");
    }
}
