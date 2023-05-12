package com.izanschool.datatype;

import java.util.Scanner;

public class Doctor {

    private String name;
    private String specialization;
    private int contactInformation;

    public static void main(String[] args) {

        Scanner nm = new Scanner(System.in);

        System.out.println("Name: ");
        String name = nm.next();

        System.out.println("Specialization: ");
        String specialization = nm.next();

        System.out.println("Contact Information: ");
        int contactInformation = nm.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact Information: " + contactInformation);

    }

}
