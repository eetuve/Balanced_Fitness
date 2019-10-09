package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Luokka näyttää yksityiskohtaisempia tietoja Sport-luokan avulla tehdystä oliosta.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class SportDetails extends AppCompatActivity {

    /**
     * Hakee lähettävän intentin tiedot ja asettaa sopivat määritteet tekstikentiin.
     * @param savedInstanceState lähetetyn instanssin tila.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_details);
        Bundle b = getIntent().getExtras();
        int i = b.getInt("INDEX", 0);

        ((TextView)findViewById(R.id.name))
                .setText(SuggestionList.getInstance().getSport(i).getName());
        ((TextView)findViewById(R.id.type))
                .setText(SuggestionList.getInstance().getSport(i).getType());
        ((TextView)findViewById(R.id.description))
                .setText(SuggestionList.getInstance().getSport(i).getDescription());
    }
}
