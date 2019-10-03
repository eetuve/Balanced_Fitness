package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Intent intent = getIntent();

        ListView lv = findViewById(R.id.historyListView);

        lv.setAdapter(new ArrayAdapter<Perfomance>(
                this,
                R.layout.activity_history_item,
                HistoryList.getInstance().getHistory()
        ));
    }
}
