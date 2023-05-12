package com.izanschool.ifelse;

public class ChatRoom {
    public static void main(String[] args) {

        String name = "Jack";
        int participants = 10;
        String messages = "Hi, I am Jack";

        if (name == "Jack"){
            System.out.println(messages);
        } else if (name == "Anything Else") {
            System.out.println("Do nothing");

        }
    }
}
