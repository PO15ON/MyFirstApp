package com.example.root.myapplication1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by root on 10/08/17.
 */

public class GulfInfo extends Fragment {
    public GulfInfo(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.gulf_info, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.gulf_info);
        return rootView;
    }
}
