package com.izanschool.datatype;

// BlogAuthor - A class representing a blog author with properties like name, bio, and articles.
// Declare the Class Name: BlogAuthor
public class BlogAuthor {

    private static String name = "Shomoresh Mojumder";
    private static String bio = "Legend Author";
    private static String articles = "Shat Kahon";
    // Declare Main Method
public static void main(String[] args) {
    // Declare variables with appropriate data type for each property mentioned above and also initilize them
    // Print all variables declared above
    System.out.println("Name: " + name);
    System.out.println("Bio: " + bio);
    System.out.println("Articles: " + articles);

    // Declare  boolean variables hasPublished, isCoAuthor and initializing it with a value
    boolean hasPublished = true;
    boolean isCoAuthor = false;

    // print the boolean variable
    // Using a String concatenation to print the boolean variable
    System.out.println("Has the Book Published: " + hasPublished);
    System.out.println("Is he the Co Author: " + isCoAuthor);

}
}
