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
        days.add(new Day("Mon", "Cardio"));
        days.add(new Day("Tue", "Strength"));
        days.add(new Day("Wed", "Cardio"));
        days.add(new Day("Thu", "Strength"));
        days.add(new Day("Fri", "Yoga"));
        days.add(new Day("Sat", "Strength"));
        days.add(new Day("Sun", "Rest"));
    }



    public ArrayList<Day> getDays() {
        return days;
    }

    public Day getDay(int i){
        return this.days.get(i);
    }


}
