package com.example.weshare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.weshare.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CategoryItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_items);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        replaceFragment(new PostsFragment());

        navigation.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){

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