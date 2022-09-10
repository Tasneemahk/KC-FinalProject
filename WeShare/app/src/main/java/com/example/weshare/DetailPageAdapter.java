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

public class DetailPageAdapter extends ArrayAdapter {
    List<ItemPost> itemPostsOver;

    public DetailPageAdapter(@NonNull Context context, int resource, @NonNull List<ItemPost> objects) {
        super(context, resource, objects);
        itemPostsOver = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view7 = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_post_details,parent,false);
        ItemPost currentDetail = itemPostsOver.get(position);




        ImageView imageAdapter = view7.findViewById(R.id.imageView7);
        TextView nameAdapter= view7.findViewById(R.id.itemNameDetails);
        TextView categoryAdapter= view7.findViewById(R.id.category);
        TextView descriptionAdapter = view7.findViewById(R.id.descriptionOutput);
        TextView locationAdapter = view7.findViewById(R.id.locationDetails);
        TextView availableAdapter = view7.findViewById(R.id.timeDetails);
        TextView contactAdapter = view7.findViewById(R.id.numberDetails);


        imageAdapter.setImageResource(currentDetail.getItemPicPost());
        nameAdapter.setText(currentDetail.getItemNamePost());
        categoryAdapter.setText(currentDetail.getPostCat());
        descriptionAdapter.setText(currentDetail.getItemDescriptionPost());
        locationAdapter.setText(currentDetail.getItemLocationPost());
        availableAdapter.setText(currentDetail.getFromTimePost());
        contactAdapter.setText(currentDetail.getContactItemPost());

        return view7;
    }
}
