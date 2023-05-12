package com.izanschool.datatype;// Charity - A class representing a charity with properties like name, mission, and donations.
// Declare the Class Name: Charity
import java.util.Scanner;
    public class Charity {

    private String name;
    private String mission;
    private String donation;

    // Declare Main Method
    public static void main(String[] args) {
        // Declare variables with appropriate data type for each property mentioned above
        // take input from user for value of each variable
        Scanner ch = new Scanner(System.in);

        System.out.println("Donor Name: ");
        String name = ch.next();

        System.out.println("Charity Mission: ");
        String mission = ch.next();

        System.out.println("Donation Amount: ");
        String donation = ch.next();
    }
   // Print all variables declared above
}
