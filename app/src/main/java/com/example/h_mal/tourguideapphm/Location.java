package com.example.h_mal.tourguideapphm;

/**
 * Created by h_mal on 11/02/2017.
 */

public class Location {
    /**Locations name*/
    private String mLocationName;

    /**Locations Address*/
    private String mLocationAddress;

    /**Locations name*/
    private int mLocationImage = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    @Override
    public String toString() {
        return "Location{" +
                "mLocationName='" + mLocationName + '\'' +
                ", mLocationAddress='" + mLocationAddress + '\'' +
                ", mLocationImage=" + mLocationImage + '}';
    }

    public Location (String locationName, String locationAddress, int locationImage){
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationImage = locationImage;
    }

    public Location (String locationName, String locationAddress){
        mLocationName = locationName;
        mLocationAddress = locationAddress;
    }

    /**get Location Name*/
    public String getLocationName(){
        return mLocationName;
    }

    /**get location address*/
    public String getLocationAddress(){
        return mLocationAddress;
    }

    /**get Image Resource Id*/
    public int getLocationImage(){
        return mLocationImage;
    }

    public boolean hasImage(){
        return mLocationImage != NO_IMAGE_PROVIDED;
    }

}
