package com.izanschool.helloworld;

public class Transaction {
    public static void main(String[] args) {

        System.out.println("Date: " + "05/04/2023");
        amount();
        description();
    }

    public static void amount() {System.out.println("Amount: " + "$ 499.99");}
    public static void description() {System.out.println("Description: " + "Credit card transaction");}
}
