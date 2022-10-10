package com.homework6;

/*

Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 Добавьте метод, который позволяет начислять сумму на кредитную карточку.
  Добавьте метод, который позволяет снимать с карточки некоторую сумму.
   Добавьте метод, который выводит текущую информацию о карточке.
    Напишите программу, которая создает три объекта класса CreditCard у
     которых заданы номер счета и начальная сумма Тестовый сценарий для проверки:
      Положите деньги на первые две карточки и снимите с третьей.
       Выведите на экран текущее состояние всех трех карточек.
 */
public class CreditCard {

    public CreditCard(String accountNum, double initAmount) {
        this.accountNum = accountNum;
        this.currentSum = initAmount;
        printInfo();
    }

    public CreditCard() {
        printInfo();
    }

    private String accountNum;
    private double currentSum;

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
