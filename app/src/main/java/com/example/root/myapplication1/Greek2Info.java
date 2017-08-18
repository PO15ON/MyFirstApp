package com.example.root.myapplication1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by root on 10/08/17.
 */

public class Greek2Info extends Fragment {
    public Greek2Info(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.greek2_info, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.greek2_text);
        return rootView;
    }
}
