package com.yakovenko.vladislav;

import java.util.Arrays;

public class Hobby {
    private boolean happyWithYourHobby;
    private byte years;
    private short months;
    private char[] name;
    private int days;
    private long createdThings;
    private float hours;
    private double spentDollars;

    public Hobby() {}

    public Hobby(char[] name, byte years) {
        this.name = name;
        this.years = years;
    }

    public Hobby(char[] name, byte years, double spentDollars, boolean happyWithYourHobby) {
        this.name = name;
        this.years = years;
        this.spentDollars = spentDollars;
        this.happyWithYourHobby = happyWithYourHobby;
    }

    public Hobby(char[] name, byte years, long createdThings) {
        this.name = name;
        this.years = years;
        this.createdThings = createdThings;
    }

    @Override
    public String toString() {
        return "Your hobby is " + String.valueOf(name) + ", you " +
                (happyWithYourHobby ? "" : "do not ")
                + "like it," + " you have been doing it for "+ years +" years, " +
                + months + " months, " + days + " days" + " and " + hours + " hours" +
                ", you have created " + createdThings + " things and have spent "
                + spentDollars + " dollars";
    }

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

    public long getCreatedThings() {
        return createdThings;
    }

    public void setCreatedThings(long createdThings) {
        this.createdThings = createdThings;
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

