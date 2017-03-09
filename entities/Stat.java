package com.android.training.retrofitexample.entities;

/**
 * Created by eselman on 08/03/2017.
 */

public class Stat {
    private int effort;
    private int baseStat;
    private StatDetails stat;

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }

    public StatDetails getStat() {
        return stat;
    }

    public void setStat(StatDetails stat) {
        this.stat = stat;
    }
}
