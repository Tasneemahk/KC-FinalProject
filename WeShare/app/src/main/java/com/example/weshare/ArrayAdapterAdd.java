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

public class ArrayAdapterAdd extends ArrayAdapter {
    List<Categories> comboBox1;

    public ArrayAdapterAdd(@NonNull Context context, int resource, @NonNull List<Categories> objects) {
        super(context, resource, objects);
        comboBox1 = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view5 = LayoutInflater.from(parent.getContext()).inflate(R.layout.dropdown_cat,parent,false);
        Categories currentBox = comboBox1.get(position);

        TextView item = view5.findViewById(R.id.box);

        item.setText(currentBox.getCatLabel());
        return view5;
    }
}
