package com.izanschool.datatype;

import java.util.Scanner;

public class CustomerReview {

    private String product;
    private int rating;
    private String comments;

    public static void main(String[] args) {

        Scanner cr = new Scanner(System.in);

        System.out.println("Product: ");
        String product = cr.next();

        System.out.println("Product Rating: ");
        int rating = cr.nextInt();

        System.out.println("Comments: ");
        String comments = cr.next();

        System.out.println("Product: " + product);
        System.out.println("Product Rating: " + rating);
        System.out.println("Comments: " + comments);
    }
}
