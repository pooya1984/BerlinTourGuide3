package com.example.android.berlintourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word(getApplicationContext().getString(R.string.Burger_King), getApplicationContext().getString(R.string.Adress_Potsdamer_Platz),R.drawable.burger_king));
        Words.add(new Word(getApplicationContext().getString(R.string.Vapiano), getApplicationContext().getString(R.string.Adress_Alexander_Platz),R.drawable.vapiano));
        Words.add(new Word(getApplicationContext().getString(R.string.Sakura), getApplicationContext().getString(R.string.Adress_Kurfürstenstraße), R.drawable.sakura));
        Words.add(new Word(getApplicationContext().getString(R.string.Burrito_Berlin), getApplicationContext().getString(R.string.Adress_Nollendorfstrasse), R.drawable.burrito));


        WordAdapter adapter = new WordAdapter(this, Words,R.color.category_dinner);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);}}