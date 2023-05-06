package CustomSocialNetwork;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Comment {
    private String text;
    private LinkedList<Song> songs;
    private List<Photo> photos;
    private User author;
    private LocalDateTime time;
    private List<Like> likes;

    public Comment(String text, User author) {
        this.text = text;
        this.author = author;
    }

    public Comment(LinkedList<Song> songs, User author) {
        this.songs = songs;
        this.author = author;
    }

    public Comment(List<Photo> photos, User author) {
        this.photos = photos;
        this.author = author;
    }

    public Comment(String text, LinkedList<Song> songs, User author) {
        this.text = text;
        this.songs = songs;
        this.author = author;
    }

    public Comment(String text, List<Photo> photos, User author) {
        this.text = text;
        this.photos = photos;
        this.author = author;
    }

    public Comment(LinkedList<Song> songs, List<Photo> photos, User author) {
        this.songs = songs;
        this.photos = photos;
        this.author = author;
    }

    public Comment(String text, LinkedList<Song> songs, List<Photo> photos, User author) {
        this.text = text;
        this.songs = songs;
        this.photos = photos;
        this.author = author;
    }
    public void addLike(Like like){

    }
}
