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
        days.add(new Day("Mon", "Maanantai", "Kestävyys"));
        days.add(new Day("Tue", "Tiistai", "Voima"));
        days.add(new Day("Wed", "Keskiviikko", "Kestävyys"));
        days.add(new Day("Thu", "Torstai", "Voima"));
        days.add(new Day("Fri", "Perjantai","Jooga"));
        days.add(new Day("Sat", "Lauantai", "Voima"));
        days.add(new Day("Sun", "Sunnuntai","Lepo"));
    }



    public ArrayList<Day> getDays() {
        return days;
    }

    public Day getDay(int i){
        return this.days.get(i);
    }


}
