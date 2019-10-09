package com.example.balancedfitness;

import java.util.ArrayList;

/**
 * Singleton-luokka sisältää listan mahdollisia urheilulajeja, jotka luodaan Sport-luokan avulla.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

class SuggestionList {

    /**
     * Singleton-luokan instanssimääritys.
     * ArralyList hakee määritteensä Sport-luokasta.
     */
    private static final SuggestionList ourInstance = new SuggestionList();
    private ArrayList<Sport> sports;
    static SuggestionList getInstance() {
        return ourInstance;
    }

    //Tässä luodaan ArrayList sports. Määritteet luokan Sport mukaan.
    private SuggestionList() {
        sports = new ArrayList<>();
        sports.add(new Sport("Running Hills", "Cardio", "Running is a Cardio Classic. " +
                "\nBut did you know that running hills is a more effective exercise than running on flat ground?"));
        sports.add(new Sport("Swimming", "Cardio","Swimming is done in water, usually a swimming pool. " +
                "\nWater splashes around and you're having so much fun. \nBut you're also getting fitter ;)"));
        sports.add(new Sport("Cycling", "Cardio", "Maybe you own a bicycle. Then you are lucky. " +
                "\nCycling is a great cardio exercise. " +
                "\nYou can also rent bikes, if you don't own one " +
                "\n\n(Also remember stationary bikes!)"));
        sports.add(new Sport("Skipping Rope", "Cardio","Skipping rope is a great cardio exercise. " +
                "\nYou think of iconic images of boxers skipping around the gym between sparring bouts. " +
                "\nEye of the Tiger, baby!"));
        sports.add(new Sport("Weight Training", "Strength", "Weight training is a classic. " +
                "\nJust get to the gym and get those weights in your mits.\nUp, dow, reps, baby, reps!"));
        sports.add(new Sport("Bodyweight Training", "Strength","Bodyweight training is a great alternative to weight training. " +
                "\nPlanks, push-ups and pull-ups are great builders of strength."));
        sports.add(new Sport("Kettlebells", "Strength","Kettlebells are an excellent tool for strength building." +
                "\nBut remember safety! Start your kettlebell exercising with an experienced coach."));
        sports.add(new Sport("Core Training", "Strength","Core holds the entire body together. " +
                "\nStomach muscles are the most important muscles ones for balanced health of the body. " +
                "\n\nAnd when was the last time you exercised your back muscles?"));
        sports.add(new Sport("Astanga Yoga", "Yoga", "Astanga Yoga is a demanding yogavariety, that really makes you sweat. " +
                "\nYour breath guides all your movements. (That is called Vinyasa)"));
        sports.add(new Sport("Hot Yoga", "Yoga", "Hot Yogaa is done in a heated room. " +
                "\nHot air helps relax your muscles and makes you really sweat."));
        sports.add(new Sport("A Nap", "Rest", "Sleeping is very important for your recovery. " +
                "\nIf you didn't get eight hours last night, why not take a little nap?"));
        sports.add(new Sport("E-Sports", "Rest", "For your rest day, you can sit don comfortably on your couch and start mayhem on your games console. " +
                "\n\nFor example, are you familiar with a game called Dota?"));
    }

    /**
     * Palauttaa Sport-olioista luodun listan.
     * @return listan osat Sport-luokan toString-metodin mukaan.
     */
    public ArrayList<Sport> getSports(){
        return sports;
    }

    /**
     * Palauttaa tietyn olion listasta indeksiluvun perusteella.
     * @param i indeksiluku.
     * @return listan olion joka vastaa indeksilukua.
     */
    public Sport getSport (int i) {
        return this.sports.get(i);
    }
}
