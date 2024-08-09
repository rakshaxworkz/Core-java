package com.xworkz.spotifyapp.songs;

public class Songs {
    public String songName;
    public String singerName;
    public String songMovieName;

    public void displayInfo(){
        System.out.println("The Song Name is "  + this.songName);
        System.out.println("The Singer Name is " + this.singerName );
        System.out.println("The Movie name is " + this.songMovieName);
    }
}
