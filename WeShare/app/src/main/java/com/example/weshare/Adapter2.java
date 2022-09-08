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

public class Adapter2 extends ArrayAdapter<Categories2> {
    List<Categories2> scndListOver;

    public Adapter2(@NonNull Context context, int resource, @NonNull List<Categories2> objects) {
        super(context, resource, objects);
        scndListOver = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.frstlist,parent,false);
        Categories2 currentCat2 = scndListOver.get(position);

        TextView title2 = view.findViewById(R.id.categoryL);
        ImageView IMG2 = view.findViewById(R.id.categoryIMG);

        title2.setText(currentCat2.getCatLabel2());
        IMG2.setImageResource(currentCat2.getCatIMG2());

        return view;
    }
}
