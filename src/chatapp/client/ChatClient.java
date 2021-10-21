package chatapp.client;

import java.util.Date;

public class ChatClient {
    private final ChatFrame chatFrame;
    public static void main(String[] args) {
          new ChatClient();
    }
    ChatClient(){
        chatFrame = new ChatFrame(this);
    }

    public void sendMessage(String text) {
        // Sending message asd
        Message message = new Message(text,"My ip", new Date());
        chatFrame.addOutComingMessage(message);
    }
}
