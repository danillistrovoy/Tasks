package CustomSocialNetwork;

import java.net.URL;

public class Song {
    private String author;
    private String name;
    private URL urlTrackFile;
    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrlTrackFile() {
        return urlTrackFile;
    }

    public void setUrlTrackFile(URL urlTrackFile) {
        this.urlTrackFile = urlTrackFile;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Song(String author, String name, URL urlTrackFile, String text) {
        this.author = author;
        this.name = name;
        this.urlTrackFile = urlTrackFile;
        this.text = text;
    }
}
