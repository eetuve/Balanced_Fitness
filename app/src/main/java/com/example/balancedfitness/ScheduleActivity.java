package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new ArrayAdapter<Day>(
                this,
                R.layout.day_item_layout,
                GlobalModelOfDays.getInstance().getDays()));
     lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.d("QWE", "onItemClick(" + i + ")");
            Intent nextActivity = new Intent(ScheduleActivity.this, SportTypeCardio.class);
            nextActivity.putExtra("INDEX", i);
            startActivity(nextActivity);

        }
    });

    }
    public void moveSuggestions(View view) {
        Intent intent = new Intent(this, SuggestionActivity.class);
        startActivity(intent);
    }
}
