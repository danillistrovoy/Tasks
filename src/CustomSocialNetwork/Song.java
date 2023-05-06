package CustomSocialNetwork;

import java.net.URL;

public class Song {
    private String author;
    private String name;
    private URL urlTrackFile;
    private String text;

    public Song(String author, String name, URL urlTrackFile, String text) {
        this.author = author;
        this.name = name;
        this.urlTrackFile = urlTrackFile;
        this.text = text;
    }
}
