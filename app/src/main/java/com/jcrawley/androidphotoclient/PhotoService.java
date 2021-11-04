package com.jcrawley.androidphotoclient;

import android.graphics.Bitmap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface PhotoService {
        @GET("/api/unknown")
        Call<Photo> listPhotos();

        @POST("/api/photos")
        Call<Photo> createPhoto(@Body Photo photo);

        @GET("/api/photos?")
        Call<Photo> getPhotos(@Query("page") String page);

        @FormUrlEncoded
        @POST("/api/photos?")
        Call<Photo> createPhotoWithField(@Field("name") String name, @Field("bitmap") Bitmap bitmap);
}
