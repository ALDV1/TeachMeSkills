package com.homework17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIp = new Scanner(System.in);
        System.out.print("Enter right ip address: ");
        new IPAddressValidator(userIp.nextLine());
    }
}
