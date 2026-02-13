package com.example.SP;


// the class can only be instantiated once because the constructor is private
// and has global access because the instance is static
// instance is volatile to force the cpu to always look at the RAM 
// the instantiation is synchronized so that it can be done by one thread only
public class GameConfig {
    private static volatile GameConfig instance;
    public int maxPlayers;
    public int gameSpeed;

    private GameConfig(){
        System.out.println("Loading Configs..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // just to avoid the signature hell
        }
        this.gameSpeed = 5;
        this.maxPlayers = 50;

    }

    public static GameConfig getInstance(){
        if(instance == null){
            synchronized (GameConfig.class){
                if(instance == null){
                    instance = new GameConfig();
                }
            }
        }
        return instance;
    }
}
