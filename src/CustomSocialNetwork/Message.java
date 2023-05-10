package CustomSocialNetwork;

import java.time.LocalDateTime;
import java.util.List;

public class Message {
    private String text;
    private LocalDateTime creationTime;
    private User author;
    private List<Photo> photos;
    private List<Song> songs;

    public List<Photo> getPhotos() {
        return photos;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Message(List<Song> songs, User author) {
        this.author = author;
        this.songs = songs;
    }

    public Message(User author, List<Photo> photos) {
        this.author = author;
        this.photos = photos;
    }

    public Message(User author, List<Photo> photos, List<Song> songs) {
        this.author = author;
        this.photos = photos;
        this.songs = songs;
    }

    public Message(String text, List<Song> songs, User author) {
        this.text = text;
        this.author = author;
        this.songs = songs;
    }

    public Message(String text, User author, List<Photo> photos, List<Song> songs) {
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
