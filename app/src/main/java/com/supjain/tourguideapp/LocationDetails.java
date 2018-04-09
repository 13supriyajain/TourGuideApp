package com.supjain.tourguideapp;

/**
 * This class is created to store information about a location/place. Each object of this class will store
 * specific information about a particular location/place in Indore city.
 */
public class LocationDetails {

    // For storing location image resource id, default value is -1, when no resource id has been provided
    private int mImageResourceId = -1;
    // For storing location name
    private String mLocationName;
    // For storing location description, default value is null, when no description has been provided
    private String mLocationDescription = null;
    // For storing location address
    private String mLocationAddress;
    // For storing location phone number
    private String mLocationPhoneNumber;
    // For storing location open hours
    private String mLocationHours;

    // Parametrized constructor to create an object of this class with details provided
    public LocationDetails(int imageResourceId, String locationName, String locationDescription,
                           String locationAddress, String locationHours) {
        mImageResourceId = imageResourceId;
        mLocationName = locationName;
        mLocationDescription = locationDescription;
        mLocationAddress = locationAddress;
        mLocationHours = locationHours;
    }

    // Parametrized constructor to create an object of this class with details provided
    public LocationDetails(String locationName, String locationAddress, String locationPhoneNumber,
                           String locationHours) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationPhoneNumber = locationPhoneNumber;
        mLocationHours = locationHours;
    }

    // Return object's location image resource id value
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Return object's location name variable value
    public String getLocationName() {
        return mLocationName;
    }

    // Return object's location description variable value
    public String getLocationDescription() {
        return mLocationDescription;
    }

    // Return object's location address variable value
    public String getLocationAddress() {
        return mLocationAddress;
    }

    // Return object's location phone number variable value
    public String getLocationPhoneNumber() {
        return mLocationPhoneNumber;
    }

    // Return object's location hours variable value
    public String getLocationHours() {
        return mLocationHours;
    }

    // Return true if image resource id has been provided, hence it is != -1 (default value)
    public boolean hasImage() {
        return mImageResourceId != -1;
    }

    // Return true if laction description has been provided, hence it is != null (default value)
    public boolean hasDescription() {
        return mLocationDescription != null;
    }
}
