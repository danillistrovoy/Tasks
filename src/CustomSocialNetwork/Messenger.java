package CustomSocialNetwork;

import java.util.List;

public interface Messenger {
    void showDialogues(List<Dialogue> dialogues);
    void openDialogue(Dialogue dialogue);
    void sendMessage(Message message);
    void deleteMessage(Message message);
    void replyMessage(List<Message> messages, Dialogue dialogue);
    void answerMessage(Message message, Message answer);

}
