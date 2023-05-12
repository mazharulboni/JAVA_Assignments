package com.izanschool.ifelse;

public class Advertisement {

    public static void main(String[] args) {

        String title = "Student";
        String description = "Micro Economics";
        String targetAudience = "Anything else";

        if (targetAudience == "Students") {
            System.out.println("Students are the  targeted audience for this Advertisement.");
        }
        else if (targetAudience == "Anything else") {
            System.out.println("Do nothing");
        }
    }
}