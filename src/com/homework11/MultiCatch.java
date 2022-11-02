package com.homework11;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{1, 2, 3, 4};
            arr[4] = 10;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
