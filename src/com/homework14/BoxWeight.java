package com.homework14;

public class BoxWeight {

    public static void main(String[] args) {
        Printable printer = box -> System.out.println("Loaded a box with a weight: " + box.weight);

        printer.print(new Box(20.5));
    }

    static public class Box {
        private final double weight;

        public Box(double weight) {
            this.weight = weight;
        }
    }

    public interface Printable {
        void print(Box box);
    }
}
