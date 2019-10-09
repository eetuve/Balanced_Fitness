package com.example.balancedfitness;

public class Sport {

    private String name;
    private String type;
    private String description;

    public Sport (String name, String type, String description){
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public String getDescription(){
        return this.description;
    }

    public String toString(){
        return this.name + " (" + this.type + ")";
    }
}
