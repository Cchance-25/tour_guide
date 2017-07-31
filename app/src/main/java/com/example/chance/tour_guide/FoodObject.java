package com.example.chance.tour_guide;

/**
 * Created by chance on 7/30/17.
 */

public class FoodObject {

    private String mFoodName;
    private int mFoodImageResourceId;
    private String mFoodURL;

    public FoodObject(String mFoodName, String url, int mFoodImageResourceId) {
        this.mFoodName = mFoodName;
        this.mFoodURL = url;
        this.mFoodImageResourceId = mFoodImageResourceId;
    }

    public String getmFoodName() {
        return mFoodName;
    }

    public void setmFoodName(String mFoodName) {
        this.mFoodName = mFoodName;
    }

    public String getmFoodURL() {
        return mFoodURL;
    }

    public void setmFoodURL(String mFoodURL) {
        this.mFoodURL = mFoodURL;
    }

    public int getmFoodImageResourceId() {
        return mFoodImageResourceId;
    }

    public void setmFoodImageResourceId(int mFoodImageResourceId) {
        this.mFoodImageResourceId = mFoodImageResourceId;
    }
}
