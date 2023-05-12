package com.izanschool.helloworld;

public class Email {
    public static void main(String[] args) {

        System.out.println("Sender: " + "John Doe");
        System.out.println("Receiver: " + "Richard Levi");
        Subject();
        Body( );
    }

    public static void Body() {
        System.out.println("Body: " + "Requesting an update on credit card application");
    }
    public static void Subject() {
        System.out.println("Subject: " + "Requesting an update");
    }
}
