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
 * {@link MeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MeFragment extends Fragment {


    public MeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MeFragment newInstance() {
        MeFragment fragment = new MeFragment ();
//        Bundle args = new Bundle ();
//        args.putString (ARG_PARAM1, param1);
//        args.putString (ARG_PARAM2, param2);
//        fragment.setArguments (args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_me, container, false);
    }


}
