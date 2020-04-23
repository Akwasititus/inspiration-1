package com.titi.inspiration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class positive_thinking_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive_thinking_);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
