package com.example.toshiba.friendlychat;

public class FriendlyMessage {
    private String text;
    private String name;
    private String photoUrl;
    private  long message_time;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String text, String name, String photoUrl,long message_time) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        this.message_time= message_time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public long getMessage_time() {
        return message_time;
    }

    public void setMessage_time(long message_time) {
        this.message_time = message_time;
    }
}
