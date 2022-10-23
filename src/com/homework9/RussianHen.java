package com.homework9;

public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " from Russia, lay " + this.getCountOfEggsPerMonth() +
                " eggs a month";
    }
}
