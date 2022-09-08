package com.example.weshare;

import java.io.Serializable;

public class Categories2 implements Serializable {

    private int catIMG2;
    private String catLabel2;

    public Categories2(int catIMG2, String catLabel2) {
        this.catIMG2 = catIMG2;
        this.catLabel2 = catLabel2;
    }

    public int getCatIMG2() {
        return catIMG2;
    }

    public void setCatIMG2(int catIMG2) {
        this.catIMG2 = catIMG2;
    }

    public String getCatLabel2() {
        return catLabel2;
    }

    public void setCatLabel2(String catLabel2) {
        this.catLabel2 = catLabel2;
    }
}
