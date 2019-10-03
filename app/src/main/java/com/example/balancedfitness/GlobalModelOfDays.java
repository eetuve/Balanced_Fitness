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
        days.add(new Day("Maanantai", "Kestävyys"));
        days.add(new Day("Tiistai", "Voima"));
        days.add(new Day("Keskiviikko", "Kestävyys"));
        days.add(new Day("Torstai", "Voima"));
        days.add(new Day("Perjantai", "Jooga"));
        days.add(new Day("Lauantai", "Voima"));
        days.add(new Day("Sunnuntai", "Lepo"));

    }

    public ArrayList<Day> getDays() {
        return days;
    }
}
