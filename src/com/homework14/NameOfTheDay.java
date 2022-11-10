package com.homework14;

import java.time.LocalDate;
import java.util.Scanner;

public class NameOfTheDay {
    static int getDate() {
        Scanner scanner = new Scanner(System.in);
        int date = 0;
        if (scanner.hasNextInt()) {
            date = scanner.nextInt();
        } else {
            System.out.print("Try again: ");
            scanner.next();
            date = getDate();
        }
        return date;
    }

    public static void main(String[] args) {
        System.out.print("Enter any year: ");
        int year = getDate();
        System.out.print("Enter any month: ");
        int month = getDate();
        System.out.print("Enter any day: ");
        int day = getDate();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("Day of the week of this date: " + date.getDayOfWeek());
    }
}
