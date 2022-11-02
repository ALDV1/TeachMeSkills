package com.homework10;
import java.util.Scanner;

public class Ascending {
    static Scanner console = new Scanner(System.in);

    static void userStrings(String[] strings) {
        for (int i = 0; i < strings.length; ++i) {
            System.out.print("Enter the string: ");
            strings[i] = console.nextLine();
        }
    }

    static void bubbleSort(String[] strings) {
        for (int i = 0; i < strings.length; ++i) {
            for (int j = 0; j < strings.length - i - 1; ++j) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String tmp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = tmp;
                }
            }
        }
    }

    static void print(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        String[] strings = new String[3];
        userStrings(strings);
        bubbleSort(strings);
        print(strings);
    }
}
