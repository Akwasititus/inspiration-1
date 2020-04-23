package com.titi.inspiration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn, btna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent titi = new Intent(getApplicationContext(),get_started_Activity.class);
                startActivity(titi);

    }
});
        btna = findViewById(R.id.btna);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent holy___drizzle = new Intent(getApplicationContext(),about_Activity.class);
                startActivity(holy___drizzle);
            }
        });


    }}
