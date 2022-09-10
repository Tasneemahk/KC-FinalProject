package com.example.weshare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.Serializable;

public class CategoryItems extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_items);
        ImageButton add = findViewById(R.id.addBtnP);
        ImageView back = findViewById(R.id.backP);
        Serializable list1 = getIntent().getSerializableExtra("list1");
        Serializable list2 = getIntent().getSerializableExtra("list2");
        Intent intent = new Intent(CategoryItems.this,PostsFragment.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("list1",list1);
        bundle.putSerializable("list2",list2);
        intent.putExtra("list1",bundle);
        startActivity(intent);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        replaceFragment(new PostsFragment());

        navigation.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {

                case R.id.postsMenu:
                    replaceFragment(new PostsFragment());
                    break;
                case R.id.requestsMenu:
                    replaceFragment(new RequestsFragment());
                    break;
            }
            return true;
        });


    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transcriptFragment = fragmentManager.beginTransaction();
        transcriptFragment.replace(R.id.frame_layout, fragment);
        transcriptFragment.commit();

    }



}