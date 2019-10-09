package com.example.balancedfitness;

public class Perfomance {
    private String length;
    private int hours;
    private int minutes;
    private DayAndSport dayAndSport;

    public Perfomance(String length) {
        dayAndSport = new DayAndSport();
        this.length = length;
        int lengthInteger = Integer.parseInt(this.length);
        this.hours = lengthInteger / 60;
        this.minutes = lengthInteger - (hours * 60);
    }
    public String getLenght() {
        return this.length;
    }
    public String toString() {
        return dayAndSport.getDayTime() + ", " + this.hours + "h " + this.minutes + "min " + dayAndSport.daysSport();
    }
}
