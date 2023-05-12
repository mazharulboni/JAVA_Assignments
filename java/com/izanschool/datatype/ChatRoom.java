package com.izanschool.datatype;

import java.util.Scanner;

public class ChatRoom {

    private String name;
    private String participants;
    private String messages;

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);

        System.out.println("Chat Room Name: ");
        String name = sr.next();

        System.out.println("Participant: ");
        String participants = sr.next();

        System.out.println("Chat Message: ");
        String messages = sr.next();

        System.out.println("Chat Room Name: " + name);
        System.out.println("Participant: " + participants);
        System.out.println("Chat Message: " + messages);

    }

}
