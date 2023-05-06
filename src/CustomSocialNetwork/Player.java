package CustomSocialNetwork;

import java.net.URL;

public class Player {
    private Song chosenSong;
    private Playlist chosenPlaylist;

    public void showText(){

    }
    public void changeSpeed(){

    }
    public void playSong(Song song){

    }
    public void pauseSong(){

    }
    public void choosePlaylist(Playlist playlist){

    }
    public void playNextSong(Song song){

    }
    public void playPreviousSong(Song song){

    }

    public Player(Playlist chosenPlaylist) {
        this.chosenPlaylist = chosenPlaylist;
    }

    public Player(Song chosenSong, Playlist chosenPlaylist) {
        this.chosenSong = chosenSong;
        this.chosenPlaylist = chosenPlaylist;
    }
    private URL downloadTrackFile (URL trackUrlFile){
        return trackUrlFile;
    }
}
