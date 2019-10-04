package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PerfomanceAmount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfomance_amount);
    }
    public void confirm(View view) {
        Log.d("BALANCED FITNESS", "confirm()");
        Intent intent = new Intent(this, MainActivity.class);
        TextView tv = findViewById(R.id.editText);
        String amount = tv.getText().toString();
        Perfomance perfomance = new Perfomance(amount);
        HistoryList.getInstance().getHistory().add(perfomance);

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
