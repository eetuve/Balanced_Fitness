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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   
    private MainActivityDay mainActivityDay;
    private Boolean confirmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityDay = new MainActivityDay();
        TextView DW = findViewById(R.id.dayView);
        TextView SW = findViewById(R.id.sportView);
        DW.setText(mainActivityDay.getDayTime());
        SW.setText(mainActivityDay.daysSport());
        
        Calendar calendar = Calendar.getInstance();
        int dateOfTheYear = calendar.get(Calendar.DAY_OF_YEAR);

        SharedPreferences prefGet = getSharedPreferences("Amount Confirm",Activity.MODE_PRIVATE);
        int previousConfirmDate = prefGet.getInt("DATE_KEY", 0);

        Log.d("Balanced_Fitness", "Previous confirm date was number " + previousConfirmDate);
        Log.d("Balanced_Fitness", "Date today is number " + dateOfTheYear);
        if (previousConfirmDate != dateOfTheYear) {
            confirmed = false;
        } else {
            confirmed = true;
        }
        Log.d("Balanced_Fitness", "confirmed is " + confirmed + " during onCreate()");

    }
    public void pressSchedule(View view) {
        Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
        startActivity(intent);
    }
    public void pressEntry(View view) {
        Log.d("Balanced_Fitness", "pressEntry()");
        Log.d("Balanced_Fitness", "confirmed is " + confirmed);
        if (confirmed) {
            Context context = getApplicationContext();
            CharSequence message = "Olet jo kirjannut päivän liikunnan.";
            int duration = Toast.LENGTH_SHORT;
            Toast popup = Toast.makeText(context, message, duration);
            popup.show();

        } else {
            Intent intent = new Intent(MainActivity.this, EntryActivity.class);
            startActivity(intent);
        }

    }
    public void pressRecommendations(View view) {
        Intent intent = new Intent(MainActivity.this, SuggestionActivity.class);
        startActivity(intent);
    }
    public void pressHistory(View view) {
        Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
        startActivity(intent);
    }
}
