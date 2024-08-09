package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.songs.Songs;
import com.xworkz.spotifyapp.spotify.Spotify;

public class SpotifyRunner {
    public static void main(String[] args) {
        Songs songs = new Songs();
        songs.songName="Munjane Manjalli";
        songs.singerName = "Raghu Dixit";
        songs.songMovieName="Just Math Mathalli";

        Spotify spotify = new Spotify(songs);
        spotify.openSong();
    }
}
