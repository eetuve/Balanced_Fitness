package com.example.balancedfitness;

import java.util.ArrayList;

class GlobalModelOfDays {
    private static final GlobalModelOfDays ourInstance = new GlobalModelOfDays();
    private ArrayList<Day> days;
    static GlobalModelOfDays getInstance() {
        return ourInstance;
    }

    private GlobalModelOfDays() {
        days = new ArrayList<>();
        days.add(new Day("Mon", "Kestävyys"));
        days.add(new Day("Tue", "Voima"));
        days.add(new Day("Wed", "Kestävyys"));
        days.add(new Day("Thu", "Voima"));
        days.add(new Day("Fri", "Jooga"));
        days.add(new Day("Sat", "Voima"));
        days.add(new Day("Sun", "Lepo"));
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public Day getDay(int i){
        return this.days.get(i);
    }

}
