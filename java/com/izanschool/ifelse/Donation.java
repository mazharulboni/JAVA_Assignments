package com.izanschool.ifelse;
public class Donation {
    public static void main(String[] args) {

        String donor = "Matt";
        int amount = 5500;
        String donationDate = "05/15/2023";

        if (donor == "Matt")
        {
            System.out.println("Matt is a regular donor");
        } else if (donor == "Matthew")
        {
            System.out.println("Matthew is donating for the first time");

        }
        boolean hasDonationAmount = true;
        boolean hasDonationDate = true;

        if (hasDonationAmount = true){
            System.out.println(donor + "Donated a generous Amount");
            System.out.println("Donation Amount: " + amount + " \n Donation Date: " + donationDate);
        }

    }
}
