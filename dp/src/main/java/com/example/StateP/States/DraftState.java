package com.example.StateP.States;

import com.example.StateP.Document;
import com.example.StateP.State;

public class DraftState implements State{
    public void publish(Document doc){
        System.out.println("Document sent to Moderation");
        doc.setState(new ModerationState());
    }
}
