package com.example.AP;

import com.example.AP.lib.AdvancedMediaPlayer;
import com.example.AP.lib.Mp4Player;
import com.example.AP.lib.VlcPlayer;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType){
        this.advancedMediaPlayer = mediaType.equals("mp4") ? new Mp4Player() : new VlcPlayer(); 
    }

    public void play(String mediaType, String filename){
        if(mediaType.equals("mp4"))
            this.advancedMediaPlayer.playMp4(filename);
        else
            this.advancedMediaPlayer.playVlc(filename);
    }
}
