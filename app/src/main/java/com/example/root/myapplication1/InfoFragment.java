package com.example.root.myapplication1;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by root on 09/08/17.
 */

public class InfoFragment extends Fragment {
    public InfoFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.info_fragment, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.info_fragment);
        return rootView;
    }
}
