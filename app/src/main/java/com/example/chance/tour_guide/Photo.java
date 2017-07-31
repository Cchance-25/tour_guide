package com.example.chance.tour_guide;

/**
 * Created by chance on 7/29/17.
 */

public class Photo {

    private String mDesc;
    private int mImageResourceId;

    public Photo(String mDesc, int mImageResourceId) {
        this.mDesc = mDesc;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
