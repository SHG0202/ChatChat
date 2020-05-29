package com.shg.chatchat.Model;

public class Chat {
    private String sender;
    private String reciever;
    private String message;
    private boolean is_seen;

    public Chat(String sender, String reciever, String message, boolean is_seen) {
        this.sender = sender;
        this.reciever = reciever;
        this.message = message;
        this.is_seen = is_seen;
    }

    Chat(){}

    public String getSender() { return sender; }

    public void setSender(String sender) { this.sender = sender; }

    public String getReciever() { return reciever; }

    public void setReciever(String reciever) { this.reciever = reciever; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public boolean isIs_seen() { return is_seen; }

    public void setIs_seen(boolean is_seen) { this.is_seen = is_seen; }
}
