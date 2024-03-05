package com.alilopez.com.models;

public class Message {
    private String text;
    private IComunication conn;

    public void setText(String text) {
        this.text = text;
    }

    public void setConn(IComunication conn) {
        this.conn = conn;
    }

    public boolean sendMessage() {
        return conn.send(text);
    }
}
