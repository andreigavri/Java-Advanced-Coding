package ro.sda._2_collections._4_linklist;


/*
Create a class Song with the following instance variables: title - String, duration - double
        *
        * Create the following methods:
        * - constructor
        * - getters for both fields
        * - override toString() method
        */

public class Song {
    private String title;
    private double duration;
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public double getDuration() {
        return duration;
    }
    @Override
    public String toString() {
        return this.title + " " + this.duration;
    }
}
