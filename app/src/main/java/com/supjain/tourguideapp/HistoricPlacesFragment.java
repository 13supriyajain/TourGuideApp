package com.supjain.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * This custom Fragment class is for displaying the list of historic places in Indore city.
 */
public class HistoricPlacesFragment extends Fragment {

    public HistoricPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<LocationDetails> locations = new ArrayList<>();
        locations.add(new LocationDetails(R.drawable.rajwada,
                getString(R.string.rajwada_name),
                getString(R.string.rajwada_description),
                getString(R.string.rajwada_address),
                getString(R.string.rajwada_hours)));
        locations.add(new LocationDetails(R.drawable.lal_bagh,
                getString(R.string.lal_bagh_name),
                getString(R.string.lal_bagh_description),
                getString(R.string.lal_bagh_address),
                getString(R.string.lal_bagh_hours)));
        locations.add(new LocationDetails(R.drawable.museum,
                getString(R.string.museum_name),
                getString(R.string.museum_description),
                getString(R.string.museum_address),
                getString(R.string.museum_hours)));
        locations.add(new LocationDetails(R.drawable.zoo,
                getString(R.string.zoo_name),
                getString(R.string.zoo_description),
                getString(R.string.zoo_address),
                getString(R.string.zoo_hours)));
        locations.add(new LocationDetails(R.drawable.ganesh_temple,
                getString(R.string.kgt_name),
                getString(R.string.kgt_description),
                getString(R.string.kgt_address),
                getString(R.string.kgt_hours)));
        locations.add(new LocationDetails(R.drawable.annapurna_temple,
                getString(R.string.at_name),
                getString(R.string.at_description),
                getString(R.string.at_address),
                getString(R.string.at_hours)));
        locations.add(new LocationDetails(R.drawable.krishnapura_chhatri,
                getString(R.string.kpc_name),
                getString(R.string.kpc_description),
                getString(R.string.kpc_address),
                getString(R.string.kpc_hours)));
        locations.add(new LocationDetails(R.drawable.gandhi_hall,
                getString(R.string.hall_name),
                getString(R.string.hall_description),
                getString(R.string.hall_address),
                getString(R.string.hall_hours)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_history, -1);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
