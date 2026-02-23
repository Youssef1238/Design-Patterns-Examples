package com.example.CompositeP;

import java.util.ArrayList;
import java.util.List;

public class Box implements Cargo{
    private List<Cargo> content = new ArrayList<>();

    public void add(Cargo cargo){
        this.content.add(cargo);   
    }

    public int getPrice(){
        return content.stream().mapToInt(Cargo::getPrice).sum();
    }
}
