package CustomSocialNetwork;

import java.util.List;

public class Dialogue {
    private List<Message> messages;
    private List<User> members;
    private List<Photo> photos;
    private List<Song> songs;
    private List<Message> chosenMessages;

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Dialogue(List<Message> messages, List<User> members) {
        this.messages = messages;
        this.members = members;
    }
    public void deleteMessage(Message message){

    }
    public void chooseMessage(Message chosenMessage){

    }
    private List<Message> getChosenMessages (List<Message> chosenMessages){
        return null;
    }
}
