package com.bluehat.mystadion.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class StadionModel{
    String title, content, chairs, location;
    int image[][];

    public StadionModel(String title, String content, int[][] image) {
        this.title = title;
        this.content = content;
        this.image = image;
    }

    public StadionModel() {
    }

    public StadionModel(String title, String content, String chairs, String location, int[][] image) {
        this.title = title;
        this.content = content;
        this.chairs = chairs;
        this.location = location;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getChairs() {
        return chairs;
    }

    public void setChairs(String chairs) {
        this.chairs = chairs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int[][] getImage() {
        return image;
    }

    public int getImage(int i, int j){
        return image[i][j];
    }

    public void setImage(int[][] image) {
        this.image = image;
    }
}
