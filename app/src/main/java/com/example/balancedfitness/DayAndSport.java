package com.example.balancedfitness;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Luokka antaa MainActivityn TextVieweille tekstit.
 * Käyttää singelton luokkaa GlobalModelOfDays päivän vertaamiseen ja liikuntamuodon hakemiseen.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */
public class DayAndSport {
    /**
     *GlobalModelOfDays singletonin tiedoilla luotujen olioiden parametrejä.
     * name tarkoittaa päivämäärän nimeä, activity kyseisen päivän liikuntamuotoa.
     * number on indeksiluku, jolla seurataan oikean päivän hakemista singleton luokasta.
     */
    private String name;
    private String activity;
    private Day day;
    private int number = 0;

    /**
     * Konstruktori, joka luo olion Day luokan avulla tietyllä viikonpäivällä ja liikuntamuodolla.
     */
    public DayAndSport() {
        day = new Day(name, activity);
    }

    /**
     * Palauttaa tämänhetkisen päivämäärän kolmen ensimäisen kirjaimen muodossa.
     * @return päivä
     */
    public String getDayTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE");
        String currentDate = sdf.format(new Date());
        return currentDate;
    }

    /**
     * Palauttaa kuluvan päivän liikuntalajin.
     * Kasvattaa number indeksiä niin kauan kunnes luotu looppi löytää kuluvan vastaavan päivän
     * GlobalModelOFDays singletonin listasta. Number indeksin avulla haetaan singeltonista tämän päivän
     * liikuntamuoto.
     * @return liikuntalaji.
     */
    public String daysSport() {
        while (number <= GlobalModelOfDays.getInstance().getDays().size()) {
            if (getDayTime().equals(GlobalModelOfDays.getInstance().getDay(number).getName())){
                Log.d("BreakCheck", "Found the right sport for the day.");
                break;
            }
            number++;
        }
        return GlobalModelOfDays.getInstance().getDay(number).getActivity();
    }
}
