package com.example.ariannie.tabbardemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PhoneBookFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class PhoneBookFragment extends Fragment {


    public PhoneBookFragment() {
        // Required empty public constructor
    }
    static PhoneBookFragment newInstance(){
        return new PhoneBookFragment ();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_phone_book, container, false);
    }


}
