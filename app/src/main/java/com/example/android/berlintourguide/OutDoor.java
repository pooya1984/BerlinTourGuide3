package com.example.android.berlintourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OutDoor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word(getApplicationContext().getString(R.string.category_Tier_Park), getApplicationContext().getString(R.string.Adress_U_Tier_Park), R.drawable.tier_park));
        Words.add(new Word(getApplicationContext().getString(R.string.fernsehturm), getApplicationContext().getString(R.string.Adress_Alexander_Platz), R.drawable.tv_tower));
        Words.add(new Word(getApplicationContext().getString(R.string.Berlin_Wall),getApplicationContext().getString(R.string.Adress_Warschauer_Straße), R.drawable.berlin_wall));
        Words.add(new Word(getApplicationContext().getString(R.string.Broken_church),getApplicationContext().getString(R.string.Adress_zooloogische_Garten), R.drawable.brocken_church));


        WordAdapter adapter = new WordAdapter(this, Words,R.color.category_outDoor);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);}}