package com.homework9;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " from Belarus, lay " + this.getCountOfEggsPerMonth() +
                " eggs a month";
    }
}
