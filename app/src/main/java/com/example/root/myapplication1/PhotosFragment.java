package com.example.root.myapplication1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ScrollView;


/**
 * Created by root on 09/08/17.
 */

public class PhotosFragment extends Fragment {
    public PhotosFragment(){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.photos_fragment, container, false);
        ScrollView scrollView = (ScrollView) rootView.findViewById(R.id.gridview);
        return rootView;
    }


}
