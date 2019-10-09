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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**Luokka määrittelee PerfomanceAmount näkymän.
 * @author Teemu Viljanen, Eetu Vehnämäki, Jere Tallbacka
 * @version 1.2 10/2019
 */
public class PerfomanceAmount extends AppCompatActivity {
    private DayAndSport dayAndSport;

    /**
     * luodaan näkymä
     * @param savedInstanceState instanssin tila
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfomance_amount);
    }

    /**
     * Vahvistusnappi jota painamalla siirrytään seuraavaan näkymään ja tallennetaan annettu arvo
     * @param view vahvistusnapin view
     */
    public void confirm(View view) {
        Log.d("BALANCED FITNESS", "confirm()");

        Intent intent = new Intent(this, MainActivity.class);
        TextView tv = findViewById(R.id.editText);
        String amount = tv.getText().toString();

        //tarkastetaan, että käyttäjä laittaa vain kokonaislukuja
        //luetaan historialista String-muodossa, ja tallennetaan uusi arvo String muodossa siihen

        try {
            Integer.parseInt(amount);
            Perfomance perfomance = new Perfomance(amount);
            HistoryList.getInstance().getHistory().add(perfomance);
            String amountString = perfomance.toString();
            Log.d("TO_SINGLETON", "'amount' as string is " + amountString);
            SharedPreferences prefGet = getSharedPreferences("Amount Confirm", Activity.MODE_PRIVATE);
            String historyString = prefGet.getString("STRING_KEY", "");
            historyString += amountString;
            String listAsString = HistoryList.getInstance().listToString(historyString);
            SharedPreferences prefPut = getSharedPreferences("Amount Confirm", Activity.MODE_PRIVATE);
            Log.d("TO_SINGLETON", "Storing " + listAsString + " with key 'STRING_KEY'");
            SharedPreferences.Editor prefEditor = prefPut.edit();
            prefEditor.putString("STRING_KEY", listAsString);
            prefEditor.commit();


        } catch (Exception error) {
            Log.d("BALANCED FITNESS", "Exception in confirm(): " + error);
            Log.d("BALANCED FITNESS", "User input not integer, is " + amount.getClass());
            Context context = getApplicationContext();
            CharSequence message = "Input the amount as an integer.";
            int duration = Toast.LENGTH_SHORT;
            Toast popup = Toast.makeText(context, message, duration);
            popup.show();
            intent = new Intent(this, PerfomanceAmount.class);
        }
        Calendar calendar = Calendar.getInstance();
        int dayOfTheYear = calendar.get(Calendar.DAY_OF_YEAR);
        Log.d("Balanced_Fitness_Timer", "" + dayOfTheYear);


        SharedPreferences prefPut = getSharedPreferences("Amount Confirm", Activity.MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = prefPut.edit();
        prefEditor.putInt("DATE_KEY", dayOfTheYear);
        prefEditor.commit();

        startActivity(intent);
    }
}
