package com.example.weshare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddPost extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        Serializable list1 = getIntent().getSerializableExtra("list1");
        Serializable list2 = getIntent().getSerializableExtra("list2");








        Spinner comboBox = findViewById(R.id.spinner1);
        Adapter choiceAdapter = new ArrayAdapterAdd(this,0, (List<Categories>) list1);
        Adapter choiceAdapter2 = new ArrayAdapterAdd2(this, 0 , (List<Categories2>) list2);
        comboBox.setAdapter((SpinnerAdapter) choiceAdapter);
        comboBox.setAdapter((SpinnerAdapter) choiceAdapter2);

        comboBox.setOnItemSelectedListener(this);



        

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}