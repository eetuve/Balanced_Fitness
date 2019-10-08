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

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

    }
    public void noButton(View view) {
        Calendar calendar = Calendar.getInstance();
        int dayOfTheYear = calendar.get(Calendar.DAY_OF_YEAR);

        SharedPreferences prefPut = getSharedPreferences("Amount Confirm", Activity.MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = prefPut.edit();
        prefEditor.putInt("DATE_KEY", dayOfTheYear);

        prefEditor.commit();
        Log.d("BALANCED FITNESS", "noButton()");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void yesButton(View view) {
        Log.d("BALANCED FITNESS", "yesButton()");

         Intent intent = new Intent (this, PerfomanceAmount.class);
         startActivity(intent);


    }
}
