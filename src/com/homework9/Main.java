package com.homework9;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Hen[] hen = new Hen[100];
        boolean moldovaAlreadyBeen = false;
        boolean russiaAlreadyBeen = false;
        boolean belarusAlreadyBeen = false;
        boolean ukraineAlreadyBeen = false;

        for (int i = 0; i < 100; ++i) {
            int randNumber = 1 + (int) (Math.random() * 4);
            if (randNumber == 1) {
                hen[i] = new MoldovanHen();
                if (!moldovaAlreadyBeen) {
                    System.out.println(hen[i].getDescription());
                }
                moldovaAlreadyBeen = true;
                continue;
            }
            if (randNumber == 2) {
                hen[i] = new RussianHen();
                if (!russiaAlreadyBeen) {
                    System.out.println(hen[i].getDescription());
                }
                russiaAlreadyBeen = true;
                continue;
            }
            if (randNumber == 3) {
                hen[i] = new BelarusianHen();
                if (!belarusAlreadyBeen) {
                    System.out.println(hen[i].getDescription());
                }
                belarusAlreadyBeen = true;
                continue;
            }
            if (randNumber == 4) {
                hen[i] = new UkrainianHen();
                if (!ukraineAlreadyBeen) {
                    System.out.println(hen[i].getDescription());
                }
                ukraineAlreadyBeen = true;
            }
        }
        System.out.println("count of eggs per year: " + Hen.eggsOfAll);
    }
}
