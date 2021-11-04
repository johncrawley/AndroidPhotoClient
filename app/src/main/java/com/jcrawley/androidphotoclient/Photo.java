package com.jcrawley.androidphotoclient;

import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

public class Photo {


    @SerializedName("id") private final Long id;
    @SerializedName("bitmap") private final Bitmap bitmap;
    @SerializedName("name") private final String name;

    public Photo(Long id, Bitmap bitmap, String name){
        this.id = id;
        this.bitmap = bitmap;
        this.name = name;
    }

    public Bitmap getBitmap(){
        return bitmap;
    }

    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }
}
