package com.homework11;

class ABC {
    public void printInfo() {

    }
}

public class FewCatch {
    public static void main(String[] args) {
        ABC abc = null;
        try {
            abc.printInfo();
        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
