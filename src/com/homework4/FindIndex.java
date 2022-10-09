package com.homework4;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = console.nextInt();
        int[] userNum = new int[size];

        System.out.print("Fill array: ");
        for (int i = 0; i < userNum.length; ++i) {
            userNum[i] = console.nextInt();
        }

        for (int numbers : userNum) {
            System.out.print(numbers + " ");
        }

        System.out.println();
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < userNum.length; ++i) {
            if (userNum[maxIndex] < userNum[i]) {
                maxIndex = i;
            }
            if (userNum[minIndex] > userNum[i]) {
                minIndex = i;
            }
        }
        System.out.println("Max index is " + maxIndex);
        System.out.println("min index is " + minIndex);

    }
}
