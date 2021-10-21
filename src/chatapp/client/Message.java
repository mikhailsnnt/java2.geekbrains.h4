package chatapp.client;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {

    private final String text;
    private final String fromUser;
    private final Date sendTime;
    public Message(String text , String fromUser, Date sendTime){
        this.text = text;
        this.fromUser = fromUser;
        this.sendTime = sendTime;
    }

    public String getFromUser() {
        return fromUser;
    }

    public String getText() {
        return text;
    }

    public Date getSendTime() {
        return sendTime;
    }
}
