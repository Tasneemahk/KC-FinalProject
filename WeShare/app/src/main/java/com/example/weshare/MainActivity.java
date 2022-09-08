package com.example.weshare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Categories> categories = new ArrayList<>();
    ArrayList<Categories2> categories2s = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolBar = findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);

        Categories vehicles = new Categories(R.drawable.vehicles,"Vehicles");
        Categories sport = new Categories(R.drawable.sport,"Sports");
        Categories study = new Categories(R.drawable.study,"Education");

        categories.add(vehicles);
        categories.add(sport);
        categories.add(study);

        ListView frstCatList = findViewById(R.id.frst);
        Adapter adapter = new Adapter1(this,0,categories);
        frstCatList.setAdapter((ListAdapter) adapter);


        Categories2 home = new Categories2(R.drawable.home,"Home");
        Categories2 mech = new Categories2(R.drawable.mechs,"Tools");
        Categories2 devices= new Categories2(R.drawable.devices,"Electronics");

        categories2s.add(home);
        categories2s.add(mech);
        categories2s.add(devices);

        ListView scndCatList = findViewById(R.id.scnd);
        Adapter adapter2 = new Adapter2(this,0,categories2s);
        scndCatList.setAdapter((ListAdapter) adapter2);

        scndCatList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent plane1= new Intent(MainActivity.this,CategoryItems.class);
                startActivity(plane1);
            }
        });
        frstCatList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent plane2= new Intent(MainActivity.this,CategoryItems.class);
                startActivity(plane2);
            }
        });



    }
}