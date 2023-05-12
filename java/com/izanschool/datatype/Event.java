package com.izanschool.datatype;

import java.util.Scanner;

public class Event {

    private String name;
    private String date;
    private String location;

    public static void main(String[] args) {

        Scanner ev = new Scanner(System.in);

        System.out.println("Name: ");
        String name = ev.next();

        System.out.println("Date: ");
        String date = ev.next();

        System.out.println("Location: ");
        String location = ev.next();

        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }
}
