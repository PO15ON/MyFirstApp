package com.example.root.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PreviousCamps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_camps);
    }

    public void runGreekCampus(View view) {
        Intent intent = new Intent(this, GreekCampus.class);
        startActivity(intent);
    }

    public void runGreekCampus2(View view) {
        Intent intent = new Intent(this, Greek2.class);
        startActivity(intent);
    }

    public void runZewail(View view) {
        Intent intent = new Intent(this, Zewail.class);
        startActivity(intent);
    }

    public void runGulf(View view) {
        Intent intent = new Intent(this, Gulf.class);
        startActivity(intent);
    }

    public void runAOU(View view) {
        Intent intent = new Intent(this, AOU.class);
        startActivity(intent);
    }
}
