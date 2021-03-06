package com.example.android.quakereport;

/**
 * Created by pranav on 2/24/2018.
 */

public class Earthquake {

    private  String mLocation;

    private  long mTimeInMilliseconds;

    private double mMagnitude;

    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl=url;
    }

    public double getMagnitude() {return mMagnitude;}

    public String getLocation(){ return mLocation; }

    public long getTimeInMilliseconds() {return mTimeInMilliseconds;}

    public String getUrl(){ return mUrl; }
}
