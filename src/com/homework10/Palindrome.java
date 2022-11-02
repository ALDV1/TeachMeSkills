package com.homework10;
import java.util.Scanner;

public class Palindrome {
    static Scanner console = new Scanner(System.in);

    static void userStrings(String[] strings) {
        for (int i = 0; i < strings.length; ++i) {
            System.out.print("Enter the string: ");
            strings[i] = console.nextLine();
        }
    }

    static void findPalindromeAndPrint(String[] str) {
        boolean palindromeIsHere = false;
        for (int i = 0; i < str.length; ++i) {
            StringBuilder builder = new StringBuilder(str[i]);
            if (str[i].equals(builder.reverse().toString())) {
                System.out.println("palindrome is " + str[i]);
                palindromeIsHere = true;
            }
        }
        if (!palindromeIsHere)
            System.out.println("I don't find palindrome:(");
    }

    public static void main(String[] args) {
        String[] str = new String[3];
        userStrings(str);
        findPalindromeAndPrint(str);
    }
}
