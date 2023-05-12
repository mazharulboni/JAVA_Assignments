package com.izanschool.ifelse;

public class Charity {

    public static void main(String[] args) {

        String name = "John Doe";
        String mission = "Fight against hunger";
        int donations = 1000;

        if (name == "John Doe"){
            System.out.println("Lets help others" + "\n Mission: " + mission + "\n Donation Amount: $" + donations);
        } else if (name == "John") {
            System.out.println("Do nothing");
        }

    }
}
