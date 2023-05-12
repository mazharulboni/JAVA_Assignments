package com.izanschool.ifelse;

public class Auction {

    public static void main(String[] args) {

        System.out.println("Hello From Auction Class!");

        String item = "Electronics";
        String startTime = "1000 EST";
        String endTime = "1700 EST";

        if (item == "Electronics"){
            System.out.println("Yes, this is laptop");
            System.out.println("Auction Start Time: " + startTime);
            System.out.println("Auction End Time: " + endTime);

        } else if (item == "Anything Else") {
            System.out.println("Do nothing");

        }

    }
}
