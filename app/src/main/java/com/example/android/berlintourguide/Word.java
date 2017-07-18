package com.example.android.berlintourguide;

/**
 * Created by Pooya noD on 6/9/2017.
 */

public class Word {
    private String mNameOfPlace;

    private String mAdressOfPlace;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String nameOfPlace, String adressOfPlace,int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mAdressOfPlace = adressOfPlace;
        mImageResourceId = imageResourceId;
    }



    public String getNameOfPlace() {
        return mNameOfPlace;
    }
    public String getAdressOfPlace() {
        return mAdressOfPlace;
    }
    public int getImageResourceId(){return mImageResourceId;}

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }}