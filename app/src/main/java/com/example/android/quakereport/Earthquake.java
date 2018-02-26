package com.example.android.quakereport;

/**
 * Created by pranav on 2/24/2018.
 */

public class Earthquake {

    private  String mLocation;

    private  long mTimeInMilliseconds;

    private double mMagnitude;

    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {return mMagnitude;}

    public String getLocation(){ return mLocation; }

    public long getTimeInMilliseconds() {return mTimeInMilliseconds;}
}
