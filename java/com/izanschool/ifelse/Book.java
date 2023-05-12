package com.izanschool.ifelse;

public class Book {
    public static void main(String[] args) {

        String title = "Kuhok";
        String author = "Humayun Ahmed";
        int ISBN = 45698756;

        if (title == "Kuhok"){
            System.out.println("Author is Humayun Ahmed" + "\n Title: " + title + "\n ISBN: " + ISBN);
        } else if (title == "KK") {
            System.out.println("Do nothing");
        }

    }
}
