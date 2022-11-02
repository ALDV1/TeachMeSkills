package com.homework11;

public class Finally {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int res = x / y;
            System.out.println(res);
            System.exit(0);
        } catch (ArithmeticException e) {
            System.out.println("you broke the program");
            System.exit(1);
        } finally {
            System.out.println("I am here!");
        }
    }
}
