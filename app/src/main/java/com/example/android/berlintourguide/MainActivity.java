package com.example.android.berlintourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



//onClickListener to show historyList
    public void historyList(View view) {

//Find the view which shows the history category
        TextView history = (TextView) findViewById(R.id.history);

//Set a click listener on that view
        history.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be called when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent historyIntent = new Intent(MainActivity.this, History.class);
                startActivity(historyIntent);
            }

        });
    }

    //onClickListener to show outdoorList
    public void outDoorList (View view) {

//Find the view which shows the outdoor category
        TextView outdoor = (TextView) findViewById(R.id.out_door);

//Set a click listener on that view
        outdoor.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be called when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent outDoorIntent = new Intent(MainActivity.this, OutDoor.class);
                startActivity(outDoorIntent);
            }

        });
    }

    //onClickListener to show dinnerList
    public void dinnerList(View view) {

//Find the view which shows the dinner category
        TextView dinner = (TextView) findViewById(R.id.dinner);

//Set a click listener on that view
        dinner.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be called when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent dinnerIntent = new Intent(MainActivity.this, Dinner.class);
                startActivity(dinnerIntent);
            }

        });
    }

    //onClickListener to show sportList
    public void sportList(View view) {

//Find the view which shows the sport category
        TextView sport = (TextView) findViewById(R.id.sport);

//Set a click listener on that view
        sport.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be called when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent sportIntent = new Intent(MainActivity.this, Sport.class);
                startActivity(sportIntent);
            }

        });
    }}