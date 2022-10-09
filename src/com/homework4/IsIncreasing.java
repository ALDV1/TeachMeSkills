package com.homework4;

import java.util.Scanner;

public class IsIncreasing {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = console.nextInt();
        int[] userNum = new int[size];
        System.out.print("Fill array: ");
        for (int i = 0; i < size; ++i) {
            userNum[i] = console.nextInt();
        }

        for (int elements : userNum) {
            System.out.print(elements + " ");
        }

        boolean isIncreasing = true;
        for (int i = 1; i < size; ++i) {
            if (userNum[i - 1] >= userNum[i]) {
                isIncreasing = false;
            }
        }
        if (isIncreasing) {
            System.out.println("Your array is increasing");
        } else {
            System.out.println("Your array isn't increasing");
        }
    }
}
