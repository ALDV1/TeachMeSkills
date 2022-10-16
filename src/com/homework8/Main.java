package com.homework8;

public class Main {
    public static void main(String[] args) {
        Therapist doctor = new Therapist();
        Patient patient = new Patient();
        doctor.setAndGetDoctor(patient.setAndGetTreatPlan());
    }
}
