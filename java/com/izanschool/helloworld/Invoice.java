package com.izanschool.helloworld;

public class Invoice {
    public static void main(String[] args) {

        System.out.println("Invoice Number: " + "587-856");
        customer();
        items();
    }
    public static void customer() {
        System.out.println("Customer: " + "John Doe");
    }
    public static void items() {
        System.out.println("Items : " + "Electronics");
    }
}
