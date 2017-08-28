package com.tiy;

import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected  String status;

    public Notification(String subject, String body, String status) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
        status = "normal";
    }

    public void transport(){
         try {
            throw new NoTransportException();
        } catch (NoTransportException e) {
            e.printStackTrace();
        }
    }
    public void printInfo(){
        System.out.println("status: "+ status);
    }
    protected void printInfo2(){
        System.out.println("something something something");
    }
}
