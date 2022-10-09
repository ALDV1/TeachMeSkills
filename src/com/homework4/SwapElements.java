package com.homework4;

import java.util.Scanner;

public class SwapElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = console.nextInt();
        int[] userNum = new int[size];

        for (int i = 0; i < size; ++i) {
            userNum[i] = console.nextInt();
        }

        for (int elements : userNum) {
            System.out.print(elements + " ");
        }

        for (int min = 0, max = size - 1; min < size / 2 && max >= 0; ++min, --max) {
            int tmp = userNum[min];
            userNum[min] = userNum[max];
            userNum[max] = tmp;
        }
        System.out.println();
        for (int elements : userNum) {
            System.out.print(elements + " ");
        }
    }
}
