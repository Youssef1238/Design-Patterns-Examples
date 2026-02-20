package com.example.PP;

public class ThirdPartyYoutubeLibService implements IThirdPartyYoutubeLib{
    public void getVideo(String videoId){
        System.out.println("Connecting to Youtube...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // To avoid signature hell
        }
        System.out.println("Youtube video fetched : " + videoId);
    }
}
