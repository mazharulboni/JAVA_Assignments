package com.izanschool.datatype;

import java.util.Scanner;

public class Comment {

    private String author;
    private String content;
    private String date;

    public static void main(String[] args) {

        Scanner cm = new Scanner(System.in);

        System.out.println("Author Name: ");
        String author = cm.next();

        System.out.println("Content Information: ");
        String content = cm.next();

        System.out.println("Date: ");
        String date = cm.next();


        System.out.println("Author Name: " + author);
        System.out.println("Content Information: "+ content);
        System.out.println("Date: " + date);
    }
}
