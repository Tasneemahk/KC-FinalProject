package com.example.weshare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ArrayAdapterAdd2 extends ArrayAdapter {
    List<Categories2> comboBox2;

    public ArrayAdapterAdd2(@NonNull Context context, int resource, @NonNull List<Categories2> objects) {
        super(context, resource, objects);
        comboBox2 = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view5 = LayoutInflater.from(parent.getContext()).inflate(R.layout.dropdown_cat,parent,false);
        Categories2 currentBox = comboBox2.get(position);

        TextView item = view5.findViewById(R.id.box);

        item.setText(currentBox.getCatLabel2());
        return view5;
    }
}
