package CustomSocialNetwork;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private Avatar avatar;
    private String gender;
    private LocalDateTime birthDate;
    private String name;
    private String surname;
    private List<User> friendlist;
    private Playlist userPlaylist;
    private List<Photo> gallery;
    private List<Post> wall;
    private List<User> blacklist;
    private List<Dialogue> dialogues;
    private List<Public> publics;
    private List<Group> groups;

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public User(Avatar avatar, String gender, LocalDateTime birthDate, String name, String surname) {
        this.avatar = avatar;
        this.gender = gender;
        this.birthDate = birthDate;
        this.name = name;
        this.surname = surname;
    }

    public void deletePlaylist(Playlist playlist) {

    }

    public void sharePlaylist(Playlist playlist, Dialogue dialogue) {

    }

    public void addFriend(User friend) {

    }

    public void deleteFriend(User friend) {

    }

    public void blockUser(User user) {

    }

    public void addPhotoToGallery(Photo photo) {

    }

    public void repostPhoto(Photo photo) {

    }

    public void openMessenger(Messenger messenger) {

    }

    public void usePlayer(Player player) {

    }

    public void subscribe(User user, Public pub) {

    }

    public void join(User user, Group group) {

    }

    public void showUserInfo() {

    }
}

