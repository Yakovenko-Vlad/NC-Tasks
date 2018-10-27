package com.vladislav.hobby;

public abstract class Hobby {
    private boolean happyWithYourHobby;
    private byte years;
    private short months;
    private char[] name;
    private int days;
    private long caughtFish;
    private float hours;
    private double spentDollars;

    protected Hobby() {
    }

    protected Hobby(char[] name, byte years) {
        this.name = name;
        this.years = years;
    }

    protected Hobby(char[] name, byte years, double spentDollars, boolean happyWithYourHobby) {
        this.name = name;
        this.years = years;
        this.spentDollars = spentDollars;
        this.happyWithYourHobby = happyWithYourHobby;
    }

    protected Hobby(char[] name, byte years, long caughtFish) {
        this.name = name;
        this.years = years;
        this.caughtFish = caughtFish;
    }

    public abstract String tellAboutHobby();

    public boolean isHappyWithYourHobby() {
        return happyWithYourHobby;
    }

    public void setHappyWithYourHobby(boolean happyWithYourHobby) {
        this.happyWithYourHobby = happyWithYourHobby;
    }

    public byte getYears() {
        return years;
    }

    public void setYears(byte years) {
        this.years = years;
    }

    public short getMonths() {
        return months;
    }

    public void setMonths(short months) {
        this.months = months;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public long getCaughtFish() {
        return caughtFish;
    }

    public void setCaughtFish(long caughtFish) {
        this.caughtFish = caughtFish;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public double getSpentDollars() {
        return spentDollars;
    }

    public void setSpentDollars(double spentDollars) {
        this.spentDollars = spentDollars;
    }
}

