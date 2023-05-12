package com.izanschool.datatype;

import java.util.Scanner;

public class Contact {

    private String name;
    private String email;
    private int phoneNumber;

    public static void main(String[] args) {

        Scanner co = new Scanner(System.in);

        System.out.println("Contact Name: ");
        String name = co.next();

        System.out.println("Email Address: ");
        String email = co.next();

        System.out.println("Phone Number");
        int phoneNumber = co.nextInt();

        System.out.println("Contact Name: " + name);
        System.out.println("Email Address: " + email);
        System.out.println("Phone Number" + phoneNumber);
    }
}
