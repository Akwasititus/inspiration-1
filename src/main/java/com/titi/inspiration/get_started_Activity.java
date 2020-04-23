package com.titi.inspiration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class get_started_Activity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started_);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listView = findViewById(R.id.list);

        ArrayList<String> titi =new ArrayList<>();

        titi.add("VICTORY THROUGH JESUS");
        titi.add("POSITIVE THINKING");
        titi.add("THE THREE FOLD NATURE OF MAN");
        titi.add("HOW TO STAND AGAINST THE DEVILS STRATEGIES");
        titi.add("PRAYING THE RIGHT WAY  PART I");
        titi.add("PRAYING THE RIGHT WAY  PART II");
        titi.add("PRAYING THE RIGHT WAY  PART III");
        titi.add("SELF DEVELOPMENT PART I");
        titi.add("SELF DEVELOPMENT PART II");
        titi.add("SELF DEVELOPMENT PART III");
        titi.add("HAVE YOU EVER ROBED GOD");
        titi.add("THE BOOK OF LIFE PART I");
        titi.add("THE BOOK OF LIFE PART II");
        titi.add("WHY YOU WERE BORN PART I");
        titi.add("WHY YOU WERE BORN PART II");
        titi.add("WHY YOU WERE BORN PART III");
        titi.add("THE REAL YOU PART I");
        titi.add("THE REAL YOU PART II");
        titi.add("THE REAL YOU PART III");
        titi.add("THE REAL YOU PART IIII");





        ArrayAdapter titus = new ArrayAdapter(this, android.R.layout.simple_list_item_1,titi);
        listView.setAdapter(titus);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {

                    Intent beatrice = new Intent(view.getContext(),victory_through_jesus_Activity.class);
                    startActivity(beatrice);
                    Toast.makeText(getApplicationContext(), "Dr. MYLES MUNROE", Toast.LENGTH_SHORT).show();

                }

                if(position == 1) {

                    Intent asare = new Intent(view.getContext(),positive_thinking_Activity.class);
                    startActivity(asare);

                    Toast.makeText(getApplicationContext(),"A. TITUS",Toast.LENGTH_SHORT).show();

                }

                if(position == 2) {

                    Intent titus = new Intent(view.getContext(),the_three_fold_nature_of_man_Activity.class);
                    startActivity(titus);

                    Toast.makeText(getApplicationContext(),"A. TITUS",Toast.LENGTH_SHORT).show();

                }

                if(position == 3) {

                    Intent beatrice_asare = new Intent(view.getContext(),stand_against_devils_strategies_Activity.class);
                    startActivity(beatrice_asare);

                    Toast.makeText(getApplicationContext(),"KENNETH COPELANDNN",Toast.LENGTH_SHORT).show();
                }

                if(position == 4) {

                    Intent beatrice_asare = new Intent(view.getContext(),praying_the_right_way_part_i_Activity.class);
                    startActivity(beatrice_asare);

                    Toast.makeText(getApplicationContext(),"O. B. Daniel",Toast.LENGTH_SHORT).show();
                }

                if(position == 5) {

                    Intent titi = new Intent(view.getContext(),praying_the_right_way_part_IIActivity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(),"O. B. Daniel",Toast.LENGTH_SHORT).show();
                }

                if(position == 6) {

                    Intent titi = new Intent(view.getContext(),praying_the_right_way_III_Activity.class);
                    startActivity(titi);
                    Toast.makeText(getApplicationContext(),"O. B. Daniel",Toast.LENGTH_SHORT).show();
                }


                if(position == 7) {

                    Intent titi = new Intent(view.getContext(),self_devolopment_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(),"O. B. Daniel",Toast.LENGTH_SHORT).show();

                }

                if(position == 8) {

                    Intent titi = new Intent(view.getContext(),self_dev_II_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(),"O. B. Daniel",Toast.LENGTH_SHORT).show();

                }

                if(position == 9) {

                    Intent titi = new Intent(view.getContext(), self_dev_III_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "O. B. Daniel", Toast.LENGTH_LONG).show();

                }

                if(position == 10) {

                    Intent titi = new Intent(view.getContext(), have_you_rob_god_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "A. Titus", Toast.LENGTH_LONG).show();

                }

                if(position == 11) {

                    Intent titi = new Intent(view.getContext(), book_of_life_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), " W. Max Alderman", Toast.LENGTH_LONG).show();

                }

                if(position == 12) {

                    Intent titi = new Intent(view.getContext(), book_of_life_ii_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), " W. Max Alderman", Toast.LENGTH_LONG).show();

                }


                if(position == 13) {

                    Intent titi = new Intent(view.getContext(), why_you_were_born_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "Dr. MYLES MUNROE", Toast.LENGTH_LONG).show();

                }

                if(position == 14) {

                    Intent titi = new Intent(view.getContext(), why_you_were_born_II_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "Dr. MYLES MUNROE", Toast.LENGTH_LONG).show();

                }


                if(position == 15) {

                    Intent titi = new Intent(view.getContext(), who_are_you_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "Dr. MYLES MUNROE", Toast.LENGTH_LONG).show();

                }


                if(position == 16) {

                    Intent titi = new Intent(view.getContext(), the_real_you_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "Dr. MYLES MUNROE", Toast.LENGTH_LONG).show();

                }


                if(position == 17) {

                    Intent titi = new Intent(view.getContext(), you_came_out_of_god_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "Dr. MYLES MUNROE", Toast.LENGTH_LONG).show();

                }


                if(position == 18) {

                    Intent titi = new Intent(view.getContext(), god_pronouses_what_he_sees_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "Dr. MYLES MUNROE", Toast.LENGTH_LONG).show();

                }


                if(position == 19) {

                    Intent titi = new Intent(view.getContext(), what_does_god_see_you_Activity.class);
                    startActivity(titi);

                    Toast.makeText(getApplicationContext(), "Dr. MYLES MUNROE", Toast.LENGTH_LONG).show();

                }



            }
        });





    }
}
