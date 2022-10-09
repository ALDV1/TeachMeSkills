package com.homework5;

import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.print("enter the number you want to add to the array: ");
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                int userNum = console.nextInt();
                arr[i][j] += userNum;
            }
        }
        int sumElements = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + "\t");
                sumElements += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum elements in array is " + sumElements);
    }
}
