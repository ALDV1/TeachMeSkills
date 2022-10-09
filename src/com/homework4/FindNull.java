package com.homework4;

import java.util.Scanner;

public class FindNull {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = console.nextInt();
        int[] userNum = new int[size];
        System.out.print("Fill array: ");

        for (int i = 0; i < size; ++i) {
            userNum[i] = console.nextInt();
        }

        for (int i = 0; i < size; ++i)
            System.out.print(userNum[i] + " ");
        System.out.println();

        int countNull = 0;
        for (int i = 0; i < size; ++i) {
            if (userNum[i] == 0)
                countNull++;
        }
        if (countNull == 0)
            System.out.println("null isn't founded");
        else
            System.out.println("umber of zeros: " + countNull);
    }
}
