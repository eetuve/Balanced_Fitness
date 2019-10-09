package com.example.balancedfitness;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Singleton-luokka sisältää listan liikuntahistoriasta, jotka luodaan Perfomance-luokan avulla.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

class HistoryList {
    /**
     * Singleton-luokan instanssimääritys.
     * ArralyList koostuu Perfomance-luokan olioista.
     */

    private static final HistoryList ourInstance = new HistoryList();
    private List<Perfomance> history;
    private String historyListString;

    static HistoryList getInstance() {
        return ourInstance;
    }

    //Luo uuden listan ja määrittelee this.historyListString-muuttujan
    private HistoryList() {
        history = new ArrayList<>();
        this.historyListString = "";

        /**
         * @param this.historyListString historyList String muodossa
          */

    }

    /**
     * palauttaa historialistan
     * @return historia listamuodossa
     */

    public List<Perfomance> getHistory() {
        return this.history;
    }

    /**
     * palauttaa urheilulajin
     * @param i indeksiluku
     * @return listan olion joka vastaa indeksilukua
     */
    public Perfomance getSport(int i) {
        return this.history.get(i);
    }

    /**
     * tekee String tyyppisen listan, erottajana toimii "*"
     * @param amountString tallennettavan urheilusuorituksen data
     * @return historialista String muodossa
     */
    public String listToString(String amountString) {
        int i = 0;


        //jos historialista String-muodossa on tyhjä, lisätään ensimmäinen arvo Stringiin
        if (this.historyListString.equals("")) {
            Log.d("History_List_Singleton", "History was empty, adding first performance");
            this.historyListString = amountString + "*";
        }
        while (i < this.history.size() - 1) {
            i++;
            this.historyListString += this.history.get(i) + "*";
            Log.d("History_List_Singleton", "HistoryList as String is currently: " + this.historyListString);
            Log.d("History_List_Singleton", "Index 'i' is currently: " + i);
            Log.d("History_List_Singleton", "Adding sport: " + this.history.get(i));
        }
        Log.d("History_List_Singleton", "HistoryList listToString() returns: " + this.historyListString);
        return this.historyListString;
    }
}
