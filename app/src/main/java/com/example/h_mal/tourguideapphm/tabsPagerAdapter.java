package com.example.h_mal.tourguideapphm;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by h_mal on 11/02/2017.
 */

public class tabsPagerAdapter extends FragmentPagerAdapter{


    private Context mContext;

    public tabsPagerAdapter(MainActivity context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public tabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new FoodFragment();
        }else if (position == 1){
            return new HistoricalFragment();
        }else if (position == 2){
            return new AttractionsFragment();
        }else {
            return new AccommodationFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_food);
        }else if (position == 1){
            return mContext.getString(R.string.category_historical);
        }else if (position == 2){
            return mContext.getString(R.string.category_attractions);
        }else {
            return mContext.getString(R.string.category_accommodation);
        }
    }


}
