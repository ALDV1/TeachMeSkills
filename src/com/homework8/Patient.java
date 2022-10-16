package com.homework8;

import java.util.Scanner;

public class Patient {
    Scanner console = new Scanner(System.in);
    protected int treatPlan;

    public int setAndGetTreatPlan() {
        System.out.println("Enter the doctor which you need:\n1.surgeon\n2.dentist\n3.therapist");
        if (console.hasNextInt()) {
            treatPlan = console.nextInt();
        } else {
            System.out.println("Try again:");
            console.next();
            treatPlan = setAndGetTreatPlan();
        }
        return this.treatPlan;
    }
}
