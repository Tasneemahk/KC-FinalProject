package com.example.weshare;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.io.Serializable;


public class PostsFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view9 = inflater.inflate(R.layout.dropdown_cat,container,false);
        Serializable list1 = getArguments().getSerializable("list1");
        Serializable list2 = getArguments().getSerializable("list2");
        ImageButton add = view9.findViewById(R.id.addBtnP);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(), AddPost.class);
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("list1",list1);
                bundle2.putSerializable("list2",list2);
                intent2.putExtra("bundle",bundle2);
                startActivity(intent2);

            }
        });

        return view9;
    }
}