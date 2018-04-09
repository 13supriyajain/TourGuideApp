package com.supjain.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This custom Adapter class is for setting values and displaying contents of place_list_item.xml layout file.
 */
public class PlaceAdapter extends ArrayAdapter<LocationDetails> {

    private int mColorResourceId;
    private int mImageResourceId;

    public PlaceAdapter(Activity context, ArrayList<LocationDetails> locationDetails,
                        int colorResourceId, int imageResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter, the adapter is not going to use this second argument,
        // so it can be any value. Here, we used 0.
        super(context, 0, locationDetails);
        this.mColorResourceId = colorResourceId;
        this.mImageResourceId = imageResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_list_item, parent, false);
        }

        // Get the {@link LocationDetails} object located at this position in the list
        final LocationDetails currentLocationDetails = getItem(position);

        // Find the TextView in the place_list_item.xml layout with the ID place_name TextView
        TextView placeNameTextView = listItemView.findViewById(R.id.place_name);
        // Get the place name from the current LocationDetails object and
        // set this text on the place_name TextView
        placeNameTextView.setText(currentLocationDetails.getLocationName());

        // Find the TextView in the place_list_item.xml layout with the ID place_address TextView
        TextView placeAddressTextView = listItemView.findViewById(R.id.place_address);
        // Get the place address from the current LocationDetails object and
        // set this text on the place_address TextView
        placeAddressTextView.setText(currentLocationDetails.getLocationAddress());

        // Find the TextView in the place_list_item.xml layout with the ID place_phone_number TextView
        TextView placePhoneNumberTextView = listItemView.findViewById(R.id.place_phone_number);
        // Get the place phone number from the current LocationDetails object and
        // set this text on the place_phone_number TextView
        placePhoneNumberTextView.setText(currentLocationDetails.getLocationPhoneNumber());

        // Find the TextView in the place_list_item.xml layout with the ID place_hours TextView
        TextView placeHoursTextView = listItemView.findViewById(R.id.place_hours);
        // Get the place business hours from the current LocationDetails object and
        // set this text on the place_hours TextView
        placeHoursTextView.setText(currentLocationDetails.getLocationHours());

        // Find the ImageView in the place_list_item.xml layout with the ID place_image
        ImageView iconView = listItemView.findViewById(R.id.place_image);
        // Get the image resource ID for the current place fragment from global variable
        // mImageResourceId and set the image to iconView
        iconView.setImageResource(this.mImageResourceId);

        // Set the background color of the fragment
        LinearLayout containerLayout = listItemView.findViewById(R.id.place_details_container);
        int backgroundColor = ContextCompat.getColor(getContext(), mColorResourceId);
        containerLayout.setBackgroundColor(backgroundColor);

        // Return the whole list item layout (containing 4 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
