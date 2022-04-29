package com.launcher.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import javax.mail.Message;
import javax.mail.internet.MimeBodyPart;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailMessage {
    private SimpleStringProperty subject;
    private SimpleStringProperty sender;
    private SimpleStringProperty recipient;
    private SimpleObjectProperty <SizeInteger>size;
    private SimpleObjectProperty<Date> date;
    private boolean isRead;
    private Message message;
    private List<MimeBodyPart> attachementList= new ArrayList<MimeBodyPart>();
    private boolean hasAttachements= false;

    public EmailMessage(String subject, String sender, String recipient, int size, Date date, boolean isRead, Message message) {
        this.subject =new SimpleStringProperty(subject) ;
        this.sender = new SimpleStringProperty(sender) ;
        this.recipient = new SimpleStringProperty(recipient) ;
        this.size = new SimpleObjectProperty<SizeInteger>(new SizeInteger(size));
        this.date = new SimpleObjectProperty<Date>(date);
        this.isRead = isRead;
        this.message = message;
    }

    public String getSubject() {
        return this.subject.get();
    }

    public String getSender() {
        return this.sender.get();
    }

    public List<MimeBodyPart> getAttachementList(){
        return attachementList;
    }


    public String getRecipient() {
        return this.recipient.get();
    }

    public boolean isRead() {
        return isRead;
    }

    public SizeInteger getSize() {
        return this.size.get();
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public Message getMessage() {
        return this.message;
    }

    public boolean hasAttachements() {
        return hasAttachements;
    }

    public Date getDate(){
        return this.date.get();
    }

    public void addAttachment(MimeBodyPart mbp) {
        hasAttachements=true;
        attachementList.add(mbp);

        try{
            System.out.println("Added attach: "+ mbp.getFileName());
        }catch (Exception e){
            e.printStackTrace();

        }



    }
}
