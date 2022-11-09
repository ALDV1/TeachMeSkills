package com.homework13;

public class Main {
    public static void main(String[] args) {
        Animal animals = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("elephant");
        animals.add("horse");
        animals.print();
        animals.delete();
        animals.print();
    }
}
