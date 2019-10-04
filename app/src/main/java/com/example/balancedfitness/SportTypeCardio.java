package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SportTypeCardio extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_type_cardio);
        Bundle b = getIntent().getExtras();
        int i = b.getInt("INDEX", 0);

        //TextView textView2 = findViewById(R.id.textView2);
        ((TextView)findViewById(R.id.textView2))
                .setText(GlobalModelOfDays.getInstance().getDay(i).getName());
        ((TextView)findViewById(R.id.textView3))
                .setText(GlobalModelOfDays.getInstance().getDay(i).getActivity());
        //((TextView)findViewById(R.id.description))
          //      .setText(SuggestionList.getInstance().getSport(i).getDescription());



    }
    public void moveSuggestions(View view) {
        Intent intent = new Intent(this, SuggestionActivity.class);
        startActivity(intent);
    }
}
