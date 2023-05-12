package com.izanschool.helloworld;

public class Employee {
    public static void main(String[] args) {

        System.out.println("Name: " + "John Doe");
        Designation();
        Salary();
    }

    public static void Designation() {
        System.out.println("Designation: " + "QA Analyst");
    }
    public static void Salary() {
        System.out.println("Salary: " + "$100,000.00");
    }
}
