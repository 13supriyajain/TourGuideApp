package com.supjain.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * This custom Fragment class is for displaying the list of restaurants in Indore city.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<LocationDetails> locations = new ArrayList<>();
        locations.add(new LocationDetails(getString(R.string.shreemaya_name),
                getString(R.string.shreemaya_address),
                getString(R.string.shreemaya_phone),
                getString(R.string.shreemaya_hours)));
        locations.add(new LocationDetails(getString(R.string.kebabsville_name),
                getString(R.string.kebabsville_address),
                getString(R.string.kebabsville_phone),
                getString(R.string.kebabsville_hours)));
        locations.add(new LocationDetails(getString(R.string.chotiwala_name),
                getString(R.string.chotiwala_address),
                getString(R.string.chotiwala_phone),
                getString(R.string.chotiwala_hours)));
        locations.add(new LocationDetails(getString(R.string.johny_name),
                getString(R.string.johny_address),
                getString(R.string.johny_phone),
                getString(R.string.johny_hours)));
        locations.add(new LocationDetails(getString(R.string.alav_name),
                getString(R.string.alav_address),
                getString(R.string.alav_phone),
                getString(R.string.alav_hours)));
        locations.add(new LocationDetails(getString(R.string.sayaji_name),
                getString(R.string.sayaji_address),
                getString(R.string.sayaji_phone),
                getString(R.string.sayaji_hours)));
        locations.add(new LocationDetails(getString(R.string.oye_name),
                getString(R.string.oye_address),
                getString(R.string.oye_phone),
                getString(R.string.oye_hours)));
        locations.add(new LocationDetails(getString(R.string.guru_name),
                getString(R.string.guru_address),
                getString(R.string.guru_phone),
                getString(R.string.guru_hours)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), locations, R.color.category_restaurants, R.drawable.restaurant);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}