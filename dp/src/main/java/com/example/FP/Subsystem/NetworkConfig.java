package com.example.FP.Subsystem;

public class NetworkConfig {
    public void reserveStaticIP(){
        System.out.println("IP reserved: 12:f4:a9:d9:a2:aa:00");
    }
    public void openPort(int port){
        System.out.println("Port Opened: " + port);
    }
}
