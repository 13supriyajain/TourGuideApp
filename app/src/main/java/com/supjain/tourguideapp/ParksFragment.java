package com.supjain.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * This custom Fragment class is for displaying the list of parks in Indore city.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        final int NO_IMAGE = -1;

        ArrayList<LocationDetails> locations = new ArrayList<>();
        locations.add(new LocationDetails(NO_IMAGE,
                getString(R.string.amuza_name),
                null,
                getString(R.string.amuza_address),
                getString(R.string.amuza_hours)));
        locations.add(new LocationDetails(NO_IMAGE,
                getString(R.string.mbw_name),
                null,
                getString(R.string.mbw_address),
                getString(R.string.mbw_hours)));
        locations.add(new LocationDetails(NO_IMAGE,
                getString(R.string.aag_name),
                null,
                getString(R.string.aag_address),
                getString(R.string.aag_hours)));
        locations.add(new LocationDetails(NO_IMAGE,
                getString(R.string.cw_name),
                null,
                getString(R.string.cw_address),
                getString(R.string.cw_hours)));
        locations.add(new LocationDetails(NO_IMAGE,
                getString(R.string.scw_name),
                null,
                getString(R.string.scw_address),
                getString(R.string.scw_hours)));
        locations.add(new LocationDetails(NO_IMAGE,
                getString(R.string.ndw_name),
                null,
                getString(R.string.ndw_address),
                getString(R.string.ndw_hours)));
        locations.add(new LocationDetails(NO_IMAGE,
                getString(R.string.sap_name),
                null,
                getString(R.string.sap_address),
                getString(R.string.sap_hours)));
        locations.add(new LocationDetails(NO_IMAGE,
                getString(R.string.cd_name),
                null,
                getString(R.string.cd_address),
                getString(R.string.cd_hours)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_parks, R.drawable.park);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}