package com.example.root.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Camps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camps);
    }

    public void runPrevious(View view) {
        Intent intent = new Intent(this, PreviousCamps.class);
        startActivity(intent);
    }

    public void runUpcoming(View view) {
        Intent intent = new Intent(this, UpcomingCamps.class);
        startActivity(intent);
    }
}
