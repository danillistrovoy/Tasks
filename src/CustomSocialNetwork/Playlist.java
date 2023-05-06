package CustomSocialNetwork;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Playlist {
    private LocalDateTime lastChange;
    private double duration;
    private int listeningsNumber;
    private String name;
    private LinkedList<Song> songs;
    private User creator;

    public void deleteSong(Song song) {

    }

    public void addSong(Song song) {

    }

    public Playlist(LinkedList<Song> songs, User creator) {
        this.songs = songs;
        this.creator = creator;
    }

    private void listeningsMeasure() {

    }

    private void durationIncrease() {

    }

}
