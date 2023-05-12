package com.izanschool.ifelse;

public class Contact {

    public static void main(String[] args) {

        String name = "Jack";
        String email = "jack@email.com";
        int phoneNumber = 23456;

        if (phoneNumber == 23456){
            System.out.println("This is the correct number");
        } else if (phoneNumber == 2345678) {
            System.out.println("This is the incorrect number");
        }
    }
}
