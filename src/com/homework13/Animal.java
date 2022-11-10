package com.homework13;

import java.util.LinkedList;

public class Animal {
    LinkedList<String> animalName = new LinkedList<>();

    public void add(String animal) {
        this.animalName.addLast(animal);
    }

    public void delete() {
        animalName.removeFirst();
    }

    public void print() {
        for (int i = 0; i < animalName.size(); ++i) {
            System.out.println(animalName.get(i));
        }
        System.out.println();
    }
}
