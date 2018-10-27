package com.vladislav.hobby;

public class Football extends Hobby {
    private int matchesAWeek;
    private int teamMembersAmount;

    public Football() {
        super();
    }

    public Football(char[] name, byte years, int matchesAWeek) {
        super(name, years);
        this.matchesAWeek = matchesAWeek;
    }

    public Football(char[] name, byte years, double spentDollars, boolean happyWithYourHobby, int teamMembersAmount) {
        super(name, years, spentDollars, happyWithYourHobby);
        this.teamMembersAmount = teamMembersAmount;
    }

    @Override
    public String tellAboutHobby() {
        return "Your hobby is " + String.valueOf(super.getName()) + ", you " +
                (super.isHappyWithYourHobby() ? "" : "do not ")
                + "like it," + " you have been doing it for " + super.getYears() + " years, " +
                " you have spent " + super.getSpentDollars() + " dollars, " +
                "you have " + matchesAWeek + " a week and yu have " + teamMembersAmount + " members in your team";
    }

    public int getMatchesAWeek() {
        return matchesAWeek;
    }

    public void setMatchesAWeek(int matchesAWeek) {
        this.matchesAWeek = matchesAWeek;
    }

    public int getTeamMembersAmount() {
        return teamMembersAmount;
    }

    public void setTeamMembersAmount(int teamMembersAmount) {
        this.teamMembersAmount = teamMembersAmount;
    }
}
