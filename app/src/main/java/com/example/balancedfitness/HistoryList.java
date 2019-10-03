package com.example.balancedfitness;

import java.util.ArrayList;
import java.util.List;

class HistoryList {
    private static final HistoryList ourInstance = new HistoryList();
    private List<Perfomance> history;

    static HistoryList getInstance() {
        return ourInstance;
    }
    private HistoryList() {
        history = new ArrayList<>();
    }
    public List<Perfomance> getHistory() {
        return this.history;
    }
    public Perfomance getSport(int i) {
        return this.history.get(i);
    }
}
