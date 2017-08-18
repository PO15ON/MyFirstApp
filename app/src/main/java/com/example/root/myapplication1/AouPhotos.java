package com.example.root.myapplication1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

/**
 * Created by root on 10/08/17.
 */

public class AouPhotos extends Fragment {
    public AouPhotos(){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.aou_photos, container, false);
        ScrollView scrollView = (ScrollView) rootView.findViewById(R.id.aou_photos);
        return rootView;
    }
}
