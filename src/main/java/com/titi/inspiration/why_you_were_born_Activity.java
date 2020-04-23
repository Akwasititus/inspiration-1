package com.titi.inspiration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class why_you_were_born_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.why_you_were_born);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
