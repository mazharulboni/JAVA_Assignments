package com.izanschool.datatype;

import java.util.Scanner;

public class JAVAQuiz {

    // Properties of Book class
    private String studentName;
    private String studentEmail;
    private int quizNumber;

    public static void main(String[] args) {

        // Declare variables and take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Name: ");
        String studentName = sc.nextLine();

        System.out.println("Student Email: ");
        String studentEmail = sc.nextLine();

        System.out.println("Quiz Number: ");
        int quizNumber = sc.nextInt();

        // Print the properties of the Book object
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Email: " + studentEmail);
        System.out.println("Quiz Number: " + quizNumber);
    }
}
