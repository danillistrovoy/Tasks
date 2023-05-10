package CustomSocialNetwork;

import java.io.File;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;

public class Photo {
    private String location;
    private User author;
    private LocalDateTime postTime;
    private List<Comment> comments;
    private List<Like> likes;
    private URL picture;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPostTime(LocalDateTime postTime) {
        this.postTime = postTime;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public URL getPicture() {
        return picture;
    }

    public void setPicture(URL picture) {
        this.picture = picture;
    }

    public Photo(User author, URL picture) {
        this.author = author;
        this.picture = picture;
    }
    public void addLike(Like like){

    }
    public void deleteComment (Comment comment){

    }
    public void addComment (Comment comment){

    }
    private File getPicture(URL pictureFile){
        return null;
    }
}
