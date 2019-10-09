package com.example.balancedfitness;

/**
 * Luokka sisältää määritteet Perfomance-oliolle.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class Perfomance {
    private String length;
    private int hours;
    private int minutes;
    private DayAndSport dayAndSport;

    /**
     * konstruktori joka määrittelee uuden listan dayAndSport, liikunnan pituuden length String sekä int muodossa
     * määrittelee int muotoiset "hours" ja "minutes" muuttujat
     * @param length suorituksen pituus minuutteina
     */
    public Perfomance(String length) {
        dayAndSport = new DayAndSport();
        this.length = length;
        int lengthInteger = Integer.parseInt(this.length);
        this.hours = lengthInteger / 60;
        this.minutes = lengthInteger - (hours * 60);
    }

    /**
     * palauttaa suorituksen pituuden String-muodossa
     * @return suorituksen pituus String-muodossa
     */
    public String getLenght() {
        return this.length;
    }

    /**
     * palauttaa String-muotoisen muuttujan, joka sisältää päivän, tunti- sekä minuuttimäärän sekä urheilutyylin
     * @return String muuttuja, jossa päivä, tunti- sekä minuuttimäärä sekä urheilutyyli
     */
    public String toString() {
        return dayAndSport.getDayTime() + ", " + this.hours + "h " + this.minutes + "min " + dayAndSport.daysSport();
    }
}
