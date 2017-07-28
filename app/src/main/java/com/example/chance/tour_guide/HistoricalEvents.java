package com.example.chance.tour_guide;

/**
 * Created by chance on 7/28/17.
 */

public class HistoricalEvents {
    private String mEventDate;
    private String mEventTitle;
    private String mEventDetails;
    private int mImageResourceId;
    private String URL;


    public HistoricalEvents(String mEventDate, String mEventTitle, String mEventDetails, String URL, int mImageResourceId) {
        this.mEventTitle = mEventTitle;
        this.mEventDetails = mEventDetails;
        this.mEventDate = mEventDate;
        this.URL = URL;
        this.mImageResourceId = mImageResourceId;

    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }



    public String getmEventDate() {
        return mEventDate;
    }

    public void setmEventDate(String mEventDate) {
        this.mEventDate = mEventDate;
    }

    public String getmEventTitle() {
        return mEventTitle;
    }

    public void setmEventTitle(String mEventTitle) {
        this.mEventTitle = mEventTitle;
    }

    public String getmEventDetails() {
        return mEventDetails;
    }

    public void setmEventDetails(String mEventDetails) {
        this.mEventDetails = mEventDetails;
    }
}
