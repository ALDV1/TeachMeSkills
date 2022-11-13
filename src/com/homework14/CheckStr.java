package com.homework14;

public class CheckStr {
    public static void main(String[] args) {

        Examination checkStr = str -> ((str.charAt(0) == 'J' || str.charAt(0) == 'N'))
                && str.charAt(str.length() - 1) == 'A';

        System.out.println(checkStr.check("Hello java")); // false
        System.out.println(checkStr.check("Java A")); // true
    }

    public interface Examination {
        boolean check(String str);
    }
}
