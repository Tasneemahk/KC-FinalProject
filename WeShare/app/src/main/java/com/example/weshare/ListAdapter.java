package com.example.weshare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter {

    List<ListPosts> listPostsOver;


    public ListAdapter(@NonNull Context context, int resource, @NonNull List<ListPosts> objects) {
        super(context, resource, objects);
        listPostsOver = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view6 = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_posts,parent,false);
        ListPosts currentList = listPostsOver.get(position);

        ListView list = view6.findViewById(R.id.postsListViewXML);





        return view6;
    }
}
