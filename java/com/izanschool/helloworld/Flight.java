package com.izanschool.helloworld;

public class Flight {
    public static void main(String[] args) {

        System.out.println("Flight Number: " + "Delta DA521");
        Departure();
        Arrival();
    }

    public static void Departure() {
        System.out.println("Departure Time: " + "12.05 AM EST");
    }
    public static void Arrival() {
        System.out.println("Arrival Time: " + "05.30 PM EST");
    }
}
