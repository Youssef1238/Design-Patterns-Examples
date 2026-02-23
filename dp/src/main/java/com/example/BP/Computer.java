package com.example.BP;

public class Computer {
    // Mandatory
    private String CPU;
    private int RAM;
    // Optional
    private boolean WIFI;
    private boolean Cooler;

    private Computer(ComputerBuilder builder){
        this.CPU = builder.CPU; 
        this.RAM = builder.RAM;
        this.WIFI = builder.WIFI;
        this.Cooler = builder.Cooler;
    }

    public String toString(){
        return "CPU: " + CPU + "\n" + "RAM: " + RAM + "\n" + (WIFI? "has Wifi\n":"") + (Cooler? "has Cooler\n":"");
    }

    public static class ComputerBuilder {
        private String CPU;
        private int RAM;
        private boolean WIFI;
        private boolean Cooler;

        public ComputerBuilder(String CPU, int RAM){
            this.RAM = RAM;
            this.CPU = CPU;
        }

        public ComputerBuilder setWIFI(boolean wifi) {
            this.WIFI = wifi;
            return this;
        }

        public ComputerBuilder setCooler(boolean cooler) {
            this.Cooler = cooler;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
