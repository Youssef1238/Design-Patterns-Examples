package com.example.FP.Subsystem;

public class VirtualMachine {
    public void allocateCPU(){
        System.out.println("Allocating CPU..");
    }
    public void allocateRAM(int size){
        System.out.println("Allocating " + size+ "GB of RAM..");
    }
}
