package com.example.FP;
import com.example.FP.Subsystem.*;

public class CloudProviderFacade {
    private NetworkConfig networkConfig;
    private VirtualMachine virtualMachine;
    private AccountService accountService;

    public CloudProviderFacade(){
        this.accountService = new AccountService();
        this.virtualMachine = new VirtualMachine();
        this.networkConfig = new NetworkConfig();
    }

    public void deployWebsite() throws InterruptedException{
        System.out.println("Deploying Website..");
        Thread.sleep(2000);
        accountService.verifyUser();
        accountService.checkBalance();
        Thread.sleep(2000);
        virtualMachine.allocateCPU();
        virtualMachine.allocateRAM(16);
        Thread.sleep(2000);
        networkConfig.reserveStaticIP();
        networkConfig.openPort(80);
        System.out.println("✓ Website Deplyed.");
    }
}
