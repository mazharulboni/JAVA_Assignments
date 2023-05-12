package com.izanschool.ifelse;

public class BlogAuthor {

    public static void main(String[] args) {

        String name = "John Doe";
        String bio = "Nothing";
        String articles = "Micro Economics";

        if (name == "John Doe"){
            System.out.println("John Doe is the author" + "\n Bio: " + bio + "\n Articles: " + articles);
        } else if (name == "John"){
            System.out.println("Do nothing");

        }
    }
}
