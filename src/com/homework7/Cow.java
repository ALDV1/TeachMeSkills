package com.homework7;

public class Cow extends Animal implements Eat{
    @Override
    public void eat() {
        System.out.println("cow is eating");
    }
}
