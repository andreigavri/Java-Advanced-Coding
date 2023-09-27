package ro.sda._2_collections._4_linklist;

import java.util.ArrayList;
import java.util.List;
/*
        Create a class Album with the following instance variables: name - String, artist - String, songs - List of Songs
        *
        * Create the following methods:
        * - constructor
        *
        * - getters for name and artist
        *
        * - findSong(title) - iterate through the list of songs and compare title parameter with song name
        * and if the song is found then return the song, otherwise return null
        *
        * - addSong(title, duration) - method used to add a song to the album
        * first check if the song has been already added in album (use findSong method)
        * if song is not already in album then add it
        */
public class Album {
    private String name;
    private String artist;
    private List<Song> songList;
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist;
    }
    public Song findSong(String title) {
        for (Song s : songList) {
            if (s.getTitle().equals(title)) {
                return s;
            }
        }
        return null;
    }
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songList.add(new Song(title, duration));
            return true;
        }
        return false;
    }
}