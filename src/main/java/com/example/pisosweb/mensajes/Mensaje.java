package com.example.pisosweb.mensajes;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Mensaje {
    @Id
    private String id;
    private String sender;
    private String receiver;
    private String content;
    private Date date;
    
    public Mensaje() {}

    public Mensaje(String sender, String receiver, String content, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.date = date;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", remitente='" + getSender() + "'" +
            ", destinatario='" + getReceiver() + "'" +
            ", contenido='" + getContent() + "'" +
            "}";
    }
    
}