package com.example.android.berlintourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Sport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word(getApplicationContext().getString(R.string.Ice_Hoky), getApplicationContext().getString(R.string.Adress_Reinickendorf), R.drawable.ice_hocky));
        Words.add(new Word(getApplicationContext().getString(R.string.Golf),getApplicationContext().getString(R.string.Adress_Spandau), R.drawable.golf));
        Words.add(new Word(getApplicationContext().getString(R.string.Tenesiy), getApplicationContext().getString(R.string.Adress_Steglitz), R.drawable.tennis));
        Words.add(new Word(getApplicationContext().getString(R.string.jogging),getApplicationContext().getString(R.string.Adress_Tier_Garten), R.drawable.jogging));


        WordAdapter adapter = new WordAdapter(this, Words,R.color.category_sport);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);}}