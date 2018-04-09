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
 * This custom Adapter class is for setting values and displaying contents of location_list_item.xml layout file.
 */
public class LocationAdapter extends ArrayAdapter<LocationDetails> {

    private int mColorResourceId;
    private int mImageResourceId;

    public LocationAdapter(Activity context, ArrayList<LocationDetails> locationDetails,
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
                    R.layout.location_list_item, parent, false);
        }

        // Get the {@link LocationDetails} object located at this position in the list
        final LocationDetails currentLocationDetails = getItem(position);

        // Find the TextView in the location_list_item.xml layout with the ID location_name TextView
        TextView locationNameTextView = listItemView.findViewById(R.id.location_name);
        // Get the location name from the current LocationDetails object and
        // set this text on the location_name TextView
        locationNameTextView.setText(currentLocationDetails.getLocationName());

        // Find the TextView in the location_list_item.xml layout with the ID location_description TextView
        TextView locationDescriptionTextView = listItemView.findViewById(R.id.location_description);
        // Check if description is present for this location, if it is present then set description text in
        // the location_description TextView
        if (currentLocationDetails.hasDescription()) {
            // Get the location description from the current LocationDetails object and
            // set this text on the location_description TextView
            locationDescriptionTextView.setText(currentLocationDetails.getLocationDescription());
            locationDescriptionTextView.setVisibility((View.VISIBLE));
        } else {
            // Else if description is not provided for the location, then hide the description TextView
            locationDescriptionTextView.setVisibility((View.GONE));
        }

        // Find the TextView in the location_list_item.xml layout with the ID location_address TextView
        TextView locationAddressTextView = listItemView.findViewById(R.id.location_address);
        // Get the location address from the current LocationDetails object and
        // set this text on the location_address TextView
        locationAddressTextView.setText(currentLocationDetails.getLocationAddress());

        // Find the TextView in the location_list_item.xml layout with the ID location_hours TextView
        TextView locationHoursTextView = listItemView.findViewById(R.id.location_hours);
        // Get the location open hours from the current LocationDetails object and
        // set this text on the location_hours TextView
        locationHoursTextView.setText(currentLocationDetails.getLocationHours());

        // Find the ImageView in the location_list_item.xml layout with the ID location_image
        ImageView iconView = listItemView.findViewById(R.id.location_image);
        // Check if image is present for this location, if it has image then set correct
        // image in imageView
        if (currentLocationDetails.hasImage()) {
            // Get the image resource ID from the current LocationDetails object and
            // set the image to iconView
            iconView.setImageResource(currentLocationDetails.getImageResourceId());
        } else {
            // Get the image resource ID for the current location fragment from global variable
            // mImageResourceId and set the image to iconView
            iconView.setImageResource(this.mImageResourceId);
        }

        // Set the background color of the fragment
        LinearLayout containerLayout = listItemView.findViewById(R.id.location_details_container);
        int backgroundColor = ContextCompat.getColor(getContext(), mColorResourceId);
        containerLayout.setBackgroundColor(backgroundColor);

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
