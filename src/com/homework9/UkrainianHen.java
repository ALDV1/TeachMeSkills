package com.homework9;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 8;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " from Ukraine, lay " + this.getCountOfEggsPerMonth() +
                " eggs a month";
    }
}
