package com.example.StateP;

import com.example.StateP.States.DraftState;

public class Document {
    private State state;

    public Document(){
        this.state = new DraftState();
    }

    public void setState(State state){
        this.state = state;
    }
    public void publish(){
        this.state.publish(this);
    }
}
