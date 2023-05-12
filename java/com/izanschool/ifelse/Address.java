package com.izanschool.ifelse;
// Address - A class representing an address with street, city, and zip code properties. Print street, city, and zip codes.

// Declare Address Class
public class Address {

    // Declare Main Method
    public static void main(String[] args) {
        // Print Address
        System.out.println("Hello From Address Class!");

        // Declaring variables and initializing it with a value
        String city = "CA";

        // Declare if Condition: using String
        if (city == "NY") {
            // Code to execute if condition is true
            System.out.println("NY is the city Name.");
        } else if (city == "CA") {
            System.out.println("CA is the city name");
        }
//
//        // Declare if Condition: Using equals
//
//        if(city.equals(("CA"))){
//            // Code to execute if condition is true
//             System.out.println("CA is the city Name.");
//        }
        boolean hasStreetName = true;
//        // Declare if Condition: Using  Boolean
        if (hasStreetName = true) {
//            // Code to execute if condition is true
            System.out.println("The Address Has Street Name.");
       }
    System.out.println("Zip Code is 11446;");
        }
    }