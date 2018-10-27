package com.vladislav.hobby;

public class Fishing extends Hobby {
    private int numberOfFishingRods;

    public Fishing() {
        super();
    }

    public Fishing(char[] name, byte years, int numberOfFishingRods) {
        super(name, years);
        this.numberOfFishingRods = numberOfFishingRods;
    }

    public Fishing(char[] name, byte years, long caughtFish, int numberOfFishingRods) {
        super(name, years, caughtFish);
        this.numberOfFishingRods = numberOfFishingRods;
    }

    @Override
    public String tellAboutHobby() {
        return "Your hobby is " + String.valueOf(super.getName()) + ", you " +
                (super.isHappyWithYourHobby() ? "" : "do not ")
                + "like it, you have been doing it for " + super.getYears() + " years, " +
                "you have caught " + super.getCaughtFish() + " fish and you have " +
                this.numberOfFishingRods + " fishing rods";
    }
}
