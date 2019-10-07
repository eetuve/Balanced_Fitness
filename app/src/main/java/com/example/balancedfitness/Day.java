package com.example.balancedfitness;

public class Day {

    private String name;
    private String nameFin;
    private String activity;

    public Day (String name, String nameFin, String activity){
        this.name = name;
        this.nameFin = nameFin;
        this.activity = activity;
    }
    public String getActivity() {
        return this.activity;
    }

    public String toString(){
        return this.nameFin + ": " + this.activity;
    }
    public String getName() {
        return this.name;
    }
    public String getNameFin(){
        return this.nameFin;
    }
}
