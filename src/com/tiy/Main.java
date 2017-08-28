package com.tiy;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmailNotification emailNotification = new EmailNotification("test","what is the capital of Texas?", "john jones", "smtp.gmail.com.","");
        TextNotification textNotification = new TextNotification("Meeting","what time can you meet?","jenny jones", "number@messaging.sprintpcs.com","");
        emailNotification.transport();
        textNotification.transport();
        Object emailNotificationClone = emailNotification.clone();
        (emailNotification).equals(emailNotificationClone);



    }
    public String emailNotification(){
        System.out.println(emailNotification());
        return emailNotification();
    }
    public String textNotification(){
        System.out.println(textNotification());
        return textNotification();
    }



}
