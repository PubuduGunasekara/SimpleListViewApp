package com.example.simplelistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1- AdapterView
    ListView listView;

    //2- Data source
    String[] worldCup2022 = {"England", "USA","Germany","France","Argentina","Brazil","Italy","Spain"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_item);

        //3- creating the adapter
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                worldCup2022
        );

        listView.setAdapter(adapter);

    }
}