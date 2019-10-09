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
 * Luokka näyttää listana viikko-ohjelman joka on tehty GlobalModelOfDays-singletonin avulla.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class ScheduleActivity extends AppCompatActivity {

    /**
     * Luo listanäkymän, johon hakee tiedot GlobalModelOfDays-luokasta.
     * Luo adapterin, jolla listan tiedot saadaan näkyviin.
     * @param savedInstanceState instanssin tila.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new ArrayAdapter<Day>(
                this,
                R.layout.day_item_layout,
                GlobalModelOfDays.getInstance().getDays()));
        //Luo klikkien kuuntelijan.
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            /**
             * Luo intentin klikatun listan osan indeksiluvun mukaan, ja lähettää SportTypeCardio-luokkaan.
             * @param adapterView adapterinäkymä.
             * @param view näkymä.
             * @param i listan indeksiluku.
             * @param l pitkän painalluksen määrite.
             */
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.d("QWE", "onItemClick(" + i + ")");
            Intent nextActivity = new Intent(ScheduleActivity.this, SportTypeCardio.class);
            nextActivity.putExtra("INDEX", i);
            startActivity(nextActivity);

        }
    });
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
