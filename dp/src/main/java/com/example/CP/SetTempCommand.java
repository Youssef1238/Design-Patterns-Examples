package com.example.CP;

import java.util.Stack;

import com.example.CP.Receivers.AC;

public class SetTempCommand implements ICommand{
    private AC airConditionner;
    private int targetTemp;
    private Stack<Integer> tempStack = new Stack<>();

    public SetTempCommand(AC airConditionner){
        this.airConditionner = airConditionner;
        
    }
    public void execute(){
        this.tempStack.push(airConditionner.getTargetTemp());
        airConditionner.setTargetTemp(targetTemp);
    }
    public void undo(){
        if(this.tempStack.empty()){
            System.out.println("Nothing to Undo, AC target back to 12");
            return;
        }
        airConditionner.setTargetTemp(this.tempStack.pop());
    }
    public void setTargetTemp(int temp){
        this.targetTemp = temp;
    }

}
