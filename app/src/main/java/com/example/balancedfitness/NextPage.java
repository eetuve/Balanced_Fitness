package com.example.balancedfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
    }
    public void moveOn(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
