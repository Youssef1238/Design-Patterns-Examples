package com.example.CRP;

public class Ticket {
    private String description;
    private int difficulty;

    public Ticket(String description, int difficulty){
        this.description = description;
        this.difficulty = difficulty;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }
    public String getDescription(){
        return this.description;
    }
    public int getDifficulty(){
        return this.difficulty;
    }

}
