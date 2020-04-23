package com.titi.inspiration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class who_are_you_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_are_you_);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
