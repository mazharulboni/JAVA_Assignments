package com.izanschool.datatype;

import java.util.Scanner;

public class Email {
    private String sender;
    private String recipient;
    private String subject;
    private String body;

    public static void main(String[] args) {

        Scanner em = new Scanner(System.in);

        System.out.println("Sender: ");
        String sender = em.next();

        System.out.println("Recipient: ");
        String recipient = em.next();

        System.out.println("Subject: ");
        String subject = em.next();

        System.out.println("Body: ");
        String body = em.next();

        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

}
