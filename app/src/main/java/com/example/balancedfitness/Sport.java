package com.example.balancedfitness;

/**
 * Luokka sisältää määritteet Sport-oliolle.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class Sport {

    /**
     * Sport-olion nimi, liikuntatyyppi ja lajikuvaus.
     */
    private String name;
    private String type;
    private String description;

    /**
     * Konstruktori luo Sport-olion, jolle määritetään nimi, tyyppi ja kuvaus.
     * @param name olion nimi.
     * @param type olion liikuntatyyppi.
     * @param description olion kuvaus.
     */
    public Sport (String name, String type, String description){
        this.name = name;
        this.type = type;
        this.description = description;
    }

    /**
     * Palauttaa olion nimen.
     * @return nimi.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Palauttaa olion tyypin.
     * @return tyyppi.
     */
    public String getType(){
        return this.type;
    }

    /**
     * Palauttaa olion kuvauksen.
     * @return kuvaus.
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Palauttaa olion nimen ja tyypin suluissa.
     * @return nimi ja tyyppi.
     */
    public String toString(){
        return this.name + " (" + this.type + ")";
    }
}
