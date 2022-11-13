package com.homework14;

public class RandomNumber {
    public static void main(String[] args) {
        Number num = () -> (int) (Math.random() * 10);
        System.out.println(num.random());
        System.out.println(num.random());
        System.out.println(num.random());
    }

    public interface Number {
        int random();
    }
}
