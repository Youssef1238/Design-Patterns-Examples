package com.example.TMethodP;

public abstract class HotBeverage {

    public final void prepareRecipe() throws InterruptedException{
        boilWater();
        Thread.sleep(1000);
        brew();
        Thread.sleep(2000);
        pourInCup();
        Thread.sleep(1000);
        addCondiments();
        Thread.sleep(1000);
    }

    private void boilWater(){
        System.out.println("Boiling Water..");
    }

    private void pourInCup(){
        System.out.println("Pouring In Cup..");
    }

    protected abstract void brew(); 
    protected abstract void addCondiments(); 
}
