package com.izanschool.datatype;

import java.util.Scanner;

public class Book {

    // Properties of Book class
    private String title;
    private String author;
    private int ISBN;

    public static void main(String[] args) {

    // Declare variables and take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Title: ");
        String title = sc.nextLine();

        System.out.println("Author: ");
        String author = sc.nextLine();

        System.out.println("ISBN: ");
        int ISBN = sc.nextInt();

        // Create a new Book object with the user's input values
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.ISBN = ISBN;

        // Print the properties of the Book object
        System.out.println("Book Title: " + book.title);
        System.out.println("Book Author: " + book.author);
        System.out.println("Book ISBN: " + book.ISBN);
    }
}