package com.tiy;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body,String recipient, String smsProvider, String status) {
        super(subject, body, status);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printInfo2();
    }

    @Override
    public void transport() {
        super.transport();
    }
}
