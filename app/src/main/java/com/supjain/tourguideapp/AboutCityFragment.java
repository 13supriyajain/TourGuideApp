package com.supjain.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * This custom Fragment class is for displaying about_city_text.xml layout file content.
 */
public class AboutCityFragment extends Fragment {

    public AboutCityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.about_city_text, container, false);
    }
}
