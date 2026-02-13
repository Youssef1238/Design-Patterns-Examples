package com.example;

import com.example.FMP.FileSource;
import com.example.FMP.MigrationTool;
import com.example.FMP.Source;
import com.example.FMP.SqlSource;
import com.example.SP.GameConfig;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /* MigrationTool mt = new MigrationTool();
        mt.migrate("sql"); */
        /* MigrationTool mt = new MigrationTool() {
            protected Source createSource(){
                return new FileSource();
            }
        };
        mt.migrate();
        mt = new MigrationTool() {
            protected Source createSource(){
                return new SqlSource();
            }
        };
        mt.migrate(); */
        Thread t1 = new Thread(()->GameConfig.getInstance());
        Thread t2 = new Thread(()->GameConfig.getInstance());
        t1.start();
        t2.start();
        
    }
}