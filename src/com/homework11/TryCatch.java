package com.homework11;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 1;
            int res = x / y;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("you broke the program");
        }
    }
}
