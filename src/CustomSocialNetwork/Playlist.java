package CustomSocialNetwork;

import java.time.LocalDateTime;
import java.util.List;

public class Playlist {
    private LocalDateTime lastChange;
    private double duration;
    private int listeningNumber;
    private String name;
    private List<Song> songs;
    private User creator;

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deleteSong(Song song) {

    }

    public void addSong(Song song) {

    }

    public Playlist(List<Song> songs, User creator) {
        this.songs = songs;
        this.creator = creator;
    }

    private void listeningMeasure() {

    }

    private void durationIncrease() {

    }

}
