package com.example.AP;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    public void play(String mediaType, String filename) {
        if(mediaType.equals("mp3")) System.out.println("Playing Mp3 file. Name: " + filename);
        else if (mediaType.equals("mp4") | mediaType.equals("vlc")){
            this.mediaAdapter = new MediaAdapter(mediaType);
            this.mediaAdapter.play(mediaType, filename);
        }
        else System.out.println("Media Format (" + mediaType + ") Unsopported");
    }
    
}
