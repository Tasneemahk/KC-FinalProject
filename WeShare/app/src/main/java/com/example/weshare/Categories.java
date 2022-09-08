package com.example.weshare;

import java.io.Serializable;

public class Categories implements Serializable {

    private int catIMG;
    private String catLabel;

    public Categories(int catIMG, String catLabel) {
        this.catIMG = catIMG;
        this.catLabel = catLabel;
    }


    public int getCatIMG() {
        return catIMG;
    }

    public void setCatIMG(int catIMG) {
        this.catIMG = catIMG;
    }

    public String getCatLabel() {
        return catLabel;
    }

    public void setCatLabel(String catLabel) {
        this.catLabel = catLabel;
    }
}
