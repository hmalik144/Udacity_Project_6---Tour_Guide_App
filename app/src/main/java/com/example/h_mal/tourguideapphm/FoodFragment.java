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
public class FoodFragment extends Fragment {


    public FoodFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getActivity().getString(R.string.food_name_one), getActivity().getString(R.string.food_address_one), R.drawable.splashlogosaloon));
        locations.add(new Location(getActivity().getString(R.string.food_name_two), getActivity().getString(R.string.food_address_two), R.drawable.hiba));
        locations.add(new Location(getActivity().getString(R.string.food_name_three), getActivity().getString(R.string.food_address_three), R.drawable.staxdiner));
        locations.add(new Location(getActivity().getString(R.string.food_name_four), getActivity().getString(R.string.food_address_four), R.drawable.hutong));
        locations.add(new Location(getActivity().getString(R.string.food_name_five), getActivity().getString(R.string.food_address_five), R.drawable.aquakyoto));
        locations.add(new Location(getActivity().getString(R.string.food_name_six), getActivity().getString(R.string.food_address_six), R.drawable.turtlebay));
        locations.add(new Location(getActivity().getString(R.string.food_name_seven), getActivity().getString(R.string.food_address_seven), R.drawable.roosters));
        locations.add(new Location(getActivity().getString(R.string.food_name_eight), getActivity().getString(R.string.food_address_eight), R.drawable.dishoom));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.food);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
