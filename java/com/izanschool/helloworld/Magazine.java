package com.izanschool.helloworld;

public class Magazine {
    public static void main(String[] args) {

        System.out.println("Title: " + "New York Times");
        editor();
        articles();
    }
    public static void editor() {
        System.out.println("Editor: " + "John Doe");
    }
    public static void articles() {
        System.out.println("Articles : " + "Enrique Tarrio, the former leader of the group, was one of the four members convicted of seditious conspiracy for plotting to keep Donald Trump in power.");
    }
}
