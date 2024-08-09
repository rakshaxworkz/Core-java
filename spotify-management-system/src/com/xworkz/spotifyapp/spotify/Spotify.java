package com.xworkz.spotifyapp.spotify;

import com.xworkz.spotifyapp.songs.Songs;

public class Spotify {
    Songs songs;
    public Spotify(Songs songs){
        this.songs = songs;
    }
    public void openSong(){
        if(songs!=null)
            this.songs.displayInfo();
        else
            System.out.println("Song name is not found");
    }
}
