package com.homework10;
import java.util.Scanner;

public class Average {
    static Scanner console = new Scanner(System.in);

    static void userStrings(String[] str) {
        for (int i = 0; i < str.length; ++i) {
            System.out.print("Enter the string: ");
            str[i] = console.nextLine();
        }
    }

    static void findAndPrintLessThanAverage(String[] str) {
        int sumOfAllElements = 0;
        for (int i = 0; i < str.length; ++i) {
            sumOfAllElements += str[i].length();
        }
        int average = sumOfAllElements / str.length;
        for (int i = 0; i < str.length; ++i) {
            if (str[i].length() < average) {
                System.out.println(str[i] + "\n" + "length is: " + str[i].length());
            }
        }
    }

    public static void main(String[] args) {
        String[] str = new String[3];
        userStrings(str);
        findAndPrintLessThanAverage(str);
    }
}
