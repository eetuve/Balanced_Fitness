package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Luokka näyttää Balanced Fitness logon ja vie eteenpäin pääsivulle.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */

public class NextPage extends AppCompatActivity {

    /**
     * Luo näkymän, jossa näkyy kuva.
     * @param savedInstanceState instanssin tila.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
    }

    /**
     * Luo intentin, joka lähetttää MainActivity-luokkaan.
     * @param view näkymä.
     */
    public void moveOn(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
