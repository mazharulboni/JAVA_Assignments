package com.izanschool.datatype;

import java.util.Scanner;

public class CreditCard {

    private int number;
    private String expirationDate;
    private String cardholderName;

    public static void main(String[] args) {

        Scanner cc = new Scanner(System.in);

        System.out.println("Credit Card Number");
        int number = cc.nextInt();

        System.out.println("Expiration Date: ");
        String expirationDate = cc.next();

        System.out.println("Cardholder Name: ");
        String cardholderName = cc.next();

        System.out.println("Credit Card Number" + number);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Cardholder Name: " + cardholderName);
    }
}
