package CustomSocialNetwork;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Message {
    private String text;
    private LocalDateTime creationTime;
    private User author;
    private List<Photo> photos;
    private LinkedList<Song> songs;

    public Message(User author, LinkedList<Song> songs) {
        this.author = author;
        this.songs = songs;
    }

    public Message(User author, List<Photo> photos) {
        this.author = author;
        this.photos = photos;
    }

    public Message(User author, List<Photo> photos, LinkedList<Song> songs) {
        this.author = author;
        this.photos = photos;
        this.songs = songs;
    }

    public Message(String text, User author, LinkedList<Song> songs) {
        this.text = text;
        this.author = author;
        this.songs = songs;
    }

    public Message(String text, User author, List<Photo> photos, LinkedList<Song> songs) {
        this.text = text;
        this.author = author;
        this.photos = photos;
        this.songs = songs;
    }

    public Message(String text, User author, List<Photo> photos) {
        this.text = text;
        this.author = author;
        this.photos = photos;
    }

    public Message(String text, User author) {
        this.text = text;
        this.author = author;
    }
}
