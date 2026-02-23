package com.example.CP;

import java.util.Stack;

public class RemoteControl {
    private Stack<ICommand> stack = new Stack<>();

    public void pressButton(ICommand command){
        stack.push(command);
        command.execute();
    }
    public void pressUndo(){
        if(this.stack.empty()){
            System.out.println("Nothing to Undo");
            return;
        }
        stack.pop().undo();
    }
}
