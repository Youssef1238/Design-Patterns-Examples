package com.example.FMP;

public abstract class MigrationTool {
    public void migrate() throws InterruptedException{
        System.out.println("Openning Connection..");
        Thread.sleep(2000);
        System.out.println("Starting Transaction..");
        Thread.sleep(1000);
        createSource().read();
        Thread.sleep(4000);
        System.out.println("Closing Connection..");
    }
    protected abstract Source createSource();
}
