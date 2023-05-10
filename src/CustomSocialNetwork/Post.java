package CustomSocialNetwork;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private String location;
    private User author;
    private LocalDateTime postTime;
    private List<Comment> comments;
    private List<Like> likes;
    private String text;
    private List<Song> songs;
    private List<Photo> photos;

    public void setLocation(String location) {
        this.location = location;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Post(User author, String text, List<Song> songs, List<Photo> photos) {
        this.author = author;
        this.text = text;
        this.songs = songs;
        this.photos = photos;
    }

    public Post(User author, List<Song> songs, List<Photo> photos) {
        this.author = author;
        this.songs = songs;
        this.photos = photos;
    }

    public Post(User author,List<Photo> photos, String text) {
        this.author = author;
        this.text = text;
        this.photos = photos;
    }

    public Post(User author, String text, List<Song> songs) {
        this.author = author;
        this.text = text;
        this.songs = songs;
    }

    public Post(List<Photo> photos, User author) {
        this.author = author;
        this.photos = photos;
    }

    public Post(User author, List<Song> songs) {
        this.author = author;
        this.songs = songs;
    }

    public Post(User author, String text) {
        this.author = author;
        this.text = text;
    }

    public void addLike(Like like) {

    }

    public void addComment(Comment comment) {

    }

    public void deleteComment(Comment comment) {

    }
}
