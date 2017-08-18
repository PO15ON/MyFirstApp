package com.example.root.myapplication1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class AOU extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_info:
                    AouInfo Info = new AouInfo();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.aou_frame, Info). commit();
                    return true;
                case R.id.navigation_photos:
                    AouPhotos photos = new AouPhotos();
                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    fragmentManager1.beginTransaction().replace(R.id.aou_frame, photos). commit();
                    return true;
                case R.id.navigation_videos:
                    Toast.makeText(getApplicationContext(), "No videos, Yet!", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aou);
        AouInfo Info = new AouInfo();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.aou_frame, Info). commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
