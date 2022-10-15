package com.homework6;

public class CreditCard {
    private String accountNum;
    private double currentSum;

    public CreditCard(String accountNum, double initAmount) {
        this.accountNum = accountNum;
        this.currentSum = initAmount;
        printInfo();
    }

    public CreditCard() {
        printInfo();
    }

    public double accrual(double value) {
        System.out.println("refill " + value);
        return currentSum += value;
    }

    public double sub(double value) {
        System.out.println("subtraction " + value);
        return currentSum -= value;
    }

    public void printInfo() {
        System.out.println("account number: " + accountNum + "\ncurrent sum: " + currentSum);
    }
}
