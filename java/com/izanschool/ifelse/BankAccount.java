package com.izanschool.ifelse;

public class BankAccount {

    public static void main(String[] args) {

        int accountNumber = 154879852;
        String accountBalance = "$499.00";
        String owner = "John Doe";

        if (accountNumber == 154879852) {
            System.out.println("Account is active" + "\n Account Balance: " + accountBalance + "\n Account Owner: " + owner);
        } else if (accountNumber == 154879851) {
            System.out.println("Do nothing");
        }

        }
    }

