package ro.sda._2_collections._4_linklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Create a class Playlist with the following instance variables: albums - List of Albums, playlist - Queue of Songs
        *
        * Create the following methods:
        * - constructor with no-args - initialize the list and the queue
        *
        * - finAlbum(title) - iterate through the list of albums and check if title parameter
        * is equal to current iteration album name, if it is equal return the album, otherwise return null
        *
        * - addAlbum(album) - adds the album to the album list and returns true when the operation succeeded, otherwise false
        *
        * - addToPlaylist(albumTitle, songTitle) - use findAlbum method to check if the albumTitle is in albums list
        * if the albumTitle is present the check if the songTitle is in album using findSong() method
        * if the song is present then added it to playlist queue - return true or false is the operation succeeded
        *
        * - playNextSong() - check if playlist queue is not empty and then play the first song in the queue (use poll() method)
        *
        * - playEntirePlaylist() - iterate through playlist and play all songs
        *
        */
public class Playlist {
    private List<Album> albumList;
    private Queue<Song> playList;
    public Playlist() {
        this.albumList = new ArrayList<>();
        this.playList = new LinkedList<>();
    }
    public Album findAlbum(String title){
        for(var alb : albumList){
            if (title.equals(alb.getName())){
                return alb;
            }
        }
        return null;
    }
    public boolean addAlbum(Album album){
        return albumList.add(album);
    }
    public void playEntirePlaylist(){
        for(Song song : playList){
            System.out.println("song with name : " + song.getTitle() + " is playing..");
        }
    }

    public void addToPlayList(String musicToBeMurderedBy, String godzilla) {
    }

    public void playNextSong() {
    }
}