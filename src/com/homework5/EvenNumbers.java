package com.homework5;

import java.lang.Math;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of array bigger than 3: ");
        int size;
        do {
            size = console.nextInt();
            System.out.print("Try again: ");
        } while (size <= 3);
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = 1 + (int) (Math.random() * 6);
        }
        int evenNum = 0;
        for (int i = 0; i < size; ++i) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                evenNum++;
            }
        }
        System.out.println();
        int[] evenArr = new int[evenNum];
        int index = 0;
        for (int i = 0; i < size; ++i) {
            if (arr[i] % 2 == 0) {
                evenArr[index++] = arr[i];
            }
        }
        System.out.print("Even numbers in first array: ");
        for (int i = 0; i < evenNum; ++i) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();
    }
}
