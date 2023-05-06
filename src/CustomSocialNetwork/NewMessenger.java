package CustomSocialNetwork;

import java.util.List;

public class NewMessenger implements Messenger {
    private Dialogue openedDialogue;
    private List<Dialogue> dialogues;

    @Override
    public void showDialogues(List<Dialogue> dialogues) {

    }

    @Override
    public void openDialogue(Dialogue dialogue) {

    }

    @Override
    public void sendMessage(Message message) {

    }

    @Override
    public void deleteMessage(Message message) {

    }

    @Override
    public void replyMessage(List<Message> messages, Dialogue dialogue) {

    }

    @Override
    public void answerMessage(Message message, Message answer) {

    }

    public NewMessenger(List<Dialogue> dialogues) {
        this.dialogues = dialogues;
    }
    private Dialogue getChosenDialogueData (Dialogue openedDialogue){
        return openedDialogue;
    }

}
