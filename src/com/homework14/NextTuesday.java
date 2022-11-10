package com.homework14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class NextTuesday {
    static int getDate() {
        Scanner scanner = new Scanner(System.in);
        int date;
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
        System.out.println(date);

        DayOfWeek dayOfWeek;
        if (date.getDayOfWeek() == DayOfWeek.TUESDAY) {
            date = date.plusDays(7);
        }
        while (date.getDayOfWeek() != DayOfWeek.TUESDAY) {
            date = date.plusDays(1);
        }
        System.out.println("next tuesday will be " + date);
    }

}
