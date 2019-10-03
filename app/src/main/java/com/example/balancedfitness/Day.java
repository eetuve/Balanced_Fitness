package com.example.balancedfitness;

public class Day {

    private String name;
    private String activity;

    public Day (String name, String activity){
        this.name = name;
        this.activity = activity;
    }

    public String toString(){
        return this.name + ": " + this.activity;
    }
}
