package com.example.balancedfitness;

/**
 * Luokka sisältää määritteet Day-oliolle.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class Day {

    /**
     * Day-olion nimi ja sille määrätty liikuntatyyppi.
     */
    private String name;
    private String activity;

    /**
     * Konstruktori luo Day-olion, jolle määritetään nimi ja liikuntatyyppi.
     * @param name nimi.
     * @param activity liikuntatyyppi.
     */
    public Day (String name, String activity){
        this.name = name;
        this.activity = activity;
    }

    /**
     * Palauttaa olion liikuntatyypin.
     * @return liikuntatyyppi.
     */
    public String getActivity() {
        return this.activity;
    }

    /**
     * Palauttaa olion nimen.
     * @return nimi.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Palauttaa olion nimen ja liikuntatyypin
     * @return nimi ja liikuntatyyppi.
     */
    public String toString(){
        return this.name + ": " + this.activity;
    }

}
