package com.example.balancedfitness;

import java.util.ArrayList;

/**
 * Singleton-luokka sisältää listan päivistä, jotka luodaan Day-luokan avulla.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

class GlobalModelOfDays {

    /**
     * Singleton-luokan instanssimääritys.
     * ArralyList koostuu Day-luokan olioista.
     */
    private static final GlobalModelOfDays ourInstance = new GlobalModelOfDays();
    private ArrayList<Day> days;
    static GlobalModelOfDays getInstance() {
        return ourInstance;
    }

    //Luo listan Day-olioista. Määritteet luokan Day mukaan.
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

    /**
     * Palauttaa Day-olioista luodun listan.
     * @return listan osat Day-luokan toString-metodin mukaan.
     */
    public ArrayList<Day> getDays() {
        return days;
    }

    /**
     * Palauttaa tietyn Day-olion listasta indeksiluvun perusteella.
     * @param i indeksiluku.
     * @return listan olion joka vastaa indeksilukua.
     */
    public Day getDay(int i){
        return this.days.get(i);
    }


}
