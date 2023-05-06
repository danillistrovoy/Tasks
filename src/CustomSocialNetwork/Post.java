package CustomSocialNetwork;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Post {
    private String location;
    private User author;
    private LocalDateTime postTime;
    private List<Comment> comments;
    private List<Like> likes;
    private String text;
    private LinkedList<Song> songs;
    private List<Photo> photos;

    public Post(User author, String text, LinkedList<Song> songs, List<Photo> photos) {
        this.author = author;
        this.text = text;
        this.songs = songs;
        this.photos = photos;
    }

    public Post(User author, LinkedList<Song> songs, List<Photo> photos) {
        this.author = author;
        this.songs = songs;
        this.photos = photos;
    }

    public Post(User author, String text, List<Photo> photos) {
        this.author = author;
        this.text = text;
        this.photos = photos;
    }

    public Post(User author, String text, LinkedList<Song> songs) {
        this.author = author;
        this.text = text;
        this.songs = songs;
    }

    public Post(User author, List<Photo> photos) {
        this.author = author;
        this.photos = photos;
    }

    public Post(User author, LinkedList<Song> songs) {
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
