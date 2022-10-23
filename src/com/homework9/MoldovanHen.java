package com.homework9;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 12;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " from Moldova, lay " + this.getCountOfEggsPerMonth() +
                " eggs a month";
    }
}
