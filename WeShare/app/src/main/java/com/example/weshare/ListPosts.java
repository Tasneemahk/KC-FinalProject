package com.example.weshare;

import android.widget.ListView;

public class ListPosts {
    private ListView list;

    public ListPosts(ListView list) {
        this.list = list;
    }

    public ListView getList() {
        return list;
    }

    public void setList(ListView list) {
        this.list = list;
    }
}
