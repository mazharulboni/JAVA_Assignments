package com.izanschool.datatype;

import java.util.Scanner;

public class Coupon {

    private int code;
    private int discountAmount;
    private String expirationDate;

    public static void main(String[] args) {

        Scanner co = new Scanner(System.in);

        System.out.println("Code:");
        int code = co.nextInt();

        System.out.println("Discount Amount: ");
        int discountAmount = co.nextInt();

        System.out.println("Expiration Date: ");
        String expirationDate = co.next();

        System.out.println("Code:" + code);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Expiration Date: " + expirationDate);
    }

}
