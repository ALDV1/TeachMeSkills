package com.homework8;

public class Therapist extends Doctor {
    protected Doctor doctor;

    @Override
    public void treat() {
        System.out.println("therapist treat");
    }

    public void setAndGetDoctor(int needDoctor) {
        if (needDoctor == 1) {
            doctor = new Surgeon();
            doctor.treat();
        } else if (needDoctor == 2) {
            doctor = new Dentist();
            doctor.treat();
        } else if (needDoctor == 3) {
            doctor = new Therapist();
            doctor.treat();
        }
    }
}
