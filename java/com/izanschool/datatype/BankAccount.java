package com.izanschool.datatype;

// BankAccount - A class representing a bank account with properties like account number, balance, and owner.
// Declare the Class Name: BankAccount
    public class BankAccount {

        private static int accountNumber = 458785698;
        private static int balance = 856987456;
        private static String owner = ("Me");

    // Declare Main Method
    public static void main(String[] args) {
    // Declare variables with appropriate data type for each property mentioned above and also initilize them
    // Print all variables declared above
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
        System.out.println("Account Owner: " + owner);

    // Declare  boolean variables isActive, isClosed and initializing it with a value
        boolean isActive = true;
        boolean isClosed = false;

    // print the boolean variable
        // Using a String concatenation to print the boolean variable
        System.out.println("Is your Bank Account Active: " + isActive);
        System.out.println("Is your Bank Account Closed: " + isClosed);

    }






    // Using a String concatenation to print the boolean variable
}
