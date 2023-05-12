package com.izanschool.ifelse;

public class Coupon {
    public static void main(String[] args) {

        int code = 999;
        int discountAmount = 50;
        String expirationDate = "05/20/2025";

        if (code == 899){
            System.out.println("This code is working");
        } else if (code == 999) {
            System.out.println("This is an invalid code");
        }
    }
}
