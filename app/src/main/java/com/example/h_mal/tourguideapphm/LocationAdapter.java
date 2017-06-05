package com.example.h_mal.tourguideapphm;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by h_mal on 11/02/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {

        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        Location currentLocation = getItem(position);

        TextView locationName = (TextView) listItemView.findViewById(R.id.Name);
        locationName.setText(currentLocation.getLocationName());

        TextView locationAddress = (TextView) listItemView.findViewById(R.id.Address);
        locationAddress.setText(currentLocation.getLocationAddress());

        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.image);
        if(currentLocation.hasImage()) {
            locationImage.setImageResource(currentLocation.getLocationImage());
            locationImage.setVisibility(View.VISIBLE);
        }
        else{
            locationImage.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }


}
