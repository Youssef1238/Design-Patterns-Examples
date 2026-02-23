package com.example.StateP.States;

import com.example.StateP.Document;
import com.example.StateP.State;

public class ModerationState implements State{
    public void publish(Document doc){
        System.out.println("Document approved and published");
        doc.setState(new PublishedState());
    }
}
