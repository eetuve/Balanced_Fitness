package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Luokka näyttää päivän ja lajiehdotuksen päivälle asetetun lajityypin perusteella.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class SportTypeCardio extends AppCompatActivity {

    /**
     * Hakee lähettävän intentin tiedot ja asettaa sopivat määritteet tekstikenttiin.
     * @param savedInstanceState lähetetyn instanssin tila.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_type_cardio);
        Bundle b = getIntent().getExtras();
        int i = b.getInt("INDEX", 0);

        //Hakee instanssin GlobalModelOfDays-singletonista.
        ((TextView)findViewById(R.id.textView2))
                .setText(GlobalModelOfDays.getInstance().getDay(i).getName());
        ((TextView)findViewById(R.id.textView3))
                .setText(GlobalModelOfDays.getInstance().getDay(i).getActivity());

        //Vertaa GlobalModelOfDays- ja Suggestionlist- singletoneja.
        //Antaa satunnaisen indeksiluvun, jolla lajiehdotus haetaan SuggestionList-singletonin listasta, johon on määritetty järjestykseen tietyt määrät kutakin vaihtoehtoa.
        Random rand = new Random();
        int u = rand.nextInt(4);
        int t = rand.nextInt(4) + 4;
        int e = rand.nextInt(2) + 8;
        int f = rand.nextInt(2) + 10;
        if (GlobalModelOfDays.getInstance().getDay(i).getActivity().contains("Cardio")){
            ((TextView)findViewById(R.id.textView5))
                    .setText("What kind of cardio to do?\n\n" + SuggestionList.getInstance().getSport(u).getDescription());
        }
        if (GlobalModelOfDays.getInstance().getDay(i).getActivity().contains("Strength")){
            ((TextView)findViewById(R.id.textView5))
                    .setText("What kind of strength training to do?\n\n" + SuggestionList.getInstance().getSport(t).getDescription());
        }
        if (GlobalModelOfDays.getInstance().getDay(i).getActivity().contains("Yoga")){
            ((TextView)findViewById(R.id.textView5))
                    .setText("What kind of Yoga to do?\n\n" + SuggestionList.getInstance().getSport(e).getDescription());
        }
        if (GlobalModelOfDays.getInstance().getDay(i).getActivity().contains("Rest")){
            ((TextView)findViewById(R.id.textView5))
                    .setText("What to do with your rest day?\n\n" + SuggestionList.getInstance().getSport(f).getDescription());
        }

    }

    /**
     * Luo intentin joka lätettää SuggestionActivity-luokkaan.
     * @param view näkymä.
     */
    public void moveSuggestions(View view) {
        Intent intent = new Intent(this, SuggestionActivity.class);
        startActivity(intent);
    }
}
