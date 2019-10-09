package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Luokka näyttää listan lajiehdotuksia, joka on tehty SuggestionList-singletonin avulla.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class SuggestionActivity extends AppCompatActivity {

    /**
     * Luo listanäkymän, johon hakee tiedot SuggestionList-luokasta.
     * Luo adapterin, jolla listan tiedot saadaan näkyviin.
     * @param savedInstanceState instanssin tila.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        ListView lv = findViewById(R.id.suggestionList);
        lv.setAdapter(new ArrayAdapter<Sport>(
                this,
                R.layout.sport_item_layout,
                SuggestionList.getInstance().getSports()
        ));

        //Luo klikkien kuuntelijan.
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            /**
             * Luo intentin klikatun listan osan indeksiluvun mukaan, ja lähettää SportDetails-luokkaan.
             * @param adapterView adapterinäkymä.
             * @param view näkymä.
             * @param i listan indeksiluku.
             * @param l pitkän painalluksen määrite.
             */
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("QWE", "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(SuggestionActivity.this, SportDetails.class);
                nextActivity.putExtra("INDEX", i);
                startActivity(nextActivity);

            }
        });
    }

}
