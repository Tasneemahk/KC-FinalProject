package com.example.weshare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter1 extends ArrayAdapter<Categories> {
    List<Categories> frstListOver;

    public Adapter1(@NonNull Context context, int resource, @NonNull List<Categories> objects) {
        super(context, resource, objects);
        frstListOver = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.frstlist,parent,false);
        Categories currentCat = frstListOver.get(position);

        TextView title = view.findViewById(R.id.categoryL);
        ImageView IMG = view.findViewById(R.id.categoryIMG);


        title.setText(currentCat.getCatLabel());
        IMG.setImageResource(currentCat.getCatIMG());

        return view;

    }

}
