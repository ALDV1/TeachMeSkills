package com.homework4;

import java.util.Scanner;

public class FindElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = console.nextInt();
        int[] userNum = new int[size];
        System.out.print("Fill array: ");
        for (int i = 0; i < size; ++i) {
            userNum[i] = console.nextInt();
        }

        for (int numbers : userNum) {
            System.out.print(numbers + " ");
        }

        int minElement = userNum[0];
        int maxElement = userNum[0];
        for (int i = 0; i < size; ++i) {
            if (userNum[i] > maxElement) {
                maxElement = userNum[i];
            }
            if (userNum[i] < minElement) {
                minElement = userNum[i];
            }
        }
        System.out.println("\nMax element in array is " + maxElement + "\nMin element in array is " + minElement);
    }
}
