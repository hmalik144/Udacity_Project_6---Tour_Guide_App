package com.example.h_mal.tourguideapphm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccommodationFragment extends Fragment {


    public AccommodationFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getActivity().getString(R.string.accodomation_name_one), getActivity().getString(R.string.accodomation_address_one)));
        locations.add(new Location(getActivity().getString(R.string.accodomation_name_two), getActivity().getString(R.string.accodomation_address_two)));
        locations.add(new Location(getActivity().getString(R.string.accodomation_name_three), getActivity().getString(R.string.accodomation_address_three)));
        locations.add(new Location(getActivity().getString(R.string.accodomation_name_four), getActivity().getString(R.string.accodomation_address_four)));
        locations.add(new Location(getActivity().getString(R.string.accodomation_name_five), getActivity().getString(R.string.accodomation_address_five)));
        locations.add(new Location(getActivity().getString(R.string.accodomation_name_six), getActivity().getString(R.string.accodomation_address_six)));
        locations.add(new Location(getActivity().getString(R.string.accodomation_name_seven), getActivity().getString(R.string.accodomation_address_seven)));
        locations.add(new Location(getActivity().getString(R.string.accodomation_name_eight), getActivity().getString(R.string.accommodation_address_eight)));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.acco);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
