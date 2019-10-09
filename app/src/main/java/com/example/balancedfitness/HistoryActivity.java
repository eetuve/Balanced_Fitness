package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Intent intent = getIntent();
        SharedPreferences prefGet = getSharedPreferences("Amount Confirm", Activity.MODE_PRIVATE);
        String historyString = prefGet.getString("STRING_KEY", "");

        Log.d("History_Activity", "historyString is: " + historyString);
        ArrayList<String> historyList = new ArrayList<String>(Arrays.asList(historyString.split("\\*")));
        ListView lv = findViewById(R.id.historyListView);
        Log.d("History_Activity", "historyList is: " + historyList);

        ArrayAdapter<String> stringArrayAdapter= new ArrayAdapter<String>(this, R.layout.activity_history_item, historyList);
        lv.setAdapter(stringArrayAdapter);
    }
}
