package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SportDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_details);
        Bundle b = getIntent().getExtras();
        int i = b.getInt("INDEX", 0);

        ((TextView)findViewById(R.id.name))
                .setText(SuggestionList.getInstance().getSport(i).getName());
        ((TextView)findViewById(R.id.type))
                .setText(SuggestionList.getInstance().getSport(i).getType());
        ((TextView)findViewById(R.id.description))
                .setText(SuggestionList.getInstance().getSport(i).getDescription());
    }
}
