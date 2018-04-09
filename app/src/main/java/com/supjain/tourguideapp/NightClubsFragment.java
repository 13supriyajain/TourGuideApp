package com.supjain.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * This custom Fragment class is for displaying the list of night clubs in Indore city.
 */
public class NightClubsFragment extends Fragment {

    public NightClubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<LocationDetails> locations = new ArrayList<>();
        locations.add(new LocationDetails(getString(R.string.ego_name),
                getString(R.string.ego_address),
                getString(R.string.ego_phone),
                getString(R.string.ego_hours)));
        locations.add(new LocationDetails(getString(R.string.calypso_name),
                getString(R.string.calypso_address),
                getString(R.string.calypso_phone),
                getString(R.string.calypso_hours)));
        locations.add(new LocationDetails(getString(R.string.temp_name),
                getString(R.string.temp_address),
                getString(R.string.temp_phone),
                getString(R.string.temp_hours)));
        locations.add(new LocationDetails(getString(R.string.silver_name),
                getString(R.string.silver_address),
                getString(R.string.silver_phone),
                getString(R.string.silver_hours)));
        locations.add(new LocationDetails(getString(R.string.chazers_name),
                getString(R.string.chazers_address),
                getString(R.string.chazers_phone),
                getString(R.string.chazers_hours)));
        locations.add(new LocationDetails(getString(R.string.legend_name),
                getString(R.string.legend_address),
                getString(R.string.legend_phone),
                getString(R.string.legend_hours)));
        locations.add(new LocationDetails(getString(R.string.mustang_name),
                getString(R.string.mustang_address),
                getString(R.string.mustang_phone),
                getString(R.string.mustang_hours)));
        locations.add(new LocationDetails(getString(R.string.woodstock_name),
                getString(R.string.woodstock_address),
                getString(R.string.woodstock_phone),
                getString(R.string.woodstock_hours)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), locations, R.color.category_clubs, R.drawable.night_club);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
