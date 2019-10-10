package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;
/**
 * Luokka määrittelee EntryActivity näkymän.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class EntryActivity extends AppCompatActivity {

    /**
     * Luokka määrittelee EntryActivity aktiviteetin
     * @param savedInstanceState instanssin tila
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

    }

    /**
     * "Ei"-nappi, josta painamalla ei kirjata arvoa historiaan, mutta käytetään päivän kirjausmahdollisuus
     * @param view "Ei"-nappi
     */
    public void noButton(View view) {
        Log.d("BALANCED FITNESS", "noButton()");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /**
     * "Kyllä"-nappi, josta painamalla siirrytään PerfomanceAmount-näkymään
     * @param view "Kyllä"-nappi
     */
    public void yesButton(View view) {
        Log.d("BALANCED FITNESS", "yesButton()");

         Intent intent = new Intent (this, PerfomanceAmount.class);
         startActivity(intent);


    }
}
