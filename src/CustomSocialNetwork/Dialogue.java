package CustomSocialNetwork;

import java.util.List;

public class Dialogue {
    private List<Message> messages;
    private List<User> members;
    private List<Photo> photos;
    private List<Song> songs;
    private List<Message> chosenMessages;

    public Dialogue(List<Message> messages, List<User> members) {
        this.messages = messages;
        this.members = members;
    }
    public void deleteMessage(Message message){

    }
    public void chooseMessage(Message chosenMessage){

    }
}
