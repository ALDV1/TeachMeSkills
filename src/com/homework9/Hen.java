package com.homework9;

public abstract class Hen {
    public static int eggsOfAll;

    public Hen() {
        eggsOfAll += getCountOfEggsPerMonth();
    }

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "I am chicken";
    }
}
