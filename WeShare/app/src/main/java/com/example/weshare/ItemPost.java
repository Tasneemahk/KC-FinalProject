package com.example.weshare;

import java.io.Serializable;

public class ItemPost implements Serializable {
    private int ItemPicPost;
    private String postCat;
    private String ItemNamePost;
    private String ItemDescriptionPost;
    private String fromTimePost;
    private String toTimePost;
    private String ItemLocationPost;
    private String contactItemPost;


    public ItemPost(int itemPicPost, String postCat, String itemNamePost, String itemDescriptionPost, String fromTimePost, String toTimePost, String itemLocationPost, String contactItemPost) {
        ItemPicPost = itemPicPost;
        this.postCat = postCat;
        ItemNamePost = itemNamePost;
        ItemDescriptionPost = itemDescriptionPost;
        this.fromTimePost = fromTimePost;
        this.toTimePost = toTimePost;
        ItemLocationPost = itemLocationPost;
        this.contactItemPost = contactItemPost;
    }


    public int getItemPicPost() {
        return ItemPicPost;
    }

    public void setItemPicPost(int itemPicPost) {
        ItemPicPost = itemPicPost;
    }

    public String getPostCat() {
        return postCat;
    }

    public void setPostCat(String postCat) {
        this.postCat = postCat;
    }

    public String getItemNamePost() {
        return ItemNamePost;
    }

    public void setItemNamePost(String itemNamePost) {
        ItemNamePost = itemNamePost;
    }

    public String getItemDescriptionPost() {
        return ItemDescriptionPost;
    }

    public void setItemDescriptionPost(String itemDescriptionPost) {
        ItemDescriptionPost = itemDescriptionPost;
    }

    public String getFromTimePost() {
        return fromTimePost;
    }

    public void setFromTimePost(String fromTimePost) {
        this.fromTimePost = fromTimePost;
    }

    public String getToTimePost() {
        return toTimePost;
    }

    public void setToTimePost(String toTimePost) {
        this.toTimePost = toTimePost;
    }

    public String getItemLocationPost() {
        return ItemLocationPost;
    }

    public void setItemLocationPost(String itemLocationPost) {
        ItemLocationPost = itemLocationPost;
    }

    public String getContactItemPost() {
        return contactItemPost;
    }

    public void setContactItemPost(String contactItemPost) {
        this.contactItemPost = contactItemPost;
    }
}
