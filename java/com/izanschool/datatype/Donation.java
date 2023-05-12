package com.izanschool.datatype;

import java.util.Scanner;

public class Donation {

    private String donor;
    private int amount;
    private String donationDate;

    public static void main(String[] args) {

        Scanner dn = new Scanner(System.in);

        System.out.println("Donor Name: ");
        String donor = dn.next();

        System.out.println("Donation Amount: ");
        int amount = dn.nextInt();

        System.out.println("Donation Date: ");
        String donationDate = dn.next();

        System.out.println("Donor Name: " + donor);
        System.out.println("Donation Amount: " + amount);
        System.out.println("Donation Date: " + donationDate);

    }
}
