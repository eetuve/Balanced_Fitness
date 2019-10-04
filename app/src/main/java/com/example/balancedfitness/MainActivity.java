package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private Boolean confirmed;
    private DayAndSport dayAndSport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dayAndSport = new DayAndSport();
        TextView DW = findViewById(R.id.dayView);
        TextView SW = findViewById(R.id.sportView);
        DW.setText(dayAndSport.getDayTime());
        SW.setText(dayAndSport.daysSport());
        //confirmed = false;
    }
    public void pressSchedule(View view) {
        Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
        startActivity(intent);
    }
    public void pressEntry(View view) {
        Intent intent = new Intent(MainActivity.this, EntryActivity.class);
        startActivity(intent);

        //SharedPreferences prefGet = getSharedPreferences("Amount Confirm", Activity.MODE_PRIVATE);
        //confirmed = prefGet.getBoolean("CONFIRM_KEY", false);
        //if (!confirmed) {
        //}

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
