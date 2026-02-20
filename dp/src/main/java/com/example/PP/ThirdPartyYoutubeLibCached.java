package com.example.PP;

import java.util.HashMap;

public class ThirdPartyYoutubeLibCached implements IThirdPartyYoutubeLib{
    private ThirdPartyYoutubeLibService youtubeService;
    private HashMap<String,String> cache;

    public ThirdPartyYoutubeLibCached(){
        this.youtubeService = new ThirdPartyYoutubeLibService();
        this.cache = new HashMap<>();
    }


    public void getVideo(String videoId){
        if(this.cache.containsKey(videoId)) System.out.println("Youtube video fetched from cache: " + videoId);
        else{
            this.youtubeService.getVideo(videoId);
            cache.put(videoId, "");
        }
    }
}
