package com.izanschool.helloworld;

public class Survey {
    public static void main(String[] args) {

        System.out.println("Questions: " + "How would you rate your overall experience with our customer service?");
        Responses();
        results();
    }

    public static void Responses() {System.out.println("Responses: \n" +
            "1: Very satisfied\n" +
            "2: Satisfied\n" +
            "3: Neutral\n" +
            "4: Dissatisfied\n" +
            "5: Very dissatisfied\n");}
    public static void results() {System.out.println("Results: \n" +
            "1: Very satisfied: 45%\n" +
            "2: Satisfied: 35%\n" +
            "3: Neutral: 10%\n" +
            "4: Dissatisfied: 8%\n" +
            "5: Very dissatisfied: 2%");}
}