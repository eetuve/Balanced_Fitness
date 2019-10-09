package com.example.balancedfitness;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

class HistoryList {
    private static final HistoryList ourInstance = new HistoryList();
    private List<Perfomance> history;
    private String historyListString;

    static HistoryList getInstance() {
        return ourInstance;
    }
    private HistoryList() {
        history = new ArrayList<>();
        this.historyListString = "";

    }
    public List<Perfomance> getHistory() {
        return this.history;
    }
    public Perfomance getSport(int i) {
        return this.history.get(i);
    }

    public String listToString(String amountString) {
        int i = 0;

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
