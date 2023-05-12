package com.izanschool.ifelse;
import java.util.Timer;
import java.util.Date;
public class Appointment {

    public static void main(String[] args) {

        String doctorName = "John";
        Date currentDate = new Date();
        String time = "02.00 PM EST";
        String location = "NY";

        if (doctorName == "John")
        {
            System.out.println("My doctor's name is John\n" + "Doctor Appointment\n" + currentDate + time + "\n Location: " + location);
        }
        else if (doctorName == "Anything else") {
            System.out.println("Do nothing");
        }
    }
}