package com.example.ariannie.tabbardemo;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends Fragment {


    public FindFragment() {
        // Required empty public constructor
    }
    public static FindFragment newInstance() {
        FindFragment fragment = new FindFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_find, container, false);
    }

}
