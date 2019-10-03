package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

    }
    public void noButton(View view) {
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
