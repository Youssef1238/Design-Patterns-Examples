package com.example.CP.Receivers;


public class AC {
    private int targetTemp = 12;

    public AC(int targetTemp){
        this.targetTemp = targetTemp;
    }

    public int getTargetTemp(){
        return this.targetTemp;
    }
    public void setTargetTemp(int temp){
        this.targetTemp = temp;
    }
}
