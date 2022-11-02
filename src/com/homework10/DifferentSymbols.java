package com.homework10;

import java.util.Scanner;

public class DifferentSymbols {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arrWords = new String[3];
        for (int i = 0; i < arrWords.length; ++i) {
            System.out.print("Enter the string: ");
            arrWords[i] = console.nextLine();
        }
        for (String e : arrWords) {
            boolean flag = false;
            for (int i = 0; i < e.length() - 1; ++i) {
                for (int j = i + 1; j < e.length() - 1; ++j) {
                    if (e.charAt(i) != e.charAt(j)) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                System.out.println(e);
                break;
            }
        }
    }
}
