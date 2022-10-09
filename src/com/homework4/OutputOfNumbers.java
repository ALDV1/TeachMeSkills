package com.homework4;

import java.util.Scanner;

public class OutputOfNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = console.nextInt();
        while (size < 0) {
            System.out.print("Try again: ");
            size = console.nextInt();
        }
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; ++i)
            arr[i] = Math.random();
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; --i) {
            System.out.println(arr[i]);
        }
    }
}