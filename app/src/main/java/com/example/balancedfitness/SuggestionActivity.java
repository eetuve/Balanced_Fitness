package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuggestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        ListView lv = findViewById(R.id.suggestionList);
        lv.setAdapter(new ArrayAdapter<Sport>(
                this,
                R.layout.sport_item_layout,
                SuggestionList.getInstance().getSports()
        ));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("QWE", "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(SuggestionActivity.this, SportDetails.class);
                nextActivity.putExtra("INDEX", i);
                startActivity(nextActivity);

            }
        });
    }

}
