package CustomSocialNetwork;

import java.time.LocalDateTime;
import java.util.List;

public class Comment {
    private String text;
    private List<Song> songs;
    private List<Photo> photos;
    private User author;
    private LocalDateTime time;
    private List<Like> likes;

    public String getText() {
        return text;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public Comment(String text, User author) {
        this.text = text;
        this.author = author;
    }

    public Comment(User author, List<Song> songs) {
        this.songs = songs;
        this.author = author;
    }

    public Comment(List<Photo> photos, User author) {
        this.photos = photos;
        this.author = author;
    }

    public Comment(List<Song> songs, String text, User author) {
        this.text = text;
        this.songs = songs;
        this.author = author;
    }

    public Comment(String text, List<Photo> photos, User author) {
        this.text = text;
        this.photos = photos;
        this.author = author;
    }

    public Comment(List<Song> songs, List<Photo> photos, User author) {
        this.songs = songs;
        this.photos = photos;
        this.author = author;
    }

    public Comment(String text, List<Song> songs, List<Photo> photos, User author) {
        this.text = text;
        this.songs = songs;
        this.photos = photos;
        this.author = author;
    }

    public void addLike(Like like) {

    }
}
