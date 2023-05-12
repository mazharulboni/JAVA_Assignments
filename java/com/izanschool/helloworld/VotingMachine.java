package com.izanschool.helloworld;

public class VotingMachine {
    public static void main(String[] args) {

        System.out.println("Candidates: " + "John Doe, Richard Levi");
        voters();
        results();
    }

    public static void voters() {System.out.println("Voters: " + "5236");}
    public static void results() {System.out.println("Results: " + "John Doe Won");}
}
