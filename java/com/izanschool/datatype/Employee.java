package com.izanschool.datatype;

import java.util.Scanner;

public class Employee {
    private String name;
    private String designation;
    private int salary;

    public static void main(String[] args) {

        Scanner em = new Scanner(System.in);

        System.out.println("Name: ");
        String name = em.next();

        System.out.println("Designation: ");
        String designation = em.next();

        System.out.println("Salary: ");
        int salary = em.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: "  + salary);
    }
}