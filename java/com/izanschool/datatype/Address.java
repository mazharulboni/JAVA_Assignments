package com.izanschool.datatype;
// Address - A class representing an address with street, city, and zip code properties. Print street, city, and zip codes.

// Declare Address Class
public class Address {
    // Declare Main Method
    public static void main(String[] args) {
        String street = "5 Abbey";
        String City = "New York";
        int ZipCode = 11577;

        // Print Address

        System.out.println("Street: " + street);
        System.out.println("City: " + City);
        System.out.println("Street: " + ZipCode);

        // Declaring  boolean variables hasStreetName, hasApartment and initializing it with a value
        boolean hasStreetName = true;
        boolean hasApartment = false;
        // print the boolean variable
        System.out.println("Has Street Name: " + hasStreetName);
        System.out.println("Has Apartment: " + hasApartment);
    }
    // Using a String concatenation to print the boolean variable
    // System.out.println("Has Apartment:  " + hasApartment);



}


