package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SportTypeCardio extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_type_cardio);
        Bundle b = getIntent().getExtras();
        int i = b.getInt("INDEX", 0);


        ((TextView)findViewById(R.id.textView2))
                .setText(GlobalModelOfDays.getInstance().getDay(i).getNameFin());
        ((TextView)findViewById(R.id.textView3))
                .setText(GlobalModelOfDays.getInstance().getDay(i).getActivity());

        Random rand = new Random();
        int u = rand.nextInt(4);
        int t = rand.nextInt(4) + 4;
        int e = rand.nextInt(2) + 8;
        int f = rand.nextInt(2) + 10;
        if (GlobalModelOfDays.getInstance().getDay(i).getActivity().contains("Kestävyys")){
            ((TextView)findViewById(R.id.textView5))
                    .setText("Mietitkö kestävyyslajia?\n\n" + SuggestionList.getInstance().getSport(u).getDescription());
        }
        if (GlobalModelOfDays.getInstance().getDay(i).getActivity().contains("Voima")){
            ((TextView)findViewById(R.id.textView5))
                    .setText("Mietitkö voimalajia?\n\n" + SuggestionList.getInstance().getSport(t).getDescription());
        }
        if (GlobalModelOfDays.getInstance().getDay(i).getActivity().contains("Jooga")){
            ((TextView)findViewById(R.id.textView5))
                    .setText("Mietitkö joogatyyliä?\n\n" + SuggestionList.getInstance().getSport(e).getDescription());
        }
        if (GlobalModelOfDays.getInstance().getDay(i).getActivity().contains("Lepo")){
            ((TextView)findViewById(R.id.textView5))
                    .setText("Mietitkö lepotyyliä?\n\n" + SuggestionList.getInstance().getSport(f).getDescription());
        }

    }
    public void moveSuggestions(View view) {
        Intent intent = new Intent(this, SuggestionActivity.class);
        startActivity(intent);
    }
}
