package com.titi.inspiration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class the_real_you_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_real_you_);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
