package com.homework10;
import java.util.Scanner;

public class LengthString {
    static Scanner console = new Scanner(System.in);

    static void userStrings(String[] strings) {
        for (int i = 0; i < strings.length; ++i) {
            System.out.print("Enter the string: ");
            strings[i] = console.nextLine();
        }
    }

    static void findMaxAndMinElementsInString(String[] strings) {
        String largestString = strings[0];
        String smallestString = strings[0];
        for (int i = 0; i < strings.length; ++i) {
            if (strings[i].length() > largestString.length()) {
                largestString = strings[i];
            }
            if (strings[i].length() < smallestString.length()) {
                smallestString = strings[i];
            }
        }
        System.out.println("largest string: " + largestString + " has " + largestString.length() + " elements" +
                "\nsmallest string: " + smallestString + " has " + smallestString.length() + " elements");
    }

    public static void main(String[] args) {
        String[] strings = new String[3];
        userStrings(strings);
        findMaxAndMinElementsInString(strings);
    }
}
