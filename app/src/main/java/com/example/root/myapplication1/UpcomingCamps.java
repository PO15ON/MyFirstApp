package com.example.root.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UpcomingCamps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_camps);
    }

    public void runRegister(View view) {
        Intent intent = new Intent(this, Test1.class);
        startActivity(intent);
    }

    public void runRegister2(View view) {
        Intent intent = new Intent(this, Test2.class);
        startActivity(intent);
    }
}
