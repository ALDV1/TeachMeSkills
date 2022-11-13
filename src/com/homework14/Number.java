package com.homework14;

public class Number {
    public static void main(String[] args) {
        WhatTheNumber x = (value) -> {
            return (value > 0) ? value + " is a positive number" : (value == 0) ? value + " is a zero" :
                    value + " is a negative number";
        };
        System.out.println(x.getNumber(0));
        System.out.println(x.getNumber(10));
        System.out.println(x.getNumber(-1));
    }

    public interface WhatTheNumber {
        String getNumber(int value);
    }
}
