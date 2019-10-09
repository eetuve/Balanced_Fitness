package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.List;

/**
 * Luokka määrittelee MainActivity aktiviteetin toimintaa.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */
public class MainActivity extends AppCompatActivity {

    /**
     * @param confirmed boolean, joka kertoo onko liikunta jo kirjattu kyseisenä päivänä
     * @param dayAndSport DayAndSport tyyppinen olio
     */
    private Boolean confirmed;
    private DayAndSport dayAndSport;

    /**
     * Hakee DayAndSport luokasta TextVieweille String arvot.
     * getDayTime() metodi palauttaa päivän nimen.
     * daysSport() metodi palauttaa kyseisen päivän liikuntamuodon.
     *
     * @param savedInstanceState instanssin tila.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dayAndSport = new DayAndSport();
        TextView DW = findViewById(R.id.dayView);
        TextView SW = findViewById(R.id.sportView);
        DW.setText(dayAndSport.getDayTime());
        SW.setText(dayAndSport.daysSport());

        Calendar calendar = Calendar.getInstance();
        int dateOfTheYear = calendar.get(Calendar.DAY_OF_YEAR);

        //haetaan edellinen kirjauspäivä SharedPreferencistä

        SharedPreferences prefGet = getSharedPreferences("Amount Confirm",Activity.MODE_PRIVATE);
        int previousConfirmDate = prefGet.getInt("DATE_KEY", 0);

        Log.d("Balanced_Fitness", "Previous confirm date was number " + previousConfirmDate);
        Log.d("Balanced_Fitness", "Date today is number " + dateOfTheYear);

        //verrataan edellistä kirjauspäivää tämän hetkiseen päivään
        //alla on testailua varten koodinpätkä piiloitettu kommentin sisään
        //dateOfTheYear = 0;
        if (previousConfirmDate != dateOfTheYear) {
            confirmed = false;
        } else {
            confirmed = true;
        }
        Log.d("Balanced_Fitness", "confirmed is " + confirmed + " during onCreate()");
    }

    /**
     * Avaa ScheduleActivityn, kun painaa Scheduleksi nimettyä nappia.
     * @param view "Schedule"-nappi
     */
    public void pressSchedule(View view) {
        Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
        startActivity(intent);
    }

    /**
     * Avaa EntryActivityn, kun painaa Entryksi niemttyä nappia.
     * @param view "Entry"-nappi
     */
    public void pressEntry(View view) {
        Log.d("Balanced_Fitness", "pressEntry()");
        Log.d("Balanced_Fitness", "confirmed is " + confirmed);

        //jos suoritus on jo kirjattu, näytetään lyhyt Toast-tyyppinen viesti käyttäjälle ja kirjaus estetään
        if (confirmed) {
            Context context = getApplicationContext();
            CharSequence message = "You have already logged your performance for the day.";
            int duration = Toast.LENGTH_SHORT;
            Toast popup = Toast.makeText(context, message, duration);
            popup.show();

        } else {
            Intent intent = new Intent(MainActivity.this, EntryActivity.class);
            startActivity(intent);
        }

    }

    /**
     * Avaa SuggestionActivityn, kun painaa Suggestioniksi nimettyä nappia.
     * @param view "Recommendations"-nappi
     */
    public void pressRecommendations(View view) {
        Intent intent = new Intent(MainActivity.this, SuggestionActivity.class);
        startActivity(intent);
    }

    /**
     * Avaa HistoryActivityn, kun painaa Historyksi nimettyä nappia.
     * @param view "History"-nappi
     */
    public void pressHistory(View view) {
        Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
        startActivity(intent);
    }
}
