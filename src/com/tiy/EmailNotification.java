package com.tiy;

public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider, String status) {
        super(subject,  body, status);
        printInfo2();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        super.transport();
    }

    @Override
    public void printInfo2() {
        super.printInfo2();
        System.out.println("else else else else");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (!getRecipient().equals(that.getRecipient())) return false;
        return getSmtpProvider().equals(that.getSmtpProvider());
    }

    @Override
    public int hashCode() {
        int result = getRecipient().hashCode();
        result = 31 * result + getSmtpProvider().hashCode();
        return result;
    }

    @Override
    protected Object clone()  {
        return recipient;

    }
}
