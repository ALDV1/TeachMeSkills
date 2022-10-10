package com.homework6;


public class Main {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard("5532255", 10.5);
        CreditCard secondCard = new CreditCard("4412551", 1000);
        CreditCard thirdCard = new CreditCard("123456", 20);
        firstCard.accrual(1000.2);
        secondCard.accrual(10.55);
        thirdCard.sub(10);
        firstCard.printInfo();
        secondCard.printInfo();
        thirdCard.printInfo();
    }
}
