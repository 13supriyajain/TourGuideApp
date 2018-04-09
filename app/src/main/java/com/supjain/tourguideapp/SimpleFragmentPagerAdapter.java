package com.supjain.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * This custom FragmentPagerAdapter class is for returning custom Fragment class objects and page titles
 * based on which page/fragment user is viewing currently.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    // For storing context of the app
    private Context mContext;

    // Parametrized constructor of this class to create its object
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Generate custom Fragment class object based on item position
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutCityFragment();
        } else if (position == 1) {
            return new HistoricPlacesFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else if (position == 3) {
            return new RestaurantsFragment();
        } else {
            return new NightClubsFragment();
        }
    }

    // Generate title based on item position
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.about_city_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.historic_places_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.parks_fragment);
        } else if (position == 3) {
            return mContext.getString(R.string.restaurants_fragment);
        } else {
            return mContext.getString(R.string.night_clubs_fragment);
        }
    }

    // Return count/number of Fragments/Pages present for the app
    @Override
    public int getCount() {
        return 5;
    }
}
